package 신덕용_test;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DB {
	
	public void memberSave() {
		
		// try FileOutputStream은 무조건 적으로 일반예외 발생함으로 try로 막아준다
		try {
			// FileOutputStream 객체명 = new FileOutputStream(파일위치)
			FileOutputStream outputStream = new FileOutputStream("D:/memberDB.txt");
			// for문을 멤버리스트 길이 만큼 돌려서 temp로 임시저장
			for(Member temp : Controller.memberlist) {
				// 문자열을 선언해서 각 객체를 가지고와서 하나의 문자열로 만듬
				String memberSave = temp.getId()+","+temp.getPw()+","+temp.getName()+","+temp.getPhone()+","+temp.isCheck()+"\n";
				// OutputStream의 write메소드를 이용해사 방금만든 문자열을 바이트로 저장
				outputStream.write(memberSave.getBytes());
			}
		}
		// catch(예외종류 객체명) 예외가 발생했을 경우 [ EX)파일이 없을경우 ] 실행하는 실행문
		catch(Exception e) {
			
		}
	}
	
	
	public void memberLoad() {
		
		// try FileInputStream은 무조건 적으로 일반예외 발생함으로 try로 막아준다
		try {
			// FileInputStream 객체명 = new FileInputStream(파일위치)
			FileInputStream inputStream = new FileInputStream("D:/memberDB.txt");
			// 바이트열을 선언 [ 바이트배열 객체명 = new 바이트배열[길이]
			byte[] bytes = new byte[1024]; 
			// InputStream의 read메소드를 이용해서 해당 정보를 바이트열로 불러옴
			inputStream.read(bytes); 
			// 바이트열로 불러온 정보를 문자열로 변환
			String file = new String(bytes); 
			// 문자열을 slip의 한줄 마다 짤라서 배열로 만듬
			String[]list = file.split("\n"); 
			
			int i = 0;
			// 문자열배열로 저장된 요소를 temp로임시 선언
			for(String temp : list) {
				// 인덱스의 +1 이 길이와 같다면 종료
				// 인덱스의 가장 마지막이라면 종료
				if( i+1 == list.length ) {
					break; 
				}
				// \n로 한줄씩 배열에 저장된 문자열요소들을 ,로 한번 도 나눠줌
				String[] filed = temp.split(",");
				// 잘린 문자열들을 요소로 나눠서 객체화를 시킴
				Member temp2 = new Member(filed[0],filed[1],filed[2],filed[3],Boolean.parseBoolean(filed[4]));
				// 객체화 시킨 요소를 리스트에 추가
				Controller.memberlist.add(temp2);
				i++;
			}
			
		}
		catch(Exception e) {
		}
	}
	
	public void movieSave() {
		try {
			FileOutputStream outputStream = new FileOutputStream("D:/movieDB.txt");
		
			for(Movie temp : Controller.movielist) {
				String memberSave = temp.getTitle()+","+temp.getIntime()+","+temp.getRuntime()+","+temp.getMoney()+"\n";
				outputStream.write(memberSave.getBytes());
			}
		}
		catch(Exception e) {
			
		}
	}
	
	public void movieLoad() {
		try {
			FileInputStream inputStream = new FileInputStream("D:/movieDB.txt");
			byte[] bytes = new byte[1024]; 
			inputStream.read(bytes); 
			String file = new String(bytes); 
			String[]list = file.split("\n"); 
			int i = 0;
			for(String temp : list) {
				if( i+1 == list.length ) {
					break; 
				}
				String[] filed = temp.split(",");
				Movie temp2 = new Movie(filed[0],filed[1],filed[2],Integer.parseInt(filed[3]));
				Controller.movielist.add(temp2);
				i++;
			}
			
		}
		catch(Exception e) {
		}
	}
	
	public void ticketSave() {
		try {
			FileOutputStream outputStream = new FileOutputStream("D:/ticketDB.txt");
		
			for(Ticket temp : Controller.ticketlist) {
				String ticketSave = temp.getT_id()+","+temp.getT_title()+","+temp.getT_intime()+","+temp.getT_outtime()+","+temp.getT_seat()
				+","+temp.getT_num()+","+temp.getT_money()+"\n";
				outputStream.write(ticketSave.getBytes());
			}
		}
		catch(Exception e) {
			
		}
	}
	
	public void ticketLoad() {
		try {
			FileInputStream inputStream = new FileInputStream("D:/ticketDB.txt");
			byte[] bytes = new byte[1024]; 
			inputStream.read(bytes); 
			String file = new String(bytes); 
			String[]list = file.split("\n"); 
			int i = 0;
			for(String temp : list) {
				if( i+1 == list.length ) {
					break; 
				}
				String[] filed = temp.split(",");
				Ticket temp2 = new Ticket(filed[0],filed[1],filed[2],filed[3],Integer.parseInt(filed[4]),Integer.parseInt(filed[5]),Integer.parseInt(filed[6]));
				Controller.ticketlist.add(temp2);
				i++;
			}
			
		}
		catch(Exception e) {
		}
	}
	
}
