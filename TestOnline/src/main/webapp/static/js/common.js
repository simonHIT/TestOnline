function getCurrentUser() {

    $.ajax({
        type: "POST",
        url: "../TestOnline/myuser/currentuser",
        async: true,
        dataType: 'json',
        cache: false,
        success: function (reg) {
            console.log(reg);
            console.log(reg.status);
            console.log(reg.entity);
            var status = reg.status;
            var entity = reg.entity;
            console.log(status.code)
            if (status.code == 0) {
                var jsonStr = JSON.stringify(entity);
                sessionStorage.setItem("user", jsonStr);
                console.log(entity);
            }
        }, error: function (XMLHttpRequest) {
            console.log("Error: " + XMLHttpRequest.responseText);
        }
    });
}

function logout() {

    $.ajax({
        type: "POST",
        url: "../TestOnline/myuser/logout",
        async: true,
        dataType: 'json',
        cache: false,
        success: function (reg) {
            console.log(reg);
            console.log(reg.status);
            var status = reg.status;
            console.log(status.code)
            if (status.code == 0) {

                sessionStorage.removeItem("user");

                window.location.href="Login.html";

            }
        }, error: function (XMLHttpRequest) {
            console.log("Error: " + XMLHttpRequest.responseText);
        }
    });
}

$(document).ready(function(){
	$("._userLoged").hover(function() {
		$(".sets").css("display", "block");
	});
	$(".nav_tit").hover(function() {
		$(".sets").css("display", "none");
	});
});


$(document).ready(function(){
	$(".set li a").hover(function() {
		$(this).css("color","rgb(85, 185, 41)");
	},function(){
		$(this).css("color","#666");
	});
});