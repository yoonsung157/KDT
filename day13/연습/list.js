getBoard()

function getBoard() {
    let html =''
    let boardList = localStorage.getItem('boardList')
    if(boardList == null) { boardList = [] }
    else {boardList = JSON.parse(boardList)}

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