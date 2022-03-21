package 평가2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class 평가 {
	
//	1. 주차 현황 표 는 항상 출력이 되어 있도록 합니다. [ 10점 ]
//			  * 입차 시 출차시간은 주차중이며 출차 시 출차 시간을 대입합니다. 
//			  * 출차 가 아닌 차는 주차 중으로 표시 하고 출차를 진행한 차량은 출차시간을 표시합니다.
//			  * 금액은 주차중이면 정산전 으로 표시하고 출차시간이 존재할 경우 금액을 표시합니다.
//
//			2. 메뉴에서 1번 선택시 입차를 합니다. [ 10점 ]
//			  * 입차시 : 차량번호만 입력받습니다. [ 날짜 , 입차시간 , 출차시간 , 금액 은 입력받지 않습니다. ]
//			  * 임의로 5개의 차량을 등록하여 표시하시오. 
//
//			3. 메뉴에서 2번 선택시 출차를 합니다. [ 10점 ]
//			  * 출차시 : 차량번호만 입력받습니다.
//			  * 출차시 주차 현황표 에서 출차시간을 대입하고 금액을 계산하여 표시합니다.
//
//			4. 데이터는 키보드로 입력받아 차량 객체를 배열 및 리스트 에 저장합니다. [ 5점 ]
//
//			6. 입차시간과 출차시간을 계산하여 금액을 구하시오. [ 10점 ]
//			  * 최초 30분 무료 [ 10분당 1,000원 ]
//
//			7. 파일처리는 하지 않습니다.
//			8. 입력 오류에 대하여 예외발생 상황에 대한 처리를 합니다. [ 5점 ]

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("--------------------- 주차 현황 표 ---------------------");
			Date date = new Date();
			 SimpleDateFormat sdf 
				= new SimpleDateFormat("\t  \t    yyyy-MM-dd-hh:mm ");
			 System.out.println(sdf.format(date));
			 System.out.println();
			 System.out.println("\t날짜\t차량번호\t입차시간\t출차시간\t금액");
			 String sst = sdf.format(date);
			System.out.println("-----------------------------------------------------");
			
			int i =0;
			for(Parking temp :Controller.carlist) {
				if ( temp != null) {
					System.out.println("\t" + Controller.carlist.get(i).getDate()+"\t" + Controller.carlist.get(i).getCarNum());
				}
				
			}
			System.out.println("\t\t\t1.입차\t2.출차\t\t\t"); int ch = scanner.nextInt();
			
			if(ch ==1 ) {
				String payMoney = "정산전";
				String carIntime = null;
				String carOuttime = null;
				System.out.println(" 차량번호를 입력하세요 : "); String carNum = scanner.next();
				Controller.incar(sst, carNum, carIntime, carOuttime, payMoney);
			}
			else if( ch == 2) {}
			else {System.out.println("잘못된입력입니다.");}
			
			
			
			
		} // while end

	} // m e

} // c e
