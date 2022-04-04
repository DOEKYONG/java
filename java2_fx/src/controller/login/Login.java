package controller.login;

import java.net.URL;
import java.util.ResourceBundle;

import dto.Member;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.util.Duration;

public class Login implements Initializable {
	
	
	// * �ش� Ŭ������ �޸𸮸� ��ȯ�ϴ� ���
		// 1. ���� Ŭ������ ��ü����
	public static Login instansce;
	// * 2 .�����ڿ��� ��ü�� this �־��ֱ�
			// this : ����Ŭ������ �޸�  [ ���ο�޸��Ҵ�x] 
	public Login() {
		instansce = this;
	}
	
	/// *�α��� ������ ȸ����ü
	public static Member member;

    @FXML
    private MediaView mediaview;
    
    @FXML
    private BorderPane borderpane;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		Media media = new Media(getClass().getResource("/img/login.mp4").toString());
		
		MediaPlayer mediaPlayer = new MediaPlayer(media);
		mediaview.setMediaPlayer(mediaPlayer);
		
		mediaPlayer.play();
		
		// * ������ �������
		mediaPlayer.setOnEndOfMedia(new Runnable() {
			
			@Override
			public void run() { // ��Ƽ ������
				mediaPlayer.seek(Duration.ZERO);
				// �̵���� ������ġ�� ó������ ������
			}
		});
		
		loadpage("/view/login/loginpane.fxml");
		
	}
	
	public void loadpage( String page ) {
		try {
		Parent parent = FXMLLoader.load(getClass().getResource(page));
		borderpane.setCenter(parent);
		} catch(Exception e) { System.out.println("�����̾��� "+  e);}
	}	
}
