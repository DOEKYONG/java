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
		// 5. �����̳� �ҷ�����
		Parent parent = FXMLLoader.load(getClass().getResource("/view/login/main.fxml"));
		// 6. �� ��ü -> �����̳�
		Scene scene = new Scene(parent);
		// 7 . �� -> ��������
		stage.setScene(scene);
		
		//3 ���������ΰ� ����
		Image image = new Image("/img/stagelogo.png");
		// 2 �������� ����
		stage.getIcons().add(image);
		
		// * �ܺ���Ʈ ����
			// 1. ��Ʈ ��������
			Font.loadFont(getClass().getResourceAsStream("SANGJU Gotgam.ttf"), 14);
			// 2. �ܺ� ��Ÿ�Ͻ�Ʈ ����
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		
		stage.setResizable(false); // 4. �������� ũ�� ���� �Ұ�
		stage.setTitle("�޹�������");
		stage.show();
			
		}

public static void main(String[] args) {
	
	launch(args);
}
}
