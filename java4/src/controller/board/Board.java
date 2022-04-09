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
import javafx.scene.control.TableView;

public class Board implements Initializable {

    @FXML
    private TableView<?> boardtable;

    @FXML
    private Button btnwrite;

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
    	
    	
    }
}
