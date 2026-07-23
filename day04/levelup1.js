// 문제 1) 계좌 배열 기반 ATM 출금 시스템
// 다음 조건을 만족하는 ATM 출금 프로그램을 작성하시오.
// 사전 제공 코드 (수정 금지)
// let accountNumberList = ['111-222', '333-444', '555-666'];
// let balanceList = [50000, 120000, 30000];
// 두 배열에서 같은 인덱스는 동일한 계좌를 의미한다.

// 예) '333-444' → 잔액 120000원
// 입력 (prompt 사용)
// 계좌번호 (문자열)
//  prompt("계좌번호를 입력하세요");
// 출금 금액 (정수)
//  prompt("출금 금액을 입력하세요");
// 출금 규칙
// 계좌 존재 여부
// 입력한 계좌번호가 accountNumberList에 존재할 경우만 출금 가능
// 존재하지 않으면 즉시 다음 문구 출력 : 존재하지 않는 계좌입니다.
// 출금 조건 (우선순위 중요)
// 출금 금액이 10000원 미만일 경우
//  출력: 출금 금액이 너무 적습니다.
// 출금 금액이 10000원 단위가 아닐 경우
//  출력: 출금 단위 오류입니다.
// (출금 금액 + 수수료:1200 ) > 계좌 잔액일 경우
//  출력: 잔액이 부족합니다.

// 모든 조건을 통과한 경우

//  출력: 출금 완료

let accountNumberList = ['111-222', '333-444', '555-666'];
let balanceList = [50000, 120000, 30000];
let accountNumber = prompt('계좌번호를 입력하세요.')
let index = accountNumberList.indexOf(accountNumber)
let money

console.log(index)
console.log(balanceList[index])

if(accountNumberList.includes(accountNumber)){
    money = Number(prompt('출금 금액을 입력하세요'))
    if( money >= 10000) {
        if( money % 10000 == 0) {
            if( money + 1200 > balanceList[index]) console.log('잔액이 부족합니다.')
            else console.log('출금 완료')
        }
        else console.log('출금 단위 오류입니다.')
    }
    else console.log('출금 금액이 너무 적습니다.')
}
else console.log('존재하지 않는 계좌입니다.')