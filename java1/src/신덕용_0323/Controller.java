package �Ŵ���_0323;


import java.util.ArrayList;



public class Controller {
	
	// ȸ������Ʈ
	static ArrayList<Member> memberlist = new ArrayList<>();
	// ��ȭ����Ʈ
	static ArrayList<Movie> movielist = new ArrayList<>();
	
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
	
		return "good";
	}
	
	public String login(String id,String pw) {
		
		Member members = new Member("admin","aa","aa","aa");
		memberlist.add(members);
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
	
	public void findid(String name, String phone) {//���̵�ã��

		for(Member temp : memberlist) {
			if(temp!=null&&temp.getName().equals(name)&&temp.getPhone().equals(phone)) {
				System.out.println("ȸ������ ���̵�: "+ temp.getId());
			} 
			else {System.out.println("�ش� ���̵� ã�� �� �����ϴ�.");
			}
		}///for
	}
	// ��
	public void findpw(String id,String phone) {
		for(Member temp : memberlist) {
			if(temp!=null&&temp.getId().equals(id)&&temp.getPhone().equals(phone)) {
				System.out.println("ȸ������ ��й�ȣ: "+ temp.getPw());
			}
			else {System.out.println("�ش� ��й�ȣ�� ã�� �� �����ϴ�.");
			}
		}///for
	}
	
	
	public void changepw() {}
	
	//��ȭ�ý���///////////////////////////////////////////////////////////////////////////
	
	public void reserve() {}
	
	public void myreserve() {}
	
	public void cancle() {}
	
	//������ �ý���/////////////////////////////////////////////////////////////////////////
	
	public void moive_register () {}
	
	public void movie_remove () {}
	
	public void sale() {}
	
	
	
}
