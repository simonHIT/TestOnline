$(function(){
	isLogged();
	getCpuCourse();
	getswCourse();
	getwlCourse();
	getwxCourse();
	gethxCourse();
	getsxCourse();
})



function isLogged(){
	var userstr=sessionStorage.getItem("user");
	if(userstr != null && userstr != ""){
		console.log(userstr);
		var jsonObj = eval("("+userstr+")");
		var roleId = jsonObj.roleId;
		console.log(roleId);
		if(roleId == 1){
			$("#myCourse").attr('href','StudentCourse.html');
			
			console.log($("#myCourse"));
		}else{
			$("#myCourse").attr('href','StudentCourse.html');
			$("#_myCourse").attr('href','TeacherCourse.html');
			$("_#myCourse").css('display','block');
		}
	}else{
		alert("请先登录");
		window.location.href='Login.html';
	}
	
}

function getAllCourse(){
	localStorage.courseInfo = ""
	var str = "";
	$.ajax({
		type:"GET",
		url:"../TestOnline/course/showCourse",
		async:true,
		dataType: 'json',
		cache:false,
		success:function(reg){
			console.log(reg);
			console.log(reg.status);
			console.log(reg.dataList);
			var status = reg.status;
			var dataList = reg.dataList;
			console.log(status.code)
			if(status.code == 0){
				for(var i = 0; i < dataList.length ; i++){
					str += "<div class = 'course_block' >";
					str += "<div class='course_img'></div>";
					str += "<a href=\"CourseInfo.html?courseId="+ dataList[i].courseId +"\">"+ dataList[i].courseName +"</a></div>";
				}
				$("#course_area").append(str);
			}
		},error: function(XMLHttpRequest){  
     		console.log( "Error: " + XMLHttpRequest.responseText); 
   		} 
	});
}

function getCpuCourse(){
	localStorage.courseInfo = ""
	var str = "";
	$.ajax({
		type:"GET",
		url:"../TestOnline/course/getbyType?type=计算机",
		async:true,
		dataType: 'json',
		cache:false,
		success:function(reg){
			console.log(reg);
			console.log(reg.status);
			console.log(reg.dataList);
			var status = reg.status;
			var dataList = reg.dataList;
			console.log(status.code)
			if(status.code == 0){
				var len = 6
				if(dataList.length < len ){
					len = dataList.length;
				}
				for(var i = 0; i < len ; i++){
					str += "<div class = 'n_courseBlock' >";
					str += "<div class='course_img' style='background: url(../TestOnline/upload/" + dataList[i].courseImg +") no-repeat; background-size: 100%;'></div>";
					str += "<a href=\"CourseInfo.html?courseId="+ dataList[i].courseId +"\">"+ dataList[i].courseName +"</a></div>";
				}
				$("#cpu").append(str);
			}
		},error: function(XMLHttpRequest){  
     		console.log( "Error: " + XMLHttpRequest.responseText); 
   		} 
	});
}
function gethxCourse(){
	localStorage.courseInfo = ""
	var str = "";
	$.ajax({
		type:"GET",
		url:"../TestOnline/course/getbyType?type=化学",
		async:true,
		dataType: 'json',
		cache:false,
		success:function(reg){
			console.log(reg);
			console.log(reg.status);
			console.log(reg.dataList);
			var status = reg.status;
			var dataList = reg.dataList;
			console.log(status.code)
			if(status.code == 0){
				var len = 6
				if(dataList.length < len ){
					len = dataList.length;
				}
				for(var i = 0; i < len ; i++){
					str += "<div class = 'n_courseBlock' >";
					str += "<div class='course_img' style='background: url(../TestOnline/upload/" + dataList[i].courseImg +") no-repeat; background-size: 100%;'></div>";
					str += "<a href=\"CourseInfo.html?courseId="+ dataList[i].courseId +"\">"+ dataList[i].courseName +"</a></div>";
				}
				$("#hx").append(str);
			}
		},error: function(XMLHttpRequest){  
     		console.log( "Error: " + XMLHttpRequest.responseText); 
   		} 
	});
}

