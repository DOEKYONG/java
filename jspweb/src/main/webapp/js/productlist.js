
function pnomove (pno) {
	
	let pno =$("#modelinput").val();
}
function activechange(active) {
	
	$.ajax({
		
		url : "activechange",
		data : {"pno" : pno, "active" : active },
		success : function(re) {
			
			if(re==1 ){
				alert(" 상태변경")
				$("#producttable").load( location.href+' producttable');
			}
			else {alert(" 상태변경실패")}
		}
	});
}