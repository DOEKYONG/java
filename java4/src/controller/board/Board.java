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
    private TableView<dto.Board> boardtable; // ���̺� ���� �ڷ��� ����

    @FXML
    private Button btnwrite;
    
    public static dto.Board board; // ���̺��� ������ ��ü�� �����ϴ� ��ü

    @FXML
    void accwrite(ActionEvent event) {
    	 // *Home Ŭ������ borderpane.center ����
    	Home.home.loadpage("/view/board/boardwrite.fxml");

    }
    
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
    	
    	// 1. db���� ��� �Խñ� ��������
    	ObservableList<dto.Board> boardlist = BoardDao.boardDao.list();
    	System.out.println(boardlist.toString());
    	// 2. tableview�� �߰�
    	TableColumn tc = boardtable.getColumns().get(0); // ù��° �� ��������
    	tc.setCellValueFactory(new PropertyValueFactory<>("bnum"));
    	tc = boardtable.getColumns().get(1);
    	tc.setCellValueFactory(new PropertyValueFactory<>("btitle"));
    	tc = boardtable.getColumns().get(2);
    	tc.setCellValueFactory(new PropertyValueFactory<>("bwrite"));
    	tc = boardtable.getColumns().get(3);
    	tc.setCellValueFactory(new PropertyValueFactory<>("bdate"));
    	tc = boardtable.getColumns().get(4);
    	tc.setCellValueFactory(new PropertyValueFactory<>("bview"));
    	// 3. tableview �� list ����
    	boardtable.setItems(boardlist);
    		// ���̺��(fxid).setItems(ObservableList); 
    	// * tableview ���� �ش� ���� Ŭ�������� �̺�Ʈ
    		// boardtable.setOnMousedClicked() 
    	boardtable.setOnMouseClicked(e -> {
    		// 1. Ŭ���� ��ü�� �ӽð�ü�� ����
    		board = boardtable.getSelectionModel().getSelectedItem();
    		// 2. ��ȸ�� ����
    		// 3. ������ ��ȯ
    		Home.home.loadpage("/view/board/boardview.fxml");
    		
    	});
    	
    	
    }
}
