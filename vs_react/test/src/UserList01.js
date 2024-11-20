import { useRef } from "react";
function User({ user }) {
    return (
        <div>
            <b>{user.username}</b><span>({user.email})</span>
        </div>

    );

}

function UserList01({ users }) {
    return (
        <div>
            {users.map(user => (
                // users를 user라는 변수에 담는다.
                // .map 은 for 문처럼 반복문이다.
                <User user={user} key={user.id} />
            ))}
        </div>
    );
    
}
export default UserList01;