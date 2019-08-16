var mydataList ;
var ranks;
var courseId;
if(localStorage.courseInfo != null && localStorage.courseInfo != ""){
	var courseInfo = localStorage.courseInfo;
	var _courseInfo = eval("("+courseInfo+")");
	console.log(_courseInfo.courseId);
	courseId = _courseInfo.courseId;
	var img = "../TestOnline/upload/" + courseInfo.courseImg;
	$(".courseImg").css("background", "url(" + img + ")");
	$(".courseImg").css("background-size", "100%");
}
$(function(){
	isLogged();
	getAllque();
	for(var i =0 ; i<mydataList.length;i++){
		getQueOption(mydataList[i].queId);
	}
	
})
 
$(document).ready(function(){
  $("#_upBtn").delegate("Button","click",function(){
	sumbitBtn();
	//$("#test_submit_btn").attr("disabled", true);
//	document.getElementById("test_submit_btn").disabled=true;
//	$("#test_submit_btn").attr("disabled", true).CSS(color,gray);
	$("#test_submit_btn").css('display','none');
	});
});
 

function getAllque(){
	var questionNum = 15;
//	alert(paperId);
	var mydata = {
		num:questionNum,
		courseId : courseId
	}
	$.ajax({
		type:"POST",
		url:"../TestOnline/question/showQuiz",
		async:false,
		cache:false,
		dataType: 'json',
		data:mydata,
		success:function(reg){
			console.log(reg);
			var dataList = reg.dataList;
			mydataList = dataList;
			var _textQ = [];
			var str = "";
			var cn = 0;
			for(var i = 0; i < dataList.length ; i++){
					cn = cn +1 ;
					str += "<div class='choice_question_area' data-id = "+ dataList[i].queId +" id =\""+ dataList[i].queId +"\">";
					str += "<div class='f-text'><p> " + cn + ". " + dataList[i].queInfo + "</p></div></div >";
				}
			str += "<div id='_upBtn'><button id='test_submit_btn'>提交</button></div>"
			$("#test_area").append(str);
		},error: function(XMLHttpRequest){  
     		alert( "Error: " + XMLHttpRequest.responseText);  
   		} 
	});
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

function getQueOption(queId){
	var sr = "";
	var optionSel = ['A','B','C','D','E'];
	$.ajax({
		type:"GET",
		url:"../TestOnline/testpaper/getOptions?questionId=" + queId,
		async:false,
		cache:false,
		dataType: 'json',
		success:function(reg){
			var dataList = reg.dataList;
			console.log(dataList);
			sr += "<ul>";
			for(var i = 0 ; i < dataList.length ; i++){
				sr += "<li><input class='rad_button f-rado' type='radio' name="+ queId +" value=\""+ optionSel[i] +"\" />";
				sr += "<div class='f-op'><p>"
				sr += optionSel[i] + ". "
				sr += dataList[i].optionInfo;
				sr += "</p></div></li>"
			}
			sr += "</ul>";
			$("#"+queId).append(sr);
		},error: function(XMLHttpRequest){  
     		alert( "Error: " + XMLHttpRequest.responseText);  
   		} 
	});
}



function sumbitBtn(){
	ranks = 0;
	var queList = new Array();
	var userAnsList = new Array();
	var AnsStatus = new Array();
	$(".choice_question_area").each(function(index,item){
		var _quesId = $(item).data("id");
		var userAns = $("input[name=\""+ _quesId +"\"]:checked").val();
		queList.push(_quesId);
		userAnsList.push(userAns);
	})
	
	
	console.log(queList);
	console.log(userAnsList);
	
	for(var i = 0;i<mydataList.length;i++){
		if(mydataList[i].queAns==userAnsList[i]){
			ranks += Number(mydataList[i].queValue);
			AnsStatus.push("right");
		}else{
			AnsStatus.push("wrong");
		}
	}
	console.log(ranks);
	console.log(AnsStatus);
	
	
	for(var i = 0;i<mydataList.length;i++){
		$(":radio[name='"+ mydataList[i].queId +"'][value='" + userAnsList[i] + "']").prop("checked", "checked");
		//$("#answer_area" + mydataList[i].queId).val(mydataList[i].queAns);
		if(AnsStatus[i] == "wrong"){
			$("#" + mydataList[i].queId).css('color','red')
		}
		var sr = "";
		sr += "<div class='real-ans'><span>正确答案："+ mydataList[i].queAns +"</span></div>";
		$("#"+mydataList[i].queId).append(sr);
	}
//	alert("您的得分是："+ranks);
	var score = "<div class='testScore'>得分 ："+ ranks +"</div>";
	$("#test_name").append(score);
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