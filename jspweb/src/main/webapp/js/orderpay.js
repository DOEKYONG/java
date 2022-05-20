let jsonarray; // json 형식의 변수를 선언
let totalpay =0 ; // 총금액

$( function(){  
	getcart();
});

// 2. 장바구니 데이터 호출 메소드
function getcart() {
		$.ajax({
		url : 'getcart' ,
		success : function( json ){
			jsonarray = json;
			
			for(let i = 0; i<jsonarray.length; i++) {
				totalpay += jsonarray[i]["totalprice"];
			}
			alert(totalpay);
			
		}
	});
	
} 
 
 function payment() {
	    var IMP = window.IMP; // 생략 가능
    	IMP.init("imp96607945"); // 예: imp00000000
      // IMP.request_pay(param, callback) 결제창 호출
      IMP.request_pay({ // param
          pg: "html5_inicis", // 결제 대행회사
          pay_method: "card", // 결제방식
          merchant_uid: "ORD20180131-0000011", // 주문번호[별도]
          name: "EZEN SHOP", // 홈페이지 이름 [결제이름]
          amount: totalpay, // 총주문금액
          buyer_email: "gildong@gmail.com", // 주문자 이메일
          buyer_name: "홍길동",// 주문자 이름
          buyer_tel: "010-4242-4242", //주문자 전화번호
          buyer_addr: "서울특별시 강남구 신사동", //주문자 주소
          buyer_postcode: "01181" // 주문자 주소
      }, function (rsp) { // callback
          if (rsp.success) { // 결제 성공 시 로직,
           
          } else { // 결제 실패시 로직
					saveorder();
          }
      });
    }
    
    function saveorder() {
	alert("db처리")
	$.ajax({
		url : "saveorder",
		success: function(re) {
			alert("DB처리 성공")
		}
	})
}