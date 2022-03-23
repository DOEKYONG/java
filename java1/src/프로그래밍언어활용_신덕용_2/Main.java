package 프로그래밍언어활용_신덕용_2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
		System.out.println("---------------------- 주차 현황 표 ----------------------");
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("\t\tyyyy-MM-dd  HH:mm");
		System.out.println(sdf.format(date));
		System.out.println("\t날짜\t차량번호\t입차시간\t출차시간\t금액");
		for(Parking temp : Controller.carlist) {
			if(temp != null ) {
				System.out.println("   "+temp.getDate()+"\t"+temp.getCarNum()+"\t"+temp.getCarIntime()+"\t"+temp.getCarOuttime()+"\t"+temp.getPayMoney());
			}
		}
		System.out.println("-----------------------------------------------------------------");
		System.out.println("\t\t1.입차  2.출차"); int ch = scanner.nextInt();
		
		if(ch == 1) {
			System.out.println("차량번호를 입력하세요 :"); String carNum = scanner.next();
			boolean sw = true;
			for(int j = 0 ;j < Controller.carlist.size(); j++) {
				if(Controller.carlist.get(j).getCarNum().equals(carNum)) {
					System.out.println("중복된 차량입니다.");
					sw= false;
					break;
				}
			}
			if (sw==true) {
				Controller.incar(carNum);
				System.out.println("입차완료!!!");
			}
			
		}
		else if(ch == 2) {
			
			System.out.println("출차할 차량번호를 입력하세요 :"); String carNum = scanner.next();
			Controller.carout(carNum);
			
		}
		else {System.out.println("잘못된입력입니다.");}
		
		
		
		} // while end
	}	// main end

} //class end
