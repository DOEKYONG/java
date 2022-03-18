package Day13;

import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Day13_4 {

	public static void main(String[] args) throws InterruptedException {
		// p. 544 DecimalFormat Ŭ���� : ���� �����͸� ���ϴ� �������� ǥ��
			// ���� ����
				// 0 : �ڸ��� [���ڸ��� 0���� ä��]
				// # : �ڸ��� [ ���ڸ��� ä���]
		
		double num = 1234567.89;
		DecimalFormat df = new DecimalFormat("0");
		System.out.println(df.format(num));
		
		 df = new DecimalFormat("0.0");
		System.out.println(df.format(num));
		
		df = new  DecimalFormat("0000000000.00000");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#");
		System.out.println(df.format(num));

		df = new DecimalFormat("#.#");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("###########.#####");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#.0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("+#.0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("-#.0");
		System.out.println(df.format(num));
		
		// **** õ���� ���� ��ǥ ****
		df = new DecimalFormat("#,##0��");
		System.out.println(df.format(0));
		
		df = new DecimalFormat("0.0E0"); // E : ��������
		System.out.println(df.format(num));
		
		df = new DecimalFormat("[��]++#,### ;[��] -#.###");
		System.out.println(df.format(123));  // ��� ; ���� 
		
		// ******* ��ǻ�ʹ� �����x ******
		
		df = new DecimalFormat("#,#%");
		
		System.out.println(df.format(num));
		df = new DecimalFormat("df.format(num)");
		System.out.println(df.format(num));

		
		String id ="java";
		String name =  "�ſ��";
		String tel = "010-123-56748";
		
		String text = "ȸ�� ID : {0} \nȸ�� �̸� : {1} \nȸ����ȭ : {2}" ;
		String result1 = MessageFormat.format(text, id,name,tel);
		
		System.out.println(result1); System.out.println();
		
		String sql = "insert info member values( {0} , {1}, {2})";
		
		Object[] �迭 = {id, name,tel};
		
		String result2 = MessageFormat.format(sql, �迭);
		System.out.println(result2);
		
		// Java 7 ���� ���� Date ���Ŀ��� �������� ��¥ API �߰���
		LocalDate currDate = LocalDate.now();
		System.out.println(" ���糯¥ : " + currDate);
		LocalTime currTime = LocalTime.now();
		System.out.println(" ���� �ð� :  " + currTime);
		
		// Date ���糯¥/�ð� [ ������ �ȵǰų� �񱳱�� ����� ]
		// vs
		// LocalDate : ���糯¥       LocalTime : ����ð�
		
		LocalDateTime currdatetime = LocalDateTime.now();
		System.out.println(" ���糯¥/�ð� : " + currdatetime);
		
		// �ð� ���
		Instant instant1  = Instant.now();
		Thread.sleep(1000); // 1�� ��� [�ڵ��帧 1�� ���� ]  // �Ϲݿ���
		Instant instant2 = Instant.now();
		
		if(instant1.isBefore(instant2)) {
			System.out.println(" instant1 �� ���� ");
		} else if(instant1.isAfter(instant2)) {
			System.out.println(" instant2 �� �� �ʽ��ϴ�.");
		}else {
			System.out.println(" ������ �ð��Դϴ�.");
		}
		
		System.out.println(" �ð� �� : " + instant1.until(instant2, ChronoUnit.NANOS));
			
		
				
		}
		
	}
	


