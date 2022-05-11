function send(){
	let cname =$("#cname").val();
	 let ccontent = $("#ccontent").val();
	$.ajax({
		url : "cwrite",
		data : {"cname":cname, "ccontent": ccontent},
		success : function(result) {
			if( result == 1 ){
				  
				 $("#ccontent").val("");  
				 
				 $("#contents").load( location.href+" #contents"); // 특정 태그 새로고침
				 /* 해당 replytable 의 불러오기 = replytable */
			}
			else{ alert("채팅실패했습니다."); }
		}
	})
}


