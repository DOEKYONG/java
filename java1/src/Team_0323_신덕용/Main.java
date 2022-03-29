package Team_0323_신덕용;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;





public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Main main = new Main();
		Controller con = new Controller();
		
		DB db = new DB();
		db.memberLoad();
		db.movieLoad();
		
		while(true) {
			try {
				//영화 목록
				Date date = new Date();
				SimpleDateFormat dates = new SimpleDateFormat("yyyy - MM - dd HH : mm");
				String nowtime = dates.format(date);
				System.out.println("--------------------------------------------------------");
				System.out.println("\t현재 시간 : "+ nowtime);
				System.out.println("--------------------------------------------------------");
				System.out.printf("|\t%s\t\t| %s | %s | \n","상영작","시작 시간","종료 시간");
				System.out.println("--------------------------------------------------------");
				
				for(Movie movie : Controller.movielist) {
					
					movie.getIntime();
					movie.getRuntime();
					String [] new_intime = movie.getIntime().split(":");
					String [] new_runtime = movie.getRuntime().split(":");
					int intime_hour = Integer.parseInt(new_intime[0]);
					int intime_min = Integer.parseInt(new_intime[1]);
					int runtime_hour = Integer.parseInt(new_runtime[0]);
					int runtime_min = Integer.parseInt(new_runtime[1]);
					int outhour = (intime_hour+runtime_hour);
					int outmin = (intime_min+runtime_min);
					DecimalFormat df = new DecimalFormat("00");
					String out1 = df.format(outhour);
					String out2 = df.format(outmin);
					String outtime = out1+":"+out2;
					System.out.printf("|\t%s\t| %s | %s | \n",movie.getTitle(),movie.getIntime(),outtime);
					
					
					
					
					
				}
				
				
				
				
				
				System.out.println("1. 회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기 5.종료 ");
				System.out.println("선택 : ");
				String ch = scanner.next();
				if(ch.equals("1")) {
					String id = null;
					String pw = null;
					String phone = null;
					String name = null;
					
				System.out.println("아이디입력 : "); id = scanner.next();
				System.out.println("비밀번호 입력 : "); pw = scanner.next();
				System.out.println("이름입력 : "); name = scanner.next();
				System.out.println("전화번호 입력 : "); phone = scanner.next();
				int result = con.sign(id, pw, name, phone);
				// 중복쳌크
				if(result == 1 ) { // 회원가입
					System.out.println("회원가입성공");
				}
				else {System.out.println("회원가입실패");} 
					
				}
				else if(ch.equals("2")) { // 로그인메뉴
					System.out.println("아이디 : ");
					String id = scanner.next();
					System.out.println("비밀번호 : ");
					String pw =scanner.next();
				String result = con.login(id, pw);
				if(result.equals("admin")) {
					System.out.println("관리자 로그인");
					main.adminmenu();
				}
				else if(result.equals("false")) {
					System.out.println("로그인실패");
				}
				else {
					System.out.println(result + "님 환영 합니다.");
					main.membermneu(result);
				}
					
				}
				else if(ch.equals("3")) { // 아이디찾기
					System.out.println("이름 : ");
					String name = scanner.next();
					System.out.println("전화번호 :");
					String phone = scanner.next();
					String result = con.findid(name, phone);
					if(result.equals("false")) {
						System.out.println("해당하는 아이디가 없습니다.");
					}else {System.out.println("회원님의 아이디는  :" + result);}
					
					
				}
				else if(ch.equals("4")) { // 비밀번호찾기
					System.out.println("아이디 : ");
					String id = scanner.next();
					System.out.println("전화번호 : ");
					String phone = scanner.next(); 
					String result = con.findpw(id, phone);
					if(result.equals("false")) {
						System.out.println("해당하는 비밀번호가 없습니다.");
					}else {System.out.println("회원님의 패스워드는 :" + result);}
					
				}
				else if(ch.equals("5")) {
					System.out.println("프로그램을 종료합니다.");
					break;
					
				}
				else {System.out.println("존재하지 않는 메뉴입니다.");}
				
			} 
			catch(Exception e) {}
		}
		

	}
	
	Scanner scanner = new Scanner(System.in);
	public void membermneu(String id) {
		String t_id= id;
		Controller con = new Controller();
		while(true) {
			System.out.println("1.예매 2.예매취소 3. 예매확인 4.회원정보 5.로그아웃");
			String ch = scanner.next();
			if(ch.equals("1")) { // 예매
				
					//영화 목록
					int i = 1;
					Date date = new Date();
					SimpleDateFormat dates = new SimpleDateFormat("yyyy - MM - dd HH : mm");
					String nowtime = dates.format(date);
					System.out.println("--------------------------------------------------------");
					System.out.println("\t현재 시간 : "+ nowtime);
					System.out.println("--------------------------------------------------------");
					System.out.printf("|%s\t%s\t\t| %s | %s | \n","번호","상영작","시작 시간","종료 시간");
					System.out.println("--------------------------------------------------------");
					
					for(Movie movie : Controller.movielist) {
						
						movie.getIntime();
						movie.getRuntime();
						String [] new_intime = movie.getIntime().split(":");
						String [] new_runtime = movie.getRuntime().split(":");
						int intime_hour = Integer.parseInt(new_intime[0]);
						int intime_min = Integer.parseInt(new_intime[1]);
						int runtime_hour = Integer.parseInt(new_runtime[0]);
						int runtime_min = Integer.parseInt(new_runtime[1]);
						int outhour = (intime_hour+runtime_hour);
						int outmin = (intime_min+runtime_min);
						DecimalFormat df = new DecimalFormat("00");
						String out1 = df.format(outhour);
						String out2 = df.format(outmin);
						String outtime = out1+":"+out2;
						System.out.printf("|%d\t%s\t| %s | %s | \n",i,movie.getTitle(),movie.getIntime(),outtime);
						i++;
					}		
					
					//
					System.out.println("예매할번호를 입력해주세요 : "); int num = scanner.nextInt();
					if(num!=0 && con.movielist.size()>num-1 ) {
						for(Ticket temp : con.ticketlist) {
							if(temp == null) {
								con.theater[50] = "["+temp.getT_seat()+"]";
							}
						}
						for(int j = 0; j<con.theater.length; j++ ) {
							System.out.print(con.theater[j]);
							if(j%10==9) {
								 if(j==9) {
									 System.out.println("A열");
								 }
								 if(j==19) {
									 System.out.println("B열");
								 }
								 if(j==29) {
									 System.out.println("C열");
								 }
								 if(j==39) {
									 System.out.println("D열");
								 }
								 if(j==49) {
									 System.out.println("E열");
								 }
							}
							
						}
						
						System.out.println("좌석을선택하세요 : " ); 
						int seat = scanner.nextInt();
						String Tseat = null;
						for(int p=0; p<Controller.theater.length;p++) {
							if(Controller.theater[seat].equals("[  x  ]")) {
								System.err.println("이미 선택된 좌석입니다.");
								break;
							}
							else {
								////좌석선택
								
								
								if(Controller.theater[seat]!=null && Controller.theater[seat].equals("[ "+seat+" ]")) {
									con.theater[seat] = "[  x  ]";
									if(seat<=9) {
										 Tseat = "A열"+seat+"번";
										System.out.println(Tseat+" 좌석이 선택되었습니다.");
										con.reserve(num,t_id,seat);
										break;
										}
									else if(seat<=19) {
										 Tseat = "B열"+seat+"번";
										System.out.println(Tseat+" 좌석이 선택되었습니다.");
										con.reserve(num,t_id,seat);
										break;
									}
									else if(seat<=29) {
										 Tseat = "C열"+seat+"번";
										System.out.println(Tseat+" 좌석이 선택되었습니다.");
										con.reserve(num,t_id,seat);
										break;
									}
									else if(seat<=39) {
										 Tseat = "D열"+seat+"번";
										System.out.println(Tseat+" 좌석이 선택되었습니다.");
										con.reserve(num,t_id,seat);
										break;
									}
									else if(seat<=49) {
										 Tseat = "E열"+seat+"번";
										System.out.println(Tseat+" 좌석이 선택되었습니다.");
										con.reserve(num,t_id,seat);
										break;
									}
									else {System.err.println("좌석이 없습니다.");}
									}
								
								}
							}
						
						
						
						
					} else {System.out.println(" 존재하지 않습니다.");}
					
			}
			else if ( ch.equals("2")) { // 예매취소
				int i = 1;
				System.out.println("===============예매취소===============");
				System.out.println("i\t영화제목\t시작시간\t예매번호\t    좌석번호");
				for(Ticket temp : con.ticketlist) {
					if(temp.getT_id().equals(id)) {
					System.out.println(i+"\t"+temp.getT_title()+"\t"
							+temp.getT_intime()+"\t"+temp.getT_num()+ "\t" + temp.getT_seat()  );
					i++;
					}
				}
				
				System.out.println("취소할 예매번호를 입력하세요 : ");
				int num = scanner.nextInt();
//				if(num !=0 && con.ticketlist.size()>num-1) {
//					System.out.println("비밀번호를 입력하세요 : "); String pw = scanner.next();
//					if(con.memberlist.get(num-1).getPw().equals(pw)) {
//						con.cancle(num-1);
//					}
//				}
//				else {System.out.println("존재하지않는번호");}
				int result = con.cancle(num);
				if (result  ==2 ) {
					System.out.println("취소완료");
				}
				else {System.out.println("불일치");}
				
				
				
				
				
			}
			else if ( ch.equals("3")) { // 예매확인
				int i =1;
				System.out.println("===============예매확인===============");
				System.out.println("번호\t영화제목\t시작시간\t예매번호\t    좌석번호");
				for(Ticket temp : con.ticketlist) {
					if(temp.getT_id().equals(id)) {
					System.out.println(i+"\t"+temp.getT_title()+"\t"
							+temp.getT_intime()+"\t"+temp.getT_num()+ "\t" + temp.getT_seat()  );
					i++;
					}
				}
				
			}
			else if ( ch.equals("4")) { // 회원정보
				
			}
			else if ( ch.equals("5")) { // 로그아웃
				System.out.println("로그아웃");break;
			}
			else {System.out.println("잘못된입력");}
		}
		
	}
	
	public void adminmenu() {
		Controller con = new Controller();
		while(true) {
			System.out.println("관리자 메뉴");
			System.out.println("1.영화등록 2.영화삭제 3.매출확인 4.로그아웃");
			System.out.println(); String ch = scanner.next();
			if(ch.equals("1")) { // 영화등록
				System.out.println("영화제목 입력 :");
				String title = scanner.next();
				System.out.println("시작시간 입력 :");
				String intime = scanner.next();
				System.out.println(" 런타임  : ");
				String runtime = scanner.next();
				con.moive_register(title, intime, runtime);
				
			}
			else if(ch.equals("2")) { // 영화삭제
				
				System.out.println("삭제할 영화를 입력하세요 :");
				String title = scanner.next();
				System.out.println("삭제할 영화의 시작시간을 입력하세요 : ");
				String intime = scanner.next();
				String result = con.movie_remove(title, intime); 
				if(result.equals("suc")) {
					System.out.println("영화를 삭제했습니다.");
				}
				else {System.out.println("삭제 실패 영화이름과 시간 불일치");}
					
				
			}
			else if(ch.equals("3")) { // 매출확인
				
			}
			else if(ch.equals("4")) { // 로그아웃
				System.out.println("로그아웃합니다");
				break;
				
			}
			else {System.out.println("잘못된입력 ");}
			
		} // while end
	}

}
