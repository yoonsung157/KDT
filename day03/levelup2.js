// [더 나아가기, 제출X ] 연산자
// 문제 1) “초 단위 → HH:MM:SS” 변환기 (0패딩 포함)
// 설명
// prompt로 0 이상 정수 초(seconds)를 입력받아, 이를 시:분:초 형식으로 출력하시오.
//  단, 분/초가 한 자리면 앞에 0을 붙여 2자리로 출력합니다. (예: 3초 → 00:00:03)
// 제한 조건
// if/for/Math 금지 
// 출력 예
// 입력: 3661 → 01:01:01
// 입력: 59 → 00:00:59
// 입력: 36000 → 10:00:00

let time = Number(prompt('시간(초)'))
let second = time % 60
let minute = (time - (time % 60) ) / 60
let hour = (minute - (minute % 60) ) / 60
minute = minute % 60 

console.log(`${hour < 10 ? '0'+hour : hour} : ${minute < 10 ? '0' + minute : minute} : ${second < 10 ? '0'+second : second}`)
