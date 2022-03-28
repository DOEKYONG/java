package Day19;

import java.util.HashSet;
import java.util.Iterator;

public class Day19_1 {
	
	public static void main(String[] args) {
		
		// 컬렉션(수집)프레임워크(미리만들어진클래스)
			// * 배열의 단점을 보완 사용
			// 1. List 컬렉션
				// * 인덱스(저장순서)
				// 1. Arraylist 클래스 	: 싱글스레드 / 순차적 추가,삭제
				// 2. Vector 클래스		: 멀티스레드 (동기화O) 
				// 3. LinkedList 클래스	: 중간 삽입/삭제 빠름
			// 2. Set 컬렉션
				// * 인덱스 X  ( 저장순서가 없기때문에 자동으로 객체가 중복 불가능 )
				// 1 . HashSet 클래스
					// 1. add( 객체명 ) : set 객체내 객체(요소) 추가
					// 2. size() : set 객체내 객체(요소) 개수
					// 3. .iterator() : set 객체 순회 메소드
						// * Iterator<제네릭> 인터페이스명 : 순서없는 객체 순회 인터페이스
						// * Iterator<제네릭> iterator = set.iterator();
						//		1. iterator.hasnext() : 다음 객체 존재 여부 확인
						// 		2. iterator.next() : 다음 요소 가져오기
						// or
		
						// for(임시객체명 : set객체명) {}
		
		
		
		
		// 3. Map
		
		// p.737
		// 1. Hashset 클래스로 객체 선언
		HashSet<String> set = new HashSet<>();
		
// 1. HashSet : 컬렉션프레임워크 클래스
			// 2. <제네릭>  : Set 클래스 안에 들어가는 자료형
				// 3. set : 객체명( 아무거나 )
					// 4. new : 객체 생성시 메모리 할당
						// 5. HashSet<제네릭:생략가능>() : 생성자
		// 2. sest객체내 객체넣기 [ set객체명.add ( 객체명 ) ; ]
		set.add("Java"); System.out.println(" 확인 : " +  set);
		set.add("JDBC"); System.out.println(" 확인 : " +  set);
		set.add("Servlet/JSP"); System.out.println(" 확인 : " +  set);
		set.add("Java"); System.out.println(" 확인 : " +  set); // 객체 중복 불가능
		set.add("iBATIS"); System.out.println(" 확인 : " +  set);
		
		// 3. set객체내 객체 수 [ set객체명.size() : ]
		int size = set.size();
		System.out.println("총 객체수 : " + size);
		
		// 4. Iterator : 저장된 객체를 한번씩 가져오는 반복자 리턴 (순회)
			// * set 컬렉션 에서 사용되는 이유 : 인덱스가 없기때문에 객체를 호출하는 방법 X get
		Iterator<String> iterator = set.iterator(); // set객체내 iterator() : 순회
		while(iterator.hasNext()) { // .hasNext() : 다음 요소 존재 여부 확인 = 다음 요소가 있으면 true 없으면 false
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		// * for문과 컬렉션 활용
			// for ( 임시 객체명 : 컬렉션/배열 ) : 컬렉션/배열내 요소들을 한번씩 가져오는 반복자
//		int x = 0;
//		for ( String element : set) {
//			System.out.println("\t"+element);
//			x++;
//			
//		}
		
		// 5. set겍체명.remove( 객체명 ) : set객체내 해당 객체를 삭제 
		set.remove("JDBC"); System.out.println(" 확인 : " + set);
		set.remove("iBATIS"); System.out.println(" 확인 : " + set);
		
		// 6. set객체명.clear() : set 객체내 모든 객체를 비우기 [삭제 ]
		set.clear();	System.out.println(" 확인 : " + set);
		
	}
	
	

}
