package ���α׷��־��Ȱ��_�Ŵ���_2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
		System.out.println("---------------------- ���� ��Ȳ ǥ ----------------------");
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("\t\tyyyy-MM-dd  HH:mm");
		System.out.println(sdf.format(date));
		System.out.println("\t��¥\t������ȣ\t�����ð�\t�����ð�\t�ݾ�");
		for(Parking temp : Controller.carlist) {
			if(temp != null ) {
				System.out.println("   "+temp.getDate()+"\t"+temp.getCarNum()+"\t"+temp.getCarIntime()+"\t"+temp.getCarOuttime()+"\t"+temp.getPayMoney());
			}
		}
		System.out.println("-----------------------------------------------------------------");
		System.out.println("\t\t1.����  2.����"); int ch = scanner.nextInt();
		
		if(ch == 1) {
			System.out.println("������ȣ�� �Է��ϼ��� :"); String carNum = scanner.next();
			boolean sw = true;
			for(int j = 0 ;j < Controller.carlist.size(); j++) {
				if(Controller.carlist.get(j).getCarNum().equals(carNum)) {
					System.out.println("�ߺ��� �����Դϴ�.");
					sw= false;
					break;
				}
			}
			if (sw==true) {
				Controller.incar(carNum);
				System.out.println("�����Ϸ�!!!");
			}
			
		}
		else if(ch == 2) {
			
			System.out.println("������ ������ȣ�� �Է��ϼ��� :"); String carNum = scanner.next();
			Controller.carout(carNum);
			
		}
		else {System.out.println("�߸����Է��Դϴ�.");}
		
		
		
		} // while end
	}	// main end

} //class end
