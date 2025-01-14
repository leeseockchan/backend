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
      date: new Date().getTime() // 입력한 시간을 자동으로 가져옴
    }
    setTodos([newTodo,...todos]);   
    // 기존의 mockData를 뒤에 놓고 새로 만든 newTodo를 앞으로 추가
  }

  const onUpdate = (targetId) =>{
  // todos State의 값 중 targetId와 일치하는 id를 갖는 todoItem의 isDone 값 변경
  // todos 배열에서 targetId와 일치하는 id를 갖는 요소의 데이터만 맞바꾼 새로운 배열
    setTodos(
      todos.map((todo) => 
        todo.id === targetId ? {...todo, isDone : !todo.isDone} : todo 
      )
    );
  };
  

  const onDelete = (targetId) =>{
    // todos 배열에서 targetId와 일치하는 id를 갖는 요소만 삭제한 배열요소
      setTodos(todos.filter((todo) => todo.id !== targetId));
  }
  // onDelete 함수는 targetId기준으로 todos 배열에서 해당 id를 가진 항목을 제외하고
// 새로운 배열을 만들어 업데이트 해준다

  return (
    <div className='App'>
      <Header />
      <Editor onCreate={onCreate}/>
      {/* onCreate 함수를 props로 전달하여 리스트에 추가 될수 있도록 */}
      <List todos={todos} onUpdate={onUpdate} onDelete={onDelete}/>
    </div>
  );
}

export default App
