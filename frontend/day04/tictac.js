let A = [1,2,3,4,5,6,7,8,9]

console.log(`${A[0]} \t ${A[1]} \t  ${A[2]}`)
console.log(`${A[3]} \t ${A[4]} \t  ${A[5]}`)
console.log(`${A[6]} \t ${A[7]} \t  ${A[8]}`)
console.log('-----------------')

let turn = 0
let tictac = "O"
let user
let win = 0

if (win == 1) {console.log("선공 승리")}
else if (win == 2) {console.log("후공 승리")}
else{
    if( turn % 2 == 0) {tictac = "O"}
    else {tictac = "X"}
    user = prompt('좌표입력')
    if(A[user-1] == "O" || A[user-1] == "X"){
        console.log('이미 놓은 자리입니다.')
    }
    else{
        A[user-1] = tictac
        turn++
        console.log(`${A[0]} \t ${A[1]} \t  ${A[2]}`)
        console.log(`${A[3]} \t ${A[4]} \t  ${A[5]}`)
        console.log(`${A[6]} \t ${A[7]} \t  ${A[8]}`)
        console.log('-----------------')
    }
    
}

if (win == 1) {console.log("선공 승리")}
else if (win == 2) {console.log("후공 승리")}
else{
    if( turn % 2 == 0) {tictac = "O"}
    else {tictac = "X"}
    user = prompt('좌표입력')
    if(A[user-1] == "O" || A[user-1] == "X"){
        console.log('이미 놓은 자리입니다.')
    }
    else{
        A[user-1] = tictac
        turn++
        console.log(`${A[0]} \t ${A[1]} \t  ${A[2]}`)
        console.log(`${A[3]} \t ${A[4]} \t  ${A[5]}`)
        console.log(`${A[6]} \t ${A[7]} \t  ${A[8]}`)
        console.log('-----------------')
    }
    
}

if (win == 1) {console.log("선공 승리")}
else if (win == 2) {console.log("후공 승리")}
else{
    if( turn % 2 == 0) {tictac = "O"}
    else {tictac = "X"}
    user = prompt('좌표입력')
    if(A[user-1] == "O" || A[user-1] == "X"){
        console.log('이미 놓은 자리입니다.')
    }
    else{
        A[user-1] = tictac
        turn++
        console.log(`${A[0]} \t ${A[1]} \t  ${A[2]}`)
        console.log(`${A[3]} \t ${A[4]} \t  ${A[5]}`)
        console.log(`${A[6]} \t ${A[7]} \t  ${A[8]}`)
        console.log('-----------------')
    }
    
}
if (win == 1) {console.log("선공 승리")}
else if (win == 2) {console.log("후공 승리")}
else{
    if( turn % 2 == 0) {tictac = "O"}
    else {tictac = "X"}
    user = prompt('좌표입력')
    if(A[user-1] == "O" || A[user-1] == "X"){
        console.log('이미 놓은 자리입니다.')
    }
    else{
        A[user-1] = tictac
        turn++
        console.log(`${A[0]} \t ${A[1]} \t  ${A[2]}`)
        console.log(`${A[3]} \t ${A[4]} \t  ${A[5]}`)
        console.log(`${A[6]} \t ${A[7]} \t  ${A[8]}`)
        console.log('-----------------')
    }
    
}
//선공가로 승리
if(A[0] == "O" && A[1] == "O" && A[2] == "O"){win = 1}
else if(A[3] == "O" && A[4] == "O" && A[5] =="O"){win = 1}
else if(A[6] == "O" && A[7] == "O" && A[8] =="O"){win = 1}
//세로 승리
else if(A[0] == "O" && A[3] == "O" && A[6] =="O"){win = 1}
else if(A[1] == "O" && A[4] == "O" && A[7] =="O"){win = 1}
else if(A[2] == "O" && A[5] == "O" && A[8] =="O"){win = 1}
//대각 승리
else if(A[0] == "O" && A[4]=="O" && A[8]=="O"){win = 1}
else if(A[2] == "O" && A[4]=="O" && A[6]=="O"){win = 1}
//후공가로 승리
else if(A[0]== "X" && A[1]== "X" && A[2] == "X"){win = 2}
else if(A[3]=="X" &&  A[4]=="X" && A[5]=="X"){win = 2}
else if(A[6]=="X" && A[7]=="X" && A[8]=="X"){win = 2}
//세로 승리
else if(A[0]=="X" && A[3]=="X" && A[6]=="X"){win = 2}
else if(A[1]=="X" && A[4]=="X" && A[7]=="X"){win = 2}
else if(A[2]=="X" && A[5]=="X" && A[8]=="X"){win = 2}
//대각 승리
else if(A[0]=="X" && A[4]=="X" && A[8]=="X"){win = 2}
else if(A[2]=="X" && A[4]=="X" && A[6]=="X"){win = 2}

