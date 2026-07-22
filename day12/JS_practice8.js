let categoryList = [ { 'ccode' : 1, 'cname' : '음료' } , { 'ccode' : 2 , 'cname' : '과자'} ]
let productList = [
    { 'pcode' : 1 , 'pname' : '콜라' , 'pprice' : 1000, 'pimg' : 'https://placehold.co/100x100', 'pdate' : '2026-07-22', 'ccode' : 1},
    { 'pcode' : 2 , 'pname' : '사이다' , 'pprice' : 2000, 'pimg' : 'https://placehold.co/100x100', 'pdate' : '2026-07-23', 'ccode' : 1}
]

// [1] 전체조회 함수
productPrint( ) // JS가 열릴때 최초 1번 실행
function productPrint( ){
    let tbody = document.querySelector( '#main table tbody' )

    let html = ''
    for( let index = 0; index < productList.length; index++ ){
        let product = productList[index]
        let cname = ''
        for( let j = 0; j < categoryList.length; j++ ){
            if(categoryList[j].ccode == product.ccode) {
                cname = categoryList[j].cname;
                break;
            }
        }
        html += `<tr>
                    <td> <img src=${ product.pimg }/> </td>
                    <td> ${ cname } </td> <td> ${product.pname} </td> 
                    <td> ${product.pprice} </td> <td> ${product.pdate} </td> 
                    <td> 
                        <button class="deleteBtn" onClick="productDelete( ${ product.pcode } )">삭제</button> 
                        <button class="updateBtn" onClick="productUpdate( ${ product.pcode } )">수정</button> 
                    </td>
                </tr>`
    }
    tbody.innerHTML = html
} // f end

// [2] 삭제 함수
function productDelete( pcode ) {
    for( let index = 0; index <= productList.length-1; index++ ) {
        if( productList[index].pcode == pcode ){
            productList.splice( index, 1 )
            alert('삭제 성공')
            productPrint()
            return
        }
    }
}
// [3] 수정 함수
function productUpdate( pcode ) {
    for( let index = 0; index <= productList.length-1; index++ ) {
        if( productList[index].pcode == pcode) {
            let newPname = prompt('수정할 제품명 입력하세요.')
            let newPprice = prompt('수정할 가격 입력하세요.')
            productList[index].pname = newPname
            productList[index].pprice = newPprice
            productPrint(); return;
        }
    }
}
// [4] 등록 함수