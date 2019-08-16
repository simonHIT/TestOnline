$(document).ready(function(){
    rememberPass();
    $("#login_").delegate("Button","click",function(){
        login();
    });
       $("#register_").delegate("Button","click",function(){
       	
       	window.location.href='Register.html';

       });
});


function login(){


        var userName = $("#username").val();
        var password = $("#password").val();



        var mydata = {
            userName:userName,
            userPwd:password
        }
        console.log(mydata);
        if (checkUser()&&checkPwd()) {
            $.ajax({
                type:"POST",
                url:"../TestOnline/myuser/login",
                async:true,
                dataType: 'json',
                cache:false,
                data: mydata,
                success:function(reg){
                    console.log(reg);
                    console.log(reg.status);
                    console.log(reg.entity);
                    var status = reg.status;
                    var entity = reg.entity;
                    console.log(status.code);
                    if(status.code == 0){
                        var jsonStr = JSON.stringify( entity );
                        sessionStorage.setItem("user",jsonStr);
                        console.log(jsonStr);
                        window.location.href='HomePage.html';
                    }else {

                        window.alert("用户名或密码错误");
                        window.location.href="Login.html";
                    }
                },error: function(XMLHttpRequest){

                    $("#info").val(XMLHttpRequest.responseText);
                    window.alert( "Error: " + XMLHttpRequest.responseText);
                }
            });
        }else {
            window.alert("用户名或密码错误");
            window.location.href="Login.html";
        }





}
function rememberPass() {
    if (jQuery.cookie('username')!=null&&jQuery.cookie('password')) {
        $("#username").val(jQuery.cookie('username'));
        $("#password").val(jQuery.cookie('password'));
        $('#remember_').attr("checked",true);
    }

    $("#login_btn").click(function(){
        //var isRember = $("#rememberMe").attr("checked");
        var isRember=$('#remember_').is(':checked');
        if(isRember){ //如果记住
            jQuery.cookie('username', $("#username").val());
            jQuery.cookie('password', $("#password").val());
        }else{
            jQuery.cookie("username", '', { expires: -1 });
            jQuery.cookie("password", '', { expires: -1 });
        }
        $("form").submit();
    });

}

function forgetPassword(){

    window.location.href="FindPassword.html";

}



