function boardWrite() {
    let titleInput = document.querySelector('#titleInput')
    let contentInput = document.querySelector('#contentInput')
    let pwdInput = document.querySelector('#pwdInput')

    let title = titleInput.value
    let content = contentInput.value
    let pwd = pwdInput.value
    let obj = { title, content, pwd}
    let boardList = localStorage.getItem('boardList')
    if(boardList == null) { boardList = [] }
    else { boardList = JSON.parse(boardList)}
    obj.no = boardList.length == 0 ? 1 : boardList[boardList.length-1].no + 1
    boardList.push(obj)
    localStorage.setItem('boardList',JSON.stringify(boardList))
    location.href="list.html"
}

