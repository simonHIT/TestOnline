var img;
var imgUrl = "../TestOnline/static/upload/1.jpg";
var courseId;
var userId = "2";


if(localStorage.courseInfo != null && localStorage.courseInfo != ""){
	var courseInfo = localStorage.courseInfo;
	var _courseInfo = eval("("+courseInfo+")");
	console.log(_courseInfo.courseId);
	courseId = _courseInfo.courseId;
	
}

$(function(){
	isLogged();
})

$(document).ready(function(){
			layui.use('upload', function() {
				var $ = layui.jquery
			  ,upload = layui.upload;
			  
			  //普通图片上传
			  var uploadInst = upload.render({
			    elem: '#test1'
			    ,url: '../TestOnline/fileup/upload'
			    ,before: function(obj){
			      //预读本地文件示例，不支持ie8
			      obj.preview(function(index, file, result){
			        $('#demo1').attr('src', result); //图片链接（base64）
			      });
			    }
			    ,done: function(res){
			      //如果上传失败
			      if(res.code > 0){
			      	
			        return layer.msg('上传失败');
			      }else{
			      	imgUrl = res.map.image;
			      }
			      //上传成功
			    }
			    ,error: function(){
			      //演示失败状态，并实现重传
			      var demoText = $('#demoText');
			      demoText.html('<span style="color: #FF5722;">上传失败</span> <a class="layui-btn layui-btn-mini demo-reload">重试</a>');
			      demoText.find('.demo-reload').on('click', function(){
			        uploadInst.upload();
			      });
			    }
			  });
			});
  $("#addC").delegate("Button","click",function(){
		addCourse();
	});
});


function addCourse(){
	var courseName = $("#courseName").val();
	var courseInfo = $("#courseInfo").val();
	var courseTag = $("#courseTag").val();
	
	
	var mydata = {
		userId:userId,
		courseName:courseName,
		courseInfo:courseInfo,
		courseTag:courseTag,
		img:imgUrl
	}
	console.log(mydata);
	$.ajax({
		type:"POST",
		url:"../TestOnline/course/addCourse",
		async:true,
		dataType: 'json',
		cache:false,
		data: mydata,
		success:function(reg){
			console.log(reg);
			if(reg.status.code == "0"){
				alert("添加成功");
			}else{
				alert("添加失败");
			}
		},error: function(XMLHttpRequest){  
     		alert("服务器异常");
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