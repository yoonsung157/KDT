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

//휴가
showVaction()

//휴가신청 출력
function showVaction(){
    let html=''
    let name=''
    for(let i=0; i<=vacationList.length-1; i++){
        for(let j=0; j<=memberList.length-1; j++){
            if(vacationList[i].mcode==memberList[j].mcode){
                name=memberList[j].mname
                break
            }
        }
        html+=`<div class="vacation-card">
                <div class="user-name">${name}</div>
                <div class="date">${vacationList[i].vstart}~${vacationList[i].vend}</div>
                <div class="reason">${vacationList[i].vreason}</div>
                <button onclick="vacationDelete(${vacationList[i].vcode})" type="button" class="btn-cancel">신청취소</button>
            </div>`
    }
    document.querySelector('.vacation_sub').innerHTML=html
}

//휴가신청
function vacationAdd(){
    //휴가사원 이름 가져오기
    let member = document.querySelector('.member_select').value
    let mcode =null
    //휴가사원의 사원코드 찾아오기
    for(let i=0; i<=memberList.length-1; i++){
        if(member == memberList[i].mname){
            mcode = memberList[i].mcode
            break
        }
    }
    //휴가시작-끝 날짜 가져오기
    let vstart = document.querySelector('.vacation_start').value
    let vend = document.querySelector('.vacation_end').value
    //휴가사유 가져오기
    let vreason = document.querySelector('.vacation_reason').value
    //vationList 에 추가
    let vacationSub={mcode,vstart,vend,vreason}
    vacationList.push(vacationSub)
    //출력
    showVaction()
}


//휴가신청 취소
function vacationDelete(vcode){
    //휴가사원의 사원코드 찾아오기
    for(let i=0; i<=vacationList.length-1; i++){
        if(vcode == vacationList[i].vcode){
            vacationList.splice( i , 1 );
            alert('신청취소됨.');
        }
    }
    //출력
    showVaction()
}

function showMember() {
    
    let html = ''
    // pcode에 맞는 pname 찾기
    // pcode는 partList에 있음

    for (let index = 0; index < memberList.length; index++){

        // pcode에 맞는 pname을 찾고, pname에 선언
        let temp = memberList[index].pcode
    
        result = partList.find(item => item.pcode == temp)


        html += `
            <tr>
              <td><img src=${memberList[index].mimg} alt="프로필" class="profile-img"></td>
              <td>${memberList[index].mname}</td>
              <td>${result.pname}</td>
              <td>${memberList[index].mposition}</td>
              <td class="action-links align-right">
                <a href="#" onclick="memberUpdate(${memberList[index].mcode})" class="link-edit">수정</a>
                <a href="#" onclick="memberDelete(${memberList[index].mcode})" class="link-delete">삭제</a>
              </td>
            </tr>
        `
    }
    document.querySelector('.card.sub-section tbody').innerHTML = html
} showMember(); // 함수선언 후 사원목록 출력

function memberUpdate(mcode){

    for (index=0; index<memberList.length; index++){
        if(mcode == memberList[index].mcode){
            let newMebmerName = prompt("새로운 이름을 입력하시오")
            let newMemberPart = prompt("새로운 부서를 입력하시오")

            // 없는 부서일 경우 실패
            for (j=0; j<partList.length; j++){
                if (partList.find(item => item.pname === newMemberPart)){
                    newMemberPart = partList[j].pcode
                    break;
                }
                else{
                    alert("없는 부서입니다")
                    return
                }
            }

            let newMemberPosition = prompt("새로운 직급을 입력하시오")

            memberList[index].mname = newMebmerName
            memberList[index].pcode = newMemberPart
            memberList[index].mposition = newMemberPosition
            break;
        }
    }

    showMember()
    return
}
function memberDelete(mcode){
    for (index=0; index <memberList.length; index++){
        if(mcode == memberList[index].mcode){
            memberList.splice(index, 1)
            alert("삭제성공")
            break;
        }
    }
    showMember()
    return
}

let memberCode = memberList[memberList.length-1].mcode
function memberAdd(){
    
    memberCode += 1
    let memberName = document.querySelector('.memberName').value
    let memberPosition = document.querySelector('.memberPosition').value
    let memberPart = document.querySelector('.memberPart').value
    let memberImage = document.querySelector('.memberImg').files[0]

    
    let object = {mcode: memberCode, mname: memberName, mposition:memberPosition, mimg: memberImage == undefined ? 'https://placehold.co/100' : URL.createObjectURL(image),pcode:0}
    console.log(memberCode)	
    memberList.push(object)
    showMember();
}