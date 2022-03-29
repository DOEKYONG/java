package �Ŵ���_test;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DB {
	
	public void memberSave() {
		
		// try FileOutputStream�� ������ ������ �Ϲݿ��� �߻������� try�� �����ش�
		try {
			// FileOutputStream ��ü�� = new FileOutputStream(������ġ)
			FileOutputStream outputStream = new FileOutputStream("D:/memberDB.txt");
			// for���� �������Ʈ ���� ��ŭ ������ temp�� �ӽ�����
			for(Member temp : Controller.memberlist) {
				// ���ڿ��� �����ؼ� �� ��ü�� ������ͼ� �ϳ��� ���ڿ��� ����
				String memberSave = temp.getId()+","+temp.getPw()+","+temp.getName()+","+temp.getPhone()+","+temp.isCheck()+"\n";
				// OutputStream�� write�޼ҵ带 �̿��ػ� ��ݸ��� ���ڿ��� ����Ʈ�� ����
				outputStream.write(memberSave.getBytes());
			}
		}
		// catch(�������� ��ü��) ���ܰ� �߻����� ��� [ EX)������ ������� ] �����ϴ� ���๮
		catch(Exception e) {
			
		}
	}
	
	
	public void memberLoad() {
		
		// try FileInputStream�� ������ ������ �Ϲݿ��� �߻������� try�� �����ش�
		try {
			// FileInputStream ��ü�� = new FileInputStream(������ġ)
			FileInputStream inputStream = new FileInputStream("D:/memberDB.txt");
			// ����Ʈ���� ���� [ ����Ʈ�迭 ��ü�� = new ����Ʈ�迭[����]
			byte[] bytes = new byte[1024]; 
			// InputStream�� read�޼ҵ带 �̿��ؼ� �ش� ������ ����Ʈ���� �ҷ���
			inputStream.read(bytes); 
			// ����Ʈ���� �ҷ��� ������ ���ڿ��� ��ȯ
			String file = new String(bytes); 
			// ���ڿ��� slip�� ���� ���� ©�� �迭�� ����
			String[]list = file.split("\n"); 
			
			int i = 0;
			// ���ڿ��迭�� ����� ��Ҹ� temp���ӽ� ����
			for(String temp : list) {
				// �ε����� +1 �� ���̿� ���ٸ� ����
				// �ε����� ���� �������̶�� ����
				if( i+1 == list.length ) {
					break; 
				}
				// \n�� ���پ� �迭�� ����� ���ڿ���ҵ��� ,�� �ѹ� �� ������
				String[] filed = temp.split(",");
				// �߸� ���ڿ����� ��ҷ� ������ ��üȭ�� ��Ŵ
				Member temp2 = new Member(filed[0],filed[1],filed[2],filed[3],Boolean.parseBoolean(filed[4]));
				// ��üȭ ��Ų ��Ҹ� ����Ʈ�� �߰�
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
