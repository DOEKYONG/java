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
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

public class Home  implements Initializable{
	
public static Home home; // ��ü 
	
	// * this : ���� Ŭ������ �޸� ȣ��
	public Home() { home = this; }
	
	@FXML
	private Label lblloginid;
	@FXML
	private Label lblpoint;
	@FXML
	private Label lbllogout; // fxml
	@FXML
	private Label lbldelete;
	@FXML
	private Label lblinfo;
	@FXML
	private Label lblupdate;
	@FXML
	private Label lblboard; // fxid��������
	@FXML
	private Label lblproduct;
	
	@FXML
	private BorderPane borderpane;
	
	public void accproduct(MouseEvent e) {loadpage("/view/product/product.fxml");}
	
	
	@FXML// �����Խ� ���̺��� Ŭ�������� �̺�Ʈ
	public void accboard( MouseEvent e ) { loadpage("/view/board/board.fxml"); }	
	
	@FXML
	public void accinfo( MouseEvent e ) { loadpage("/view/home/info.fxml"); }
									// loadpage �޼ҵ� �ȿ� fxml �ۼ� ���߱� ������ fxml���� �ۼ����ּž� �ؿ�
	@FXML
	public void accupdate(MouseEvent e) {loadpage("/view/home/update.fxml");}
	
	public void loadpage(String page ) {
		try {
			Parent parent = FXMLLoader.load(getClass().getResource(page));
			borderpane.setCenter(parent);
		}catch(Exception e ) {System.out.println("ȸ�������ҷ�����" + e);}
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		lblloginid.setText(Login.member.getMid()+"��");
		lblpoint.setText("����Ʈ : " + Login.member.getMpoint()+"��");
		
		
		
	}
	@FXML
	public void logout(MouseEvent e) {
		// 1. login ���� �����
		Login.member = null;  
		// 2. ��������ȯ
		Main.instance.loadpage("/view/login/login");
	}
	@FXML
	public void delete(MouseEvent e) {
		
		// 1.�޽���
		Alert alert = new Alert(AlertType.CONFIRMATION); // Ȯ��,��� ��ư Ÿ��
			alert.setHeaderText("����Ż���Ͻðڽ��ϱ�??");
	// 2. ��ưȮ��
			Optional<ButtonType> optional = alert.showAndWait();
			
			if(optional.get() == ButtonType.OK) { // Ȯ�ι�ư�� ��������
				// ȸ��Ż�� ����
				boolean result = MemberDao.memberDao.delete(Login.member.getMnum());
								// ���� �α������� ȸ���� ��ȣ ȣ��
				if (result ) { // Ż�𼺰�
					// �α׾ƿ� [ Login Ŭ������ Member ��ü null ���� ���� ]
					Login.member = null;
					// ������ ��ȯ
					Main.instance.loadpage("/view/login/login");
					
				} else { // Ż�����
					
				}
				
			}
			// �ƴϸ� ��������...
			
		
	}
	
	
	
	
	
}
