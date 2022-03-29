package Team_0323_�Ŵ���;

import java.util.ArrayList;
import java.util.Random;




public class Controller {
	// ȸ������Ʈ
		static ArrayList<Member> memberlist = new ArrayList<>();
		// ��ȭ����Ʈ
		static ArrayList<Movie> movielist = new ArrayList<>();
		// ���Ÿ���Ʈ
		static ArrayList<Ticket> ticketlist = new ArrayList<>();
		// �¼��迭 
		static String[] theater = {	"[ 0 ]","[ 1 ]","[ 2 ]","[ 3 ]","[ 4 ]","[ 5 ]","[ 6 ]","[ 7 ]","[ 8 ]","[ 9 ]",
				"[ 10 ]","[ 11 ]","[ 12 ]","[ 13 ]","[ 14 ]","[ 15 ]","[ 16 ]","[ 17 ]","[ 18 ]","[ 19 ]",
				"[ 20 ]","[ 21 ]","[ 22 ]","[ 23 ]","[ 24 ]","[ 25 ]","[ 26 ]","[ 27 ]","[ 28 ]","[ 29 ]",
				"[ 30 ]","[ 31 ]","[ 32 ]","[ 33 ]","[ 34 ]","[ 35 ]","[ 36 ]","[ 37 ]","[ 38 ]","[ 39 ]",
				"[ 40 ]","[ 41 ]","[ 42 ]","[ 43 ]","[ 44 ]","[ 45 ]","[ 46 ]","[ 47 ]","[ 48 ]","[ 49 ]"};
	
		DB db = new DB();
	// ȸ������ �޼ҵ�
	public int sign ( String id, String pw, String name, String phone) {
		Member member = new Member( id,pw,name,phone,false);
		for(Member temp : Controller.memberlist) {
			if (temp !=null &&  temp.getId().equals(id)) {
				//���࿡ ������ �ƴϸ鼭 �迭�� id�� �Է¹��� id�� �����ϸ�
				System.out.println("�޼���)) ���� ������� ���̵��Դϴ�.");
				return 2; //�Լ����� --->���̵��ߺ����� ȸ������ ����
			}
		}
		memberlist.add(member);
		db.memberSave();
		return 1;
	}
	// �α��� �޼ҵ�
	public String login(String id,String pw) {
		
		for(Member temp : memberlist) {
			if(id.equals("admin")&& temp.getPw().equals(pw)) {
				return "admin";
			}
		else if(temp!=null && temp.getId().equals(id)&&temp.getPw().equals(pw)) {
				return temp.getId();
			}
		}return "false";
	}
	
	// ���̵�ã�� �޼ҵ�
	public String findid(String name, String phone) {
		for(Member temp : memberlist) {
			if(temp!=null && temp.getName().equals(name)&&temp.getPhone().equals(phone)) {
				return temp.getId();
			}
		} return "false";
	}
	
	// ��й�ȣ ã�� �޼ҵ�
	public String findpw(String id, String phone) {
		for (Member temp : memberlist) {
			if(temp!=null && temp.getId().equals(id)&&temp.getPhone().equals(phone)) {
				return temp.getPw();
			}
		} return "false";
	}
	// �Ϲ�ȸ�� �޴�
	// ����
	public void reserve(int num,String t_id,int seat ) {
		Random random = new Random();
		int t_num = random.nextInt(99999999)+10000000;
		
		
		
		
			if(num!= 0 ) {
				System.out.println("������ ��ȭ�� �̸� : "+movielist.get(num-1).getTitle());
				System.out.println("������ ��ȭ�� �ð� : " + movielist.get(num-1).getIntime());
				String t_title = movielist.get(num-1).getTitle();
				String t_intime = movielist.get(num-1).getIntime();
				String t_outtime = null;
				
				int t_money = movielist.get(num-1).getMoney(); 
				Ticket ticket = new Ticket ( t_id,  t_title,  t_intime, t_outtime, seat, t_num,t_money);
				ticketlist.add(ticket);
			}
		
		
	}
	// ���� ������ 
	public void myreserve() {
	}
	// ���� ���
	public int cancle(int num) {
		String str = "0000";
	
		int v = Integer.parseInt(str);
		for(Ticket temp : ticketlist) {
			if(temp.getT_num() == num) {
				int seat = temp.getT_seat();
				temp.setT_intime("���");
				
				temp.setT_num(0000000);
				theater[temp.getT_seat()] = "[ "+seat+" ]";
				temp.setT_money(0);
				
				return 2;
			}
		}return 3;
		
	}
	
	
	
	
	
	////�����ڸ޴�///////////////////////////////////////
	// ��ȭ���
	public void moive_register(String title,String intime,String runtime) {
		String [] startTime = intime.split(":");
		int startHour = Integer.parseInt(startTime[0]);
		int money = 0;
		if(startHour <= 10) {
			money = 5000;
		}else {
			money = 7000;
		}
		Movie movie = new Movie(title,intime,runtime,money);
		movielist.add(movie);
		db.movieSave();
		System.out.println("����Ϸ�");
		
	}
	
	// ��ȭ����
	public String movie_remove(String title, String intime) {
		for(Movie temp : movielist) {
			if(temp!=null && temp.getTitle().equals(title) && temp.getIntime().equals(intime))
			{
				movielist.remove(temp);
				db.movieSave();
				return "suc";
				
			}
		}
		
		return "false";
	}
	
	
	
	

}
