function boardWrite() {
    // 입력받은 값 저장
    let titleInput = document.querySelector('#titleInput')
    let contentInput = document.querySelector('#contentInput')
    let pwdInput = document.querySelector('#pwdInput')

    let title = titleInput.value
    let content = contentInput.value
    let pwd = pwdInput.value
    // 객체에 넣기
    let obj = { title, content, pwd }
    // 배열 불러오기
    let boardList = localStorage.getItem('boardList')
    if ( boardList == null ) { boardList = [] }
    else ( boardList = JSON.parse(boardList))

    // 번호 지정
    obj.no = boardList == 0 ? 1 : boardList[boardList.length-1].no + 1
    // 배열에 값 넣기
    boardList.push(obj)
    // 스토리지에 저장
    localStorage.setItem('boardList', JSON.stringify(boardList))
    // 리스트로 이동
    location.href="list.html"
}