var courseId = getQueryVariable('courseId');
var userId = "1";
if(localStorage.courseInfo != null && localStorage.courseInfo != ""){
	var courseInfo = localStorage.courseInfo;
	var _courseInfo = eval("("+courseInfo+")");
	console.log(_courseInfo.courseId);
	courseId = _courseInfo.courseId;
}


$(function(){
	isLogged();
	courseInit();
	getCourseInfo(courseId);
})


function getQueryVariable(variable)
{
       var query = window.location.search.substring(1);
       var vars = query.split("&");
       for (var i=0;i<vars.length;i++) {
               var pair = vars[i].split("=");
               if(pair[0] == variable){return pair[1];}
       }
       return(false);
}



function courseInit(){
	var str = "?courseId=" + courseId;
	var a = document.querySelector(".option_list").getElementsByTagName("a");
	if(userId != "" && userId != null){
		for(var i = 0 ; i < a.length ; i++){
			a[i].href += str;
		}
	}
}

function getCourseInfo(courseId){
	$.ajax({
		type:"GET",
		url:"../TestOnline/course/getCourseInfo?courseId=" + courseId,
		async:false,
		dataType: 'json',
		cache:false,
		success:function(reg){
			console.log(reg);
			var status = reg.status;
			var code = status.code;
			console.log(reg);
			var entity = reg.entity;
			var jsonStr = JSON.stringify( entity );
			
			localStorage.courseInfo = jsonStr;
			console.log(entity);
			$("#_courseName").html("");
			$("#_courseName").html(entity.courseName);
			
			var img = "../TestOnline/upload/" + entity.courseImg;
			$(".courseImg").css("background","url("+ img +")");
			$(".courseImg").css("background-size","100%");
			$("#m_courseInfo").append("<p>" + entity.courseInfo + "</p>");
			
		},error: function(XMLHttpRequest){  
     		alert( "Error: " + XMLHttpRequest.responseText);  
   		} 
	});
}

function isLogged(){
	var userstr=sessionStorage.getItem("user");
	if(userstr != null && userstr != ""){
		console.log(userstr);
		var jsonObj = eval("("+userstr+")");
		var roleId = jsonObj.roleId;
		console.log(roleId);
		userId = jsonObj.userId;
		if(roleId == 1){
			$("#myCourse").attr('href','StudentCourse.html');
			console.log($("#myCourse"));
		}else{
			$("#myCourse").attr('href','TeacherCourse.html');
		}
	}else{
		alert("请先登录");
		window.location.href='Login.html';
	}
	
}