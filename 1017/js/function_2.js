/*********************************
 재귀 함수 호출 연습

 *********************************/

 var num = 0;

function testFnc() {
    num++;
    document.write(num, "<br>");
    if (num == 10) return;

    testFnc();
}
testFnc(); 

