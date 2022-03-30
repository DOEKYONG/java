package app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Start  extends Application{
	
	
	

	@Override
	public void start(Stage stage) throws Exception {
		// 컨테이너 불러오기
		Parent parent  = FXMLLoader.load(getClass().getResource("/view/main.fxml"));
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		
				
		
		

		
		// 3. 스테이지 로고 설정
			// 1. 이미지 불러오기  [ 이미지 객체화 ]
		Image image = new Image("/img/stagelogo.jpeg");
			// 2. 스테이지설정
		stage.getIcons().add(image);
		stage.setResizable(false);
		stage.setTitle("이젠마켓");
		stage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
	
}
