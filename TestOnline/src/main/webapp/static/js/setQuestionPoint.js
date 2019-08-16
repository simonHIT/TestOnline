var mydataList = new Array();
var editorList = new Array();
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

$(function(){
	getQues();
	getMinq2();
});



$(document).ready(function(){
  $("#upbtn").delegate("input","click",function(){
	updatePoint();
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




function updatePoint(){
//	alert("2");
	var pointList = new Array();
	
	var queIdList = new Array();
	
	$("._point").each(function(index,item){
        var point = $(item).val();
        pointList.push(point);
//      pointList.push(10);
    })
	
	$("._ques").each(function(index,item){
		var _quesId = $(item).data("id");
		queIdList.push(_quesId);
//		queIdList.push(1);
	})
	
	var userId = "1";
	
	var user = getQueryVariable("userId");
	if(user != ""){
		userId = user;
	}
	
	var _paperId= getQueryVariable("paperId");
	
	var _pointList = pointList.toString().replace(/\[.*?\]/g,'');
	
	var _quesIdList = queIdList.toString().replace(/\[.*?\]/g,'');
	
	var mydata = {
        paperId: _paperId,
        userId: userId,
        quesIdList:_quesIdList,
        scoresList:_pointList
    };
    alert(JSON.stringify(mydata));
	$.ajax({
		type:"POST",
		url:"../TestOnline/paperservice/point",
		async:true,
		dataType: 'json',
		cache:false,
		data: mydata,
		success:function(reg){
			console.log(reg);
            alert("评卷成功");
            window.history.back(-1);
        },error: function(XMLHttpRequest){
     		alert( "Error: " + XMLHttpRequest.responseText);  
   		} 
	});
}


function getQues(){
	
	var _paperId= getQueryVariable("paperId");
	var str = "";
	$.ajax({
		type:"GET",
		url:"../TestOnline/testpaper/getAllsubject?paperid=" + _paperId,
		async:false,
		dataType: 'json',
		cache:false,
		success:function(reg){
			console.log(reg);
			console.log(reg.status);
			console.log(reg.dataList);
			var status = reg.status;
			console.log(status.code)
			if(status.code == 0){
				var dataList = reg.dataList;
				
				for(var i = 0; i < dataList.length ; i++){
					if(dataList[i].queTag == "1"){
						console.log(dataList[i]);
						console.log(dataList[i].queId);
						mydataList.push(dataList[i].queId);
						str += "<div class='add_answerque_area' data-id = '1'>";
						str += "<label style='margin: 40px 25px;' >简答题</label><div class='line1'><label class='label1'>题干</label></div>";
						str +=	"<div class='_ques' data-id = " + dataList[i].queId +">";
						str += "<p>"+ dataList[i].queInfo +"</p></div>";
						str += "<div class='model_answer' id = \"myMode_answer"+ dataList[i].queId + "\"></div>";	
						str += "<div class='line1'><label class='label1'>分值</label>";
						str += "<input class='_point' type='text' class='input_info'/></div></div>";
					}
				}
			$("#quBox").append(str);
			}
		},error: function(XMLHttpRequest){  
     	console.log( "Error: " + XMLHttpRequest.responseText);  
   } 
	});
}


//function getUserAns(queId){
//	
//	var _paperId= getQueryVariable("paperId");
//	
//	$.ajax({
//		type:"GET",
//		url:"../TestOnline/paper/mine-answer?questionId=" + queId + "&paperId=" + _paperId + "&userId=1" ,
//		async:false,
//		cache:false,
//		dataType: 'json',
//		success:function(reg){
//			console.log(reg);
//		},error: function(XMLHttpRequest){  
//   alert( "Error: " + XMLHttpRequest.responseText);  
// } 
//	});
//}


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

function getMinq2(){
	var userId = "1";
	var user = getQueryVariable("userId");
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
	if(user != ""){
		userId = user;
	}
	var paperId = getQueryVariable("paperId");
	var E = window.wangEditor;
	$.ajax({
		type:"GET",
		url:"../TestOnline/paperservice/minq?userId="+ userId + "&paperId=" + paperId,
		async:false,
		dataType: 'json',
		cache:false,
		success:function(reg){
			console.log(reg);
			console.log(reg.dataList);
			var dataList = reg.dataList;
			var j = 0;
			for(var i = 0 ; i < dataList.length ; i++){
				if($.inArray(dataList[i].questionQueId,mydataList) != -1){
					$(".myMode_answer" + dataList[i].questionQueId).val(dataList[i].userAns);
					editorList[j] = new E("#myMode_answer" + dataList[i].questionQueId);
					editorList[j].customConfig.uploadImgShowBase64 = true;
					editorList[j].customConfig.menus = _menus;
					editorList[j].create();
					var userAns = dataList[i].userAns;
					userAns = userAns.replace(/\\\"/g, "\"");
					userAns = userAns.replace(/%2B/g,"\+");
					userAns = userAns.replace(/&3D/g,"\=");
					userAns = userAns.replace(/%82/g,"\,");
					editorList[j].txt.html(userAns);
					j++;
				}
			}
		},error: function(XMLHttpRequest){  
     		alert( "Error: " + XMLHttpRequest.responseText);  
   		} 
	});
}