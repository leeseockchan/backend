/***************
  
 ************** */

function varExample(){
    var x = 1;
    if(true){
        var x = 2;
        document.write(x);
    }
    document.write(x);
}
varExample();
//재선언 재할당 가능