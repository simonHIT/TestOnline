const originUrl = "http://127.0.0.1:8080/"
//用于封装请求信息
import Promise from "../../pages/nodemodules/Promise.js";
export default function ajax(url, params, method) {
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
    wx.request({
      url: data.url,
      method: data.method,
      data: params,
      /** header中设置在body中传递数据*/ 
      header:{
        'content-type': 'application/x-www-form-urlencoded'
      },
      success: function (result) {
        console.log(params);
        console.log(data)
        console.log(result);
        let statusCode = parseInt(result.data.status.code);
        if (statusCode == 0) {
          resolve(result.data);
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