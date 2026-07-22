// 배열 -----------------------------------------------------------
let partList=[
    {pcode:0, pname:'개발팀'},
    {pcode:1, pname:'디자인팀'},
    {pcode:2, pname:'기획팀'}
]

let memberList=[
    {mcode:1, mname:'김민준',mposition:'신입 개발자',mimg:'https://placehold.co/100x100',pcode:0},
    {mcode:2, mname:'이서연',mposition:'수석 디자이너',mimg:'https://placehold.co/100x100',pcode:1},
    {mcode:3, mname:'박도윤',mposition:'팀장',mimg:'https://placehold.co/100x100',pcode:2},
    {mcode:4, mname:'유재석',mposition:'대리',mimg:'https://placehold.co/100x100',pcode:0}
]

let vacationList=[
    {mcode:1,vstart:'2025-08-04',vend:'2025-08-04',vreason:'병원진료'},
    {mcode:2,vstart:'2025-07-21',vend:'2025-07-25',vreason:'여름휴가'}
]

// 함수 ---------------------------------------------------------------------------------------
let finalpcode = 2
// 부서 추가
function partAdd( ) {
    let name = document.querySelector('.name').value
    let object = {pcode : finalpcode+1, pname : name}
    partList.push(object); finalpcode++;
    showPart( )
}
// 부서 렌더링
function showPart( ) {
    let tbody = document.querySelector('.col-left .card table tbody')
    let html = ''
    if(partList.length == 0) tbody.innerHTML = html
    for( let index = 0; index <= partList.length-1; index++ ){
        let part = partList[index]
        html += `
        <tr>
            <td> ${ part.pname } </td>
            <td class="action-links align-right">
                <a href="#" class="link-edit" onclick="partUpdate(${ part.pcode })">수정</a>
                <a href="#" class="link-delete" onclick="partDelete(${ part.pcode })">삭제</a>
            </td>
        </tr>`
        tbody.innerHTML = html
    }
}
// 부서 삭제
function partDelete( pcode ) {
    for( let index = 0; index < partList.length; index++){
        if( partList[index].pcode == pcode ){
            partList.splice( index, 1 )
            alert('삭제 성공')
            showPart( ); return
        }
    }
}
// 부서 수정
function partUpdate( pcode ) {
    for( let index = 0; index < partList.length; index++){
        if( partList[index].pcode == pcode ) {
            let newPname = prompt('새로운 부서명을 입력해주세요.')
            partList[index].pname = newPname 
            showPart( ); return;
        }
    }
}

showPart( )