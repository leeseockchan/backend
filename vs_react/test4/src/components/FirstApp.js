import React from 'react'
import cat1 from '../image/1.jpg'
import cat2 from '../image/2.jpg'

export default function FirstApp() {
    const styleImg1 = {
        width: '200px',
        border: '5px solid gray',
        marginLeft: '30px',
        marginTop: '20px'
    }

    return (
        <div>
            <h2 className='line2'>FirstApp components!!</h2>
            <div style={{ fontSize: '30px', marginLeft: '100px', backgroundColor: 'salmon' }}>
                안녕~ 이틀 뒤면 2025년 새해야!!
            </div>
            {/* src 이미지 import */}
            <img src={cat1} style={styleImg1} />
            <img src={cat2} style={{
                width: '200px',
                border: '3px dotted pink',
                marginLeft: '30px',
                marginTop: '20px'
            }} />
            <hr></hr>
            {/* public image2 폴더 import 없이 직접 호출 */}
            <h3>public image2</h3>
            <img src='../image2/dish1.jpg' style={{width:'250px', marginLeft:'200px'}}/>
        </div>
    )
}
