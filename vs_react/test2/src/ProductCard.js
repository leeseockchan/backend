
function ProductCard({ productName, price, description, inStock }) {
    const cardStyle = {
        backgroundColor: inStock ? 'lightgreen' : 'lightgray',
        padding: '10px',
        margin: '10px',
        borderRadius: '5px'
    }

    return (
        <div style={cardStyle}>
            <h2>상품명 : {productName}</h2>
            <p>가격 : {price} </p>
            <p>제품 설명 : {description}</p>
            <p>재고 : {inStock ? "있음" : "없음"}</p>
        </div>

    );
};

// 기본값 설정
ProductCard.defaultProps = {
    productName: "상품명 없음",
    price: "가격 정보 없음",
    description: "설명 없음",
    inStock: false,
};
export default ProductCard;