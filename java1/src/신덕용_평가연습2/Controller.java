package Team_신덕용;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;




public class Controller   {
	static ArrayList<Car> carlist = new ArrayList<>();
	// public static Car[] 차배열 = new Car[12];
	// 입차 메소드
	public static void CarIn(int carNum, String carTimeday,  int parking) {
			 Car savecar = new Car(carNum,carTimeday,parking);
	        	 carlist.add(savecar);	 
	        	 inCarSave();
	      }
		
	
	//
	
	
	// 출차 메소드
	
	// 저장 메소드

public static void inCarSave() {

	try {
	FileOutputStream outputStream = new FileOutputStream("D:/저장.txt");
	// 2. 파일에 작성할 내용 [ 한줄씩 ]
	for(Car temp : carlist) {
		String 내용 = temp.getcarNum() +","+temp.getcarTimeday()+","+temp.getparking()+"\n";
		outputStream.write(내용.getBytes());
		}
	}
	catch(Exception e) {
	}
}

// 불러오기 메소드
public static void inCarLoad() {
	try {
		FileInputStream inputStream = new FileInputStream("D:/저장.txt"); // 1. 파일savecar클래스 
		byte[] bytes = new byte[1024]; // 2. 바이트배열 선언
		inputStream.read( bytes ); // 3. 모든 바이트 읽어와서 바이트에 저장 
		String file = new String( bytes ); // 4. 바이트 -> 문자열 변환 
		String[] 차목록 = file.split("\n"); // 5. 문자열 자르기 [ 한줄씩 [ \n ] -> 1개객체 ] 
		int i = 0; // 인덱스 용 
		for( String temp : 차목록 ) { // 배열내 문자열 하나씩 꺼내기 
			if( i+1 == 차목록.length ) break; // * 마지막 인덱스[객체] 제외
			String[] field = temp.split(","); // 6. 문자열 자르기 [ 한줄 [,] -> 각필드 ] 
			Car 차 = new Car(Integer.parseInt(field[0]),field[1],Integer.parseInt(field[2]));  // 7. 객체화 
									// 조회수는 필드는 정수형이므로 정수형으로 형변환 [ Integer.parseInt( 문자열 ) ]
			carlist.add(차);// 8. 리스트 담기 
			i++; // 인덱스 증가 
		}
		
	}catch( Exception e ) {  }
	
}

}