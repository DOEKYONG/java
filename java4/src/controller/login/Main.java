package controller.login;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

public class Main implements Initializable {

	public static Main instance;
	public Main() {
		instance = this;
	}
	
	@FXML
    private BorderPane boarderpane;

	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		System.out.println("main 뷰 실행");
		loadpage("/view/login/login.fxml");
		
	}
	
	public void loadpage(String page) {
		try {
			Parent parent = FXMLLoader.load(getClass().getResource(page));
			boarderpane.setCenter(parent);
		}catch(Exception e) {System.out.println("페이지 불러오기 실패 사유 : " + e);}
	}
}
