var type = getQueryVariable("type");
var pattern = new RegExp("[~'!@#$%^&*()-+_=:]");
var rang = ["计算机","文学","化学","物理","生物","数学"];
var regu = "^[a-zA-Z\u4e00-\u9fa5]+$";
var re = new RegExp(regu);

$(function(){
	isLogged();
	if(type != null && type != ""){
		if(pattern.test(type)){
			getAllCourse();
		}else{
			if(!isNaN(type)){
				var n = Number(type);
				if(0 <= n < 6){
					var t = rang[n];
					getCourse(t);
				}else{
					getAllCourse();
				}	
			}else{
				getAllCourse();
			}	
		}
	}else{
		getAllCourse();
	}
})


$(document).ready(function(){
	$("._search_box").delegate("Button","click",function(){
		getCourseBy();
	});
});


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

function getCourse(type){
	localStorage.courseInfo = ""
	var str = "";
	$.ajax({
		type:"GET",
		url:"../TestOnline/course/getbyType?type=" + type,
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
					var mu = "CourseInfo.html?courseId=" + dataList[i].courseId;			
					str += "<a href="+ mu +"><div class='search_res'><div class='res_img' style='background: url(../TestOnline/upload/" + dataList[i].courseImg +") no-repeat;background-size: 100%;'></div>";
					str += "<div class='res_infos'><ul><li class='res_name'>"+ dataList[i].courseName +"</li>";
					str += "<li class='res_info'><p>"+ dataList[i].courseInfo +"</p></li>";
					str += "<li class='res_tag'><i class='layui-icon'>&#xe642;</i><span>"+ dataList[i].courseTag +"</span></li>";
					str += "</ul></div></div></a>";
				}
				$("#sbox").append(str);
			}
		},error: function(XMLHttpRequest){  
     		console.log( "Error: " + XMLHttpRequest.responseText); 
   		} 
	});
}

function getAllCourse(){

	localStorage.courseInfo = ""
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
					var mu = "CourseInfo.html?courseId=" + dataList[i].courseId;			
					str += "<a href="+ mu +"><div class='search_res'><div class='res_img' style='background: url(../TestOnline/upload/" + dataList[i].courseImg +") no-repeat;background-size: 100%;'></div>";
					str += "<div class='res_infos'><ul><li class='res_name'>"+ dataList[i].courseName +"</li>";
					str += "<li class='res_info'><p>"+ dataList[i].courseInfo +"</p></li>";
					str += "<li class='res_tag'><i class='layui-icon'>&#xe642;</i><span>"+ dataList[i].courseTag +"</span></li>";
					str += "</ul></div></div></a>";
				}
				$("#sbox").append(str);
			}
		},error: function(XMLHttpRequest){  
     		console.log( "Error: " + XMLHttpRequest.responseText); 
   		} 
	});
}

function getCourseBy(){
	localStorage.courseInfo = ""
	var str = "";
	$("#sbox").html("");
	var courseName = $("#courseName").val();
	console.log(courseName);
	if(re.test(courseName)){
			$.ajax({
			type:"GET",
			url:"../TestOnline/course/searchCourse?searchInput=" + courseName + "&sType=coursename",
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
					if(dataList.length > 0){
						for(var i = 0; i < dataList.length ; i++){
							var mu = "CourseInfo.html?courseId=" + dataList[i].courseId;			
							str += "<a href="+ mu +"><div class='search_res'><div class='res_img' style='background: url(../TestOnline/upload/" + dataList[i].courseImg +") no-repeat;background-size: 100%;'></div>";
							str += "<div class='res_infos'><ul><li class='res_name'>"+ dataList[i].courseName +"</li>";
							str += "<li class='res_info'><p>"+ dataList[i].courseInfo +"</p></li>";
							str += "<li class='res_tag'><i class='layui-icon'>&#xe642;</i><span>"+ dataList[i].courseTag +"</span></li>";
							str += "</ul></div></div></a>";
						}
						$("#sbox").append(str);
					}else{
						$("#sbox").html("");
						var str = "<div class='search_res'><span>未查找到相应课程</span></div>";
						$("#sbox").append(str);
					getAllCourse();
					}
				}else{
					$("#sbox").html("");
					var str = "<div class='search_res'><span>未查找到相应课程</span></div>";
					$("#sbox").append(str);
					getAllCourse();
				}
			},error: function(XMLHttpRequest){  
	     		console.log( "Error: " + XMLHttpRequest.responseText); 
	   		} 
		});
	}else{
		getAllCourse();
		alert("请输入正确的课程名称");
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