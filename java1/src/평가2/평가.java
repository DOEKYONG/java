package ��2;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

public class �� {
	
//	1. ���� ��Ȳ ǥ �� �׻� ����� �Ǿ� �ֵ��� �մϴ�. [ 10�� ]
//			  * ���� �� �����ð��� �������̸� ���� �� ���� �ð��� �����մϴ�. 
//			  * ���� �� �ƴ� ���� ���� ������ ǥ�� �ϰ� ������ ������ ������ �����ð��� ǥ���մϴ�.
//			  * �ݾ��� �������̸� ������ ���� ǥ���ϰ� �����ð��� ������ ��� �ݾ��� ǥ���մϴ�.
//
//			2. �޴����� 1�� ���ý� ������ �մϴ�. [ 10�� ]
//			  * ������ : ������ȣ�� �Է¹޽��ϴ�. [ ��¥ , �����ð� , �����ð� , �ݾ� �� �Է¹��� �ʽ��ϴ�. ]
//			  * ���Ƿ� 5���� ������ ����Ͽ� ǥ���Ͻÿ�. 
//
//			3. �޴����� 2�� ���ý� ������ �մϴ�. [ 10�� ]
//			  * ������ : ������ȣ�� �Է¹޽��ϴ�.
//			  * ������ ���� ��Ȳǥ ���� �����ð��� �����ϰ� �ݾ��� ����Ͽ� ǥ���մϴ�.
//
//			4. �����ʹ� Ű����� �Է¹޾� ���� ��ü�� �迭 �� ����Ʈ �� �����մϴ�. [ 5�� ]
//
//			6. �����ð��� �����ð��� ����Ͽ� �ݾ��� ���Ͻÿ�. [ 10�� ]
//			  * ���� 30�� ���� [ 10�д� 1,000�� ]
//
//			7. ����ó���� ���� �ʽ��ϴ�.
//			8. �Է� ������ ���Ͽ� ���ܹ߻� ��Ȳ�� ���� ó���� �մϴ�. [ 5�� ]

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("--------------------- ���� ��Ȳ ǥ ---------------------");
			Date date = new Date();
			 SimpleDateFormat sdf 
				= new SimpleDateFormat("\t\tyyyy-MM-dd  hh:mm ");
			 System.out.println(sdf.format(date));
			 
			
			
//			Date date = new Date();
//			 SimpleDateFormat sdf 
//				= new SimpleDateFormat("yyyy-MM-dd hh:mm");
//			 //System.out.println(sdf.format(date));
//			 Date date1 = new Date();
//			 SimpleDateFormat sdf1 = 
//					 new SimpleDateFormat("hh:mm");
//			 String Date1 = sdf.format(date) +" "+ sdf1.format(date1);
//			 System.out.println("\t\t  "+Date1);
			// LocalDate localDate = LocalDate.now();
			
			 System.out.println();
			 System.out.println("\t��¥\t������ȣ\t�����ð�\t�����ð�\t�ݾ�");
			// String sst = sdf.format(date);
			System.out.println("-----------------------------------------------------");
			
			int i =0;
			for(Parking temp :Controller.carlist) {
				if ( temp != null) {
					System.out.println( Controller.carlist.get(i).getDate()+"\t" + Controller.carlist.get(i).getCarNum()+"\t"+Controller.carlist.get(i).getCarIntime()+"\t"+Controller.carlist.get(i).getCarOuttime()+"\t"+Controller.carlist.get(i).getPayMoney()
							);
				}
				i++;
				
			}
			System.out.println("\t\t\t1.����\t2.����\t\t\t"); int ch = scanner.nextInt();
			
			if(ch ==1 ) {
//				String payMoney = "������";
//				String carIntime = null;
//				String carOuttime = null;
				System.out.println(" ������ȣ�� �Է��ϼ��� : "); String carNum = scanner.next();
				//Controller.incar(carNum);
				boolean sw = true;
				for ( int j= 0 ; j < Controller.carlist.size(); j++ ) {
		
					if (Controller.carlist.get(j).getCarNum().equals(carNum)) {
						System.out.println("������Ͻ��� )) �ߺ���������ȣ");
						sw = false;
						break;
					}
				}
				if(sw==true)Controller.incar(carNum);
				
				
				
				
				
			}
			else if( ch == 2) {
				System.out.println(" ������ ������ȣ�� �Է��ϼ��� : "); String carNum = scanner.next();
				Controller.outcar(carNum);
			}
			else {System.out.println("�߸����Է��Դϴ�.");}
			
			
			
			
		} // while end

	} // m e

} // c e
