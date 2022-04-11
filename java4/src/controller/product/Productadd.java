package controller.product;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.URL;
import java.util.ResourceBundle;

import controller.home.Home;
import controller.login.Login;
import dao.ProductDao;
import dto.Product;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

public class Productadd implements Initializable {
	
	
	 @FXML
	    private Button btnadd;

	    @FXML
	    private TextField txtpname;

	    @FXML
	    private TextArea txtpcontent;

	    @FXML
	    private TextField txtpprice;

	    @FXML
	    private Button btnimg;

	    @FXML
	    private RadioButton opt1;

	    @FXML
	    private ToggleGroup category;

	    @FXML
	    private RadioButton opt2;

	    @FXML
	    private RadioButton opt3;

	    @FXML
	    private RadioButton opt4;

	    @FXML
	    private ImageView img;

	    @FXML
	    private Button btnback;

	    @FXML
	    private Label txtpath;

	    @FXML
	    void add(ActionEvent event) {
	    	// 1.컨트롤에 입력된 데이터 가져오기
	    	String pname = txtpname.getText();
	    	String pcontent = txtpcontent.getText();
	    	int pprice = Integer.parseInt(txtpprice.getText());
	    		// * 카테고리
	    	String pcategory = "";
	    	if(opt1.isSelected()) {
	    		pcategory="남성의류";
	    	}
	    	if(opt2.isSelected()) {pcategory="여성의류";}
	    	if(opt3.isSelected()) {pcategory="게임기기";}
	    	if(opt4.isSelected()) {pcategory="생활용품";}
	    int mnum = Login.member.getMnum();
	    	
	    	// 2.객체화
	    Product product = new Product(0,pname,pimage,pcontent,pcategory,pprice,1,null,mnum);
	    
	    	// 3. db처리
	    boolean result = ProductDao.productDao.add(product);
	    
	    
	    	// 4. 결과처리
	    if(result) {
	    	Alert alert = new Alert(AlertType.INFORMATION);
	    	alert.setHeaderText("제품 등록 완료");
	    	alert.showAndWait();
	    	Home.home.loadpage("/view/product/product.fxml");
	    	
	    	
	    }else {
	    	Alert alert = new Alert(AlertType.INFORMATION);
	    	alert.setHeaderText("제품 등록 실패");
	    	alert.showAndWait();
	    	
	    }
	    

	    }

	    @FXML
	    void back(ActionEvent event) {
	    	Home.home.loadpage("/view/product/product.fxml");

	    }
	    
	private String pimage = null;
	    @FXML
	    void imgadd(ActionEvent event) { // 이미지등록 버튼 클릭했을때
	    	FileChooser fileChooser = new FileChooser();
	    	fileChooser.getExtensionFilters().add(new ExtensionFilter("이미지파일:image file","*png","*jpeg","*jpg","*gif" ));
	    	
	    	File file = fileChooser.showOpenDialog(new Stage());
	    	
	    	txtpath.setText("파일경로 : " + file.getPath());
	    	
	    	pimage = file.toURI().toString();
	    	
	    	Image image = new Image(pimage);
	    	img.setImage(image);
	    	
	    	// *선택한 파일을 현재프로젝트 폴더로 복사(이동)
	    	
	    	try {
	    	// 1. 파일 입력스트림
	    	FileInputStream inputStream = new FileInputStream(file);
	    	
	    	// 2. 파일 출력 스트림
	    	
    		File copyfile = new File("C:/Users/apoch/git/java/java/java4/src/img/"+file.getName());
	    	FileOutputStream outputStream = new FileOutputStream(copyfile);
	    	byte[] bytes = new byte[1024*1024*1024];
	    	int size;
	    	while( (size = inputStream.read(bytes)) > 0) {
	    		outputStream.write(bytes,0,size);
	    		
	    	}
	    	pimage = copyfile.toURI().toString();
	    	// 용량이 큰 경우에는 스트림 종료 필수
	    	inputStream.close();
	    	outputStream.close();
	    	
	    	}catch(Exception e) {System.out.println(e);}
	    	
		    	
	    	
	    	
	    	
	    	
	    	

	    }
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}
