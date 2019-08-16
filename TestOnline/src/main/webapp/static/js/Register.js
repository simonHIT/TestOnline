$(document).ready(function(){

    $("#regist_").delegate("Button","click",function(){
        addUser();
    });


});


function addUser(){

    var userName = $("#username").val();
    var password = $("#password").val();
    var repassword=$("#password2").val();
    var mail = $("#mail").val();
    var roleId= $("input[name=\"roleRadio\"]:checked").val();


    var mydata = {
        userName:userName,
        userPwd:password,
        userEmail:mail,
        roleId:roleId

    }
    console.log(mydata);

    if (checkPwd()&&checkUser()&&checkEmail()&&checkRepwd()){
        $.ajax({
            type:"POST",
            url:"../TestOnline/myuser/regist",
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
                    window.alert("注册成功");
                    window.location.href='Login.html';
                }else {
                    window.alert("注册信息有误");
                    window.location.href='Register.html';
                }
            },error: function(XMLHttpRequest){
                alert( "Error: " + XMLHttpRequest.responseText);
            }
        });
    } else {
        window.alert("注册信息有误");
        window.location.href="Register.html";
    }

}

