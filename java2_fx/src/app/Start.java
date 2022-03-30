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
		// �����̳� �ҷ�����
		Parent parent  = FXMLLoader.load(getClass().getResource("/view/main.fxml"));
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		
				
		
		

		
		// 3. �������� �ΰ� ����
			// 1. �̹��� �ҷ�����  [ �̹��� ��üȭ ]
		Image image = new Image("/img/stagelogo.jpeg");
			// 2. ������������
		stage.getIcons().add(image);
		stage.setResizable(false);
		stage.setTitle("��������");
		stage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
	
}
