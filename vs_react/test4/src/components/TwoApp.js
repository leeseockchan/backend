import React, { useState } from 'react'

function TwoApp() {

    const [photo, setPhoto] = useState('../image2/food.jpg');
    const changePhoto = (photo) => {
        setPhoto(photo.target.value);
    }
    return (
        <div>
            <h3 className='alert alert-success'>TwoApp 입니다. 라디오 버튼</h3>
            <div>
                <b>이미지 선택 : </b>
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <label>
                    <input type='radio' name='photo' value={'../image2/dish1.jpg'} onClick={changePhoto} />이미지 1
                </label>
                &nbsp;
                <label>
                    <input type={"radio"} name={'photo'} value={'../image2/dish2.jpg'} defaultChecked onClick={changePhoto} /> 이미지 2
                </label>
                &nbsp;
                <label>
                    <input type={"radio"} name={'photo'} value={'../image2/dish3.jpg'} onClick={changePhoto} /> 이미지 3
                </label>
                &nbsp;
                <label>
                    <input type={"radio"} name={'photo'} value={'../image2/dish4.jpg'} onClick={changePhoto} /> 이미지 4
                </label>
                &nbsp;
                <label>
                    <input type={"radio"} name={'photo'} value={'../image2/dish5.jpg'} onClick={changePhoto} /> 이미지 5
                </label>
                &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
            </div>
            <img src={photo}/>
        </div>
    )
}

export default TwoApp
