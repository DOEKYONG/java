package Team_�Ŵ���;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;




public class Controller   {
	static ArrayList<Car> carlist = new ArrayList<>();
	// public static Car[] ���迭 = new Car[12];
	// ���� �޼ҵ�
	public static void CarIn(int carNum, String carTimeday,  int parking) {
			 Car savecar = new Car(carNum,carTimeday,parking);
	        	 carlist.add(savecar);	 
	        	 inCarSave();
	      }
		
	
	//
	
	
	// ���� �޼ҵ�
	
	// ���� �޼ҵ�

public static void inCarSave() {

	try {
	FileOutputStream outputStream = new FileOutputStream("D:/����.txt");
	// 2. ���Ͽ� �ۼ��� ���� [ ���پ� ]
	for(Car temp : carlist) {
		String ���� = temp.getcarNum() +","+temp.getcarTimeday()+","+temp.getparking()+"\n";
		outputStream.write(����.getBytes());
		}
	}
	catch(Exception e) {
	}
}

// �ҷ����� �޼ҵ�
public static void inCarLoad() {
	try {
		FileInputStream inputStream = new FileInputStream("D:/����.txt"); // 1. ����savecarŬ���� 
		byte[] bytes = new byte[1024]; // 2. ����Ʈ�迭 ����
		inputStream.read( bytes ); // 3. ��� ����Ʈ �о�ͼ� ����Ʈ�� ���� 
		String file = new String( bytes ); // 4. ����Ʈ -> ���ڿ� ��ȯ 
		String[] ����� = file.split("\n"); // 5. ���ڿ� �ڸ��� [ ���پ� [ \n ] -> 1����ü ] 
		int i = 0; // �ε��� �� 
		for( String temp : ����� ) { // �迭�� ���ڿ� �ϳ��� ������ 
			if( i+1 == �����.length ) break; // * ������ �ε���[��ü] ����
			String[] field = temp.split(","); // 6. ���ڿ� �ڸ��� [ ���� [,] -> ���ʵ� ] 
			Car �� = new Car(Integer.parseInt(field[0]),field[1],Integer.parseInt(field[2]));  // 7. ��üȭ 
									// ��ȸ���� �ʵ�� �������̹Ƿ� ���������� ����ȯ [ Integer.parseInt( ���ڿ� ) ]
			carlist.add(��);// 8. ����Ʈ ��� 
			i++; // �ε��� ���� 
		}
		
	}catch( Exception e ) {  }
	
}

}