const originUrl = "http://127.0.0.1:8080/TestOnline/"
//用于封装请求信息
function request(url, params, method) {
  return new Promise((resolve, reject) => {
    let data = {};
    if(method==null){
      data.method=params;
      params=null;
    }
    else{
      data.method = method;
      }
    data.url = originUrl + url;
    $.ajax({
        type:data.method,
        dataType: 'json',
        url:data.url, //你的请求程序页面随便啦
        async:false,//同步：意思是当有返回值以后才会进行后面的js程序。
        data: params,//请求需要发送的处理数据
        success: function (result) {
            let statusCode = parseInt(result.status.code);
            if (statusCode == 0) {
              resolve(result);
            } else {
              let errorMsg = '';
              switch (statusCode) {
                case 1:
                  {
                    errorMsg = '数据为空';
                    break;
                  }
                case -1:
                  {
                    errorMsg = response.data.status.msg;
                    break;
                  }
                case -2:
                  {
                    errorMsg = '参数类型错误';
                    break;
                  }
                case -3:
                  {
                    errorMsg = '输入信息错误';
                    break;
                  }
                case -4:
                  {
                    errorMsg = '所添加对象编号已存在';
                    break;
                  }
                case -5:
                  {
                    errorMsg = '服务器内部错误';
                    break;
                  }
                case 401:
                  {
                    errorMsg = '没有权限';
                    break;
                  }
                case 403:
                  {
                    errorMsg = '没有登录';
                    break;
                  }
              }
            }
            
          }
    })
  })
}