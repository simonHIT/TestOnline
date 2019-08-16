var courseId = getQueryVariable('courseId');

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
$(function(){
	isLogged();
	courseInit();
	getAllTestPaper();
})

function getAllTestPaper(){

	var str = "";
	$.ajax({
		type:"GET",
		url:"../TestOnline/paperservice/allpaper?courseId=" + courseId,
		async:true,
		dataType: 'json',
		cache:false,
		success:function(reg){
			console.log(reg);
			var dataList = reg.dataList;
			for(var i = 0 ; i < dataList.length ; i++){
				str += "<div class='test_block'><div class='test_img'></div><label>";
				str += "<a href=\"TestPage.html?paperId="+ dataList[i].recordId +"&state=0" +"\">测验"+ (i+1) +"</a>";
				str += "</label></div>";
			}
			$(".test_list_area").append(str);
		},error: function(XMLHttpRequest){  
     		alert( "Error: " + XMLHttpRequest.responseText);  
   		} 
	});
}

function courseInit(){
	if(localStorage.courseInfo != null && localStorage.courseInfo != ""){
		var courseInfo = localStorage.courseInfo;
		var _courseInfo = eval("("+courseInfo+")");
		console.log(_courseInfo.courseId);
		$("#_courseName").html("");
		$("#_courseName").html(_courseInfo.courseName);
		
		var img = "../TestOnline/upload/" + _courseInfo.courseImg;
		$(".courseImg").css("background", "url(" + img + ")");
		$(".courseImg").css("background-size", "100%");
	}
	var str = "?courseId=" + courseId;
	var a = document.querySelector(".option_list").getElementsByTagName("a");

		for(var i = 0 ; i < a.length ; i++){
			a[i].href += str;
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