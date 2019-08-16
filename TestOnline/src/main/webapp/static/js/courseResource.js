var courseId = "1";
if(localStorage.courseInfo != null && localStorage.courseInfo != ""){
	var courseInfo = localStorage.courseInfo;
	var _courseInfo = eval("("+courseInfo+")");
	console.log(_courseInfo.courseId);
	courseId = _courseInfo.courseId;
	$("#_courseName").html("");
	$("#_courseName").html(_courseInfo.courseName);
	
	var img = "../TestOnline/upload/" + _courseInfo.courseImg;
	$(".courseImg").css("background", "url(" + img + ")");
	$(".courseImg").css("background-size", "100%");
}
$(document).ready(function(){
	isLogged();
	getAllList();
	if(localStorage.courseInfo != null && localStorage.courseInfo != ""){
		var courseInfo = localStorage.courseInfo;
		var _courseInfo = eval("("+courseInfo+")");
		$("#_courseName").html("");
		$("#_courseName").html(_courseInfo.courseName);
		
		var img = "../TestOnline/upload/" + _courseInfo.courseImg;
		$(".courseImg").css("background", "url(" + img + ")");
		$(".courseImg").css("background-size", "100%");
	}
});

function getAllList(){
	var str = ""
	$.ajax({
		type:"GET",
		url:"../TestOnline/source/getAll?courseId=" + courseId,
		async:true,
		dataType: 'json',
		cache:false,
		success:function(reg){
			console.log(reg);
			var dataList = reg.dataList;
			for(var i = 0 ; i < dataList.length ; i++){
				str += "<div class='_files'><div class='_filed'></div>";
				str += "<a href=\"../TestOnline/upload/"+ dataList[i].resources +"\">"+ dataList[i].resourcesname +"</a>";
				str += "</div>";
			}
			$(".test_list_area").append(str);
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