if (win == 1) {console.log("선공 승리")}
else if (win == 2) {console.log("후공 승리")}
else{
    if( turn %2  == 0) {tictac = "O"}
    else {tictac = "X"}
    user = prompt('좌표입력')
    if(A[user-1] == "O" || A[user-1] == "X"){
        console.log('이미 놓은 자리입니다.')
    }
    else{
        A[user-1] = tictac
        turn++
        console.log(`${A[0]} \t ${A[1]} \t  ${A[2]}`)
        console.log(`${A[3]} \t ${A[4]} \t  ${A[5]}`)
        console.log(`${A[6]} \t ${A[7]} \t  ${A[8]}`)
        console.log('-----------------')
    }
    
}
//선공가로 승리
if(A[0] == "O" && A[1] == "O" && A[2] == "O"){win = 1}
else if(A[3] == "O" && A[4] == "O" && A[5] =="O"){win = 1}
else if(A[6] == "O" && A[7] == "O" && A[8] =="O"){win = 1}
//세로 승리
else if(A[0] == "O" && A[3] == "O" && A[6] =="O"){win = 1}
else if(A[1] == "O" && A[4] == "O" && A[7] =="O"){win = 1}
else if(A[2] == "O" && A[5] == "O" && A[8] =="O"){win = 1}
//대각 승리
else if(A[0] == "O" && A[4]=="O" && A[8]=="O"){win = 1}
else if(A[2] == "O" && A[4]=="O" && A[6]=="O"){win = 1}
//후공가로 승리
else if(A[0]== "X" && A[1]== "X" && A[2] == "X"){win = 2}
else if(A[3]=="X" &&  A[4]=="X" && A[5]=="X"){win = 2}
else if(A[6]=="X" && A[7]=="X" && A[8]=="X"){win = 2}
//세로 승리
else if(A[0]=="X" && A[3]=="X" && A[6]=="X"){win = 2}
else if(A[1]=="X" && A[4]=="X" && A[7]=="X"){win = 2}
else if(A[2]=="X" && A[5]=="X" && A[8]=="X"){win = 2}
//대각 승리
else if(A[0]=="X" && A[4]=="X" && A[8]=="X"){win = 2}
else if(A[2]=="X" && A[4]=="X" && A[6]=="X"){win = 2}

