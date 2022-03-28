package Day18;

import java.util.ArrayList;
import java.util.LinkedList;

public class Day18_3 {

	public static void main(String[] args) {
		
		// p.731~732 : LinkedList Ŭ����
		// 					ArrayList			vs		LinkedList
		// 						�迭							��ũ
		// ���α�������		�ε��� �������� �޸𸮿���				���� �ٸ� �޸� �ּҿ���
		// 	�ӵ�
		//	add[�߰�]				����							����
		// 	add[����=�߰�]			
		// 	�˻�				    ����                          ����
		//  ����
	
		
		// 1. ArrayList ��ü ���� [ ���׸� : String ] 
		ArrayList<String> list1 = new ArrayList<>();
		// 2. LinkednList ��ü ���� [ ���׸� : String ] 
		LinkedList<String> list2 = new LinkedList<>();
		
		// 3.�ð�����
		Long starttime; // ���۽ð�
		Long endtime; 	// ������ �ð�
		
		// 4. arraylist��ü�� 10000�� ��ü�� �����ϴµ� �ɸ��� �ð�
			starttime = System.nanoTime(); // ���� �ð��� ����ð����� ȣ��
			for(int i = 0 ; i<100000 ; i++) {
				list1.add(0,i+""); 	// ������->���ڿ� ��ȯ : 1. String.valueOf(����) 2.����+""
									// ���ڿ�->���� ��ȯ : 1. Integer.parseInt( ���ڿ� )
			}
			endtime = System.nanoTime();
			System.out.println(" Arraylist�� 10000�� �����ϴµ� �ɸ��� �ð� : " + (endtime-starttime) + "ns");
			// 5. LinkedList ��ü�� 10000�� ��ü�� �����ϴµ� �ɸ��� �ð� üũ
				starttime = System.nanoTime();
				for(int i = 0 ; i<100000 ; i++) {
					list2.add(0,i+""); 	
				}
				endtime = System.nanoTime();
				System.out.println(" LinkedList�� 10000�� �����ϴµ� �ɸ��� �ð� : " + (endtime-starttime) + "ns");
			
	
	
	
	
	}
}
