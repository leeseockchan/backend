import React, { useState } from 'react'
import dog from '../image/3.jpg'

export default function FourthApp() {

    const [name, setName] = useState('뽀로로');
    const [age, setAge] = useState('22');

    return (
        <div>
            <h3 className='alert alert-danger'>
                Fourth App 입니다.!~
                <img className='rounded-circle' src={dog} style={{ width: '200px', marginLeft: '50px' }} />
            </h3>
            <br />
            <b style={{ fontSize: '30px' }}>이름:   {name}    <span style={{ marginLeft: '20px' }}>나이: {age}세</span></b>
            <br/>
            <button type='button' className='btn btn-info'
            onClick={()=>{
                setName("크롱");
                setAge('20');
            }}>크롱으로 변경</button>
            <button type='button' className='btn btn-danger'
            onClick={()=>{
                setName("");
                setAge("");
            }}>초기화</button>

        </div>
    )
}
