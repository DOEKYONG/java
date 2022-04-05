package controller.board;

import java.net.URL;
import java.util.ResourceBundle;

import controller.home.Home;
import dao.BoardDao;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class Board implements Initializable {
	
    @FXML
    private TableView<dto.Board> boardtable; // 테이블에 넣을 자료형 선택 [ 테이블에 게시물 표시하기위해 ]
    
    public static dto.Board board;
    
    @FXML
    private Button btnwrite;

    @FXML
    void accwrite(ActionEvent event) {
    	// * Home클래스내 borderpane center 변경
    	Home.home.loadpage("/view/board/boardwrite.fxml");
    }
    
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
    	// * arraylist 가 아닌 ObservableList 사용하는 이유 [tableview가 ObservableList를 사용 ] 
    	// 1. db에서 모든 게시글 가져오기
    	ObservableList<dto.Board> boardlist = BoardDao.boardDao.list();
    	System.out.println( boardlist.toString() );
    	// 2. tableview 에 추가 
    	TableColumn tc = boardtable.getColumns().get(0);
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
    		//	테이블명(fxid).setItems( Observablelist ) ; // 테이블에 표시할 리스트(일반적 arraylist x) 설정
    	
    	// tableview 에서 해당 셀을 클릭했을때 이벤트
    	// boardtable.setOnMouseClicked(e -> {실행코드}); 테이블을 클릭했을때
    	boardtable.setOnMouseClicked(e -> {
    	// 1. 테이블에서 클릭한 객체를 임시객체에 저장	
    	board = boardtable.getSelectionModel().getSelectedItem(); // 클릭된 board 객체 호출
    	// 2. 조회수 증가
    	// 3. 페이지전환
    	Home.home.loadpage("/view/board/boardview.fxml");
    		
    	});
    	
    	// [ 일회용 ]인수 -> 실행코드 : 람다식  ( 익명함수 : 이름이 없는 함수 [인수와 실행코드만 존재 ] )
    	// vs 
    	// [ 재활용 ]void 함수명 ( 인수1 ) { 실행코드 } : 함수
    	
    }

}