if (win == 1) {console.log("선공 승리")}
else if (win == 2) {console.log("후공 승리")}
else{
    if( turn % 2 == 0) {tictac = "O"}
    else {tictac = "X"}
    user = prompt('좌표입력')
    if(A[user-1] == "O" || A[user-1] == "X"){
        console.log('이미 놓은 자리입니다.')
    }
    else{
        A[user-1] = tictac
        turn++
        console.log(`${A[0]} \t ${A[1]} \t  ${A[2]}`)
        console.log(`${A[3]} \t ${A[4]} \t  ${A[5]}`)
        console.log(`${A[6]} \t ${A[7]} \t  ${A[8]}`)
        console.log('-----------------')
    }
    
}
//선공가로 승리
if(A[0] == "O" && A[1] == "O" && A[2] == "O"){win = 1}
else if(A[3] == "O" && A[4] == "O" && A[5] =="O"){win = 1}
else if(A[6] == "O" && A[7] == "O" && A[8] =="O"){win = 1}
//세로 승리
else if(A[0] == "O" && A[3] == "O" && A[6] =="O"){win = 1}
else if(A[1] == "O" && A[4] == "O" && A[7] =="O"){win = 1}
else if(A[2] == "O" && A[5] == "O" && A[8] =="O"){win = 1}
//대각 승리
else if(A[0] == "O" && A[4]=="O" && A[8]=="O"){win = 1}
else if(A[2] == "O" && A[4]=="O" && A[6]=="O"){win = 1}
//후공가로 승리
else if(A[0]== "X" && A[1]== "X" && A[2] == "X"){win = 2}
else if(A[3]=="X" &&  A[4]=="X" && A[5]=="X"){win = 2}
else if(A[6]=="X" && A[7]=="X" && A[8]=="X"){win = 2}
//세로 승리
else if(A[0]=="X" && A[3]=="X" && A[6]=="X"){win = 2}
else if(A[1]=="X" && A[4]=="X" && A[7]=="X"){win = 2}
else if(A[2]=="X" && A[5]=="X" && A[8]=="X"){win = 2}
//대각 승리
else if(A[0]=="X" && A[4]=="X" && A[8]=="X"){win = 2}
else if(A[2]=="X" && A[4]=="X" && A[6]=="X"){win = 2}

if (win == 1) {console.log("선공 승리")}
else if (win == 2) {console.log("후공 승리")}
else{
    if( turn % 2 == 0) {tictac = "O"}
    else {tictac = "X"}
    user = prompt('좌표입력')
    if(A[user-1] == "O" || A[user-1] == "X"){
        console.log('이미 놓은 자리입니다.')
    }
    else{
        A[user-1] = tictac
        turn++
        console.log(`${A[0]} \t ${A[1]} \t  ${A[2]}`)
        console.log(`${A[3]} \t ${A[4]} \t  ${A[5]}`)
        console.log(`${A[6]} \t ${A[7]} \t  ${A[8]}`)
        console.log('-----------------')
    }
    
}
//선공가로 승리
if(A[0] == "O" && A[1] == "O" && A[2] == "O"){win = 1}
else if(A[3] == "O" && A[4] == "O" && A[5] =="O"){win = 1}
else if(A[6] == "O" && A[7] == "O" && A[8] =="O"){win = 1}
//세로 승리
else if(A[0] == "O" && A[3] == "O" && A[6] =="O"){win = 1}
else if(A[1] == "O" && A[4] == "O" && A[7] =="O"){win = 1}
else if(A[2] == "O" && A[5] == "O" && A[8] =="O"){win = 1}
//대각 승리
else if(A[0] == "O" && A[4]=="O" && A[8]=="O"){win = 1}
else if(A[2] == "O" && A[4]=="O" && A[6]=="O"){win = 1}
//후공가로 승리
else if(A[0]== "X" && A[1]== "X" && A[2] == "X"){win = 2}
else if(A[3]=="X" &&  A[4]=="X" && A[5]=="X"){win = 2}
else if(A[6]=="X" && A[7]=="X" && A[8]=="X"){win = 2}
//세로 승리
else if(A[0]=="X" && A[3]=="X" && A[6]=="X"){win = 2}
else if(A[1]=="X" && A[4]=="X" && A[7]=="X"){win = 2}
else if(A[2]=="X" && A[5]=="X" && A[8]=="X"){win = 2}
//대각 승리
else if(A[0]=="X" && A[4]=="X" && A[8]=="X"){win = 2}
else if(A[2]=="X" && A[4]=="X" && A[6]=="X"){win = 2}

