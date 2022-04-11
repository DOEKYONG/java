package controller.home;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import controller.login.Login;
import controller.login.Main;
import dao.MemberDao;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

public class Home implements Initializable {
	
	public static Home home;
	public Home() {home = this;}
	
	  @FXML
	    private BorderPane borderpane;

	    @FXML
	    private Label lblloginid;

	    @FXML
	    private Label lblpoint;

	    @FXML
	    private Label lbllogout;

	    @FXML
	    private Label lblproduct1;

	    @FXML
	    private Label lblproduct2;

	    @FXML
	    private Label lblproduct3;

	    @FXML
	    private Label lblproduct4;

	    @FXML
	    private Label lblboard;

	    @FXML
	    private Label lblinfo;

	    @FXML
	    private Label lblupdate;

	    @FXML
	    private Label lbldelete;
	    
	    @FXML
	    public void accproduct(MouseEvent e) {
	    	loadpage("/view/product/product.fxml");
	    }
	    
	    @FXML
	    public void accboard(MouseEvent e) {
	    	loadpage("/view/board/board.fxml");
	    }
	    
	    @FXML // ȸ������ �̺�Ʈ
	  		public void accupdate(MouseEvent e) {
	  			loadpage("/view/home/update.fxml");
	  			
	  		}
	    
	    @FXML // ȸ������ ��ȸ
		public void accinfo(MouseEvent e) {
			loadpage("/view/home/info.fxml");
			
		}
	    
	    public void loadpage(String page) {
	    	
	    	try {
	    		Parent parent = FXMLLoader.load(getClass().getResource(page));
	    		borderpane.setCenter(parent);
	    	} catch(Exception e) {System.out.println("????"+e);}
	    }

	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		lblloginid.setText(Login.member.getMid()+" ��");
		lblpoint.setText("����Ʈ : "+Login.member.getMpoint() + " ��");
		
	}
	@FXML // �α׾ƿ� �̺�Ʈ
	public void logout( MouseEvent e) {
		// 1. Login ���� �����
		Login.member = null;
		Main.instance.loadpage("/view/login/login.fxml");
	}
	@FXML // ȸ��Ż�� �̺�Ʈ
	public void delete(MouseEvent e) {
		
		// 1. �޽���
		Alert alert = new Alert(AlertType.CONFIRMATION );
			alert.setHeaderText("���� Ż�� �Ͻðڽ��ϱ�?");
		// 2. ��ưȮ��
			Optional<ButtonType> optional = alert.showAndWait();
		
			if(optional.get() == ButtonType.OK) {
			boolean result =	MemberDao.memberDao.delete(Login.member.getMnum());
				if(result) {
					//�α׾ƿ� [Login Ŭ������ Member ��ü null ���� ���� ]
					Login.member = null;
					// ������ ��ȯ
					Main.instance.loadpage("/view/login/login.fxml");
					
				}else {
					
				}
			}
	}
	
	
	

}
