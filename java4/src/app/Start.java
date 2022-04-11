package app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Start extends Application {

	@Override
		public void start(Stage stage ) throws Exception {
		// 5. 컨테이너 불러오기
		Parent parent = FXMLLoader.load(getClass().getResource("/view/login/main.fxml"));
		// 6. 씬 객체 -> 컨테이너
		Scene scene = new Scene(parent);
		// 7 . 씬 -> 스테이지
		stage.setScene(scene);
		
		//3 스테이지로고 설정
		Image image = new Image("/img/stagelogo.png");
		// 2 스테이지 설정
		stage.getIcons().add(image);
		
		// * 외부폰트 설정
			// 1. 폰트 가져오기
			Font.loadFont(getClass().getResourceAsStream("SANGJU Gotgam.ttf"), 14);
			// 2. 외부 스타일시트 적용
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		
		stage.setResizable(false); // 4. 스테이지 크기 변경 불가
		stage.setTitle("앵무새마켓");
		stage.show();
			
		}

public static void main(String[] args) {
	
	launch(args);
}
}