function getswCourse(){
	localStorage.courseInfo = ""
	var str = "";
	$.ajax({
		type:"GET",
		url:"../TestOnline/course/getbyType?type=生物",
		async:true,
		dataType: 'json',
		cache:false,
		success:function(reg){
			console.log(reg);
			console.log(reg.status);
			console.log(reg.dataList);
			var status = reg.status;
			var dataList = reg.dataList;
			console.log(status.code)
			if(status.code == 0){
				var len = 6
				if(dataList.length < len ){
					len = dataList.length;
				}
				for(var i = 0; i < len ; i++){
					str += "<div class = 'n_courseBlock' >";
					str += "<div class='course_img' style='background: url(../TestOnline/upload/" + dataList[i].courseImg +") no-repeat; background-size: 100%;'></div>";
					str += "<a href=\"CourseInfo.html?courseId="+ dataList[i].courseId +"\">"+ dataList[i].courseName +"</a></div>";
				}
				$("#sw").append(str);
			}
		},error: function(XMLHttpRequest){  
     		console.log( "Error: " + XMLHttpRequest.responseText); 
   		} 
	});
}

function getsxCourse(){
	localStorage.courseInfo = ""
	var str = "";
	$.ajax({
		type:"GET",
		url:"../TestOnline/course/getbyType?type=数学",
		async:true,
		dataType: 'json',
		cache:false,
		success:function(reg){
			console.log(reg);
			console.log(reg.status);
			console.log(reg.dataList);
			var status = reg.status;
			var dataList = reg.dataList;
			console.log(status.code)
			if(status.code == 0){
				var len = 6
				if(dataList.length < len ){
					len = dataList.length;
				}
				for(var i = 0; i < len ; i++){
					str += "<div class = 'n_courseBlock' >";
					str += "<div class='course_img' style='background: url(../TestOnline/upload/" + dataList[i].courseImg +") no-repeat; background-size: 100%;'></div>";
					str += "<a href=\"CourseInfo.html?courseId="+ dataList[i].courseId +"\">"+ dataList[i].courseName +"</a></div>";
				}
				$("#sx").append(str);
			}
		},error: function(XMLHttpRequest){  
     		console.log( "Error: " + XMLHttpRequest.responseText); 
   		} 
	});
}

function getwlCourse(){
	localStorage.courseInfo = ""
	var str = "";
	$.ajax({
		type:"GET",
		url:"../TestOnline/course/getbyType?type=物理",
		async:true,
		dataType: 'json',
		cache:false,
		success:function(reg){
			console.log(reg);
			console.log(reg.status);
			console.log(reg.dataList);
			var status = reg.status;
			var dataList = reg.dataList;
			console.log(status.code)
			if(status.code == 0){
				var len = 6
				if(dataList.length < len ){
					len = dataList.length;
				}
				for(var i = 0; i < len ; i++){
					str += "<div class = 'n_courseBlock' >";
					str += "<div class='course_img' style='background: url(../TestOnline/upload/" + dataList[i].courseImg +") no-repeat; background-size: 100%;'></div>";
					str += "<a href=\"CourseInfo.html?courseId="+ dataList[i].courseId +"\">"+ dataList[i].courseName +"</a></div>";
				}
				$("#wl").append(str);
			}
		},error: function(XMLHttpRequest){  
     		console.log( "Error: " + XMLHttpRequest.responseText); 
   		} 
	});
}

function getwxCourse(){
	localStorage.courseInfo = ""
	var str = "";
	$.ajax({
		type:"GET",
		url:"../TestOnline/course/getbyType?type=文学",
		async:true,
		dataType: 'json',
		cache:false,
		success:function(reg){
			console.log(reg);
			console.log(reg.status);
			console.log(reg.dataList);
			var status = reg.status;
			var dataList = reg.dataList;
			console.log(status.code)
			if(status.code == 0){
				var len = 6
				if(dataList.length < len ){
					len = dataList.length;
				}
				for(var i = 0; i < len ; i++){
					str += "<div class = 'n_courseBlock' >";
					str += "<div class='course_img' style='background: url(../TestOnline/upload/" + dataList[i].courseImg +") no-repeat; background-size: 100%;'></div>";
					str += "<a href=\"CourseInfo.html?courseId="+ dataList[i].courseId +"\">"+ dataList[i].courseName +"</a></div>";
				}
				$("#wx").append(str);
			}
		},error: function(XMLHttpRequest){  
     		console.log( "Error: " + XMLHttpRequest.responseText); 
   		} 
	});
}