package ���α׷��־��Ȱ��_�Ŵ���;

import java.util.Scanner;






public class �׽�Ʈ {
   static �л�[] �л��迭 = new �л�[100];
   static int arr[] = new int[100];
   static int rank[] = new int[100];
   
   
   public static void main(String[] args) {
      
      
      // �迭 
      
       
      Scanner scanner = new Scanner(System.in);
      
      
      while( true ) {
         try {
            int i = 0;
            int j = 1;
            System.out.println(" ----------------------------------------------------------- ");
            System.out.println("                      ��      ��      ǥ                          ");
            System.out.println(" ----------------------------------------------------------- ");
            System.out.println(" ��ȣ\t�̸�\t����\t����\t����\t����\t���\t���� ");
            System.out.println(" ------------------------------------------------------------ ");
            for (�л� temp : �л��迭) {
            	
            	if(temp != null) {
            		int ���� = �л��迭[i].get����()+�л��迭[i].get����()+�л��迭[i].get����();
            		arr[i] = ����;
            		double ��� =(double)(�л��迭[i].get����()+�л��迭[i].get����()+�л��迭[i].get����())/3;
            		rank[i] = j;
            		if(rank[i+1]>rank[i]) {
            			rank[i] = j+1;
            			rank[i+1] = j;
            			
            		}
            		j++;
            		
            		//double ��� = (�л��迭[i].get����()+�л��迭[i].get����()+�л��迭[i].get����())/3;
               System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",i,�л��迭[i].get�̸�(),�л��迭[i].get����(),�л��迭[i].get����(),�л��迭[i].get����(),arr[i],���,rank[i]);
               
            	} i++;
            }
            
            
            
            
            System.out.print(" 1. �л���� 2.�л����� : ");
            int ch = scanner.nextInt();
            if( ch==1 ) {  
            	
               System.out.println(" �̸��� �Է��ϼ��� : "); String �̸� = scanner.next();
               System.out.println(" �������� �Է� : "); int ���� = scanner.nextInt();
               System.out.println(" �������� �Է� : "); int ���� = scanner.nextInt();
               System.out.println(" �������� �Է� : "); int ���� = scanner.nextInt();
               //int ���� = ����+����+����;
               Controller.�����Է�(�̸�, ����, ����, ����);
            	
               
               
               
               
               } // �л� ��� 
            else if( ch== 2 ) {   } // �л� ���� 
            else {  System.out.println("�߸����Է�");}
            
         }
         catch( Exception e ) {     }

      }
   }
}