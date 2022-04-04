package controller.login;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

public class Main implements Initializable {
					// Initializable : view 가 새로 열렸을때 초기값 설정 메소드 제공
	public static Main instance;
	public Main() {
		instance=this;
	}
	
	
	 @FXML
	    private BorderPane borderpane; // 씬빌더에서 만든 컨테이너 객체

	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		System.out.println("메인뷰가 실행되었습니다.");
		// 1.
		loadpage("/view/login/login");  // loadpage 메소드 호출시 ( 파일경로 )
		// loadpage 메소드 안에 fxml 작성 했기 때문에 fxml 생략
	}
	
	public void loadpage(String page) { // loadpage( 파일경로 )
		try {
			// 페이지(fxml) 객체화 
			Parent parent = FXMLLoader.load(getClass().getResource(page+".fxml")); //무조건예외처리  && 해당파일불러오기
			borderpane.setCenter(parent); // main.fxml에 존재하는 borderpane객체내..........
		}catch(Exception e) {System.out.println("페이지연결실패"+e);}
		
	}
}

