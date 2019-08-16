var imgUrl;
var userstr=sessionStorage.getItem("user");
var user=JSON.parse(userstr);
imgUrl = user.userImg;

$(document).ready(function(){
	$('#demo1').attr('src', imgUrl);
    showUser();
    $("#saveInfo").delegate("Button","click",function(){
        saveUser();
    });
	layui.use('upload', function(){
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
			      	imgUrl ="../TestOnline/upload/" + res.map.image;
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

});


function saveUser(){

    if (checkUser()&&checkPwd()&&checkEmail()){
        var userstr=sessionStorage.getItem("user");
        console.log(userstr);
        var user=JSON.parse(userstr);
        var userId=user.userId;
        var userName=$("#username").val();
        var userImg=imgUrl;
        var password = $("#password").val();
        var mail = $("#mail").val();
        var address=$("#address").val();
        var roleId=user.roleId;
        var userSex="1";
        if($("#radio_woman").selected){
            userSex="0";
        }



        var mydata = {
            userId:userId,
            userName:userName,
            userPwd:password,
            userEmail:mail,
            roleId:roleId,
            img:imgUrl,
            sex:userSex,
            address:address

        }
        console.log(mydata);
        $.ajax({
            type:"POST",
            url:"../TestOnline/myuser/update",
            async:true,
            dataType: 'json',
            cache:false,
            data: mydata,
            success:function(reg){
                console.log(reg);
                console.log(reg.status);

                var status = reg.status;

                console.log(status.code)
                if(status.code == 0){
                    showUser();
                    window.alert("更新成功");


                }
            },error: function(XMLHttpRequest){
                alert( "Error: " + XMLHttpRequest.responseText);
            }
        });
    } else {
        window.alert("信息填写错误！")
    }


}

function showUser() {
    getCurrentUser();
    var userstr=sessionStorage.getItem("user");
    console.log(userstr);
    var user=JSON.parse(userstr);

    if(user.userSex=="1"){

        $("#radio_man").attr("checked",true);

    }else if (user.userSex=="0"){

        $("#radio_woman").attr("checked",true);

    }else {

        $("#radio_man").attr("checked",false);
        $("#radio_woman").attr("checked",false);
    }
	$("#username").val(user.userName);
    $("#password").val(user.userPwd);
    $("#mail").val(user.userEmail);
    $("#address").val(user.userAddress);
}

function updateUserInfo(){
	var userstr=sessionStorage.getItem("user");
    console.log(userstr);
    var user=JSON.parse(userstr);
    var userId=user.userId;
    
    $.ajax({
		type: "GET",
		url:"../TestOnline/deletes/userInformation?userId="+ userId,
		async:false,
		dataType: 'json',
		cache:false,
		data:mydata,
		success:function(reg){
			console.log(reg);
			sessionStorage.setItem("user",jsonStr);
		},error: function(XMLHttpRequest){  
     		alert( "Error: " + XMLHttpRequest.responseText);  
   		} 
	});
}

