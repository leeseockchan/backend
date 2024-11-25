import "./App.css";
import { useState } from "react";
import Title from "./Title";
function App() {
    // let TITLE = "Hello korea!"
    // function ClikHAndler(){
    //    console.log("클릭했다.");
    // }

    const [text, setText] = useState("");
    const [title, setTitle] = useState("Hello Korea!");
    // 첫번째 인자는 값을 저장
    // 두전째 인자는 변수 값의 변화를 감지
    const ClikHAndler = () => {
        setTitle(prev => prev + "SUPREME");
        // setTitle(oldState => oldState + "plus string");
        // prev 는 현재 상태 값을 뜻한다. (관례적으로 prev를 쓸 뿐 다른 글자로 사용해도 상관은 없다.)
        // 이전 상태를 기반으로 변경 될 때 사용한다.
    }

    const changeHandler = (e) => {  // 입력 인식 함수
        // console.log(e.target.value);
        setText(e.target.value);
    }

    const onReset = () =>{  //초기화 버튼
        setText("");
    }

    return (
        <div className="wrapper">
            <Title title={title} text={text} />
            <div>
                <input type="text" value={text} onChange={changeHandler} />
                <button onClick={onReset}>초기화</button>
            </div>
            <button onClick={ClikHAndler}>change Title</button>
        </div>
    );
}
export default App;