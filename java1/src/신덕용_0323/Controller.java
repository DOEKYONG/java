package �Ŵ���_0323;


import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Scanner;







public class Controller {
	
	DB db = new DB();
	// ȸ������Ʈ
	static ArrayList<Member> memberlist = new ArrayList<>();
	// ��ȭ����Ʈ
	static ArrayList<Movie> movielist = new ArrayList<>();
	// Ƽ�ϸ���Ʈ
	static ArrayList<Ticket> ticketlist = new ArrayList<>();
	Scanner scanner = new Scanner(System.in);
	
	//ȸ�� �ý��� ////////////////////////////////////////////////////////////////////////
	//
	public String sign (String id, String pw,String name, String phone) {
		
		//���̵� �ߺ��˻�
		for(Member temp : memberlist) {
			if (temp !=null &&  temp.getId().equals(id)) {
				//���࿡ ������ �ƴϸ鼭 �迭�� id�� �Է¹��� id�� �����ϸ�
				System.out.println("���� ������� ���̵��Դϴ�.");
				return "bad"; //�Լ����� --->���̵��ߺ����� ȸ������ ����
			}
		}
		//ȸ������ �Է¹ޱ�
		
		//��üȭ
		Member member = new Member( id, pw, name, phone,false);
		//ȸ������ ����
		
		memberlist.add(member);
		db.memberSave();
	
		return "good";
	}
	
	public String login(String id,String pw) {
		db.memberLoad();
//		Member members = new Member("admin","aa","aa","aa");
//		memberlist.add(members);
		//�α��� �ߺ�üũ
		for(Member temp : memberlist) {
			if(temp!=null) {
				if(id.equals("admin") && temp.getPw().equals(pw)) {
					return "admin";
				}
				else if(temp.getId().equals(id)&&temp.getPw().equals(pw)) {
					return temp.getId(); //�α��μ��� ����Ʈ���ִ� ���̵� ����
				}
				
			}
			
		}
		return "ȸ��";
	}
	
	public String findid(String name, String phone) {//���̵�ã��

		for(Member temp : Controller.memberlist) {
			if(temp!=null&&temp.getName().equals(name)&&temp.getPhone().equals(phone)) {
				return temp.getId();
			}
		}
		return "false";
	}
	// ��
	public String findpw(String id,String phone) {
		for(Member temp : Controller.memberlist) {
			if(temp!=null&&temp.getId().equals(id)&&temp.getPhone().equals(phone)) {
				return temp.getPw();
			}
		}
		return "false";
	}
	
	
	public void changepw() {}
	
	//��ȭ�ý���///////////////////////////////////////////////////////////////////////////
	
	public void reserve(String title, String intime, String seat) {
		for(Movie temp : movielist ) {
			if(temp!=null) {
				if(seat==null&temp.getTitle().equals(title)&&temp.getIntime().equals(intime)) {
					
				}
			}
		}
	}
	
	public void myreserve() {
		// Ƽ�ϸ���Ʈ�� �������� -> ����� ���̵�� Ƽ���� ���̵� ���ٸ� Ƽ�ϸ���Ʈ�� ����� ������ ���
		
		
	} //????
	
	// ���Ź�ȣ����
	

	
	public void ticketsave( String id ,String t_title, String t_intime, String t_outtime,String t_seat) {
		// ���Ź�ȣ ����
		int t_num1 = (int)(Math.random() * (99999 - 10000 + 1)) + 10000;
		// �����Ҷ� �Է��� ������ ����
		Ticket ticket = new Ticket(id,t_title,t_intime,t_outtime,t_seat,t_num1);
		ticketlist.add(ticket);
		
		
		for(Ticket temp : ticketlist) {
			if(temp.getT_id().equals(id)) {
				
				
			}
		}
		
		
		
	}
	
	public void cancle() {} // ������� �޼ҵ�
	
	//������ �ý���/////////////////////////////////////////////////////////////////////////
	
//public static void moive_register (String title, String intime, String outtime, int money) {//��ȭ���
//		
//		
//		//��ȭƼ�ϰ��� ���
//		String [] startTime = intime.split(":");
//		
//		int startHour = Integer.parseInt(startTime[0]);
//		//int ���ۺ� = Integer.parseInt(startTime[1]);
//		
//		for(Movie temp: movielist) {
//		if(startHour <= 10) {
//			temp.setMoney(5000);
//			}
//		else {temp.setMoney(7000);}
//		}
//		
//		//��üȭ
//		Movie movie = new Movie(title, intime, outtime, money);
//		//����Ʈ�� ����
//		movielist.add(movie);
//		
//		
//		
//		//����ó��
//		try {//���ܰ� �߻��� �� ���� �ڵ� ����					
//			FileOutputStream outputStream = new FileOutputStream("D:/�����ο�ȭ.txt", true);
//			String movieRecord = title + "," + intime+ "," +outtime+  ","+ money + "\n"; //, : ����
//			outputStream.write(movieRecord.getBytes());	//���ڿ� ->����Ʈ��
//			}catch (Exception e) {//����[����] ó��[���] : Exception Ŭ����
//				
//			}
//			System.out.println("��ȭ ���� �Ϸ�");
//		
//	}
	
	public void movie_remove () {}
	
	public void sale() {}
	
	
	
}
