var courseId = getQueryVariable('courseId');

if(localStorage.courseInfo != null && localStorage.courseInfo != ""){
	var courseInfo = localStorage.courseInfo;
	var _courseInfo = eval("("+courseInfo+")");
	console.log(_courseInfo.courseId);
	courseId = _courseInfo.courseId;
	
}
var userId = "1"

$(function(){
	isLogged();
	var user = sessionStorage.getItem("user");
	var jsonObj = eval("("+user+")");
	console.log(jsonObj.userId);
	userId = jsonObj.userId;
	getCourseInfo(courseId);
	courseInit();
	isSelected();
})


$(document).ready(function(){
  $("#joinCourse").delegate("#selectC","click",function(){
		selectCourse();
	});
	$("#outCourse").delegate("#outC","click",function(){
		outCourse();
	});
});

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


function isSelected(){
	
	$.ajax({
		type:"GET",
		url:"../TestOnline/course/isSelect?userId="+ userId + "&courseId=" + courseId,
		async:false,
		dataType: 'json',
		cache:false,
		success:function(reg){
			console.log(reg);
			var status = reg.status;
			var code = status.code;
			if(code == "0"){
				$("#selectC").css('display','none');
				$("#myselected").css('display','block');
				
				$("#outC").css('display','block');
			}else{
				$("#_test").css('display','none');
				$("#_file").css('display','none');
				$("#_testself").css('display','none');
			}
		},error: function(XMLHttpRequest){  
     		alert( "Error: " + XMLHttpRequest.responseText);  
   		} 
	});
}


function selectCourse(){
	$.ajax({
		type:"GET",
		url:"../TestOnline/course/selectCourse?userId="+ userId + "&courseId=" + courseId,
		async:false,
		dataType: 'json',
		cache:false,
		success:function(reg){
			console.log(reg);
			var status = reg.status;
			var code = status.code;
			if(code == "0"){
				$("#selectC").css('display','none');
				$("#myselected").css('display','block');
				$('#outC').css('display','block');
				$("#_test").css('display','block');
				$("#_file").css('display','block');
				$("#_testself").css('display','block');
				alert("添加成功");
			}else{
				alert("添加失败");
			}
		},error: function(XMLHttpRequest){  
     		alert( "Error: " + XMLHttpRequest.responseText);  
   		} 
	});
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

function outCourse(){

	var mydata = {
		userId:userId,
		courseId:courseId
	};
	
	$.ajax({
		type: "POST",
		url:"../TestOnline/deletes/deleteCourse",
		async:false,
		dataType: 'json',
		cache:false,
		data:mydata,
		success:function(reg){
			console.log(reg);
			$("#_test").css('display','none');
			$("#_file").css('display','none');
			$("#_testself").css('display','none');
			$("#outC").css('display','none');
			$("#selectC").css('display','block');
			$("#myselected").css('display','none');
		},error: function(XMLHttpRequest){  
     		alert( "Error: " + XMLHttpRequest.responseText);  
   		} 
	});
}
