function list(){
    let html = ''
    let name = document.querySelector('#name')
    let number = document.querySelector('#number')
    let text = document.querySelector('#text')

    html = `<tr> <td> ${name.value} </td> <td> ${number.value} </td> <td> ${text.value} </td>`
    document.querySelector('table').innerHTML += html
}