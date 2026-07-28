
// 리터럴 ? 값 그 자체, 상수, 'a', 3 = 아스키코드
// 자료의 타입 : 숫자, 문자열, 논리, 객체( [ ], { }, function(){} )
//      * 주의할점 [ ] 또는 { } 안에 자료가 여러개 존재 하더라도 자료 1개 취급

// [1] 객체 선언 { } vs 배열 선언 [ ]
{ }

// [2] 객체는 주로 변수에 대입/저장한다.
let 객체변수1 = { }
console.log( 객체변수1 )  // 객체가 저장된 변수 호출
// [3] 객체내 속성( properties ) 구성, '속성명' : 속성값
const 객체변수2 = { 속성명1 : 10, '속성명2' : '안녕' }
console.log( 객체변수2 )
// [4] 객체내 속성 호출, .(점/도트)연산자, 왼쪽 자료의 참조
console.log( 객체변수2.속성명1 )
console.log( )  // console 객체내 log 함수 호출
console.log( 객체변수2.속성명2 )
console.log( Object.keys( 객체변수2) )      // 객체 내 모든 속성명 (배열)출력
console.log( Object.values( 객체변수2 ))    // 객체 내 모든 속성값 (배열)출력
console.log( Object.entries( 객체변수2 ) )  // 객체 내 모든 속성명/값 (배열)출력
// [5] 객체내 속성 추가,    .새로운속성명 = 새로운값
객체변수2.속성명3 = 3.14
// [6] 객체내 속성 값 수정,  .수정할속성명 = 수정할값
객체변수2.속성명3 = true
// [7] 객체내 속성 삭제 , delete 변수명. 삭제할속성명
delete 객체변수2.속성명3
// [8] 객체내 여러 타입 저장
const 객체변수3 = { prop1 : 1, prop2 : [1, 2, 3], prop3 : {age : 40 } , prop4 : function(){} }
console.log(객체변수3.prop3.age) //40

// [9] 객체내 속성별 여부 확인 , '속성명' in 객체변수
console.log('prop1' in 객체변수3) //true
// [10] 객체


let students = [{name: '', major: '', students_number: '', grade: ''}, ]
let subject = [{subject_name: '', major:'', code: '', category: '', grade: '', credit: '', professor: ''}, ] 
let info_major = [{major: '', Department: '', phone_number: '', captain: '',}, ]
let history = [{id:'', students_number: '', students_name: '', code: '', subject_name: ''}, ]


students.push({name: "박현민", major: "정보통신공학과", students_number: '2021123', year:'4'})
students.push({name: "최윤성", major: "컴퓨터공학과", students_number: '2021124', year:'4'})
students.push({name: "정형진", major: "컴퓨터공학과", students_number: '2021125', year:'4'})

subject.push({subject_name: "데이터베이스", code: "12345", major: "컴퓨터공학과", category: "전필", grade: '2', credit: '3', professor: '한경수'})
subject.push({subject_name: "정보보안", code: "12346", major: "정보통신공학과", category: "전필", grade: '4', credit: '3', professor: '박찬욱'})
subject.push({subject_name: "자바프로그래밍", code: "12347", major: "컴퓨터공학과", category: "전필", grade: '2', credit: '3', professor: '김현수'})

info_major.push({major: '컴퓨터공학과', Department: '성결관 501호', phone_number: '031-123-456', captain: '요네'})
info_major.push({major: '정보통신공학과', Department: '성결관 502호', phone_number: '031-123-457', captain: '말파이트'})
info_major.push({major: '미디어소프트웨어공학과', Department: '성결관 503호', phone_number: '031-123-458', captain: '야스오'})

history.push({id:'1', students_number: students[1].students_number, students_name: students[1].name, code: subject[1].code, subject_name: subject[1].subject_name})
history.push({id:'2', students_number: students[2].students_number, students_name: students[2].name, code: subject[3].code, subject_name: subject[3].subject_name})
history.push({id:'3', students_number: students[3].students_number, students_name: students[3].name, code: subject[2].code, subject_name: subject[2].subject_name})



console.log(history)



