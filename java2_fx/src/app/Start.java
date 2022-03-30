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
		// 5. �����̳� �ҷ�����
		Parent parent  = FXMLLoader.load(getClass().getResource("/view/main.fxml"));
		// 6. �� ��ü -> �����̳� 
		Scene scene = new Scene(parent);
		// 7. �� -> �������� 
		stage.setScene(scene);
		
				
		
		

		
		// 3. �������� �ΰ� ����
			
		Image image = new Image("/img/stagelogo.jpeg"); // 1. �̹��� �ҷ�����  [ �̹��� ��üȭ ]
		// Image image2 = new Image("C:/Users/505-t/git/ezen_web_2022_A/java2/src/img/stagelogo.jpeg"); // 1. �̹��� �ҷ����� [ �̹��� ��üȭ ]  
		// ������  vs ����� 
		// ������ : ��� ���
			//  C:\Users\505-t\git\ezen_web_2022_A\java2\src\img\���ϸ�.Ȯ����
		// ����� : �� ��ġ[������Ʈ���� src] ���� ��� 
			//  ���� [ src�������� ]  /img/���ϸ�.Ȯ����
		
		stage.getIcons().add(image); // 3. �������� �����ܼ��� 
		stage.setResizable(false); // 4. �������� ũ�� ���� �Ұ�
		stage.setTitle("��������"); // 2.�������� â �̸�
		stage.show(); // 1. �������� ���� 
		
	}
	public static void main(String[] args) {
		launch(args);
	}
	
}