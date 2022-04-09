package app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
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
		stage.setTitle("앵무새마켓");
		stage.show();
			
		}

public static void main(String[] args) {
	
	launch(args);
}
}
