package Team_0323_�Ŵ���;

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
				//��ȭ ���
				Date date = new Date();
				SimpleDateFormat dates = new SimpleDateFormat("yyyy - MM - dd HH : mm");
				String nowtime = dates.format(date);
				System.out.println("--------------------------------------------------------");
				System.out.println("\t���� �ð� : "+ nowtime);
				System.out.println("--------------------------------------------------------");
				System.out.printf("|\t%s\t\t| %s | %s | \n","����","���� �ð�","���� �ð�");
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
				
				
				
				
				
				System.out.println("1. ȸ������ 2.�α��� 3.���̵�ã�� 4.��й�ȣã�� 5.���� ");
				System.out.println("���� : ");
				String ch = scanner.next();
				if(ch.equals("1")) {
					String id = null;
					String pw = null;
					String phone = null;
					String name = null;
					
				System.out.println("���̵��Է� : "); id = scanner.next();
				System.out.println("��й�ȣ �Է� : "); pw = scanner.next();
				System.out.println("�̸��Է� : "); name = scanner.next();
				System.out.println("��ȭ��ȣ �Է� : "); phone = scanner.next();
				int result = con.sign(id, pw, name, phone);
				// �ߺ��nũ
				if(result == 1 ) { // ȸ������
					System.out.println("ȸ�����Լ���");
				}
				else {System.out.println("ȸ�����Խ���");} 
					
				}
				else if(ch.equals("2")) { // �α��θ޴�
					System.out.println("���̵� : ");
					String id = scanner.next();
					System.out.println("��й�ȣ : ");
					String pw =scanner.next();
				String result = con.login(id, pw);
				if(result.equals("admin")) {
					System.out.println("������ �α���");
					main.adminmenu();
				}
				else if(result.equals("false")) {
					System.out.println("�α��ν���");
				}
				else {
					System.out.println(result + "�� ȯ�� �մϴ�.");
					main.membermneu(result);
				}
					
				}
				else if(ch.equals("3")) { // ���̵�ã��
					System.out.println("�̸� : ");
					String name = scanner.next();
					System.out.println("��ȭ��ȣ :");
					String phone = scanner.next();
					String result = con.findid(name, phone);
					if(result.equals("false")) {
						System.out.println("�ش��ϴ� ���̵� �����ϴ�.");
					}else {System.out.println("ȸ������ ���̵��  :" + result);}
					
					
				}
				else if(ch.equals("4")) { // ��й�ȣã��
					System.out.println("���̵� : ");
					String id = scanner.next();
					System.out.println("��ȭ��ȣ : ");
					String phone = scanner.next(); 
					String result = con.findpw(id, phone);
					if(result.equals("false")) {
						System.out.println("�ش��ϴ� ��й�ȣ�� �����ϴ�.");
					}else {System.out.println("ȸ������ �н������ :" + result);}
					
				}
				else if(ch.equals("5")) {
					System.out.println("���α׷��� �����մϴ�.");
					break;
					
				}
				else {System.out.println("�������� �ʴ� �޴��Դϴ�.");}
				
			} 
			catch(Exception e) {}
		}
		

	}
	
	Scanner scanner = new Scanner(System.in);
	public void membermneu(String id) {
		String t_id= id;
		Controller con = new Controller();
		while(true) {
			System.out.println("1.���� 2.������� 3. ����Ȯ�� 4.ȸ������ 5.�α׾ƿ�");
			String ch = scanner.next();
			if(ch.equals("1")) { // ����
				
					//��ȭ ���
					int i = 1;
					Date date = new Date();
					SimpleDateFormat dates = new SimpleDateFormat("yyyy - MM - dd HH : mm");
					String nowtime = dates.format(date);
					System.out.println("--------------------------------------------------------");
					System.out.println("\t���� �ð� : "+ nowtime);
					System.out.println("--------------------------------------------------------");
					System.out.printf("|%s\t%s\t\t| %s | %s | \n","��ȣ","����","���� �ð�","���� �ð�");
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
					System.out.println("�����ҹ�ȣ�� �Է����ּ��� : "); int num = scanner.nextInt();
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
									 System.out.println("A��");
								 }
								 if(j==19) {
									 System.out.println("B��");
								 }
								 if(j==29) {
									 System.out.println("C��");
								 }
								 if(j==39) {
									 System.out.println("D��");
								 }
								 if(j==49) {
									 System.out.println("E��");
								 }
							}
							
						}
						
						System.out.println("�¼��������ϼ��� : " ); 
						int seat = scanner.nextInt();
						String Tseat = null;
						for(int p=0; p<Controller.theater.length;p++) {
							if(Controller.theater[seat].equals("[  x  ]")) {
								System.err.println("�̹� ���õ� �¼��Դϴ�.");
								break;
							}
							else {
								////�¼�����
								
								
								if(Controller.theater[seat]!=null && Controller.theater[seat].equals("[ "+seat+" ]")) {
									con.theater[seat] = "[  x  ]";
									if(seat<=9) {
										 Tseat = "A��"+seat+"��";
										System.out.println(Tseat+" �¼��� ���õǾ����ϴ�.");
										con.reserve(num,t_id,seat);
										break;
										}
									else if(seat<=19) {
										 Tseat = "B��"+seat+"��";
										System.out.println(Tseat+" �¼��� ���õǾ����ϴ�.");
										con.reserve(num,t_id,seat);
										break;
									}
									else if(seat<=29) {
										 Tseat = "C��"+seat+"��";
										System.out.println(Tseat+" �¼��� ���õǾ����ϴ�.");
										con.reserve(num,t_id,seat);
										break;
									}
									else if(seat<=39) {
										 Tseat = "D��"+seat+"��";
										System.out.println(Tseat+" �¼��� ���õǾ����ϴ�.");
										con.reserve(num,t_id,seat);
										break;
									}
									else if(seat<=49) {
										 Tseat = "E��"+seat+"��";
										System.out.println(Tseat+" �¼��� ���õǾ����ϴ�.");
										con.reserve(num,t_id,seat);
										break;
									}
									else {System.err.println("�¼��� �����ϴ�.");}
									}
								
								}
							}
						
						
						
						
					} else {System.out.println(" �������� �ʽ��ϴ�.");}
					
			}
			else if ( ch.equals("2")) { // �������
				int i = 1;
				System.out.println("===============�������===============");
				System.out.println("i\t��ȭ����\t���۽ð�\t���Ź�ȣ\t    �¼���ȣ");
				for(Ticket temp : con.ticketlist) {
					if(temp.getT_id().equals(id)) {
					System.out.println(i+"\t"+temp.getT_title()+"\t"
							+temp.getT_intime()+"\t"+temp.getT_num()+ "\t" + temp.getT_seat()  );
					i++;
					}
				}
				
				System.out.println("����� ���Ź�ȣ�� �Է��ϼ��� : ");
				int num = scanner.nextInt();
//				if(num !=0 && con.ticketlist.size()>num-1) {
//					System.out.println("��й�ȣ�� �Է��ϼ��� : "); String pw = scanner.next();
//					if(con.memberlist.get(num-1).getPw().equals(pw)) {
//						con.cancle(num-1);
//					}
//				}
//				else {System.out.println("���������ʴ¹�ȣ");}
				int result = con.cancle(num);
				if (result  ==2 ) {
					System.out.println("��ҿϷ�");
				}
				else {System.out.println("����ġ");}
				
				
				
				
				
			}
			else if ( ch.equals("3")) { // ����Ȯ��
				int i =1;
				System.out.println("===============����Ȯ��===============");
				System.out.println("��ȣ\t��ȭ����\t���۽ð�\t���Ź�ȣ\t    �¼���ȣ");
				for(Ticket temp : con.ticketlist) {
					if(temp.getT_id().equals(id)) {
					System.out.println(i+"\t"+temp.getT_title()+"\t"
							+temp.getT_intime()+"\t"+temp.getT_num()+ "\t" + temp.getT_seat()  );
					i++;
					}
				}
				
			}
			else if ( ch.equals("4")) { // ȸ������
				
			}
			else if ( ch.equals("5")) { // �α׾ƿ�
				System.out.println("�α׾ƿ�");break;
			}
			else {System.out.println("�߸����Է�");}
		}
		
	}
	
	public void adminmenu() {
		Controller con = new Controller();
		while(true) {
			System.out.println("������ �޴�");
			System.out.println("1.��ȭ��� 2.��ȭ���� 3.����Ȯ�� 4.�α׾ƿ�");
			System.out.println(); String ch = scanner.next();
			if(ch.equals("1")) { // ��ȭ���
				System.out.println("��ȭ���� �Է� :");
				String title = scanner.next();
				System.out.println("���۽ð� �Է� :");
				String intime = scanner.next();
				System.out.println(" ��Ÿ��  : ");
				String runtime = scanner.next();
				con.moive_register(title, intime, runtime);
				
			}
			else if(ch.equals("2")) { // ��ȭ����
				
				System.out.println("������ ��ȭ�� �Է��ϼ��� :");
				String title = scanner.next();
				System.out.println("������ ��ȭ�� ���۽ð��� �Է��ϼ��� : ");
				String intime = scanner.next();
				String result = con.movie_remove(title, intime); 
				if(result.equals("suc")) {
					System.out.println("��ȭ�� �����߽��ϴ�.");
				}
				else {System.out.println("���� ���� ��ȭ�̸��� �ð� ����ġ");}
					
				
			}
			else if(ch.equals("3")) { // ����Ȯ��
				
			}
			else if(ch.equals("4")) { // �α׾ƿ�
				System.out.println("�α׾ƿ��մϴ�");
				break;
				
			}
			else {System.out.println("�߸����Է� ");}
			
		} // while end
	}

}
