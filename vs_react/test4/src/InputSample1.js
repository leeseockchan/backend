import { useState } from "react";

function InputSample() {
    const [text, setText] = useState('');

    const onChange = (e) => {
         setText(e.target.value);
        // 키보드의 입력 값을 받는다. setText(설정값)
    }
    const onReset = () =>{
        setText("");
        // 버튼을 누르면 "" 값이 반환되어 출력된다.
    }
    
    return (
      <div>
        <input onChange={onChange}/>
        <button onClick={onReset}>초기화</button>
        <div>
          <b>값: {text}</b>
        </div>
      </div>
    );
  }
  
  export default InputSample;