if (win == 1) {console.log("선공 승리")}
else if (win == 2) {console.log("후공 승리")}
else{
    if( turn % 2 == 0) {tictac = "O"}
    else {tictac = "X"}
    user = prompt('좌표입력')
    if(A[user-1] == "O" || A[user-1] == "X"){
        console.log('이미 놓은 자리입니다.')
    }
    else{
        A[user-1] = tictac
        turn++
        console.log(`${A[0]} \t ${A[1]} \t  ${A[2]}`)
        console.log(`${A[3]} \t ${A[4]} \t  ${A[5]}`)
        console.log(`${A[6]} \t ${A[7]} \t  ${A[8]}`)
        console.log('-----------------')
    }
    
}
//선공가로 승리
if(A[0] == "O" && A[1] == "O" && A[2] == "O"){win = 1}
else if(A[3] == "O" && A[4] == "O" && A[5] =="O"){win = 1}
else if(A[6] == "O" && A[7] == "O" && A[8] =="O"){win = 1}
//세로 승리
else if(A[0] == "O" && A[3] == "O" && A[6] =="O"){win = 1}
else if(A[1] == "O" && A[4] == "O" && A[7] =="O"){win = 1}
else if(A[2] == "O" && A[5] == "O" && A[8] =="O"){win = 1}
//대각 승리
else if(A[0] == "O" && A[4]=="O" && A[8]=="O"){win = 1}
else if(A[2] == "O" && A[4]=="O" && A[6]=="O"){win = 1}
//후공가로 승리
else if(A[0]== "X" && A[1]== "X" && A[2] == "X"){win = 2}
else if(A[3]=="X" &&  A[4]=="X" && A[5]=="X"){win = 2}
else if(A[6]=="X" && A[7]=="X" && A[8]=="X"){win = 2}
//세로 승리
else if(A[0]=="X" && A[3]=="X" && A[6]=="X"){win = 2}
else if(A[1]=="X" && A[4]=="X" && A[7]=="X"){win = 2}
else if(A[2]=="X" && A[5]=="X" && A[8]=="X"){win = 2}
//대각 승리
else if(A[0]=="X" && A[4]=="X" && A[8]=="X"){win = 2}
else if(A[2]=="X" && A[4]=="X" && A[6]=="X"){win = 2}

if (win == 1) {console.log("선공 승리")}
else if (win == 2) {console.log("후공 승리")}
else{
    if( turn % 2 == 0) {tictac = "O"}
    else {tictac = "X"}
    user = prompt('좌표입력')
    if(A[user-1] == "O" || A[user-1] == "X"){
        console.log('이미 놓은 자리입니다.')
    }
    else{
        A[user-1] = tictac
        turn++
        console.log(`${A[0]} \t ${A[1]} \t  ${A[2]}`)
        console.log(`${A[3]} \t ${A[4]} \t  ${A[5]}`)
        console.log(`${A[6]} \t ${A[7]} \t  ${A[8]}`)
        console.log('-----------------')
    }
    
}
//선공가로 승리
if(A[0] == "O" && A[1] == "O" && A[2] == "O"){win = 1}
else if(A[3] == "O" && A[4] == "O" && A[5] =="O"){win = 1}
else if(A[6] == "O" && A[7] == "O" && A[8] =="O"){win = 1}
//세로 승리
else if(A[0] == "O" && A[3] == "O" && A[6] =="O"){win = 1}
else if(A[1] == "O" && A[4] == "O" && A[7] =="O"){win = 1}
else if(A[2] == "O" && A[5] == "O" && A[8] =="O"){win = 1}
//대각 승리
else if(A[0] == "O" && A[4]=="O" && A[8]=="O"){win = 1}
else if(A[2] == "O" && A[4]=="O" && A[6]=="O"){win = 1}
//후공가로 승리
else if(A[0]== "X" && A[1]== "X" && A[2] == "X"){win = 2}
else if(A[3]=="X" &&  A[4]=="X" && A[5]=="X"){win = 2}
else if(A[6]=="X" && A[7]=="X" && A[8]=="X"){win = 2}
//세로 승리
else if(A[0]=="X" && A[3]=="X" && A[6]=="X"){win = 2}
else if(A[1]=="X" && A[4]=="X" && A[7]=="X"){win = 2}
else if(A[2]=="X" && A[5]=="X" && A[8]=="X"){win = 2}
//대각 승리
else if(A[0]=="X" && A[4]=="X" && A[8]=="X"){win = 2}
else if(A[2]=="X" && A[4]=="X" && A[6]=="X"){win = 2}

