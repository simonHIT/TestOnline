var editorList = new Array();
var mydataList;
var ndataList;

$(function(){
	getAllque();
	$(".choice_question_area").each(function(index,item){
		var _quesId = $(item).data("id");
		getQueOption(_quesId);
//		queIdList.push(1);
	})
	
	var state = getQueryVariable("state");
	
	if(state == "0"){
		setMyTime();
	}else if(state == "3"){
		localStorage.cookieTime = ""
		$("#_upBtn").css('display','none');
		$(".timeBox").css('display','none');
		getMinq();
	}else{
		localStorage.cookieTime = ""
		$(".timeBox").css('display','none');
		$("#_upBtn").css('display','none');
		getMinq2();
	}
})

$(document).ready(function(){
	var _menus = [
		'head', // 标题
		'bold', // 粗体
		'fontSize', // 字号
		'fontName', // 字体
		'italic', // 斜体
		'underline', // 下划线
		'strikeThrough', // 删除线
		'foreColor', // 文字颜色
		'link', // 插入链接
		'justify', // 对齐方式
		'quote', // 引用
		'image', // 插入图片
		'code', // 插入代码
		'undo', // 撤销
	];
	var E = window.wangEditor;
	for(var j = 0; j < ndataList.length; j++) {
		var i = ndataList[j];
		editorList[j] = new E("#answer_area" + mydataList[i].queId);
		editorList[j].customConfig.uploadImgShowBase64 = true;
		editorList[j].customConfig.menus = _menus;
		editorList[j].create();
	}
  $("#_upBtn").delegate("Button","click",function(){
	sumbitBtn();
	});
});



