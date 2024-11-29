import { useState } from "react";

function MultiInputForm() {
    // useState 를 사용하여 입력 상태 관리
    const [formData, setFormData] = useState({
        // 입력값이 변경될때 상태를 업데이트 하는 핸들러
        name: "",
        email: ""
    });

    const handleChange = (e) => {
        // 입력필드의 name(name, email) 과 value(입력 내용) 가져오기
        const { name, value } = e.target;

        setFormData({
            ...formData,    // 이전 상태 복사 (원래 데이터를 유지한 상태)
            [name] : value,
        });
    }

    const handleSubmit = (e) => {
        e.preventDefault();
        console.groupCollapsed("submit data", formData);
        alert(`Name : ${formData.name}, Email : ${formData.email}`);
    }

    return (
        <div>
            <h2>멀티 인풋폼</h2>
            <form onSubmit={handleSubmit}>
                <div>
                    <label>name:
                        <input
                            type="text"
                            name="name"
                            value={formData.name} // 상태값을 input의 value로 전환
                            onChange={handleChange} // 상태 업데이트 핸들러
                        />
                    </label>
                </div>

                <div>
                    <label>email:
                        <input
                            type="email"
                            name="email"
                            value={formData.email}
                            onChange={handleChange}
                        />
                    </label>
                </div>
                <button type="submit">전송하기</button>
                <div>
                    <h3>현재 인풋창에 나오는 내용</h3>
                    <p>Name : {formData.name}</p>
                    <p>Email : {formData.email}</p>
                </div>
            </form>
        </div>
    );
}
export default MultiInputForm;