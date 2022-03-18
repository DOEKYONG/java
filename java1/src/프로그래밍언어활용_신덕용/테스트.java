package 프로그래밍언어활용_신덕용;

import java.util.Scanner;






public class 테스트 {
   static 학생[] 학생배열 = new 학생[100];
   static int arr[] = new int[100];
   static int rank[] = new int[100];
   
   
   public static void main(String[] args) {
      
      
      // 배열 
      
       
      Scanner scanner = new Scanner(System.in);
      
      
      while( true ) {
         try {
            int i = 0;
            int j = 1;
            System.out.println(" ----------------------------------------------------------- ");
            System.out.println("                      성      적      표                          ");
            System.out.println(" ----------------------------------------------------------- ");
            System.out.println(" 번호\t이름\t국어\t영어\t수학\t총점\t평균\t석차 ");
            System.out.println(" ------------------------------------------------------------ ");
            for (학생 temp : 학생배열) {
            	
            	if(temp != null) {
            		int 총점 = 학생배열[i].get국어()+학생배열[i].get영어()+학생배열[i].get수학();
            		arr[i] = 총점;
            		double 평균 =(double)(학생배열[i].get국어()+학생배열[i].get영어()+학생배열[i].get수학())/3;
            		rank[i] = j;
            		if(rank[i+1]>rank[i]) {
            			rank[i] = j+1;
            			rank[i+1] = j;
            			
            		}
            		j++;
            		
            		//double 평균 = (학생배열[i].get국어()+학생배열[i].get영어()+학생배열[i].get수학())/3;
               System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",i,학생배열[i].get이름(),학생배열[i].get국어(),학생배열[i].get영어(),학생배열[i].get수학(),arr[i],평균,rank[i]);
               
            	} i++;
            }
            
            
            
            
            System.out.print(" 1. 학생등록 2.학생삭제 : ");
            int ch = scanner.nextInt();
            if( ch==1 ) {  
            	
               System.out.println(" 이름을 입력하세요 : "); String 이름 = scanner.next();
               System.out.println(" 국어점수 입력 : "); int 국어 = scanner.nextInt();
               System.out.println(" 영어점수 입력 : "); int 영어 = scanner.nextInt();
               System.out.println(" 수학점수 입력 : "); int 수학 = scanner.nextInt();
               //int 총점 = 국어+영어+수학;
               Controller.점수입력(이름, 국어, 영어, 수학);
            	
               
               
               
               
               } // 학생 등록 
            else if( ch== 2 ) {   } // 학생 삭제 
            else {  System.out.println("잘못된입력");}
            
         }
         catch( Exception e ) {     }

      }
   }
}