function getAllque(){
	var paperId = getQueryVariable("paperId");
//	alert(paperId);
	$.ajax({
		type:"GET",
		url:"../TestOnline/testpaper/getAllsubject?paperid=" + paperId,
		async:false,
		cache:false,
		dataType: 'json',
		success:function(reg){
			console.log(reg);
			var dataList = reg.dataList;
			mydataList = dataList;
			var _textQ = [];
			var str = "";
			var cn = 0;
			for(var i = 0; i < dataList.length ; i++){
					if(dataList[i].queTag == "0"){
						cn = cn +1 ;
						str += "<div class='choice_question_area' data-id = "+ dataList[i].queId +" id =\""+ dataList[i].queId +"\">";
						str += "<div class='f-text'><p> " + cn + ". " + dataList[i].queInfo + "</p></div></div >";
					}else{
						_textQ.push(i);
					}
				}
			ndataList = _textQ;
			for(var j = 0 ; j < _textQ.length; j++){
				var i = _textQ[j];
				str += "<div class='answer_question_area' data-id = "+ dataList[i].queId +" id =\""+ dataList[i].queId +"\">";
				str += "<div class='f-text'><p>" + cn + ". " + dataList[i].queInfo + "</p></div>";
				str += "<div class='_answer_area' id=\"answer_area"+ dataList[i].queId + "\"></div></div>";
				
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
	var paperId = getQueryVariable("paperId");
	var userId = "1";
	var user = getQueryVariable("userId");
	if(user != ""){
		userId = user;
	}
	var queList = new Array();
	var userAnsList = new Array();
	$(".choice_question_area").each(function(index,item){
		var _quesId = $(item).data("id");
		var userAns = $("input[name=\""+ _quesId +"\"]:checked").val();
		queList.push(_quesId);
		userAnsList.push(userAns);
//		queIdList.push(1);
	})
	
	$(".answer_question_area").each(function(index,item){
		var _quesId = $(item).data("id");
		var userAns = editorList[index].txt.html();
		userAns = userAns.replace(/\"/g, "\\\"");
		userAns = userAns.replace(/\+/g,"%2B");
		userAns = userAns.replace(/\=/g,"&3D");
		userAns = userAns.replace(/\,/g,"%82");
		userAnsList.push(userAns);
		queList.push(_quesId);
//		queIdList.push(1);
	})
	
	var _quesIdList = queList.toString().replace(/\[.*?\]/g,'');
	
//	var _userAnsList = userAnsList.toString().replace(/\[.*?\]/g,'');

	var s = userAnsList.toString();

	var _userAnsList = s;
	
	var mydata = {
		answerList:_userAnsList,
        questionIdList:_quesIdList,
        paperId: paperId,
        userId: userId
    };
    console.log(mydata);
    
    $.ajax({
		type:"POST",
		url:"../TestOnline/paper/submit",
		async:true,
		dataType: 'json',
		cache:false,
		data: mydata,
		success:function(reg){
			console.log(reg);
			alert("提交成功");
			window.history.back(-1); 
		},error: function(XMLHttpRequest){  
     		alert( "Error: " + XMLHttpRequest.responseText);  
   		} 
	});
}

function getMinq(){
	
	var userId = "1";
	var paperId = getQueryVariable("paperId");
	var user = getQueryVariable("userId");
	if(user != ""){
		userId = user;
	}
	$.ajax({
		type:"GET",
		url:"../TestOnline/paperservice/minq?userId="+ userId + "&paperId=" + paperId,
		async:true,
		dataType: 'json',
		cache:false,
		success:function(reg){
			var cnt = 0;
			console.log(reg);
			console.log(reg.dataList);
			var dataList = reg.dataList;
			var j = 0;
			for(var i = 0 ; i < dataList.length ; i++){
				if(i < dataList.length-ndataList.length){
					$(":radio[name='"+ dataList[i].questionQueId +"'][value='" + dataList[i].userAns + "']").prop("checked", "checked");
				}else{
					var userAns = dataList[i].userAns;
					userAns = userAns.replace(/\\\"/g, "\"");
					userAns = userAns.replace(/%2B/g,"\+");
					userAns = userAns.replace(/&3D/g,"\=");
					userAns = userAns.replace(/%82/g,"\,");
					editorList[j].txt.html(userAns);
					j++;
				}
				 if(dataList[i].userGrade == "0"){
				 	$("#" + dataList[i].questionQueId).css('color','red')
				 }
				 
				 
				 cnt += Number(dataList[i].userGrade);
				var sr = ""; 
				sr += "<div class='real-ans'><span>正确答案："+ mydataList[i].queAns +"</span></div>";
				$("#"+mydataList[i].queId).append(sr);
			}
			console.log(cnt);
			var score = "<div class='testScore'>得分 ："+ cnt +"</div>";
			
			$("#test_name").append(score);
		},error: function(XMLHttpRequest){  
     		alert( "Error: " + XMLHttpRequest.responseText);  
   		} 
	});
}

function getMinq2(){
	var userId = "1";
	var user = getQueryVariable("userId");
	if(user != ""){
		userId = user;
	}
	var paperId = getQueryVariable("paperId");
	
	$.ajax({
		type:"GET",
		url:"../TestOnline/paperservice/minq?userId="+ userId + "&paperId=" + paperId,
		async:true,
		dataType: 'json',
		cache:false,
		success:function(reg){
			var cnt = 0;
			console.log(reg);
			console.log(reg.dataList);
			var dataList = reg.dataList;
			var j = 0;
			for(var i = 0 ; i < dataList.length ; i++){
//				 $(":radio[name='"+ dataList[i].questionQueId +"'][value='" + dataList[i].userAns + "']").prop("checked", "checked");
				 if(i < dataList.length-ndataList.length){
					$(":radio[name='"+ dataList[i].questionQueId +"'][value='" + dataList[i].userAns + "']").prop("checked", "checked");
				}else{
					var userAns = dataList[i].userAns;
					userAns = userAns.replace(/\\\"/g, "\"");
					userAns = userAns.replace(/%2B/g,"\+");
					userAns = userAns.replace(/&3D/g,"\=");
					userAns = userAns.replace(/%82/g,"\,");
					editorList[j].txt.html(userAns);
					j++;
				}
				 
			}
			console.log(cnt);
		},error: function(XMLHttpRequest){  
     		alert( "Error: " + XMLHttpRequest.responseText);  
   		} 
	});
}

	
	function setMyTime() {
		var x = "2:0:0",
				interval;
		if(!hasSetTime()) {
			localStorage.cookieTime = x;
		} else {
			x = localStorage.cookieTime;
		}
		var d = new Date("1111/1/1," + x);
		interval = setInterval(function() {
			var m = d.getMinutes();
			var s = d.getSeconds();
			var h = d.getHours();
//			h = m < 10 ? "0" + h : h;
			m = m < 10 ? "0" + m : m;
			s = s < 10 ? "0" + s : s;
			timeTxt.innerHTML = h + ":" + m + ":" + s;
			if(m == 0 && s == 0 && h == 0) {
				clearInterval(interval);
				localStorage.cookieTime = "";
				return;
			}
			var t = h + ":" + m + ":" + s;
			localStorage.cookieTime = t;
			console.log(t);
			d.setSeconds(s - 1);
		}, 1000);
	}

function hasSetTime() {
	if(localStorage.cookieTime == null || localStorage.cookieTime == "") {
		return false
	} else {
		return true
	}
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