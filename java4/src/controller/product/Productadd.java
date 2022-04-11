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
	    	// 1.��Ʈ�ѿ� �Էµ� ������ ��������
	    	String pname = txtpname.getText();
	    	String pcontent = txtpcontent.getText();
	    	int pprice = Integer.parseInt(txtpprice.getText());
	    		// * ī�װ�
	    	String pcategory = "";
	    	if(opt1.isSelected()) {
	    		pcategory="�����Ƿ�";
	    	}
	    	if(opt2.isSelected()) {pcategory="�����Ƿ�";}
	    	if(opt3.isSelected()) {pcategory="���ӱ��";}
	    	if(opt4.isSelected()) {pcategory="��Ȱ��ǰ";}
	    int mnum = Login.member.getMnum();
	    	
	    	// 2.��üȭ
	    Product product = new Product(0,pname,pimage,pcontent,pcategory,pprice,1,null,mnum);
	    
	    	// 3. dbó��
	    boolean result = ProductDao.productDao.add(product);
	    
	    
	    	// 4. ���ó��
	    if(result) {
	    	Alert alert = new Alert(AlertType.INFORMATION);
	    	alert.setHeaderText("��ǰ ��� �Ϸ�");
	    	alert.showAndWait();
	    	Home.home.loadpage("/view/product/product.fxml");
	    	
	    	
	    }else {
	    	Alert alert = new Alert(AlertType.INFORMATION);
	    	alert.setHeaderText("��ǰ ��� ����");
	    	alert.showAndWait();
	    	
	    }
	    

	    }

	    @FXML
	    void back(ActionEvent event) {
	    	Home.home.loadpage("/view/product/product.fxml");

	    }
	    
	private String pimage = null;
	    @FXML
	    void imgadd(ActionEvent event) { // �̹������ ��ư Ŭ��������
	    	FileChooser fileChooser = new FileChooser();
	    	fileChooser.getExtensionFilters().add(new ExtensionFilter("�̹�������:image file","*png","*jpeg","*jpg","*gif" ));
	    	
	    	File file = fileChooser.showOpenDialog(new Stage());
	    	
	    	txtpath.setText("���ϰ�� : " + file.getPath());
	    	
	    	pimage = file.toURI().toString();
	    	
	    	Image image = new Image(pimage);
	    	img.setImage(image);
	    	
	    	// *������ ������ ����������Ʈ ������ ����(�̵�)
	    	
	    	try {
	    	// 1. ���� �Է½�Ʈ��
	    	FileInputStream inputStream = new FileInputStream(file);
	    	
	    	// 2. ���� ��� ��Ʈ��
	    	
    		File copyfile = new File("C:/Users/apoch/git/java/java/java4/src/img/"+file.getName());
	    	FileOutputStream outputStream = new FileOutputStream(copyfile);
	    	byte[] bytes = new byte[1024*1024*1024];
	    	int size;
	    	while( (size = inputStream.read(bytes)) > 0) {
	    		outputStream.write(bytes,0,size);
	    		
	    	}
	    	pimage = copyfile.toURI().toString();
	    	// �뷮�� ū ��쿡�� ��Ʈ�� ���� �ʼ�
	    	inputStream.close();
	    	outputStream.close();
	    	
	    	}catch(Exception e) {System.out.println(e);}
	    	
		    	
	    	
	    	
	    	
	    	
	    	

	    }
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}
