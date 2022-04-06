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
    	// 1. ��Ʈ�ѿ� �Էµ� ������ ��������
    	String pname = txtpname.getText();
    	String pcontent = txtpcontent.getText();
    	int pprice = Integer.parseInt( txtpprice.getText() ) ;	// ���ڿ� -> ������ ��ȯ [ Integer.parseInt ]
    		// * ī�װ�
    	String pcategory = null;
    		if( opt1.isSelected() ) { // ���࿡ opt1��� fxid�� ��Ʈ��(������ư)�� ���õǾ�����
    			pcategory="�����Ƿ�";
    		}
    		if( opt2.isSelected() ) { pcategory ="�����Ƿ�";}
    		if( opt3.isSelected() ) { pcategory ="���ӱ��";}
    		if( opt4.isSelected() ) { pcategory ="��Ȱ��ǰ";}
    	int mnum = Login.member.getMnum();
    	// 2. ��üȭ
    	Product product = new Product(0, pname, pimage, pcontent, pcategory, pprice, 1, null, mnum);
    	// 3. DBó��
    	boolean result =  ProductDao.productDao.add(product);
    	// 4. ���ó��
    	if( result ) {
    		Alert alert = new Alert(AlertType.INFORMATION);
    			alert.setHeaderText("��ǰ ��� �Ϸ� ");
    			alert.showAndWait();
    			Home.home.loadpage("/view/product/product.fxml");
    	}else {
    		
    	}
    	
    }

    @FXML
    void back(ActionEvent event) {
    	Home.home.loadpage("/view/product/product.fxml");
    }
    
    private String pimage = null; // �޼ҵ� �ۿ��� �����ϴ� ���� : imgadd�޼ҵ�� add �޼ҵ忡�� ����ϱ� ����

    @FXML
    void imgadd(ActionEvent event) { // �̹������ ��ư�� Ŭ��������
    	// 1. ���� ���� Ŭ����
    	FileChooser fileChooser = new FileChooser();
    	
    	// 2. ���� ����[����] ����
    		fileChooser.getExtensionFilters().add(new ExtensionFilter("�̹�������:image file", "*png","*jpeg","*jpg","*gif"));
    	
    	// 3. ���ο� stage���� ���ϼ��� ȭ�� ����
    	File file  = fileChooser.showOpenDialog(new Stage() );
    		// ���ϼ��ð�ü.showOpenDialog(���������̸�) ;
    		// fileChooser ȭ�鿡�� ���õ� ������ file Ŭ������üȭ
    	
    	// 4. ������ ������ ���
    	txtpath.setText("���� ��� : " + file.getPath() );
    	
    	// 5. ���ϰ��
    	pimage = file.toURI().toString();
    	
    	// 6. �̸����� �̹�����Ʈ�ѿ� ����
    	Image image = new Image(pimage);
    	img.setImage(image);
    	
    	// * ������ ������ ���� ������Ʈ ������ ���� �̵� �ؿ��� 
    	try {
    		// 1. ���� �Է� ��Ʈ�� [ �̵� ���� : ����Ʈ ]
        	FileInputStream inputStream = new FileInputStream(file); // file : fileChosser ���� ���õ� ���� ��ü
        	// 2. ���� ��� ��Ʈ��
        		// 1. ���ο� ��� ���� 												/ �������
        	File copyfile = new File("C:/Users/apoch/git/java/java/java2_fx/src/img/" + file.getName() );
        	FileOutputStream outputStream = new FileOutputStream(copyfile);
        	// 3 . ����Ʈ �迭 ����
        	byte[] bytes = new byte[1024*1024*1024];
        	// 4. �ݺ����� �̿��� inputStream�� ���� ��Ʈ�� ��� �о����
        	int size;
        	while( (size = inputStream.read(bytes)) >0 ) { // �о�� ����Ʈ�� 0���� ������ �ݺ��� ���� [ �о�ù���Ʈ�� ����������]
        		outputStream.write(bytes,0,size);
        	}
        	// 5. �뷮 ū ��쿡�� ��Ʈ�� ���� �ʼ�!!
        	inputStream.close();
        	outputStream.close();
        	// * ����� �����ǰ�θ� db ����
        	pimage = copyfile.toURI().toString();
        	
        	
    	}catch(Exception e) {System.out.println(e);}
    	
    }
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	}
}

