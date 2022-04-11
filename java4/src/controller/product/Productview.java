package controller.product;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;

import controller.home.Home;
import controller.login.Login;
import dao.MemberDao;
import dto.Product;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Productview implements Initializable {
	
	@FXML
    private Button btnback;

    @FXML
    private ImageView img;

    @FXML
    private Button btnupdate;

    @FXML
    private Button btndelete;

    @FXML
    private TextField txtpname;

    @FXML
    private TextArea txtpcontent;

    @FXML
    private Label txtpprice;

    @FXML
    private Label txtpactivation;

    @FXML
    private Label txtpdate;

    @FXML
    private Label txtmid;

    @FXML
    private Button btnactivation;

    @FXML
    void activation(ActionEvent event) {

    }

    @FXML
    void back(ActionEvent event) {
    	Home.home.loadpage("/view/product/product.fxml");

    }

    @FXML
    void delete(ActionEvent event) {

    }

    @FXML
    void update(ActionEvent event) {

    }
	
	
	
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		Product product = Productcontrol.select;
		
		img.setImage(new Image(product.getPimg()));
		txtpname.setText(product.getPname() );
		txtpcontent.setText(product.getPcontent());
		
		DecimalFormat decimalFormat = new DecimalFormat("가격 : #,##0 원");
		txtpprice.setText("가격 : "+product.getPprice());
		if(product.getPactivation() == 1) {txtpactivation.setText("판매중");}
		if(product.getPactivation() == 2) {txtpactivation.setText("거래중");}
		if(product.getPactivation() == 3) {txtpactivation.setText("판매완료");}
		txtpdate.setText(product.getPdate());
		
		txtmid.setText("제품 등록회원 : " + MemberDao.memberDao.getmid(product.getMnum()) );
		
		txtpname.setEditable(false);
		txtpcontent.setEditable(false);
		
		// * 제품등록회원과 로그인 회원이 동일하지 않으면
		if( product.getMnum() != Login.member.getMnum() ) {
			btndelete.setVisible(false);
			btnupdate.setVisible(false);
		}
		
		
	}

}
