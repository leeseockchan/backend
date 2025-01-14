import React, { useState,useRef } from 'react'
import Header from './components/Header'
import Editor from './components/Editor'
import List from './components/List'
import "./App.css";

const mockData = [
  {
    id: 0,
    isDone: false,
    content: "React 공부하기",
    date: new Date().getTime(),
  }, {
    id: 1,
    isDone: false,
    content: "빨래하기",
    date: new Date().getTime(),

  }, {
    id: 2,
    isDone: false,
    content: "노래 연습하기",
    date: new Date().getTime(),

  }
];

function App() {
  const [todos, setTodos] = useState(mockData);
  const idRef = useRef(3);  // 초기 번호는 mockData 0,1,2가 등록 되어 있기에 3부터 시작

  const onCreate = (content) =>{
    const newTodo = {
      id:idRef.current++, // id 번호 자동 생성
      isDone:false,       //  네모박스(?) 체크박스
      content: content,   // 입력한 내용을 그대로 추가
      date: new Date().getTime(), // 입력한 시간을 자동으로 가져옴
    }
    setTodos([newTodo,...todos]);   
    // 기존의 mockData를 뒤에 놓고 새로 만든 newTodo를 앞으로 추가
  }

  return (
    <div className='App'>
      <Header />
      <Editor onCreate={onCreate}/>
      {/* onCreate 함수를 props로 전달하여 리스트에 추가 될수 있도록 */}
      <List todos={todos}/>
    </div>
  )
}

export default App
