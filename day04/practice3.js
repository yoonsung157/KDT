// 문제 1: 과일 목록 관리
// 다음 과일 목록 배열이 주어져 있습니다.
// let fruitList = [ '사과', '바나나' ];
// 사용자로부터 새로운 과일 이름을 입력받아, fruitList에 이미 존재하는 과일이면 '이미 존재하는 과일입니다.'를 출력하세요. 존재하지 않는 과
// 일이면 배열에 추가한 뒤, 변경된 배열 전체를 출력하는 프로그램을 작성하시오.

// let fruitList = [ '사과', '바나나' ]
// let fruit = prompt('과일 입력')

// if(fruitList.includes(fruit)) console.log('이미 존재하는 과일입니다.')
// else{
//     fruitList.push(fruit)
//     console.log(fruitList)
// }

// 문제 2: 성별에 따른 색상 지정
// 주민등록번호 13자리를 문자열로 입력받습니다. 성별을 나타내는 7번째 숫자가 '1' 또는 '3'이면 'blue'를, '2' 또는 '4'이면 'red'를 출력하는 프
// 로그램을 작성하시오.

// let number = prompt('주민번호 13자리')
// result = number.slice(6,7)
// if( result == 1 || result == 3) console.log('blue')
// else if( result == 2 || result == 4) console.log('red')

// 문제 3: 구매 금액에 따른 할인율 적용
// 사용자로부터 총 구매 금액을 입력받습니다. 구매 금액에 따라 아래와 같이 할인율을 적용하여 최종 결제 금액을 출력하는 프로그램을 작성하시
// 오.
// 50,000원 이상: 10% 할인
// 30,000원 이상 50,000원 미만: 5% 할인
// 10,000원 이상 30,000원 미만: 1% 할인
// 10,000원 미만: 할인 없음

// let price = prompt('총 구매 금액')
// if( price >= 50000 ) console.log( `${price - price * 0.1}`)
// else if( price >= 30000 ) console.log( `${price - price * 0.05}`)
// else if( price >= 10000 ) console.log( `${price - price * 0.01}`)
// else console.log(price)

// 문제 4: 월(Month)에 따른 계절 판별
// 1부터 12 사이의 월(Month)을 숫자로 입력받아, 해당하는 계절을 출력하는 프로그램을 작성하시오.
// 봄: 3, 4, 5월
// 여름: 6, 7, 8월
// 가을: 9, 10, 11월
// 겨울: 12, 1, 2월
// 만약 1~12 이외의 숫자를 입력하면 '잘못된 월입니다.'를 출력하세요.

// let month = prompt('월')
// if (month == 3 || month == 4 || month == 5) console.log('봄')
// else if (month == 6 || month == 7 || month == 8) console.log('여름')
// else if (month == 9 || month == 10 || month == 11) console.log('가을')
// else if (month == 12 || month == 1 || month == 2) console.log('겨울')
// else console.log('잘못된 월입니다.')

// 문제 5: 세 수 중 가장 큰 수 찾기
// 서로 다른 세 개의 정수를 입력받아, 가장 큰 수를 출력하는 프로그램을 작성하시오.

// let a = prompt('정수')
// let b = prompt('정수')
// let c = prompt('정수')

// if (a > b) {
//     if (a > c) console.log(a)
//     else console.log(c)
// }
// else {
//     if (b > c) console.log(b)
//     else console.log(c)
// }