if (win == 1) {console.log("선공 승리")}
else if (win == 2) {console.log("후공 승리")}
else{
    if( turn % 2 == 0) {tictac = "O"}
    else {tictac = "X"}
    user = prompt('좌표입력')
    if(A[user-1] == "O" || A[user-1] == "X"){
        console.log('이미 놓은 자리입니다.')
    }
    else{
        A[user-1] = tictac
        turn++
        console.log(`${A[0]} \t ${A[1]} \t  ${A[2]}`)
        console.log(`${A[3]} \t ${A[4]} \t  ${A[5]}`)
        console.log(`${A[6]} \t ${A[7]} \t  ${A[8]}`)
        console.log('-----------------')
    }
    
}
//선공가로 승리
if(A[0] == "O" && A[1] == "O" && A[2] == "O"){win = 1}
else if(A[3] == "O" && A[4] == "O" && A[5] =="O"){win = 1}
else if(A[6] == "O" && A[7] == "O" && A[8] =="O"){win = 1}
//세로 승리
else if(A[0] == "O" && A[3] == "O" && A[6] =="O"){win = 1}
else if(A[1] == "O" && A[4] == "O" && A[7] =="O"){win = 1}
else if(A[2] == "O" && A[5] == "O" && A[8] =="O"){win = 1}
//대각 승리
else if(A[0] == "O" && A[4]=="O" && A[8]=="O"){win = 1}
else if(A[2] == "O" && A[4]=="O" && A[6]=="O"){win = 1}
//후공가로 승리
else if(A[0]== "X" && A[1]== "X" && A[2] == "X"){win = 2}
else if(A[3]=="X" &&  A[4]=="X" && A[5]=="X"){win = 2}
else if(A[6]=="X" && A[7]=="X" && A[8]=="X"){win = 2}
//세로 승리
else if(A[0]=="X" && A[3]=="X" && A[6]=="X"){win = 2}
else if(A[1]=="X" && A[4]=="X" && A[7]=="X"){win = 2}
else if(A[2]=="X" && A[5]=="X" && A[8]=="X"){win = 2}
//대각 승리
else if(A[0]=="X" && A[4]=="X" && A[8]=="X"){win = 2}
else if(A[2]=="X" && A[4]=="X" && A[6]=="X"){win = 2}

if (win == 1) {console.log("선공 승리")}
else if (win == 2) {console.log("후공 승리")}
else{
    if( turn % 2 == 0) {tictac = "O"}
    else {tictac = "X"}
    user = prompt('좌표입력')
    if(A[user-1] == "O" || A[user-1] == "X"){
        console.log('이미 놓은 자리입니다.')
    }
    else{
        A[user-1] = tictac
        turn++
        console.log(`${A[0]} \t ${A[1]} \t  ${A[2]}`)
        console.log(`${A[3]} \t ${A[4]} \t  ${A[5]}`)
        console.log(`${A[6]} \t ${A[7]} \t  ${A[8]}`)
        console.log('-----------------')
    }
    
}
//선공가로 승리
if(A[0] == "O" && A[1] == "O" && A[2] == "O"){win = 1}
else if(A[3] == "O" && A[4] == "O" && A[5] =="O"){win = 1}
else if(A[6] == "O" && A[7] == "O" && A[8] =="O"){win = 1}
//세로 승리
else if(A[0] == "O" && A[3] == "O" && A[6] =="O"){win = 1}
else if(A[1] == "O" && A[4] == "O" && A[7] =="O"){win = 1}
else if(A[2] == "O" && A[5] == "O" && A[8] =="O"){win = 1}
//대각 승리
else if(A[0] == "O" && A[4]=="O" && A[8]=="O"){win = 1}
else if(A[2] == "O" && A[4]=="O" && A[6]=="O"){win = 1}
//후공가로 승리
else if(A[0]== "X" && A[1]== "X" && A[2] == "X"){win = 2}
else if(A[3]=="X" &&  A[4]=="X" && A[5]=="X"){win = 2}
else if(A[6]=="X" && A[7]=="X" && A[8]=="X"){win = 2}
//세로 승리
else if(A[0]=="X" && A[3]=="X" && A[6]=="X"){win = 2}
else if(A[1]=="X" && A[4]=="X" && A[7]=="X"){win = 2}
else if(A[2]=="X" && A[5]=="X" && A[8]=="X"){win = 2}
//대각 승리
else if(A[0]=="X" && A[4]=="X" && A[8]=="X"){win = 2}
else if(A[2]=="X" && A[4]=="X" && A[6]=="X"){win = 2}

