var a = 15;
var b = 2;
var rest = a % b;
if (rest == 0) {
	alert('Делится, результат деления: ' + (a / b));
} else {
	alert('Делится с остатком ' + rest);
}



 drawTriangle(5,+);
 + 
 ++
 +++
 ++++
 +++++
function drawTriangle(height, symbol){

  for (var i=1; i <= height; i++)
  {
    var line = ''

      for (var j=1; j<=i; j++)
      {
        line += symbol;
      }
    
      console.log(line);
  }
}




for(let x=0; x<100;x++){
	if (x%2 === 1){
		console.log('только нечетные : x= ' +x);
  }
}


var n = 1000;
var num = 0;
while (n >= 50) {
    n = n/2 ;
    num = num +1 ;
}
console.log (' Результат деления: n = ' +n ) ;
console.log( ' Количество итераций: num = '+num );