
/* -------- 카테고리 버튼 눌렀을때 함수(이벤트) ------- */
function categorybtn(){
	// 특정태그의 HTML 넣기 
	$("#categotyinput").html(
		'<input type="text" id="cname">'+
		'<button onclick="categoryadd()" type="button">등록</button>'
	)
}
/* -----------------------------------------*/
/* -------- 카테고리 등록 눌렀을때 함수(이벤트) ------- */
function categoryadd(){
	let cname = $("#cname").val();		/* 해당 입력값 가져오기 */ 
	$.ajax({							/* 비동기 통신 */
		url : "categoryadd" , 			/* 서블릿 URL 매핑 */
		data : { "cname" : cname } ,	/* 보내는 데이터 : 카테고리명 */
		success : function( result ){	/* 통신 성공시 받는 데이터 */
			if( result == 1 ){  
				alert("카테고리추가"); 
				$("#categotyinput").html("");
			}
			else{ alert("카테고리실패"); }
		}
	});
}
/* -------- -------------------------- ------- */
// ----------카테고리 호출-------------

$(function getcategory() {
	
	$.ajax({
		url : "getcategory", 
		success : function(re) {
			$("#categorybox").html(re);
		}
	})
	
})
/* -------- ----------form 전송------------- ------- */
function productadd() {
	
	var form = $("#addform")[0];
	var formData = new FormData(form);
	
	 $.ajax({
		url : "productadd",
		type: 'POST', // type : 1.GET(기본타입) 2.POST(첨부파일사용시,보안용)
		data : formData,
		contentType : false,
		processData : false,
		success : function(re) {
			if(re == 1) {
					alert("등록이 완료되었습니다.")
					form.reset();
			}else {
				alert("등록 실패ㅠㅠ")
			}
		
			
		}
		
	})
}



