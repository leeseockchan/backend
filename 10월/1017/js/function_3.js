/*******************
  전역, 지역 변수 연습
 ****************** */

let globalVar = "난 전역 변수";

function showVar() {
    let localVar = "난 지역 변수";
    console.log(globalVar);
    console.log(localVar);
}
showVar();
console.log(globalVar);
// globalVar - 함수 외부에서 선언 된 전역변수 
//             함수 내부와 외부 모두 접근이 가능.
console.log(localVar);
// localVar - 함수 내부에서 선언된 지역변수
//            함수 내부에서만 접근이 가능하다.
