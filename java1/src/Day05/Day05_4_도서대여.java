package Day05;

import java.util.Scanner;

public class Day05_4_�����뿩 { // c s
   
   /*
   ��빮�� 1. ����� 2.����/�ڷ���/����  3.����/�ݺ� 4.����/�ݺ� 5.�迭
   * ���� �뿩 console ���α׷�
   1. �迭 ����
      1. ȸ�� [ ���̵�(�ߺ�x) , ��й�ȣ ]
      2. ���� [ ������(�ߺ�x) , �����뿩����(�뿩����,�뿩��) , �뿩��(�α��ν� ���̵�) ]
   2. �ʱ�޴�
      1.ȸ������ 2.�α��� 
         1.ȸ�����Խ� ���̵� �ߺ�üũ 
   3. �α��ν� �޴� 
      1. �����˻� 2.������� 3.�����뿩 4.�����ݳ� 5.�α׾ƿ�
          1. �����˻��� �������� ��ġ�ϸ� ������� �����뿩���� ���
         2. ������Ͻ� ��� ������ ��� 
         3. �����뿩�� �����뿩���ΰ� �����Ҷ� �����뿩 ó��
         4. �����ݳ��� ������ �뿩�� ������ �ݳ� ó�� 
         5. �α׾ƿ� �ʱ�޴��� 
   4. �α��ν� ���̵� admin �̸� �����ڸ޴� 
      1. ������� 2.������� 3.��������(����) 4.�α׾ƿ�
         1. ������Ͻ� �������� �Է¹޾� ���� ���ó��
         2. ������Ͻ� ��� ������ ��� 
         3. ���������� ������ �������� �Է¹޾� ������ ������ ����[ null ]
         4. �α׾ƿ��� �ʱ�޴��� 
   */

