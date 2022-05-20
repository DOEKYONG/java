// 테이블에 데이터를 넣어주는 함수
let jsonarray;
let sumprice = 0;
let deliverypay =0;
let totalpay = 0;
let point = 0;

$( function(){  
	getcart();
});

// 2. 장바구니 데이터 호출 메소드
function getcart() {
		$.ajax({
		url : 'getcart' ,
		success : function( json ){
			jsonarray = json;
			tableview();
		
		}
	});
	
}
/* 3. 테이블에 데이터를 넣어주는 함수 */
function tableview(){
	let tr = '<tr> <!-- 헤더 -->'+
'					<th width="60%">상품정보</th> 	<!-- width속성 : 가로길이  -->'+
'					<th width="20%">수량</th> 		'+
'					<th width="20%">가격</th> '+
'				</tr>';

				 sumprice = 0;
				 deliverypay =0;
				 totalpay = 0;
				 
			for( let i = 0 ; i<jsonarray.length; i++ ){
				
				sumprice += jsonarray[i]["totalprice"];
				
				tr += 
				'<tr>'+
'					<td> <!--  상품정보 열 -->'+
'						<div class="row"> <!-- row(b) : 하위 태그를 가로배치   -->'+
'							<div class="col-sm-2"> <!-- col-sm-2(b) : 12그리드 중 2그리드 사용 -->'+
'								<img alt="" src="/jspweb/admin/productimg/'+jsonarray[i]["pimg"]+'" width="70%"> '+
'							</div>'+
'							<div class="col-sm-10">'+
'								<div class="pnamebox"> '+jsonarray[i]["pname"]+' </div>'+
'								<div class="optionbox">'+jsonarray[i]["scolor"]+' / '+jsonarray[i]["ssize"]+'</div>'+
'							</div>'+
'						</div>   '+
'						<br>'+
'					</td> '+
'					<td class="align-middle"> <!-- 수량 --> <!-- align-middle(b) : 수직 중앙배치 -->'+
'						<div class="row g-0"> <!-- g-0(b) : 그리드 간 여백 제거 -->'+
'							'+
'							<div class="col-sm-5 offset-3">'+
'								<!-- form-control(b) : 입력상자 형식 꾸미기 -->'+
'								<input readonly id="" value="'+jsonarray[i]["samount"]+'" type="text" class="form-control" style="background-color: white;">'+
'							</div>'+
'							'+
'							<div class="col-sm-2">'+
'								<button onclick="amounticre('+i+')" class="amount_btn"> ▲ </button>'+
'								<button onclick="amountdecre('+i+')" class="amount_btn"> ▼ </button>'+
'							</div>'+
'						</div>'+
'					</td>'+
'					<td class="align-middle"> <!--  가격 -->'+
'						<div class="row g-0">'+
'							<div class="col-md-8 pricebox">'+jsonarray[i]["totalprice"].toLocaleString()+'원</div>'+
'							<div class="col-md-4 deletebox"><button onclick="cancel('+i+')">X</button></div>'+
'						</div>'+
'					</td>'+
'				</tr>';
			}
			
			// 만약 총가격이 7만원 이상이면 배송비 무료
			if(sumprice >= 70000){
				deliverypay =0;
			} else {
				deliverypay = 2500;
			} // 총주문금액
			// 만약에 장바구니에 상품이 없으면
			if(jsonarray.length == 0) {
				tr += '<td style="text-align:center" colspan="3"> 상품이 없습니다.</td>'
				deliverypay = 0; 
			}
			totalpay = sumprice + deliverypay;
			// 포인트
			point = sumprice *0.01;
			//출력
			$("#sumprice").html(sumprice.toLocaleString()+'원')
			$("#deliverypay").html(deliverypay.toLocaleString()+'원')
			$("#totalpay").html(totalpay.toLocaleString()+'원')
			$("#point").html(point.toLocaleString()+'원')
			
			$("#carttable").html( tr );
}

// 4. json상태 업데이트 처리 메소드
function updatecart(){
	$.ajax({
		url : "updatecart",
		data : {"json" : JSON.stringify(jsonarray)},
		success : function (json) {
			alert("업데이트처리")
			getcart();
		}
	})
	
}

/* 8. 장바구니 삭제 처리 메소드 */
function deletecart(i){
	$.ajax({
		url : "deletecart",
		data : { 'cartno' : jsonarray[i]["cartno"] },
		success : function (json) {
			alert("삭제처리")
			getcart();
		}
	})
	
}




// 수량 증가 메소드
function amounticre(i) {
	
	$.ajax({
		url : "getamount" ,
		data : {'pno' : jsonarray[i]['pno'],
		"color":jsonarray[i]['scolor'],
		"size":jsonarray[i]['ssize'] },
		success : function(maxamount) {
			if(jsonarray[i]['samount']>= maxamount) {alert("재고부족");return; }
			
			let price =parseInt((jsonarray[i]['totalprice'] / jsonarray[i]['samount']))
			jsonarray[i]['samount']++;
			jsonarray[i]['totalprice'] = price * jsonarray[i]['samount'];
			updatecart();
		}
		
	})
	
	
	
}

// 수량 감소 메소드
function amountdecre(i) {
	if(jsonarray[i]["samount"] == 1){alert("최소 수량입니다"); return}
	
	let price = parseInt ( (  jsonarray[i]['totalprice'] / jsonarray[i]['samount'] ) ); // 제품 하나의 금액
	jsonarray[i]['samount']--; // 수량감소 
	jsonarray[i]['totalprice'] = price * jsonarray[i]['samount']; // 증가된 수량의 총금액 업데이트
	updatecart();
}

// json 배열내 특정 인덱스 삭제
function cancel(i){
	
	if(i==-1) {
		if(confirm('전체 삭제하시겠습니까?')) {
			for(let j =0; j<jsonarray.length; j++) {
				deletecart(j);
			}
		}
		return;
	}
	
	deletecart(i);
}



