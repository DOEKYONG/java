package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

public class Main implements Initializable {
					// Initializable : view �� ���� �������� �ʱⰪ ���� �޼ҵ� ����
	
	@FXML
    private BorderPane boarderPane; // ���������� ���� �����̳� ��ü

	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		System.out.println("���κ䰡 ����Ǿ����ϴ�.");
		// 1.
		loadpage("/view/login");
	}
	
	public void loadpage(String page) {
		try {
			Parent parent = FXMLLoader.load(getClass().getResource(page+".fxml")); //�����ǿ���ó��
			boarderPane.setCenter(parent);
		}catch(Exception e) {System.out.println("�������������");}
		
	}
}

