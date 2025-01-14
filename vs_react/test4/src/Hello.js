import React from "react";

// function Hello(props){
//     return <div style={{color:props.color}}>Hi {props.name}</div>
// }    위와 같아도 작동한다~
function Hello({color, name,isSpecial}){
    return <div style={{color}}>
        {isSpecial && <b>*</b>}
        {/* isSpecial 이 true 이면 *을 넣자 */}
        Hi {name}</div>
}
Hello.defaultProps = {
    name: '이름없음'
  }
export default Hello;