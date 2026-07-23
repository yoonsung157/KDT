printBoard()

function printBoard() {
    let url = new URLSearchParams(location.search)
    let selectNo = url.get('no')

    let boardList = localStorage.getItem('boardList')
    if(boardList == null) { boardList = [] }
    else {boardList = JSON.parse(boardList)}

    for(let i = 0; i < boardList.length; i++){
        let obj = boardList[i]
        if(obj.no == selectNo){
            document.querySelector('#title').innerHTML = obj.title
            document.querySelector('#content').innerHTML = obj.content
        }
    }
}

function deleteBoard() {
    let url = new URLSearchParams(location.search)
    let selectNo = url.get('no')

    let boardList = localStorage.getItem('boardList')
    if(boardList == null) { boardList = [] }
    else {boardList = JSON.parse(boardList)}

    for(let i = 0; i < boardList.length; i++){
        let obj = boardList[i]
        if(obj.no == selectNo){
            let confirm = prompt('비번')
            if(confirm == obj.pwd){
                boardList.splice(i,1)
                localStorage.setItem('boardList', JSON.stringify(boardList))
                alert('good')
                location.href="list.html"
            }
            else { alert('fail')}
        }
    }
}