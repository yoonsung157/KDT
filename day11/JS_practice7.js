function a(){
    let date = document.querySelector('#date')
    let name = document.querySelector('#name')
    let price = document.querySelector('#price')
    b = Number(price.value)
    b = b.toLocaleString()
    let html =''
    html += `<tr> <td> ${date.value} </td> <td> ${name.value} </td> <td> ${b} </td> </tr>`
    document.querySelector('table').innerHTML += html
}

