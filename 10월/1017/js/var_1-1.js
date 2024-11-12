/***************
  
 ************** */

function varExample(){
    let x = 1;
    if(true){
        let x = 2;  // 블럭 내에서만 유효 -중괄호 '{}' 내에서만 유효
        document.write(x,"<br>");//2
    }
    document.write(x,"<br>");    //1(블럭 외부의 변수)
}
varExample();
//재선언 재할당 가능