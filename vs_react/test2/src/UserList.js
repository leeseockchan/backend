import UserCard from "./UserCard";
import UserCard1 from "./UserCard1";

function UserList() {
    const users = [
        { name: "Alice", age: "30세", job: "Designer", isActive: true },
        { name: "Bob", age: "22세", job: "Developer", isActive: false },
        { name: "Charlie", age: "28세", job: "Product Manager", isActive: true },
        { name: "Jhone", job: "Anlyst", isActive: false },

    ]

    return (
        <>
            <h1>사용자 목록</h1>
            {users.map(((user, index) =>
            //  .map -- for 문과 같은 반복 문이다.
            
                <UserCard1 key={index} name={user.name} age={user.age} job={user.job} isActive={user.isActive} />
            ))};
        </>
    );
}
export default UserList;