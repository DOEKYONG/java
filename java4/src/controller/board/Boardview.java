package controller.board;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import controller.home.Home;
import controller.login.Login;
import dao.BoardDao;
import dto.Board;
import dto.Reply;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class Boardview implements Initializable {
	
	   @FXML
	    private Button btnrewrite;

	    @FXML
	    private TextField txttitle;

	    @FXML
	    private TextArea txtcontent;

	    @FXML
	    private Button btnback;

	    @FXML
	    private Button btndelete;

	    @FXML
	    private Button btnupdate;

	    @FXML
	    private Label lblwrite;

	    @FXML
	    private Label lbldate;

	    @FXML
	    private Label lblview;

	    @FXML
	    private TextArea txtrecontent;

	    @FXML
	    private TableView<Reply> replytable;
	    
	    // ** ��� ���̺� �޼ҵ�
	    public void replytableshow() {
	    	// 1. ���� �Խù� ��ȣ
	    	int bnum = controller.board.Board.board.getBnum();
	    	// 2
	    	ObservableList<Reply> replylist = BoardDao.boardDao.replylist(bnum);
	    	
	    	//3.
	    	TableColumn tc = replytable.getColumns().get(0);
	    	tc.setCellValueFactory(new PropertyValueFactory<>("rnum"));
	    	
	    	 tc = replytable.getColumns().get(1);
	    	tc.setCellValueFactory(new PropertyValueFactory<>("rwrite"));
	    	
	    	 tc = replytable.getColumns().get(2);
	    	tc.setCellValueFactory(new PropertyValueFactory<>("rdate"));
	    	
	    	 tc = replytable.getColumns().get(3);
	    	tc.setCellValueFactory(new PropertyValueFactory<>("rcontent"));
	    	
	    	
	    	
	    	// 4.���̺��信 ����Ʈ �־��ֱ�
	    	replytable.setItems(replylist);
	    }
	    
	    

	    @FXML
	    void back(ActionEvent event) {
	    	Home.home.loadpage("/view/board/board.fxml");

	    }

	    @FXML
	    void delete(ActionEvent event) {
	    	
	    	// 1. ����޽��� �˸�
	    	Alert alert = new Alert(AlertType.CONFIRMATION);
	    		alert.setHeaderText("�ش� �Խù��� �����ұ��?");
	    	Optional<ButtonType> optional = alert.showAndWait();
	    	
	    	
	    	// 2. Ȯ�ι�ư ��������
	    	if(optional.get() == ButtonType.OK) {
	    		// 3. ����ó��
	    	BoardDao.boardDao.delete(controller.board.Board.board.getBnum());
	    	Home.home.loadpage("/view/board/board.fxml");
	    	}
	    	

	    }

	    @FXML
	    void rewrite(ActionEvent event) { // ��� �ۼ� ��ư ��������
	    	
	    	String rcontent = txtrecontent.getText();
	    	String rwirte = Login.member.getMid();
	    	int bnum = controller.board.Board.board.getBnum();
	    	
	    	// ����üȭ
	    	Reply reply = new Reply(0,rcontent,rwirte,null,bnum);
	    	boolean result = BoardDao.boardDao.rwrite(reply);
	    	if(result) {
	    		Alert alert = new Alert(AlertType.INFORMATION);
	    			alert.setHeaderText("��� ��� ����");
	    			alert.showAndWait();
	    			
	    			txtrecontent.setText("");
	    			// ��� �ۼ��� ���̺� ���ΰ�ħ
	    			replytableshow();
	    	}
	    }
	    
	    boolean upcheck = true;
	    @FXML
	    void update(ActionEvent event) {
	    	
	    	Alert alert = new Alert(AlertType.INFORMATION);
	    	if(upcheck) {
	    	alert.setHeaderText("�Խñ� ������ ���� �Ϸ� ��ư �����ּ���");
	    	alert.showAndWait();
	    	txttitle.setEditable(true);
	    	txtcontent.setEditable(true);
	    	btnupdate.setText("�����Ϸ�");
	    	upcheck = false;
	    }else { // �����Ϸ�
	    	// db ó��
	    	BoardDao.boardDao.update(controller.board.Board.board.getBnum(),
	    			txttitle.getText(),
	    			txtcontent.getText());
	    	
	    	alert.setHeaderText("������ �Ϸ� �Ǿ����ϴ�.");
	    	alert.showAndWait();
	    	txttitle.setEditable(false);
	    	txtcontent.setEditable(false);
	    	
	    	upcheck = true;
	    }
	    }
	
	
	
	
	
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		replytableshow();
		Board board = controller.board.Board.board;
		
		// �� ��Ʈ�ѿ� ���õ� board�� ������ �����ϱ�
		lblwrite.setText("�ۼ��� : " +board.getBwrite());
		lbldate.setText("�ۼ��� : " +board.getBdate());
		lblview.setText("��ȸ�� : " +board.getBview());
		txttitle.setText(board.getBtitle());
		txtcontent.setText(board.getBcontent());
		// ���࿡ �ۼ��ڿ� ����α��ε� id�� �������� ������
		if (!board.getBwrite().equals(Login.member.getMid())) {
			btndelete.setVisible(false);
			btnupdate.setVisible(false);
		}
		// ����� ������ ���������� ��������
		txttitle.setEditable(false);
		txtcontent.setEditable(false);
		
	}

}