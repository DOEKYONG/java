package controller.board;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import java.net.URL;
import java.util.ResourceBundle;

import controller.home.Home;
import dao.BoardDao;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class Board implements Initializable {

    @FXML
    private TableView<dto.Board> boardtable; // 테이블에 넣을 자료형 선택

    @FXML
    private Button btnwrite;
    
    public static dto.Board board; // 테이블에서 선택한 객체를 저장하는 객체

    @FXML
    void accwrite(ActionEvent event) {
    	 // *Home 클래스내 borderpane.center 변경
    	Home.home.loadpage("/view/board/boardwrite.fxml");

    }
    
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
    	
    	// 1. db에서 모든 게시글 가져오기
    	ObservableList<dto.Board> boardlist = BoardDao.boardDao.list();
    	System.out.println(boardlist.toString());
    	// 2. tableview에 추가
    	TableColumn tc = boardtable.getColumns().get(0); // 첫번째 열 가져오기
    	tc.setCellValueFactory(new PropertyValueFactory<>("bnum"));
    	tc = boardtable.getColumns().get(1);
    	tc.setCellValueFactory(new PropertyValueFactory<>("btitle"));
    	tc = boardtable.getColumns().get(2);
    	tc.setCellValueFactory(new PropertyValueFactory<>("bwrite"));
    	tc = boardtable.getColumns().get(3);
    	tc.setCellValueFactory(new PropertyValueFactory<>("bdate"));
    	tc = boardtable.getColumns().get(4);
    	tc.setCellValueFactory(new PropertyValueFactory<>("bview"));
    	// 3. tableview 에 list 연결
    	boardtable.setItems(boardlist);
    		// 테이블명(fxid).setItems(ObservableList); 
    	// * tableview 에서 해당 셀을 클릭했을때 이벤트
    		// boardtable.setOnMousedClicked() 
    	boardtable.setOnMouseClicked(e -> {
    		// 1. 클릭한 객체를 임시객체에 저장
    		board = boardtable.getSelectionModel().getSelectedItem();
    		// 2. 조회수 증가
    		// 3. 페이지 전환
    		Home.home.loadpage("/view/board/boardview.fxml");
    		
    	});
    	
    	
    }
}
