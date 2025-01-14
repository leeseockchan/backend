import { useState } from 'react'
import TodoItem from './TodoItem';
import "./List.css";

function List({ todos }) {
    const [search, setSearch] = useState("");

    const onChangeSearch = (e) => {
        setSearch(e.target.value);
        //  입력한 값을 search 에 저장 
    }
    const getFilteredData = () => {
        if (search === "") {
            return todos;
            // 검색 창에 아무것도 입력되지 않았다면
            // todos 전체를 반환
        }
        return todos.filter((todo) =>
            todo.content.toLowerCase().includes(search.toLowerCase())
            // toLowerCase 대소문자를 모두 구분하지 않고 소문자로 바꿈
            // includes 일치하는 값이 포함 되었는지
            // search 입력한 값
        );

    };
    const filteredTodos = getFilteredData();
    // getFilteredData() 실행 시킨 결과를(반환) 할일 목록을 filteredTodos에 저장


    return (
        <div className='List'>
            <h4>Todo List</h4>
            <input
                value={search}
                onChange={onChangeSearch}

                placeholder='검색어를 입력하세요' />
            <div className='todos_wrapper'>
                {filteredTodos.map((todo) => {
                    return <TodoItem key={todo.id} {...todo} />
                })}
            </div>
        </div>
    )
}

export default List;
