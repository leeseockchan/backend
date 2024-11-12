/***************
  콘스트 연습~
 ************** */

function constExample() {

    // var y = 5;
    // y = 10;      var는 재할당이 가능
    // var y = 20;  var는 재선언이 가능

    // let y = 5;
    // y = 10;      let도 재할당이 가능
    // let y = 30;  let은 재선언이 불가능

    // const y = 10;
    // y = 20;      const는 재할당이 불가능
    // const y = 30;const는 재선언이 불가능

    const obj = { name: "하리" };
    obj.name = "희동";      // 개체 속성은 변경이 가능하다
    console.log(obj);

    const arr = [1, 2, 3];
    arr.push(4);            // 배열의 요소는 변경이 가능하다. - 숫자 4를 맨 뒤에 밀어넣어라
    console.log(arr);       //출력:[1,2,3,4]

    document.write(y, "<br>");

}
constExample();

