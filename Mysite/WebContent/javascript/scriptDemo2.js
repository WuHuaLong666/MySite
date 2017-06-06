/**
 *浏览器对象
 */
function document1() {
	var len = navigator.plugins.length;
	with (document) {

		write("你的浏览器共支持" + len + "种外挂插件：<BR>");
		write("<table border=1>")
		write("<caption>外挂插件清单</caption>")
		write("<tr><th> <th>名称<th>描述<th>文件名");
		for (var i = 0; i < len; i++) {
			write("<tr><td>" + i + "<td>" + navigator.plugins[i].name + "<td>"
					+ navigator.plugins[i].description + "<td>"
					+ navigator.plugins[i].filename);
		}
	}
}
//屏幕对象
function scrn(){
	if(screen.width||screen.colorDepth){
		var mc="本网站的最佳浏览模式为800*600*256";
			alert(mc);
	}
}
//window窗口对象
function er(){
	if(confirm("确定离开此页吗？")){
		//关闭窗口有以下两种方法
		//window.close();
		self.close();
		
	}else
		return false;
	
		
}
