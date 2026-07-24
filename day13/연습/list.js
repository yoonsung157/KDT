getBoard()

function getBoard() {
    // 배열 불러오기
    let boardList = localStorage.getItem('boardList')
    if ( boardList == null ) { boardList = [] }
    else ( boardList = JSON.parse(boardList))
    // 번호 제목 출력
    let html =''
    for(let i = 0; i < boardList.length; i++){
        let obj = boardList[i]
        html += `
            <tr>
                <td> ${obj.no} </td>
                <td> <a href="view.html?no=${obj.no}"> ${obj.title} </a> </td>
            </tr>
        `
    }
    document.querySelector('#boardTbody').innerHTML = html
}