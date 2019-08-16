$(document).ready(function(){

    $("#saveInfo").delegate("Button","click",function(){
        saveUser();
    });
});


function saveUser(){


    var userId=parseInt(getUrlParam("userId"));
    var password = $("#password").val();
    var password1 = $("#password1").val();
    if(password!=password1){
        alert("两次输入的密码应该一致");
        return null;
    }

    var mydata = {
        userId:userId,
        userPwd:password,
    }
    console.log(mydata);
    $.ajax({
        type:"POST",
        url:"../TestOnline/user/change-password",
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
                window.alert("更新成功");
            }else{
                "Error: " + XMLHttpRequest.responseText
            }
        }
    });
    function getUrlParam(name) {
        var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)"); //构造一个含有目标参数的正则表达式对象
        var r = window.location.search.substr(1).match(reg); //匹配目标参数
        if (r != null) return unescape(r[2]); return null; //返回参数值
    }
}