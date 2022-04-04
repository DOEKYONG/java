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
	
	
	// * 해당 클래스의 메모리를 반환하는 방법
		// 1. 현재 클래스로 객체선언
	public static Login instansce;
	// * 2 .생성자에서 객체내 this 넣어주기
			// this : 현재클래스의 메모리  [ 새로운메모리할당x] 
	public Login() {
		instansce = this;
	}
	
	/// *로그인 성공한 회원객체
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
		
		// * 동영상 무한재생
		mediaPlayer.setOnEndOfMedia(new Runnable() {
			
			@Override
			public void run() { // 멀티 스레드
				mediaPlayer.seek(Duration.ZERO);
				// 미디어의 현재위치를 처음으로 돌리기
			}
		});
		
		loadpage("/view/login/loginpane.fxml");
		
	}
	
	public void loadpage( String page ) {
		try {
		Parent parent = FXMLLoader.load(getClass().getResource(page));
		borderpane.setCenter(parent);
		} catch(Exception e) { System.out.println("파일이없어 "+  e);}
	}	
}
