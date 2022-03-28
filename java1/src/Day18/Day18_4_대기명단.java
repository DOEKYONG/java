package Day18;

import java.util.ArrayList;
import java.util.Scanner;

public class Day18_4_대기명단 {

	public static void main(String[] args) {
		
		// 대기명단 프로그램
			// 메뉴 : [고객] 1.대기추가  2.대기취소 [ 관리자 ] 3.대기자입장
				// 대기추가 : 인원수를 입력받아 대기번호 반환
				// 대기취소 : 대기번호 입력받아 명단 취소
				// 대기자입장 : 첫번째 대기중인 대기번호 호출
			Scanner scanner =new Scanner(System.in);
			int  대기번호 = 1;
			ArrayList<대기> 대기명단 = new ArrayList<>();
		while(true) {
			
			// 반복문을 이용한 리스트내 모든 객체 호출
			System.out.println(" 대기번호 \t 인원수 \t 대기예약시간");	
			for(대기 temp : 대기명단) {
					if(대기명단.indexOf(temp) ==0) {System.out.println(temp.대기번호+"\t"+temp.인원수+"\t 입장");}
					else {System.out.println(temp.대기번호+"\t"+temp.인원수+"\t"+대기명단.indexOf(temp)*3+"분");}
				}
			
			System.out.println("[고객] 1.대기추가 2.대기취소 [관리자] 3.대기자입장");
			int ch = scanner.nextInt();
			if(ch==1) {
				System.out.println(" 전화번호 : "); String 전화번호 = scanner.next();
				System.out.println(" 인원수 : "); int 인원수 = scanner.nextInt();
				// 2. 3개변수 -> 1개 객체화
				대기 temp  = new 대기(대기번호,전화번호,인원수);
				// 3. 대기 인원들을 리스트에 저장
				대기명단.add(temp);
				// *대기번호 증가
				대기번호++;
				
			}
			else if(ch==2) {
				System.out.println(" 대기번호 : "); int 삭제대기번호 = scanner.nextInt();
				// 리스트내 객체 필드 검색
				for( 대기 temp : 대기명단 ) {
					if(temp.대기번호 == 삭제대기번호) {
						대기명단.remove(temp); break;
				// * 대기명단 리스트에 하나씩 temp 호출하는데 만약에  temp내 대기번호가 입력받은 삭제대기번호와 같으면 해당 temp는 삭제후 반복문종료
					}
				}
			}
			else if(ch==3) {
				System.out.println("가장 앞에 있는 대기명단을 입장 시킵니다. "); 대기명단.remove(0); // 0번째 인덱스 삭제
			}
			else {}
		}
		
		
		
		
		
	}
}
