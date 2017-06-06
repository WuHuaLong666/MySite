/**
 * Demo script
 */
function Demo() {
	var num = Demo.arguments.length;
	console.info("num" + num);

	var nua = [ 12, "aa", 12.5, '男', 100 ];
	for ( var arr in nua) {
		console.info(arr + "-----" + nua[arr]);
	}
}
function Student(name) {
	this.name = name;
	this.getName = getName;

}
function getName() {
	return this.name;
}

function Button1_onclick() {
	// 定义了对象构造器后，用new运算符创建对象实例。
	var s = new Student("zhaosi", 57, "asdad", "13971212");

	console.info(s);
	alert(s.getName());
	alert(s.name);

}
// pasta是四个参数的构造器。
function pasta(grain, width, shape, hasEgg) {
	this.grain = grain;
	this.width = width;
	this.shape = shape;
	this.hasEgg = hasEgg;
	this.toString = toString;
	// 这里添加toString方法（如下定义）。
	// 注意在函数调用，而是对函数自身的引用。
	// 这不是一个函数调用，而是对函数自身的引用。

}
function toString() {
	return "grain" + this.grain + "\n" + "width" + this.width + "\n" + "shape"
			+ this.shape + "\n" + "hasEgg" + Boolean(this.hasEgg);
}
function patesDemo() {// 将调用toString（）并显示d 对象的属性。
	var d = new pasta("wheat", 15, "asdad", true);
	console.info(d);
	// 使用原型对象添加属性
	pasta.prototype.foodgroup = "carbohydrates";
	// 使用expanddo属性
	d.color = "pale straw";
	d.drycook = 6;
	d.freshcook = 0.5;
	console.info(d.foodgroup);
	console.info(d);

	// 重新创建对象
	var chowFun = new pasta("rice", 3, "flat", false);
	console.info(chowFun);
	pasta.prototype.trim = function(str) {
		// 用正则表达式将前后空格用空字符串代替。
		return str.replace(/(^\s*)|(\s*$)/g, "");
	}
	console.info(d.color);
	var trimColor = d.trim(d.color);
	console.info(trimColor);

}
function myObjectProptrey() {
	var myObject = new Object();
	myObject.name = "zhangwenqiang";
	myObject.age = 23;
	myObject.phone = "5555 77777";
	myObject["not a valid identifier"] = "This is the property value";
	myObject[100] = "100";
	// 枚举（循环）对象的所属性
	for (prop in myObject) {
		document.write("The property" + prop + "is" + myObject[prop] + "<br/>");
	}
}
	function arrayDemo() {
		var my=new Array(3);
		my[0]="Hello";
		my[1]=33;
		my[2]=new Date(2017,4,26);
		//显示数组的长度3
		//window.alert(my.length);
		//添加某些expando属性
	/*	my[expando]="JScript!";
		my["another Expando"]="Windows";*/
		//仍然显示3，因为两个expando属性，并不影响长度。
		
		console.info(my.length);
		for(ret in my){
			document.write(ret+my[ret]);
			
		}
	}
	function withDemo(){
		//使用with方式
		var x,y;
		with(Math){
			x=cos(3*PI)+sin(LN10);
			y=tan(14*E);
		}
		console.info("x="+x+", y="+y);
		
		var m, n;
		m=Math.cos(3*Math.PI)+ Math.sin(Math.LN10);
		n=Math.tan(14*Math.E)
		console.info("m="+m+", n="+n);
	}

	
