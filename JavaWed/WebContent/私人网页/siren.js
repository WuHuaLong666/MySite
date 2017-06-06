function animateDemo(){
for(var i=0;i<=100000;i++){
$('#we').animate({
	left:'+=500px'
},3000)
$('#we').animate({
	left:'-=500px'
},3000)
}
}