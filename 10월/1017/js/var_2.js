/***************
 
  함수 스코프 이해하기
  스코프란 ? 함수 내의 중괄호 내의 "{}" 범위를 뜻한다.

 ************** */

function varExample() {
    var x = 1;

    if (true) {
        var x = 2;  // 함수 블럭 내에서 유효
        document.write(x, "<br>");//2
    }
    document.write(x, "<br>");    //2
}
varExample();
//재선언 재할당 가능