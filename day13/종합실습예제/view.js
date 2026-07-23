getBoard()

function getBoard() {
    let url = new URLSearchParams(location.search)
    let selectNo = url.get('no')

    let boardList = localStorage.getItem('boardList')
    if(boardList == null) { boardList = [] }
    else { boardList = JSON.parse(boardList)}
    
    
    
    for(let i = 0; i < boardList.length; i++){
        let obj = boardList[i]
        if(obj.no == selectNo){
            document.querySelector('#title') = obj.title
            document.querySelector('#content') = obj.content
            return;
        }
    }

}
