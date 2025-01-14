import React, { useState, useRef } from 'react';

function InputSample() {
    const [inputs, setInputs] = useState({
        id: '',
        nickname: ''
    });
    const idInput = useRef();

    const { id, nickname } = inputs;   // 구조 분해 할당   값 추출
    const onChange = (e) => {
        const {value, name} = e.target;
        setInputs({
            ...inputs,      // 기존의 input 객체를 복사한 뒤 
            [name]:value    // name키를 가지 값으로 value로 설정
        });
    };
    const onReset = () => {
        setInputs({
            id:'',
            nickname:''
        });
        idInput.current.focus();    // 선택하고 싶은 돔요소인 id에서 커서가 깜빡인다.!
    };


    return (
        <div>
            <input placeholder="ID" onChange={onChange} value={id} name='id' ref={idInput}/><br></br>
            <input placeholder="닉네임"onChange={onChange} value={nickname} name='nickname'/>
            <button onClick={onReset}>초기화</button>
            <div>
                <b>값: </b>
                {id} ({nickname})
            </div>
        </div>
    );
}

export default InputSample;