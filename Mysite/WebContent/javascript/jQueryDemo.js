/**
 * jQuery的使用
 */
function get_text() {
	/* alert(document.getElementById("txt").value); */
	alert($('#txt').val());
}
function Test() {// 标签选择器
	$("div").css('color', 'blue');
	// document.getElementsByTagName("div").style.color="blue";
}
function prevSelect() {// 邻居选择器
	$("p~label").css('color', 'red');
}
function gebiSelect() {// 隔壁选择器，// 同级的紧紧相邻的
	$("p+label").css('color', 'red');
}
function childSelect() {// 父子选择器，同级的都可以，可以不相邻
	$("p>label").css('color', 'red');
}
function zuxianSelect() {// 祖先选择器
	$("div label").css('color', 'red');
}
function guolvSelect() {// 过滤选择器，不区分不同的ul，只取第一个最后一个
	$('li:first').css('color', 'red');
	$('li:last').css('color', 'blue');

}
function guoSelect() {// 过滤选择器，第一个和最后一个子元素
	$('li:first-child').css('color', 'red');
	$('li:last-child').css('color', 'blue');

}
// 指定下标的过滤器
function xiabiaoSelect() {
	$('li:eq(1)').css('color', 'pink')
}
// 按文字内容过滤
function containsDemo() {
	$('li:contains(to)').css('color', 'bule')
}
// has包含过滤器
function hasDemo() {
	$('li:has(span)').css('color', 'pink')
}
// 过滤隐藏器
function noneSelect() {
	// 隐藏器
	// $('li:hidden').show()
	// 显示隐藏器
	$('li:visible').hide()
}
// 属性选择器
function attriSelect() {
	$('input[id=ipt]').val("hello")
	$('input[name=ipt1]').val("hello######")

}
// 表格选择器 :checked 的使用
function biaogeSelect() {
	console.log($('#pot:input:checked'))
}
// 表单选择器 :selected 的使用
function selectedSelect() {
	console.log($('#pt:selected'))
}
// #################################
// 操作DOM
// attr获取属性
function attrDemo() {
	console.log($('#de').attr('action'))
	$('#de').attr('action', 'foo.php')
	console.log($('#de').attr('action'))
}
// removeAttr删除属性
function removeDemo() {
	// console.log($('#de').attr('action'))
	$("img").removeAttr("src")
	// console.log($("imp").removeAttr("src"))
}
// html()和text()
function htmlDemo() {
	console.log($("p").html())
	$("p").html('<i>world</i>')
	console.log($("p").html())
}
function textDemo() {
	console.log($("p").text())
	$("p").text('<i>world</i>')
	console.log($("p").text())
}
// css()使用
function cssDemo() {
	console.log($("p").css('color', 'blue'))
}
// addclass添加样式和removeclass删除样式
function addclassDemo() {
	console.log($("h5").addClass('text'))
}

function removeclassDemo() {
	console.log($("h5").removeClass('bar'))

}
// append()尾部添加元素和prepend()头部添加元素
function appendDemo() {
	console.log($("h3").append('World'))

}
function prependDemo() {
	$("h3").prepend('****')

}
// after()在尾部添加元素翻倍和befor()在头部添加翻倍
function afterDemo() {
	$("h3").after('<h3>World</h3>')
}
function beforeDemo() {
	$("h3").before('<h3>World</h3>')
}
// clone()使用
function cloneDemo() {
	var clone_p = $("p").clone()
	$("p").after(clone_p)

}
// **********************
// jQuery事件
// ready()使用

// $(document).ready(function(){})
// 可以简写 如下：
$(function() {
	$('#lg1').bind('click', function() {
		$(this).attr("disable", "true");
	})
	// focus和blur

	$('#lg2').bind('focus', function() {
		$(this).css("border", "4pt solid blue").bind('blur', function() {
			// solid表示书法
			$(this).css("border", "3pt solid yellow");
		})// jQuery链式书写
	})

	// mouseover()进入和mouseout()退出

	$('#lg3').mouseover(function() {
		$(this).val("mouseover-已进入")
	})

	$('#lg3').mouseout(function() {
		$(this).val("mouseout-已退出")
	})
	/*
	 * $('#lg3').mouseover(function() {
	 * $(this).val("mouseover-已进入")}).mouseout(function() {
	 * $(this).val("mouseout-已退出") })
	 */
	/*
	 * $('#lg1').hover(function(){ $(this).val("已进入") },function(){
	 * $(this).val("已退出") })
	 */
})
// jQuery动画演示
// show()演示
/*
 * function showDemo(){ // $('#bu1').show(5000)
 * 
 * 8
 */

// show()显示
/*$(function() {
	$('#bu2').bind('click', function() {
			//$(this).val("隐藏")
	$('#bu1').show(2000).hide()
	})
		// hide()隐藏
	//$('#bu2').bind('click', function() {
		$('#bu1').hide()
	//})
			//$(this).mouseout(function() {
				//$(this).val("显示")
			// $(this).val("显示")
	})*/

	
function ifDemo(){
		if($('#bu2')[0].value=="显示"){
			$('#bu1').show(2000)
			
			$('#bu2').attr("value","隐藏")
	      
		
			
		}
			else{
	    $('#bu1').hide()
		$('#bu2').attr("value","显示")
		
	
		}
		
		
	}	

		
	
	


//animate()的使用

	function animateDemo(){
			$('#bu3').animate({
				left:'+=100px'
			}, 3000)
			$('#bu3').animate({
				left:'-=100px'
			},3000)
			}