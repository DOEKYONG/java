package 개인과제;

import java.util.Scanner;

public class 엘레베이터 {
	
//	엘레베이터
//
//	내가 있는 층수
//
//	올라가는버튼을 눌렀을때
//	올라가려는 층수 입력
//
//	내려가는버튼 을 눌렀을때
//	내려가는 층수 입력



	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
	while (true) {
		System.out.println("---------엘레베이터-----------");
		System.out.println("현재위치한 층수를 입력하세요  : "); int now = scanner.nextInt();
		while(true) { // 엘레베이터 작동 while
		System.out.println(" 1.올라가기 2.내려가기 "); int ch = scanner.nextInt();
		if(ch == 1) { //올라가기를 선택했을경우 
			System.out.println("올라갈 층수를 입력하세요 : "); int floor = scanner.nextInt();
			if(floor != now && floor>now ) { // 올라가려는 층수가 현재층이 아니면서 올라가려는층이 현재층보다 높을경우 
				System.out.println(floor+"층으로 올라갑니다."); 
				now = floor; // 올라간 층으로 현재층 변경 
			}else if(floor == now) { // 현재층에서 현재층으로 올라가려 할 경우 
				System.out.println("올라갈수없습니다!! 현재"+floor+"층입니다.");
			}else {System.out.println("올라가려는 층수가 현재층수보다 낮습니다. ");} // 올라가려는 층수가 현재층보다 낮을경우 
			
		}else if(ch == 2) { // 내려가기 선택했을경우 
			if(now == 1) { // 현재층이 1층일경우 
				System.out.println("1층에서 더 내려갈 수 없습니다."); 
			}
			System.out.println("내려갈 층수를 입력하세요 : "); int floor = scanner.nextInt();
			if(floor != now && floor<now ) { // 내려가려는 층이 현재층이 아니면서  현재층이 내려가려는 층보다 높을경우
				System.out.println(floor+"층으로 내갑려갑니다.");
				now = floor; // 내려간층으로 현재층 변경 
			}else if(floor == now) { // 내려가려는층과 현재층이 같은경우 
				System.out.println("내려갈수없습니다!! 현재"+floor+"층입니다.");
			}else {System.out.println("내려가려는 층수가 현재층수보다 높습니다.");}
			
		}
		else {System.out.println("잘못된입력입니다.");}
		}
		
		
		
		
		
	} // while end

	} // m e

} // c e
