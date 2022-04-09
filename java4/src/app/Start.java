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
		stage.setTitle("�޹�������");
		stage.show();
			
		}

public static void main(String[] args) {
	
	launch(args);
}
}
