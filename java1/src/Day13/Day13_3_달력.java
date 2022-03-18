package Day13;

import java.util.Calendar;
import java.util.Scanner;

public class Day13_3_달력 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner( System.in);
		System.out.print(" 연도 :"); int year = scanner.nextInt();
		System.out.print(" 월 :");	int month = scanner.nextInt();
		
		달력( year , month );
		
	} // main end 
	
	//1.달력메소드 
	public static void 달력( int year , int month ) {
		while(true) {
		// 1. 캘린더 클래스내 현재 날짜/시간 객체 호출 
		Calendar calendar = Calendar.getInstance(); //예) 2022년3월18일
		// * 해당 월의 1일의 요일찾기 
			// 1. 사용자 정의 캘린터 설정 
			calendar.set( year , month-1 , 1 ); // 예) 2022년3월1일
			// 2. 3월1일의 요일 
			int sweek = calendar.get( Calendar.DAY_OF_WEEK );
			// 3. 3월의 마지막 일 
			int eday = calendar.getActualMaximum( Calendar.DAY_OF_MONTH );
		// 3. 출력 
		System.out.println(" ********************** "+year+"년" + month+"월 ******************");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		// * 현재 월 1일의 위치 앞에 공백 채우기 
		for( int i = 1 ; i < sweek ; i++ ) { // 3월1일 = 화 = 3 
			System.out.print("\t"); // 공백출력
		}
		// 1일부터 마지막날짜 까지 출력 
		for( int i = 1 ; i<=eday ; i++ ) {
			 // i = 일수 출력
			System.out.print(i+"\t");
			// 토요일마다 줄바꿈처리 [ 토요일=7 ] 요일이 7배수마다
			if( sweek % 7 == 0 ) System.out.println();
			 // 하루씩 요일 증가 
			sweek++;
		}
		// 버튼 [ 1.◀(이전달)  2.▶(다음달) 3.다시검색 ]
		try { // 만약에 try{}안에서 예외 [에러] 가 발생하면 catch로 이동
			
		
		System.out.print(" \n \n 1.◀(이전달)  2.▶(다음달) 3.다시검색 4. 종료");
		Scanner scanner = new Scanner(System.in); int ch = scanner.nextInt();
		if( ch ==1 ) {
			month -= 1;
			if (month == 0) {year -=1;  month = 12 ; }
			}
		else if(ch ==2) {
			month +=1;
			if ( month == 13) {month =1; year +=1 ;}
			}
		else if(ch ==3) {
			System.out.print(" 연도 :");  year = scanner.nextInt();
			System.out.print(" 월 :");	 month = scanner.nextInt();
		}
		else if(ch ==4) {
			System.out.println(" 프로그램 종료");
			return;
		}
		else {System.out.println("알수없는번호");
		
		}
		} catch(Exception e) {
			System.out.println("정상적인입력을해주세요!");
		}
		
	} // while end
		
		
		
	} // 달력 메소드 end 
} // class end 

