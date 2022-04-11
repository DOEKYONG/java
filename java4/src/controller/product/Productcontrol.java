package controller.product;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import controller.home.Home;
import dao.ProductDao;
import dto.Product;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class Productcontrol implements Initializable {

	
	 @FXML
	    private Button btnadd;

	    @FXML
	    private ScrollPane scrollpane;

	    @FXML
	    private VBox vbox;

	    @FXML
	    private TextField txtsearch;

	    @FXML
	    private Button btnsearch;

	    @FXML
	    void accadd(ActionEvent event) {
	    	Home.home.loadpage("/view/product/productadd.fxml");
	    }
	    
	    public static Product select; // 선택된 버튼의 제품번호저장
	    

	    @FXML
	    void search(ActionEvent event) {

	    }
	
	
	
	
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		ArrayList<Product> productlist = ProductDao.productDao.list();
		
		// 2 그리드
		GridPane gridPane = new GridPane();
		
		// *그리드 여백
		gridPane.setPadding(new Insets(10));
		// * 버튼들 여백
		gridPane.setHgap(20);
		gridPane.setVgap(20);
		
		
		// 3 반복문
		int i = 0;
		for (int row = 0; row <productlist.size()/3; row++) {
			
			for(int col = 0; col<3; col++) {
				
				ImageView imageView = new ImageView(new Image(productlist.get(i).getPimg()));
					imageView.setFitWidth(250);
					imageView.setFitHeight(200);
					
				Button button = new Button(null,imageView);	
				
				// 버튼배경제거
				button.setStyle("-fx-background-color:transparent");
				
				// 버튼 id값 넣기 [ 제품 식별 ]
				button.setId(i+"");
		
				
				// * 버튼 클릭이벤트
				button.setOnAction( e -> {
					System.out.println( e.toString());
					
					int id = Integer.parseInt( e.toString().split(",")[0].split("=")[2]);
					// 클릭한 제품 번호저장
					select = productlist.get(id);
					
					// 화면전환
					Home.home.loadpage("/view/product/productview.fxml");
					
				});
				
				
				gridPane.add(button, col, row);
				
				i++;
			}
			
		}
		// *3배수의 나머지값
		int row = productlist.size()/3;
		int remain = productlist.size()%3;
		if(remain != 0) {
	for(int col = 0; col<remain; col++) {
				ImageView imageView = new ImageView(new Image(productlist.get(i).getPimg()));
					imageView.setFitWidth(250);
					imageView.setFitHeight(200);
				Button button = new Button(null,imageView);	
				button.setStyle("-fx-background-color:transparent");
				button.setId(i+"");
				button.setOnAction( e -> {
					System.out.println( e.toString());
					int id = Integer.parseInt( e.toString().split(",")[0].split("=")[2]);
					// 클릭한 제품 번호저장
					select = productlist.get(id);
					
					Home.home.loadpage("/view/product/productview.fxml");
					
				});
				
				
				gridPane.add(button, col, row+1);
				
				i++;
			}
			
			
		}
		
		// 4. vbox에 그리드 넣기
		vbox.getChildren().add(gridPane);
		
		
	}
}
