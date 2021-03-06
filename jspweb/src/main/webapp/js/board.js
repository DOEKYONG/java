// 문서 열렸을때 실행 함수 무조건 실행
 $(document).ready( function(){
	 $('#summernote').summernote({
    	placeholder: '내용 입력',
    	tabsize: 2,
   	 	minHeight : 250 , // 최소 높이
   	 	maxHeight : null , // 최대 높이 
   	 	lang : 'ko-KR'	// 메뉴 한글 버전 
	  });
});

function filedelete( bno ){
	
	// HTML에서 JS 로 변수 이동[통신]
		// 1. 메소드 인수로 이동 
		// 2. 태그의 value 혹은 html 이동  [ $("#bno").val();]
	alert("파일만삭제");
	// 비동기통신 = 페이지 전환이 없는 상태 DB통신 
	// JQUERY라이브러리의 AJAX 사용 
	$.ajax({
		url : "filedelete", /*서블릿통신 */ 
		data : { "bno" : bno }, /* 통신 데이터 : { 변수명 : 값 , 변수명2 : 값  } */
		success : function( result ){
			if( result == "1" ){ 
				alert("첨부파일삭제성공 ");
				location.reload(); // 현재 페이지 새로고침
			}
			else { alert("첨부파일삭제실패[관리자에게문의]")}
		}
		
	});
}

function replywrite( bno ){
	let rcontent = $("#rcontent").val();
	$.ajax({
		url: "replywrite" ,
		data: { "bno":bno , "rcontent" : rcontent  } ,
		success : function( result ){
			if( result == 1 ){
				 alert("댓글작성 되었습니다."); // 성공 메시지 알림 
				 $("#rcontent").val(""); // 작성 input 공백으로 초기화 
				 $("#replytable").load( location.href+" #replytable"); // 특정 태그 새로고침
				 /* 해당 replytable 의 불러오기 = replytable */
			}
			else{ alert("댓글작성이 실패했습니다."); }
		}
	});
	
}

function rereplyview( rno , bno , mid ){ // 대댓글 입력창 표시 메소드 
	// ' '  or " "	: 문자처리 	// '문자열' + 변수 + '문자열'
	if( mid == "null" ){ // 로그인 안되어 있으면
		alert("로그인후 작성이 가능합니다."); 
		return;
	}
	// JS 작성 공간 에서는 HTML 작성 불가능 --> HTML 문자처리 
		$("#"+rno).html(
			'<div class="row">'+
				'<div class="col-md-10">'+
					'<textarea name="rerecontent" id="rrcontent" class="form-control" rows=3></textarea>'+
				'</div>'+
				'<div class="col-md-2">'+
					'<button class="form-control py-4 my-1" onclick="rereplywrite('+rno+','+bno+')">대댓글 등록</button>'+
				'</div>'+
			'</div>'
		);	
}
function rereplywrite( rno , bno ){ // 대댓글 쓰기 메소드 
	let rrcontent = $("#rrcontent").val();
	$.ajax({
		url : "rereplywrite" , 
		data : { "rno" : rno , "bno" : bno  , "rrcontent" : rrcontent} ,
		success : function( result ){
			if( result == 1 ){
				 alert("대댓글 작성 되었습니다."); // 성공 메시지 알림 
				 $("#rrcontent").val(""); // 작성 input 공백으로 초기화 
				 $("#replytable").load( location.href+" #replytable"); // 특정 태그 새로고침
			}
			else{ alert("대댓글작성이 실패했습니다."); }
		}
	});
}

function replydelete( rno ){
	$.ajax({
		url : "replydelete" , 
		data : { "rno" : rno } , 
		success : function( result ){
			if( result == 1 ){
				alert("댓글 삭제 되었습니다.");
				$("#replytable").load( location.href+" #replytable"); // 특정 태그 새로고침
			}
			else{ alert("삭제 실패(관리자에게 문의)"); } 
		}
	});
}

function updateview(rno,rcontent,bno){ // 댓글수정창 표시 메소드 
	
	// JS 작성 공간 에서는 HTML 작성 불가능 --> HTML 문자처리 
		$("#"+rno).html(
			'<div class="row">'+
				'<div class="col-md-10">'+
					'<textarea name="updatecontent1" id="updatecontent1" class="form-control" rows=3>'+rcontent+'</textarea>'+
				'</div>'+
				'<div class="col-md-2">'+
					'<button class="form-control py-4 my-1" onclick="replyupdate('+rno+','+bno+')">수정 등록</button>'+
				'</div>'+
			'</div>'
		);	
}

function replyupdate(rno ,bno){ // 수정쓰기메소드
	let updatecontent1= $("#updatecontent1").val();
	//alert(rno)
	//alert(bno)
	//alert(updatecontent1);
	$.ajax({
		url : "replyupdate" , 
		data : { "rno" : rno ,"updatecontent1":updatecontent1,"bno":bno  } ,
		success : function( result ){
			if( result ==1 ){
				alert("댓글 수정 되었습니다.");
				 $("#rcontent").val(""); // 작성 input 공백으로 초기화 
				 $("#replytable").load( location.href+" #replytable"); // 특정 태그 새로고침
			}
			else{ alert("수정 실패했습니다."); }
		}
	});
}

function rereplyupdate(rno,bno) {
	let updatecontent2= $("#updatecontent2").val();
	alert(rno)
	alert(bno)
	alert(updatecontent2);
	$.ajax({
		url : "rereplyupdate" , 
		data : { "rno" : rno ,"updatecontent2":updatecontent2,"bno":bno } ,
		success : function( result ){
			if( result ==1 ){
				alert("댓글 수정 되었습니다.");
				 $("#rcontent").val(""); // 작성 input 공백으로 초기화 
				 $("#replytable").load( location.href+" #replytable"); // 특정 태그 새로고침
			}
			else{ alert("수정 실패했습니다."); }
		}
	});
	
	
}

function reupdateview(rno,rcontent,bno){ // 댓글수정창 표시 메소드 
	
	// JS 작성 공간 에서는 HTML 작성 불가능 --> HTML 문자처리 
		$("#"+rno).html(
			'<div class="row">'+
				'<div class="col-md-10">'+
					'<textarea name="updatecontent2" id="updatecontent2" class="form-control" rows=3>'+rcontent+'</textarea>'+
				'</div>'+
				'<div class="col-md-2">'+
					'<button class="form-control py-4 my-1" onclick="rereplyupdate('+rno+','+bno+')">수정 등록</button>'+
				'</div>'+
			'</div>'
		);	
}



