function findPassword(){
    var userName=$("#username").val();
    var mydata = {
        userName:userName,
    }
    console.log(mydata);
    $.ajax({
        type:"POST",
        url:"../TestOnline/user/find-password",
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
                alert("已发送，请注意查收邮件");
            }
            else{
                "Error: " + XMLHttpRequest.responseText
                alert("服务器连接失败")
            }
        }
    });
}