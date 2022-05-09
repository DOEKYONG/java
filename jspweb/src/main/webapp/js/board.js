
// 문서 열렸을때 실행
$(document).ready(function(){
	 $('#summernote').summernote({
        placeholder: '내용입력',
        tabsize: 2,
        minHeight: 250,
        maxHeight : null,
        lang : 'ko-KR' 
      });
	
	
});

function filedelete(bno) {
	
	// HTML에서 js로 변수 이동
		// 1. 메도스의 인수로 이동
		// 2. 태그의 value 혹은 html 이동
		$.ajax({
				url : "filedelete" , // 보내는 위치 [ 서블릿 경로 ]
				data : { "bno" : bno } , // 보내는 데이터  { "변수명" : 값 , "변수명2" : 값 }
				success : function( result ){ // 통신 성공 했을경우 (  result = 받은 값 변수 )
					if(result == "1") {
						alert("첨부파일삭제성공");
						location.reload();	// 현재 페이지를 새로고침
						
					}
					else{
						alert("첨부파일삭제 실패 관리자에게 문의");
					}
					}
					});
}

