//    用户名验证
function checkUser(){
    var user = $("#username").val();
    $("#user_prompt").html("");
    // var reg=/^[a-zA-Z][a-zA-Z0-9]{3,15}$/;
    var reg=/^[\u4E00-\u9FA5A-Za-z0-9]{3,16}$/;
    if(reg.test(user)==false){
    	$("#user_prompt").html("用户名格式不正确,只能输入中文、英文、数字但不包括下划线等符号，长度为3-16位");
    	$("#tag").val("0");
        buttonDisable();
        return false;
    }
    buttonEnable();
    return true;
}
//    password check
function checkPwd(){
    var pwd = $("#password").val();
    $("#pwd_prompt").html("");
    var reg = /^[a-zA-Z0-9]{4,10}$/;
    if(reg.test(pwd)==false){
    	$("#pwd_prompt").html("密码不能含有非法字符，长度在4-10之间");
        $("#tag").val("0");
        buttonDisable();
        return false;
    }
    buttonEnable();
    return true;
}
function checkRepwd(){
    var repwd = $("#password2").val();
    var pwd = $("#password").val();
    $("#repwd_prompt").html("");
    if(pwd!=repwd){
    	$("#repwd_prompt").html("两次密码不一致");
        $("#tag").val("0");
        buttonDisable();
        return false;
    }
    buttonEnable();
    return true;
}
//   邮箱验证
function checkEmail(){
    var email = $("#mail").val();
    $("#email_prompt").html("");
    var reg = /^\w+@\w+(\.[a-zA-Z]{2,3}){1,2}$/;
    if(reg.test(email)==false){
    	$("#email_prompt").html("Email格式不对，请输入正确email");
        $("#tag").val("0");
        buttonDisable();
        return false;
    }
    buttonEnable();
    return true;
}
//      手机号验证
function checkMobile() {
    var mobile = $("mobile");
    var mobileId = divId("mobile_prompt");
    mobileId.innerHTML="";
    var reMobile = /^1\d{10}$/;
    if (reMobile.test(mobile)==false){
        mobileId.innerHTML="手机号输入有误";
        $("#tag").val("0");
        buttonDisable();
        return false;
    }
    buttonEnable();
    return true;
}
//    生日验证
function checkBirth(){
    var birth = $("birth");
    var birthId = divId("birth_prompt");
    birthId.innerHTML="";
    var reg = /^((19\d{2})|(200\d))-(0?[1-9]|1[0-2])-(0?[1-9]|[1-2]\d|3[0-1])$/;
    if(reg.test(birth)==false){
        birthId.innerHTML="生日格式不对";
        $("#tag").val("0");
        buttonDisable();
        return false;
    }
    buttonEnable();
    return true;
}
function buttonDisable() {
    var tag = $("#tag").val();
    if (tag == "0") {
        $(":button")[0].disabled=true;

    }
}
function buttonEnable() {
    $(":button")[0].disabled=false;
}