   public static void main(String[] args) { // m s
      Scanner scanner = new Scanner(System.in);
      
      String[][] memberlist = new String[100][2];
      String[][] booklist =  new String[100][3];
      
      while(true) {
         
         System.out.println("-------------------------------------");
         System.out.println("------------�����뿩���α׷�--------------");
         System.out.println("1.ȸ������ 2.�α���"); int ch = scanner.nextInt();
         
         if(ch == 1 ) { // ȸ������
            System.out.println("------------------------------------");
            System.out.println("------------ȸ������������--------------");
            System.out.println(" MEMBER ID : "); String id = scanner.next();
            System.out.println(" MEMBER PASSWORD : "); String password =scanner.next();
            
            boolean idcheck = true;
            // ���̵� �ߺ�üũ
            for(int i = 0 ; i<memberlist.length; i++) {
               if(memberlist[i][0] != null && memberlist[i][0].equals(id) ) {
                  // ==null  : ȸ�� ����  !=null ȸ���ִ�
                  System.out.println(" �˸�]] �����Ѿ��̵� �����մϴ�");
                  idcheck = false;
                  break;
               }   // if(member[i][0] != null && member[i][0].equals(id) ) end
            } // for(int i = 0 ; i<member.length; i++) end
            //����
            if (idcheck) {
               for( int i = 0; i < memberlist.length ; i++) {
                  if(memberlist[i][0] == null) { // i��°�࿡ id�������� = �����
                     memberlist[i][0] = id;
                     memberlist[i][1] = password;
                     // i��° �� ���� ����������
                     System.out.println(" �˸� ]] ȸ�������� �Ǿ����ϴ�.");
                     break; // ���������� �� [ 1���� ���� ]
                  }
               }      
            }
            
         } // if ��ȣ == 1 end
         if(ch == 2) { //�α���ȭ��
            System.out.println("-------�α��� ������ --------");
            System.out.print(" MEMBER ID : "); String id = scanner.next();
            System.out.print(" MEMBER PASSWORD : "); String password =scanner.next();
            
            boolean logincheck = false;
            for ( int i = 0; i<memberlist.length; i++) {
               
               if ( logincheck == true) {
                  
                  break;
               }
               
               if( memberlist[i][0] !=null && memberlist[i][0].equals( id ) &&
                     memberlist[i][1].equals(password) ) {
                  
                  System.out.println(" �˸�]] �α��� ����");
                  
                  logincheck = true ; // �α��μ��� ��
///////////////////////////////////////////////////////////////////////////////////////////////////////////                  
                  while(true) {
                     System.out.println("--------------�α��� �޴� ------------------");
                     System.out.print("1.�����˻� 2.������� 3.�����뿩 4.�����ݳ� 5.�α׾ƿ� \n");
                     System.out.print("��ȣ���Է��ϼ���"); int ch2 = scanner.nextInt();
                     boolean bookcheck = false;
                     if(ch2 == 1 ) {
                        System.out.print("1.������ �˻��ϼ��� : "); String �˻� = scanner.next();
                        
                        for (int j = 0; j<booklist.length; j++) {
                           if(booklist[j][0] != null && booklist[j][0].equals(�˻�)) {
                              // ������, �뿩���� ���
                              System.out.printf("%s, %s \n",booklist[j][0],booklist[j][1]);
                              bookcheck = true;
                           } //������ �뿩���� if end
                           //* ���� else if(bookcheck = false) {System.out.println("����å"); break;}
                           // ������ �ذ�!! esle �� else if�ϸ� �����ð� �����ϳ��� ���� �׷��� �ؿ��� ������ 100���ݺ��Ȱ�!!
                           
                           
                        } // for end
                        if (bookcheck==false) {
                        	System.out.println("����å");
                        }
                        
                     }
                     else if( ch2 == 2) {
                        System.out.println("------------���������ȸ--------------");
                        for (int k = 0; k<booklist.length; k++ ) {
                           if (booklist[k][0] != null) {
                              System.out.printf("%s \n",booklist[k][0]);
                              bookcheck = true;
                              
                           } if(bookcheck = false) {
                              System.out.println("������������������ʽ��ϴ�.");
                              break;
                           }
                        }
                     } // else if( ch2 == 2) end
                     else if( ch2 == 3) {}
                     else if( ch2 == 4) {}
                     else if( ch2 == 5) {}
                     else {System.out.println("�߸����Է�");}
                  } // while2 end
               
                  
               } // �α��θ޴�if end
               else if (id.equals("admin")) {
                  while(true) {
                     
                  System.out.println("------------�����ڸ޴�-----------------");
                  System.out.println("1.������� 2.������� 3.��������(����) 4.�α׾ƿ�");
                  System.out.print("��ȣ�� �Է��ϼ��� : "); int chadmin = scanner.nextInt();
                  
                  if(chadmin == 1) {
                     System.out.println("------�������������-------------");
                     
                     System.out.print("å�̸��� �Է��ϼ���"); String book = scanner.next();
                     for(int a = 0; a<booklist.length; a++) {
                        if(booklist[a][0] == null) {
                           booklist[a][0] = book;
                           booklist[a][1] = "�뿩����";
                           booklist[a][2] = id;
                           System.out.println("ok"); break;
                        } // �Ʒ��ٺ��ʹ� �ߺ� �˻� ������
                        
                     }
                  }
                  else if (chadmin == 2) {
                     for( int j =0; j<booklist.length ; j++) {
                        if( booklist[j][0] != null) { // �Խù��� ���� �ε����� ����
                        System.out.printf("%s\t%s\t%s \n",booklist[j][0],booklist[j][1],booklist[j][2]);
                        }
                     }
                     
                  }
                  else if (chadmin == 3) {}
                  else if (chadmin == 4) {
                  
                     System.out.println("�α׾ƿ�"); 
                     logincheck = true;
                     break;
                  }
                  else {}
                  } // while end
                  
                  
                  
               }
               else {System.err.println("�α��ν���"); break;}
               
            } // for end
            
         } //if(��ȣ == 2)
         
      } 
      

   } // m e

} // c e