let board = ['','','','','','','','','']
let currentPlayer = 'O'
let turn = true
let end = false
let win
let num = 0

while(end == false){            // 반복
    // 승리조건
    for(let i = 0; i <= 6; i += 3){
        if( board[i] == board[i+1] && board[i+1] == board[i+2] && board[i] != '' ) {
            end = !end
            win = board[i]
        }
    }
    for(let i = 0; i <= 2; i++){
        if( board[i] == board[i+3] && board[i+3] == board[i+6] && board[i] != '') {
            end = !end
            win = board[i]
        } 
    }
    if( board[0] == board[4] && board[4] == board[8] && board[0] != '') {end = !end; win = board[0]}
    else if( board[2] == board[4] && board[4] == board[6] && board[2] != '') {end = !end; win = board[2]}
    else if( !board.includes('')) {end = !end; win = '없습니다'}
    
    if( end == true ) { console.log(`승자는 ${win}`) }
    else{
        num = prompt('칸 번호를 입력하세요')
        if( num > 8 || num < 0 ){
            console.log('잘못된 위치입니다.')       // 위치 검증
        }
        else{
            if( board[num] != ''){
                console.log('이미 선택된 자리입니다.')      // 중복 검증
            }
            else{
                turn == true ? currentPlayer = 'O' : currentPlayer = 'X'        // O,X 변경
                board[num] = currentPlayer        // 보드 변경
                console.log(` ${board[0]} ${board[1]} ${board[2]} \n ${board[3]} ${board[4]} ${board[5]} \n ${board[6]} ${board[7]} ${board[8]}`) // 보드 출력
                turn = !turn
            }
        }
    }
}
