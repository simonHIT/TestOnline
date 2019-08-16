var courseId;

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
	console.log("1");
}

var userId = "1";

$(function(){
	isLogged();
	courseInit();
	getAllTestPaper();
})

function getAllTestPaper(){
	if(localStorage.courseInfo != null && localStorage.courseInfo != "") {
		var courseInfo = localStorage.courseInfo;
		var _courseInfo = eval("(" + courseInfo + ")");
		$("#_courseName").html("");
		$("#_courseName").html(_courseInfo.courseName);
	
		var img = "../TestOnline/upload/" + _courseInfo.courseImg;
		$(".courseImg").css("background", "url(" + img + ")");
		$(".courseImg").css("background-size", "100%");
	}
	var str = "";
	$.ajax({
		type:"GET",
		url:"../TestOnline/testpaper/getPapers?courseId=" + courseId + "&userId=" + userId,
		async:true,
		dataType: 'json',
		cache:false,
		success:function(reg){
			console.log(reg);
			var dataList = reg.dataList;
			for(var i = 0 ; i < dataList.length ; i++){
				str += "<div class='test_block'><div class='test_img'></div><label>";
				str += "<a href=\"TestPage.html?paperId="+ dataList[i].testPaperId +"&state="+dataList[i].state + "&userId=" + userId +"\">测验"+ (i+1) +"</a>";
				str += "</label></div>";
			}
			$(".test_list_area").append(str);
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
	}else{
		alert("请先登录");
		window.location.href='Login.html';
	}
	
}