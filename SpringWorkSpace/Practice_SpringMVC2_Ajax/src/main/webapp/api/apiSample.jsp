<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
 <script type="text/javascript" src="https://openapi.map.naver.com/openapi/v3/maps.js?ncpClientId=yjjq1hdu73&submodules=geocoder"></script>
</head>
<body>
	<h1>API 샘플</h1>
	<h2>1.다음(카카오) 주소찾기 API</h2>
	<input type="text"   id="postCode" 			placeholder="우편번호">
	<input type="button" id="" 			onclick="addrSearch()" value="우편번호 찾기"><br>
	<input type="text"   id="roadAddr" 			placeholder="도로명주소">
	<input type="text"   id="jibunAddr" 		placeholder="지번주소">
	<input type="text"   id="detailAddr" 		placeholder="상세주소">
	
	<h2>2.네이버 지도</h2>
	<div id="map" style="width:100%;height:400px;"></div>
	
	
	
</body>
<script>

///다음 주소 api
	function addrSearch(){
		new daum.Postcode({
	        oncomplete: function(data) {
				document.querySelector("#postCode").value=data.zonecode;
				document.querySelector("#roadAddr").value=data.roadAddress;
				document.querySelector("#jibunAddr").value=data.jibunAddress;
	        
	        }
		}).open();
	}
	
//네이버 지도 api
	//center 가 기본 지도 위치 셋팅 값
	//구글검색해서 좌표를 얻어낼 ㅜㅅ 있나봄.
	//위도 경도/ 구글링
	var mapOptions = {
	    center: new naver.maps.LatLng(37.5678912, 126.9830897),
	    zoom: 17,
	    zoomControl : true,
	    zoomControlOptions : {
	    		position : naver.maps.Position.TOP_RIGHT,
	    		style : naver.maps.ZoomControlStyle.SMALL
	    }
	};
	
	var map = new naver.maps.Map('map', mapOptions);
	
	var markerOptions = {}
	
	var marker = new naver.maps.Marker({
		position : new naver.maps.LatLng(37.567892,126.9830897),
		map : map
	});
	
	//정보창 생성
	var contentStr = "<div><h3>KH정보교육원</h3><p></p></div>";
	var infoWindow = new naver.maps.InfoWindow({
		content : contentStr
	});
	//정보창 오픈
	infoWindow.open(map,marker);
	
	//마커에 이벤트 연결
	naver.maps.Event.addListener(marker,"click",function(e){
		if(infoWindow.getMap()){ // 정보창 오픈 여부
			infoWindow.close(); //정보창 닫기
		}else{
			infoWindow = new naver.maps.InfoWindow({
				content : contentStr
			})
			infoWindow.open(map,marker); //정보창 열기
		}
	});
	
	
	//지도에 이벤트 연결
	naver.maps.Event.addListener(map,"click",function(e){
		
		//정보창 오픈
		infoWindow.open(map,marker);
		
		console.log(e);
		marker.setPosition(e.coord);
		if(infoWindow.getMap()){
			infoWindow.close();
		}
		
		naver.maps.Service.reverseGeocode({
			location : new naver.maps.LatLng(e.coord.lat(),e.coord.lng())
		}, function(status, response) {
			console.log(response);
			var data = response.result;
			var items = data.items;
			var address = items[1].address;
			contentStr = "<div>{p}"+ address + "</p></div>";
		});
	});
	
	
</script>
</html>