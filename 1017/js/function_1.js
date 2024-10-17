//  함수 정의
function addNum(a, b) {
    return a + b;
}
// 함수 호출
let result = addNum(5, 3);
let result1 = addNum(7, 13);
document.write(result + " " + result1, "<br>");

// 매개변수가 없는 함수
function sayHello() {
    document.write("Hello, world", "<br>");
}
// 함수 호출
sayHello();

// 익명 함수
var bye = function (x, y) {
    return x * y;
}
console.log(bye(4, 5));

let divide = function (x, y) {
    return x / y;
}
document.write(divide(8, 4), "<br>");

// 간략하게 사용 하기
let dibe = (x, y) => x / y;
document.write(dibe(50, 10), "<br>");