var choicequeList = "";
var answerqueList = "";
var courseId = "1";
var _courseId = "1";
$(function(){
	getAllQueList();
})
if(localStorage.courseInfo != null && localStorage.courseInfo != ""){
	var courseInfo = localStorage.courseInfo;
	var _courseInfo = eval("("+courseInfo+")");
	console.log(_courseInfo.courseId);
	courseId = _courseInfo.courseId;
	_courseId = courseInfo.courseId;
	$("#_courseName").html("");
	$("#_courseName").html(_courseInfo.courseName);
	
	var img = "../TestOnline/upload/" + _courseInfo.courseImg;
	$(".courseImg").css("background", "url(" + img + ")");
	$(".courseImg").css("background-size", "100%");
}

$(document).ready(function(){
  $(".addbox1").delegate(".addbtn","click",function(){
		newChoicQuestion();
	});
	$(".addbox2").delegate(".addbtn","click",function(){
		newAnswerQuestion();
	});
	$("#subtn").delegate("button","click",function(){
		addTestPaper();
	});
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
});

function newChoicQuestion(){
	var str = "<div class='line1'><label class='label1'>题目</label>";
		str += "<select class='select1'>";
		str += choicequeList;					
		str += "</select></div>";				
		$(".add_choiceque_area").append(str);
}

function newAnswerQuestion(){
	var str = "<div class='line1'><label class='label1'>题目</label>";
		str += "<select class='select1'>";
		str += answerqueList;					
		str += "</select></div>";				
		$(".add_answerque_area").append(str);
}


function getAllQueList(){
	$.ajax({
		type:"GET",
		url:"../TestOnline/paperservice/getQ/" + courseId,
		async:true,
		cache:false,
		dataType: 'json',
		success:function(reg){
			console.log(reg.dataList);
			var dataList = reg.dataList;
			for(var i = 0 ; i < dataList.length; i ++){
				if(dataList[i].queTag == "0"){
					
					choicequeList += "<option value="+ dataList[i].queId +">"+ dataList[i].queInfo +"</option>"
					
				}else{
					
					answerqueList += "<option value="+ dataList[i].queId +">"+ dataList[i].queInfo +"</option>"
					
				}
			}
		},error: function(XMLHttpRequest){  
     		alert( "Error: " + XMLHttpRequest.responseText);  
   		} 
	});
}


function addTestPaper(){
	var queIdList = new Array();

	$(".select1").each(function(index,item){
		var queId = $(item).val();
		if(queId != ""){
			queIdList.push(queId);
		}
	})
	var _quesIdList = queIdList.toString().replace(/\[.*?\]/g,'');
	
	var mydata = {
		courseId:_courseId,
		questionIdList:_quesIdList
	}
	console.log(mydata)
	
	$.ajax({
		type:"POST",
		url:"../TestOnline/paperservice/submit",
		async:true,
		dataType: 'json',
		cache:false,
		data: mydata,
		success:function(reg){
			console.log(reg);
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
			$("#myCourse").attr('href','StudentCourse.html');
			$("#_myCourse").attr('href','TeacherCourse.html');
			$("_#myCourse").css('display','block');
		}
	}else{
		alert("请先登录");
		window.location.href='Login.html';
	}
	
}