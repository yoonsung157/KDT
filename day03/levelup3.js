// 문제 2) “주차비 계산기” (올림 계산 + 최대 요금 + 심야 할인)
// 설명
//  입차 시각(시,분)과 출차 시각(시,분)을 prompt로 입력받아 주차 요금을 계산해 콘솔에 출력하시오.
//  단, 출차는 같은 날이며 출차 시간이 더 늦다고 가정.
// 요금 규칙
// 총 이용시간(분)을 계산한다.
// 기본 30분까지 2,000원
// 이후 10분마다 500원씩 추가 (10분 단위는 올림 처리)
// 하루 최대 요금 20,000원 (초과하면 20,000원으로 고정)
// 심야 할인: 입차 시간이 22시 이상이면 최종요금에서 20% 할인
// 할인 후 금액은 원 단위 버림(정수)
// 제한 조건
// if/for/Math 금지 
// 출력 예
// 21:50 ~ 22:40 (50분)

//  기본 2000 + 추가 20분 → 10분*2 = 1000 → 3000원 (심야 아님)
// 22:10 ~ 23:05 (55분)

//  기본 2000 + 추가 25분 → 10분 단위 올림 = 3 → 1500 → 3500.

//  심야 20% 할인 → 2800원

let come_hour = Number(prompt('입차시각(시)'))
let come_minute = Number(prompt('입차시각(분)'))
let out_hour = Number(prompt('출차시각(시)'))
let out_minute = Number(prompt('출차시각(분)'))

let hour = out_hour - come_hour
let minute = out_minute - come_minute
let result = (hour * 60) + minute

result % 10 == 0 ? result : result = result - (result % 10) + 10    // 올림 처리
let pay = 2000 + ((result-30)/10) * 500             // 가격
come_hour >= 22 ? (pay = pay - pay*0.2) : pay       // 야간 할인
pay % 10 == 0 ? pay : pay = pay - (pay % 10)        // 원 단위 버림
pay > 20000 ? pay = 20000 : pay                     // 최대 요금 조정
console.log(pay)
