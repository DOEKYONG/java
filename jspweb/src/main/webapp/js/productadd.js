
/* -------- 카테고리 버튼 눌렀을때 함수(이벤트) ------- */
function categorybtn(){
	// 특정태그의 HTML 넣기 
$("#categoryinput").html(
		'<div class="row">'+
		'<div class="col-md-5">'+'<input class="form-control" type="text" id="cname">'+'</div>'+
		'<div class="col-md-5">'+'<button class="form-control" onclick="categoryadd()" type="button">등록</button>'+'</div>'+
		'</div>'
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
				getcategory();
			}
			else{ alert("카테고리실패"); }
		}
	});
}

$(function category() {
	getcategory();
})
/* -------- -------------------------- ------- */
// ----------카테고리 호출-------------

function getcategory() {
	
	$.ajax({
		url : "getcategory", 
		success : function(re) {
			$("#categorybox").html(re);
		}
	})
	
}
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
////////////////////////////////////////////////
/* 첨부파일이 변경되면 특정태그에 첨부파일 이미지 표시*/
$("#pimg").change( function(e) {
//	alert(e); /*change 된 객체*/
//	alert(e.target); /*객체.target() -> html 태그*/
//	alert(e.target.files[0]);
	// 클라이언트가 업로드시 업로드파일의 경로 알기
	let reader =new FileReader();
	reader.readAsDataURL(e.target.files[0]);
	reader.onload = function(e) { // 찾은 파일 경로 실행
		alert(e.target.result)
		$("#preview").attr("src",e.target.result);
	}
	
	alert($("#pimg").val());
	/* c:\fakepath\~~~*/
	/* 클라이언트가 사진을 업로드시 js가 클라이언트의 경로를 알수가 없다 */
} );



