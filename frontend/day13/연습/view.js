printBoard()

function printBoard() {
    // url
    let url = new URLSearchParams(location.search)
    let selectNo = url.get('no')
    // 배열 불러오기
    let boardList = localStorage.getItem('boardList')
    if ( boardList == null ) { boardList = [] }
    else ( boardList = JSON.parse(boardList))
    // 번호 확인
    for(let i = 0; i < boardList.length; i++){
        let obj = boardList[i]
        if(obj.no == selectNo){
            // 제목 내용 출력
            document.querySelector('#title').innerHTML = obj.title
            document.querySelector('#content').innerHTML = obj.content
        }
    }
    
}

function deleteBoard() {
    // url
    let url = new URLSearchParams(location.search)
    let selectNo = url.get('no')
    // 배열
    let boardList = localStorage.getItem('boardList')
    if ( boardList == null ) { boardList = [] }
    else ( boardList = JSON.parse(boardList))
    // 번호 확인
    for(let i = 0; i < boardList.length; i++){
        let obj = boardList[i]
        if(obj.no == selectNo){
            // 비밀번호 입력받기
            let confirm = prompt('비밀번호')
             // 비밀번호 확인
            if( confirm == obj.pwd){
                // 배열에서 삭제
                boardList.splice(i , 1)
                // 스토리지 최신화
                localStorage.setItem('boardList', JSON.stringify(boardList) )
                alert('삭제 완료')
                // 리스트로 이동
                location.href="list.html"
            }
            else { alert('실패')}
        }
        
    }
    
   

    

    

    
}