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
let finalPcode = 2 // 현재 마지막으로 사용한 제품코드 
function productAdd( ){
    // 1. 입력받은 값 가져오기 
    let category = document.querySelector('.category').value
    let name = document.querySelector('.name').value
    let price = document.querySelector('.price').value
    let image = document.querySelector('.image').files[0] // + 첨부파일은 .files[0] 속성에서 첨부파일의 첫번째 자료 가져오기 
    if( category == 'disabled' ) {
        alert('카테고리 선택해주세요!')
        return;
    }
    // 2. 입력받은 값들을 객체화
        // pcode : 제품식별코드로 사용자가 지정하지 않고 *자동번호 부여* , 마지막사용된 제품코드에 + 1
        // pdate : 현재 시스템 날짜/시간 함수 , new Date()
            // 현재연도 : new Date().getFullYear()  ,  현재월(0:1월~11:12월) : new Date().getMonth() , 현재일 : new Date().getDate()
        //console.log( new Date().getFullYear() , new Date().getMonth() , new Date().getDate()  ) 
    let pdate = `${ new Date().getFullYear() }-${ new Date().getMonth()+1 }-${ new Date().getDate() }`
    let object = { ccode : category , pname : name , pprice : price , 
                    pimg : image == undefined ? 'https://placehold.co/100' : URL.createObjectURL( image ) , 
                    pcode : finalPcode+1 , pdate : pdate }
    // 3. 배열 저장  , **마지막 제품코드 1 증가** 
    productList.push( object ); finalPcode += 1
    // 4. 성공  , 화면 최신화 
    alert('등록성공'); 
    productPrint();
} // f end 