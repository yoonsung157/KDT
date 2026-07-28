// [더 나아가기, 제출X ] 키오스크 설계

//     - 문제1 : 아래와 같은 주문 시나리오에 따라 들어오는 데이터를 표현하시오.
//     - 시나리오 
//         1. 고객1(유재석) 이 키오스크 에서 '커피' 카테고리를 선택하여 아이스아메리카노 2개 주문 요청 
//         2. 고객1(유재석) 은 주문번호를 받아서 대기 한다.
//         3. 고객2(강호동) 이 키오스크 에서 '커피' 카테고리를 선택하여 카페라떼 1개 주문 , 
//             '스무디' 카테고리를 선택하여 사과스무디 2개 주문 요청 
//         4. 고객2(강호동) 은 주문번호를 받아서 대기 한다.
//     - 결과방법
//         위 시나리오에 따른 필요한 데이터들을 찾아서 변수와 자료형 들을 이용하여 구성 하시오.


let more = '네'         // 동일 인물의 추가 주문 여부
let i = Number(0)       // 배열 인덱스
let cate = []           // 카테고리
let menu = []           // 메뉴
let count = []          // 수량
let order = Number(0)   // 주문 횟수

while(more == '네')
{
    cate[i] = prompt('카테고리를 선택하세요 [커피] [스무디]')
    menu[i] = prompt('메뉴를 입력하세요')
    count[i] = prompt('수량을 입력하세요')
    i++
    order = i
    more = prompt('더 주문하시겠습니까? [네] [아니오] ')
}
let wating = 1                                  // 주문 번호
console.log(`주문번호 ${wating++}번 \n`)
for(i=0; i<order; i++)
{
    console.log(`${menu[i]} ${count[i]}잔\n`)
}

more = '네'                                     // 초기화
i = Number(0)
while(more == '네')
{
    cate[i] = prompt('카테고리를 선택하세요 [커피] [스무디]')
    menu[i] = prompt('메뉴를 입력하세요')
    count[i] = prompt('수량을 입력하세요')
    i++
    order = i
    more = prompt('더 주문하시겠습니까? [네] [아니오] ')
}
console.log(`주문번호 ${wating}번\n`)
for(i=0; i<order; i++)
{
    console.log(`${menu[i]} ${count[i]}잔\n`)
}