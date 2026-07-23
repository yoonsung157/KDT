let html = ''

for(let i = 0; i < 10; i++ ){
    for(let k = 0; k <= i; k++){
        html += ' ★ '
    } 
    html += '</br>'
}
for(let i = 0; i < 10; i++){
    for(let k = 1; 10 - k > i; k++){
        html += ' ★ '
    }   
    html += '</br>'
}

document.querySelector("p").innerHTML = html