if (win == 1) {console.log("선공 승리")}
else if (win == 2) {console.log("후공 승리")}
else{
    if( turn % 2 == 0) {tictac = "O"}
    else {tictac = "X"}
    user = prompt('좌표입력')
    if(A[user-1] == "O" || A[user-1] == "X"){
        console.log('이미 놓은 자리입니다.')
    }
    else{
        A[user-1] = tictac
        turn++
        console.log(`${A[0]} \t ${A[1]} \t  ${A[2]}`)
        console.log(`${A[3]} \t ${A[4]} \t  ${A[5]}`)
        console.log(`${A[6]} \t ${A[7]} \t  ${A[8]}`)
        console.log('-----------------')
    }
    
}
//선공가로 승리
if(A[0] == "O" && A[1] == "O" && A[2] == "O"){win = 1}
else if(A[3] == "O" && A[4] == "O" && A[5] =="O"){win = 1}
else if(A[6] == "O" && A[7] == "O" && A[8] =="O"){win = 1}
//세로 승리
else if(A[0] == "O" && A[3] == "O" && A[6] =="O"){win = 1}
else if(A[1] == "O" && A[4] == "O" && A[7] =="O"){win = 1}
else if(A[2] == "O" && A[5] == "O" && A[8] =="O"){win = 1}
//대각 승리
else if(A[0] == "O" && A[4]=="O" && A[8]=="O"){win = 1}
else if(A[2] == "O" && A[4]=="O" && A[6]=="O"){win = 1}
//후공가로 승리
else if(A[0]== "X" && A[1]== "X" && A[2] == "X"){win = 2}
else if(A[3]=="X" &&  A[4]=="X" && A[5]=="X"){win = 2}
else if(A[6]=="X" && A[7]=="X" && A[8]=="X"){win = 2}
//세로 승리
else if(A[0]=="X" && A[3]=="X" && A[6]=="X"){win = 2}
else if(A[1]=="X" && A[4]=="X" && A[7]=="X"){win = 2}
else if(A[2]=="X" && A[5]=="X" && A[8]=="X"){win = 2}
//대각 승리
else if(A[0]=="X" && A[4]=="X" && A[8]=="X"){win = 2}
else if(A[2]=="X" && A[4]=="X" && A[6]=="X"){win = 2}

if (win == 1) {console.log("선공 승리")}
else if (win == 2) {console.log("후공 승리")}
else{
    if( turn % 2 == 0) {tictac = "O"}
    else {tictac = "X"}
    user = prompt('좌표입력')
    if(A[user-1] == "O" || A[user-1] == "X"){
        console.log('이미 놓은 자리입니다.')
    }
    else{
        A[user-1] = tictac
        turn++
        console.log(`${A[0]} \t ${A[1]} \t  ${A[2]}`)
        console.log(`${A[3]} \t ${A[4]} \t  ${A[5]}`)
        console.log(`${A[6]} \t ${A[7]} \t  ${A[8]}`)
        console.log('-----------------')
    }
    
}





