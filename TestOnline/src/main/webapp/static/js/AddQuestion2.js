$(function(){
	getCourse();
})

$(document).ready(function(){
  $("#addQ").delegate("Button","click",function(){
	addQuestion();
	});
});


function getCourse(){
	var str = "";
	var userId = "1";
	var str = "";
	$.ajax({
		type:"GET",
		url:"../TestOnline/course/showCourse",
		async:true,
		dataType: 'json',
		cache:false,
		success:function(reg){
			console.log(reg);
			console.log(reg.status);
			console.log(reg.dataList);
			var status = reg.status;
			var dataList = reg.dataList;
			console.log(status.code)
			if(status.code == 0){
				for(var i = 0; i < dataList.length ; i++){
					str += "<option value=" + dataList[i].courseId + ">"+ dataList[i].courseName +"</option>";
				}
				$("#courseSelect").append(str);
			}
		},error: function(XMLHttpRequest){  
     	console.log( "Error: " + XMLHttpRequest.responseText); 
     	var str = "<option value=1>error</option>";
     	$("#courseSelect").append(str);
   } 
	});
}

function addQuestion(){
	var _queInfo = $("#queInfo").val();
	var _queoptions = new Array();
	$(".queOption").each(function(index,item){
		var _quesOption = $(item).val();
		if(_quesOption != ""){
			_queoptions.push(_quesOption);
		}
	})
	var _queTag = "0";
	var _queAns = $("#queAns").val();
	var _queValue = "15";
	var _queRank = "1";
	var _queoptionList = _queoptions.toString().replace(/\[.*?\]/g,'');
	var _courseId = $("#courseSelect").val();
	var mydata = {
        queInfo: _queInfo,
        queTag: _queTag,
        courseId:_courseId,
        aueAns:_queAns,
        queValue: _queValue,
        queRank:_queRank,
        options:_queoptionList,
    };
	console.log(mydata);
	$.ajax({
		type:"POST",
		url:"../TestOnline/question/add",
		async:true,
		cache:false,
		data: mydata,
		dataType: 'json',
		success:function(reg){
			console.log(reg);
		},error: function(XMLHttpRequest){  
     	alert( "Error: " + XMLHttpRequest.responseText);  
   	} 
	});
}
