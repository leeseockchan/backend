import React, { useState } from 'react'

function ThirdApp() {
    // 상태 관리를 위한 변수값
    const [message, setMessage] = useState('기본 값');

    const enterEvent = (event=> {
        if(event.key === 'Enter'){
            setMessage("");
            event.target.value = "";
        }
    });
  return (
    <div>
      <h3 className='alert alert-dark'>Third App 입니다</h3>
      <h3 style={{color:'red'}}>{message}</h3>
      <input className='form-control' type='text'
      style={{width:'300px', fontSize:'2em', marginLeft: '10px'}} defaultValue={message} 
      onChange={(e)=>{
        console.log(e.target.value);
        setMessage(e.target.value);
      }}
      onKeyUp={enterEvent} />
      
    </div>
  )
}

export default ThirdApp
