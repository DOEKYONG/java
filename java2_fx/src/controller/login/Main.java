package controller.login;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

public class Main implements Initializable {
					// Initializable : view �� ���� �������� �ʱⰪ ���� �޼ҵ� ����
	public static Main instance;
	public Main() {
		instance=this;
	}
	
	
	 @FXML
	    private BorderPane borderpane; // ���������� ���� �����̳� ��ü

	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		System.out.println("���κ䰡 ����Ǿ����ϴ�.");
		// 1.
		loadpage("/view/login/login");  // loadpage �޼ҵ� ȣ��� ( ���ϰ�� )
		// loadpage �޼ҵ� �ȿ� fxml �ۼ� �߱� ������ fxml ����
	}
	
	public void loadpage(String page) { // loadpage( ���ϰ�� )
		try {
			// ������(fxml) ��üȭ 
			Parent parent = FXMLLoader.load(getClass().getResource(page+".fxml")); //�����ǿ���ó��  && �ش����Ϻҷ�����
			borderpane.setCenter(parent); // main.fxml�� �����ϴ� borderpane��ü��..........
		}catch(Exception e) {System.out.println("�������������"+e);}
		
	}
}

