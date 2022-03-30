package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

public class Main implements Initializable {
					// Initializable : view 가 새로 열렸을때 초기값 설정 메소드 제공
	
	@FXML
    private BorderPane boarderPane; // 씬빌더에서 만든 컨테이너 객체

	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		System.out.println("메인뷰가 실행되었습니다.");
		// 1.
		loadpage("/view/login");
	}
	
	public void loadpage(String page) {
		try {
			Parent parent = FXMLLoader.load(getClass().getResource(page+".fxml")); //무조건예외처리
			boarderPane.setCenter(parent);
		}catch(Exception e) {System.out.println("페이지연결실패");}
		
	}
}

