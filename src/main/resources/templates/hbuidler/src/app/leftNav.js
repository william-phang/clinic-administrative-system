function navBar(strData){
	var data;
	if(typeof(strData) == "string"){
		var data = JSON.parse(strData); //服务器端返回的json数据
	}else{
		data = strData;
	}	
	var ulHtml = '<ul class="layui-nav layui-nav-tree">';
	for(var i=0;i<data.length;i++){
		console.log(typeof data[i].spread+":"+data[i].spread);
		//将字符串解析为布尔
		var flag = eval(data[i].spread);  // var s = "1+2"; alert(s);  var str = eval(s); alert(str);-->3
		console.log(typeof  flag);
		if(!flag){
			ulHtml += '<li class="layui-nav-item">';
		}else{
			ulHtml += '<li class="layui-nav-item layui-nav-itemed">';
		}
		if(data[i].children != undefined && data[i].children.length > 0){
			ulHtml += '<a href="javascript:;">';
			if(data[i].css != undefined && data[i].css != ''){
				if(data[i].css.indexOf("css-") != -1){
					ulHtml += '<i class="layui-icon" data-icon="'+data[i].css+'"></i>';
				}else{
					ulHtml += '<i class="layui-icon" data-icon="'+data[i].css+'">'+data[i].css+'</i>';
				}
			}
			ulHtml += '<cite>'+data[i].name+'</cite>';
			ulHtml += '<span class="layui-nav-more"></span>';
			ulHtml += '</a>';
			ulHtml += '<dl class="layui-nav-child">';
			for(var j=0;j<data[i].children.length;j++){
				if(data[i].children[j].target == "_blank"){
					ulHtml += '<dd><a href="javascript:;" data-url="'+data[i].children[j].href+'" target="'+data[i].children[j].target+'">';
				}else{
					ulHtml += '<dd><a href="javascript:;" data-url="'+data[i].children[j].href+'">';
				}
				if(data[i].children[j].icon != undefined && data[i].children[j].css != ''){
					if(data[i].children[j].icon.indexOf("icon-") != -1){
						ulHtml += '<i class="iconfont" data-icon="'+data[i].children[j].css+'"></i>';
					}else{
						ulHtml += '<i class="iconfont" data-icon="'+data[i].children[j].css+'">'+data[i].children[j].css+'</i>';
					}
				}
				ulHtml += '<cite>'+data[i].children[j].name+'</cite></a></dd>';
			}
			ulHtml += "</dl>";
		}else{
			if(data[i].target == "_blank"){
				ulHtml += '<a href="javascript:;" data-url="'+data[i].href+'" target="'+data[i].target+'">';
			}else{
				ulHtml += '<a href="javascript:;" data-url="'+data[i].href+'">';
			}
			if(data[i].css != undefined && data[i].css != ''){
				if(data[i].css.indexOf("icon-") != -1){
					ulHtml += '<i class="iconfont '+data[i].css+'" data-icon="'+data[i].css+'"></i>';
				}else{
					ulHtml += '<i class="layui-icon" data-icon="'+data[i].css+'">'+data[i].css+'</i>';
				}
			}
			ulHtml += '<cite>'+data[i].name+'</cite></a>';
		}
		ulHtml += '</li>';
	}
	ulHtml += '</ul>';
	return ulHtml;
}
