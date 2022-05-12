$(function() {
	
	$.ajax({
		url : "getproductlist", 
		type : 'POST',
		success : function(re) {
			$("#productlistbox").html(re);
			
		}
	})
	
})