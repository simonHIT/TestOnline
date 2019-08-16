var userId = "2";
$(function(){
	isLogged();
	getCourses();
})

function getCourses(){
	localStorage.courseInfo = ""
	var str = "";
	$.ajax({
		type : "GET",
		url : "../TestOnline/course/teaCourse?userId="+userId,
		async : true,
		dataType : 'json',
		cache : false,
		success : function (reg){
			console.log(reg);
			var status = reg.status;
			var dataList = reg.dataList;
			if(status.code == 0){
				for(var i = 0; i < dataList.length ; i++){
					str += "<div class = course_block ><div class = course_img style='background: url(../TestOnline/upload/" + dataList[i].courseImg +") no-repeat; background-size: 100%;'> </div> ";
					str +="<a href=\"CourseInfoT.html?courseId="+ dataList[i].courseId +"\">" + dataList[i].courseName + "</a></div>";
				}
				$("#course_area").append(str);
			}
		},error: function(XMLHttpRequest){  
     	console.log( "Error: " + XMLHttpRequest.responseText); 
     	var str = "<option value=1>error</option>";
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
			$("#myCourse").attr('href','StudentCourse.html');
			$("#_myCourse").attr('href','TeacherCourse.html');
			$("_#myCourse").css('display','block');
		}
		$("#_userImg").attr('src',jsonObj.userImg);
		$("#_userName").html(jsonObj.userName);
	}else{
		alert("请先登录");
		window.location.href='Login.html';
	}
	
}