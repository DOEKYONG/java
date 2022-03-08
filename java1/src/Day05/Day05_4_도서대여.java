package Day05;

import java.util.Scanner;

public class Day05_4_도서대여 { // c s
   
   /*
   사용문법 1. 입출력 2.변수/자료형/연산  3.제어/반복 4.제어/반복 5.배열
   * 도서 대여 console 프로그램
   1. 배열 변수
      1. 회원 [ 아이디(중복x) , 비밀번호 ]
      2. 도서 [ 도서명(중복x) , 도서대여여부(대여가능,대여중) , 대여인(로그인시 아이디) ]
   2. 초기메뉴
      1.회원가입 2.로그인 
         1.회원가입시 아이디 중복체크 
   3. 로그인시 메뉴 
      1. 도서검색 2.도서목록 3.도서대여 4.도서반납 5.로그아웃
          1. 도서검색시 도서명이 일치하면 도서명과 도서대여여부 출력
         2. 도서목록시 모든 도서명 출력 
         3. 도서대여시 도서대여여부가 가능할때 도서대여 처리
         4. 도서반납시 본인이 대여한 도서만 반납 처리 
         5. 로그아웃 초기메뉴로 
   4. 로그인시 아이디가 admin 이면 관리자메뉴 
      1. 도서등록 2.도서목록 3.도서삭제(도전) 4.로그아웃
         1. 도서등록시 도서명을 입력받아 도서 등록처리
         2. 도서목록시 모든 도서명 출력 
         3. 도서삭제시 삭제할 도서명을 입력받아 동일한 도서명 삭제[ null ]
         4. 로그아웃시 초기메뉴로 
   */

   public static void main(String[] args) { // m s
      Scanner scanner = new Scanner(System.in);
      
      String[][] memberlist = new String[100][2];
      String[][] booklist =  new String[100][3];
      
      while(true) {
         
         System.out.println("-------------------------------------");
         System.out.println("------------도서대여프로그램--------------");
         System.out.println("1.회원가입 2.로그인"); int ch = scanner.nextInt();
         
         if(ch == 1 ) { // 회원가입
            System.out.println("------------------------------------");
            System.out.println("------------회원가입페이지--------------");
            System.out.println(" MEMBER ID : "); String id = scanner.next();
            System.out.println(" MEMBER PASSWORD : "); String password =scanner.next();
            
            boolean idcheck = true;
            // 아이디 중복체크
            for(int i = 0 ; i<memberlist.length; i++) {
               if(memberlist[i][0] != null && memberlist[i][0].equals(id) ) {
                  // ==null  : 회원 없다  !=null 회원있다
                  System.out.println(" 알림]] 동일한아이디가 존재합니다");
                  idcheck = false;
                  break;
               }   // if(member[i][0] != null && member[i][0].equals(id) ) end
            } // for(int i = 0 ; i<member.length; i++) end
            //저장
            if (idcheck) {
               for( int i = 0; i < memberlist.length ; i++) {
                  if(memberlist[i][0] == null) { // i번째행에 id가없으면 = 빈공간
                     memberlist[i][0] = id;
                     memberlist[i][1] = password;
                     // i번째 각 열에 데이터저장
                     System.out.println(" 알림 ]] 회원가입이 되었습니다.");
                     break; // 저장했으면 끝 [ 1번만 저장 ]
                  }
               }      
            }
            
         } // if 번호 == 1 end
         if(ch == 2) { //로그인화면
            System.out.println("-------로그인 페이지 --------");
            System.out.print(" MEMBER ID : "); String id = scanner.next();
            System.out.print(" MEMBER PASSWORD : "); String password =scanner.next();
            
            boolean logincheck = false;
            for ( int i = 0; i<memberlist.length; i++) {
               
               if ( logincheck == true) {
                  
                  break;
               }
               
               if( memberlist[i][0] !=null && memberlist[i][0].equals( id ) &&
                     memberlist[i][1].equals(password) ) {
                  
                  System.out.println(" 알림]] 로그인 성공");
                  
                  logincheck = true ; // 로그인성공 값
///////////////////////////////////////////////////////////////////////////////////////////////////////////                  
                  while(true) {
                     System.out.println("--------------로그인 메뉴 ------------------");
                     System.out.print("1.도서검색 2.도서목록 3.도서대여 4.도서반납 5.로그아웃 \n");
                     System.out.print("번호를입력하세요"); int ch2 = scanner.nextInt();
                     boolean bookcheck = false;
                     if(ch2 == 1 ) {
                        System.out.print("1.도서를 검색하세요 : "); String 검색 = scanner.next();
                        
                        for (int j = 0; j<booklist.length; j++) {
                           if(booklist[j][0] != null && booklist[j][0].equals(검색)) {
                              // 도서명, 대여여부 출력
                              System.out.printf("%s, %s \n",booklist[j][0],booklist[j][1]);
                              bookcheck = true;
                           } //도서명 대여여부 if end
                           //* 질문 else if(bookcheck = false) {System.out.println("없는책"); break;}
                           // 수업중 해결!! esle 나 else if하면 무조ㅓ건 둘중하나가 실행 그래서 밑에께 나오면 100번반복된거!!
                           
                           
                        } // for end
                        if (bookcheck==false) {
                        	System.out.println("없는책");
                        }
                        
                     }
                     else if( ch2 == 2) {
                        System.out.println("------------도서목록조회--------------");
                        for (int k = 0; k<booklist.length; k++ ) {
                           if (booklist[k][0] != null) {
                              System.out.printf("%s \n",booklist[k][0]);
                              bookcheck = true;
                              
                           } if(bookcheck = false) {
                              System.out.println("도서목록이존재하지않습니다.");
                              break;
                           }
                        }
                     } // else if( ch2 == 2) end
                     else if( ch2 == 3) {}
                     else if( ch2 == 4) {}
                     else if( ch2 == 5) {}
                     else {System.out.println("잘못된입력");}
                  } // while2 end
               
                  
               } // 로그인메뉴if end
               else if (id.equals("admin")) {
                  while(true) {
                     
                  System.out.println("------------관리자메뉴-----------------");
                  System.out.println("1.도서등록 2.도서목록 3.도서삭제(도전) 4.로그아웃");
                  System.out.print("번호를 입력하세요 : "); int chadmin = scanner.nextInt();
                  
                  if(chadmin == 1) {
                     System.out.println("------도서등록페이지-------------");
                     
                     System.out.print("책이름을 입력하세요"); String book = scanner.next();
                     for(int a = 0; a<booklist.length; a++) {
                        if(booklist[a][0] == null) {
                           booklist[a][0] = book;
                           booklist[a][1] = "대여가능";
                           booklist[a][2] = id;
                           System.out.println("ok"); break;
                        } // 아랫줄부터는 중복 검사 할차례
                        
                     }
                  }
                  else if (chadmin == 2) {
                     for( int j =0; j<booklist.length ; j++) {
                        if( booklist[j][0] != null) { // 게시물이 없는 인덱스는 제외
                        System.out.printf("%s\t%s\t%s \n",booklist[j][0],booklist[j][1],booklist[j][2]);
                        }
                     }
                     
                  }
                  else if (chadmin == 3) {}
                  else if (chadmin == 4) {
                  
                     System.out.println("로그아웃"); 
                     logincheck = true;
                     break;
                  }
                  else {}
                  } // while end
                  
                  
                  
               }
               else {System.err.println("로그인실패"); break;}
               
            } // for end
            
         } //if(번호 == 2)
         
      } 
      

   } // m e

} // c e