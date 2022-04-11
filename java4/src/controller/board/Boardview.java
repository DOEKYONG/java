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
	    
	    // ** 댓글 테이블 메소드
	    public void replytableshow() {
	    	// 1. 현재 게시물 번호
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
	    	
	    	
	    	
	    	// 4.테이블뷰에 리스트 넣어주기
	    	replytable.setItems(replylist);
	    }
	    
	    

	    @FXML
	    void back(ActionEvent event) {
	    	Home.home.loadpage("/view/board/board.fxml");

	    }

	    @FXML
	    void delete(ActionEvent event) {
	    	
	    	// 1. 경고메시지 알림
	    	Alert alert = new Alert(AlertType.CONFIRMATION);
	    		alert.setHeaderText("해당 게시물을 삭제할까요?");
	    	Optional<ButtonType> optional = alert.showAndWait();
	    	
	    	
	    	// 2. 확인버튼 눌렀을때
	    	if(optional.get() == ButtonType.OK) {
	    		// 3. 삭제처리
	    	BoardDao.boardDao.delete(controller.board.Board.board.getBnum());
	    	Home.home.loadpage("/view/board/board.fxml");
	    	}
	    	

	    }

	    @FXML
	    void rewrite(ActionEvent event) { // 댓글 작성 버튼 눌렀을때
	    	
	    	String rcontent = txtrecontent.getText();
	    	String rwirte = Login.member.getMid();
	    	int bnum = controller.board.Board.board.getBnum();
	    	
	    	// ㅐㄱ체화
	    	Reply reply = new Reply(0,rcontent,rwirte,null,bnum);
	    	boolean result = BoardDao.boardDao.rwrite(reply);
	    	if(result) {
	    		Alert alert = new Alert(AlertType.INFORMATION);
	    			alert.setHeaderText("댓글 등록 성공");
	    			alert.showAndWait();
	    			
	    			txtrecontent.setText("");
	    			// 댓글 작성후 테이블 새로고침
	    			replytableshow();
	    	}
	    }
	    
	    boolean upcheck = true;
	    @FXML
	    void update(ActionEvent event) {
	    	
	    	Alert alert = new Alert(AlertType.INFORMATION);
	    	if(upcheck) {
	    	alert.setHeaderText("게시글 수정후 수정 완료 버튼 눌러주세요");
	    	alert.showAndWait();
	    	txttitle.setEditable(true);
	    	txtcontent.setEditable(true);
	    	btnupdate.setText("수정완료");
	    	upcheck = false;
	    }else { // 수정완료
	    	// db 처리
	    	BoardDao.boardDao.update(controller.board.Board.board.getBnum(),
	    			txttitle.getText(),
	    			txtcontent.getText());
	    	
	    	alert.setHeaderText("수정이 완료 되었습니다.");
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
		
		// 각 컨트롤에 선택된 board의 데이터 설정하기
		lblwrite.setText("작성자 : " +board.getBwrite());
		lbldate.setText("작성일 : " +board.getBdate());
		lblview.setText("조회수 : " +board.getBview());
		txttitle.setText(board.getBtitle());
		txtcontent.setText(board.getBcontent());
		// 만약에 작성자와 현재로그인된 id와 동일하지 않으면
		if (!board.getBwrite().equals(Login.member.getMid())) {
			btndelete.setVisible(false);
			btnupdate.setVisible(false);
		}
		// 제목과 내용을 수정못ㅎ게 수정금지
		txttitle.setEditable(false);
		txtcontent.setEditable(false);
		
	}

}
