# java# 영화관 3조
## 오늘 상영중인 영화 | 영화 시작시간 |  상영관
---
# 회원가입,로그인 메뉴
1. 회원가입
2. 로그인
3. 아이디찾기
4. 비밀번호찾기

## 회원가입,로그인 필드,메소드
---
필드
***
* private String id
* private String pw
* private String phone
* rivate boolean check
***
메소드
***
* public void sign() {}
* public void login() {}
* public void findid() {}
* public void findpw() {}
* public void changepw() {}

# 일반회원 메뉴
---
1.예매
   1. 영화 선택
   2. 영화시간 선택
   3. 좌석 선택
         1. 결제
         2. 취소
2. 예매내역
   1. 예메취소
   2. 뒤로가기

3. 회원정보 보기 
    1. 비밀번호 변경

## 일반회원 메뉴 필드,메소드
---
필드
***
* private String m_title
* private String m_intime
* private String m_seat
* private int m_num
***
메소드
***
* public void reserve() {}
* public void myreserve() {}
* public void cancle() {}

# 관리자 메뉴
---
1.영화등록
   1. 영화제목 입력
   2. 상영관 선택
   3. 영화시간 입력 
2.영화삭제
      1.영화제목 입력
      2.영화시간 입력
   
   
