# 이재희 202330122

## 3월 15일 강의 
강의내용 정리중

이번에는 안올림

## 3월 22일 강의

ctrl + shift + p , >java project

ctrl + /로 주석빠르게

main을 입력하면 시간단축. 클래스의 멤버 함수를 자바에서는 메소드라함. 메소드의개수는 제한이없음. 자바에서 모든문장은 ';'로 끝나야한다. 정수,문자,문자열 등 프로그램에서 사용하는 데이터를 사용하는 데이터를 화면에 출력하기위해 System.out.println()이나 print()를 사용함 식별자는 클래스,변수,상수,메소드 등에 붙이는 이름을 말함. -특수문자,공백은 식별자 사용X -한글도 가능. -자바언어의 키워드는 사용불가 -첫번째 문자로 숫자사용불가. -대소문자 구별

문자열 : 자바에서 문자열은 기본타입에 속하지 않으며 String 클래스를 이용함.

## 3월 29일 강의
예제 2-5 Scanner를 이용한 키 입력
예제 2-6 /와 % 산술 연산자 응용
예제 3-4 2중 중첩을 이용한 구구단 출력
System.in : 키보드 장치를 직접 제어하고 키 입력을 받는 표준 입력 스트림 객체이다. Scanner : 키 입력을 쉽게 받을 수 있도록 자바 패키지에서 제공하는 클래스. Scanner 객체생성 - Scanner scanner = new Scanner(System.in); import 문 사용 - 스캐너를 사용하기위해서는 맨앞줄에 import문이 필요. import java.util.Scanner; 사용 예시 Scanner scanner = new Scanner(System.in); String name = scanner.next(); 교재 78페이지 참고.. scanner객체닫기 -사용종료하려면 scanner.close();로 닫아주자.

연산자 - 교재 81 증감 연산 ++ -- ex) int a = 1; a++; - a값 1증가, a는 2 ++a; - 다시 a 값 1 증가. a는 3 ++a 는 a를 1증가하고 증가전의 값을 반환 a++은 1증가하고 증가된 값 반환 교재 83쪽

반복문(교재 115쪽) for문 : for(초기문; 조건식; 반복 후 작업){ 작업문 } 초기문: 주로 변수 초기화, 빈상태로 두어도 되지만 ;은 있어야함. 조건식: 논리형 변수나 논리연산 사용. 반복 후 작업:교재116참고.

배열: 배열(Array)은 인덱스(index)와 대응하는 데이터들로 이루어진 연속적인 자료구조로서, 같은 종류의 데이터들이 순차적으로 저장됨. 자바에서 배열생성은 두단계로 이루어짐 1.배열에 대한 레퍼런스 변수선언 2.배열생성 - 배열의 저장 공간 할당. 레퍼런스 변수선언 : int intArray [] 배열타입, 배열에 대한레퍼런스 변수, 배열선언 배열생성 : intArray = new int [5]; 배열에대한 레퍼런스변수, 배열생성, 타입, 원소개수 등등 . 130p 참고.

이차원 배열 대괄호 2개임. 3차원 3개. p138.

## 4월 5일 강의
예제 3-13 으로 나누는 예외에 대처하는 try catch 블록 만들기
예제 4-2 두개의 생성자를 가진 circle 클래스
예제 4-4 생성자 선언 및 활용 연습
생성자 : 객체가 생성될 때 객체의 초기화를 위해 실행되는 메소드다. -생성자는 여러개 오버로딩 할수있다. - 생성자는 new를 통해 객체를 생성할 때 한번만 호출된다 -생성자에 리턴 타입을 지정할 수 없다. -생성자의 목적은 객체가 생성될 때, 필요한 초기 작업을 위함이다. 기본생성자: 매개변수와 실행코드가 없어 아무 일도 하지않고 단순 리턴하는 생성자이며 디폴트 생성자라고도 부른다. 

## 4월 12일 강의
예제 4-11 static 멤버를 가진 Calc 클래스 생성
상속 - 자바에서 부모 클래스르 슈퍼클래스, 상속받는 자식 클래스를 서브 클래스라 부르며, 상속을 선언할 때 확장한다는 뜻을 가진 extends 키워드를 사용한다.

상속의 특징 - 자바에서는 클래스의 다중 상속을 지원하지않는다. 자바에서는 상속의 횟수에 제한을 두지 않는다. 자바에서 계층 구조의 최상위 java.lang.object 클래스가 있다. 추상 메소드 : 선언은 되어 있으나 코드가 구현되어 있지 않은, 즉 껍데기만 있는 메소드이다.추상 클래스 만들기 : 2가지로서 모두 abstract 키워드로 선언 해야함(p291). 추상 클래스 구현이란: 슈퍼클래스에 선언된 모든 추상 메소드를 서브 클래스에서 오버라이딩하여 실행 가능한 코드를 말함.

## 4월 19일 강의
추상클래스 상속: 추상클래스를 상속 받으면 추상 클래스가 됨(서브 클래스도 abstract로 선언 해야함) 추상 클래스 구현: 서브 클래스에서 슈퍼 클래스의 추상 메소드 구현(오버라이딩),추상 클래스를 구현한 서브 클래스는 추상 클래스 아님 추상클래스의 목적: 상속을 위한 슈퍼 클래스로 활용하는 것, 서브 클래스에서 추상 메소드 구현, 다형성 실현

자바의 인터페이스: 클래스가 구현해야 할 메소드들이 선언되는 추상형(interface로 선언),인터페이스 상속해서 확장된 인터페이스 작성 가능

인터페이스 구성요소 상수: public만 허용,추상 메소드 ,default 메소드,private 메소드, static

6장 패키지: 서로 관련된 클래스와 인터 페이스를 컴파일한 클래스 파일들을 묶어 놓은 디렉터리,하나의 응용 프로 그램은 한갱 이상의 패키지로 작성(jdk)

모듈:여러 패키지와 이미지 등의 자원을 모아 놓은 컨테이너(하나의 모듛을 하나의.jmod파일의 저장) 모듈화의 목적:응용 프로그램이 실행할때 꼭 필요한 모듈들로만 실행환경 구축 (메모리 자원이 열악한 작은 소형기기에 꼭 필요한 모듈로 구성된 작은 크기의실행 이미지를 만들기 위함) 모듈의 현실: 현실적으로 모듈로 나누어 자바 프로그램을 작성할 필요없음 자바 jdk에 제공되는 모듈 파일들:jmods( jmod) 다른 패키지에 작성도니 클래스 사용:import를 이용

페키지 만드는 방법 :java project>src>+>package object 클래스 :모든 자바클래스는 반드시object를 상속 받도록 자동 컴파일 toString()메소드 :toString()을 오버라이딩 하여 자신만의 문자열 리턴 가능

boolean equals(object obj) 두 객페의 내용물 비교 객체의 내용물을 비교하기 위해 클래스의 멤버로 작성

Wrapper클래스: 자바의 기본 타입을 클래스 화한 8개클래스를 통칭

박싱: 기본 타입의 값을 Wrapper객체로 변환 하는것 언박싱: Wrapper객체에 들어있는 기본 타입의 값을 빼내는것 
String:여러개의 문자열
## 5월 3일 강의
컬렉션 : 요소라고 불리는 가변 개수의 객체들의 저장소 -객체들의 컨테이너라고도 불림
요소의 개수에 따라 크기 자동 조절
요소의 삽입, 삭제에 따른 요소의 위치 자동 이동
컬렉션은 제네릭기법으로 구현 제네릭 : 특정 타입만 다루지 않고 여러 종류의 타입으로 변신할 수 있도록 클래스나 메소드를 일반화시키는 기법 클래스나 인터페이스 이름에 , , 등 타입매개변수 포함

제네릭 컬렉션 사례 : 벡터 Vector 에서 E에 구체적인 타입을 주어 구체적인 타입만 다루는 벡터로 활용 점수만 다루는 컬렉션 벡터 Vector 문자열만 다루는 컬렉션 벡터 Vector 제네릭 : 클래스나 메소드를 형판에서 찍어내듯이 생상할수 있도록 일반화된 형판을 만드는 기법 벡터 Vector의 특성 -에 사용할 요소의 특정 타입으로 구체화 배열을 가변 크기로 다룰 수 있게 하는 컨테이너 -배열의 길이 제한 극복 -요소의 개수가 넘치면 자동으로 길이 조정 요소의 객체들의 삽입, 삭제 검색하는 컨테이너 -삽입 삭제에 따라 자동으로 요소의 위치조정 Vector에 삽입 가능한것 -객체,null -기본 타입의 값은 Wrapper 객체로 만들어 저장 Vecotr에 객체 삽입 - 백터의 맨 뒤, 중간에 객체 삽입 가능 Vector에 객체 삭제 - 임의의 위치에 있는 객체 삭제 가능 ArrayList
가변크기 배열을 구현한 클래스 . 에 요소로 사용할 특정 타입으로 구체화
벡터와 거의 동일
Iterator인터페이스 -리스트 구조의 컬렉션에서 요소의 순차 검색을 위한 인터페이스

Iterator 객체 얻어내기 -컬렉션의 iterator() 메소드 호출 -컬렉션 검색 코드

HashMap <K,V> 키와 값의 쌍으로 구성되는 요소를 다루는 컬렉션

K:키로 사용한 요소의 타입
V:값으로 사용할 요소의 타입
키와 값이 한 쌍으로 삽입
'값'을 검색하기 위해서는 반드시 '키'이용 삽입 및 검색이 빠른 특징
요소 삽입:put()메소드
요소 검색 get()메소드
GUI 응용프로그램 GUI : 사용자가 편리하게 입출력 할 수 있도록 그래픽으로 화면을 구성하고 마우스나 키보드로 입력 받을 수 있도록 지원하는 사용자 인터페이스 자바 언어에서 GUI 응용프로그램 작성

AWT와 Swing 패키지 -AWT 패키지 -자바가 처음 나왔을 때부터 배포된 GUI패키지, 최근에는 거의 사용하지 않음 -AWT 컴포넌트는 중량 컴포넌트 -Swing 패키지

AWT 기술을 기반으로 작성된 자바 라이브러리
모든 AWT 기능 + 추가된 풍부하고 화려한 고급 컴포넌트
AWT 컴포넌트를 모두 스윙으로 재작성 AWT 컴포넌트 이름 앞에 J자를 덧붙임
순수 자바 언어로 구현
스윙 컴포넌트는 경량 컴포넌트
현재 자바의 GUI로 사용됨
컨테이너

다른 컴포넌트를 포함할 수 있는 GUI컴포넌트
다른 컨테이너를 포할될 수 있음 -AWT컨테이너 -Swing컨테이너 컴포넌트
컨테이너에 포함되어야 화면에 출력될 수 있는 GUI 객체
다른 컴포넌트를 포함할 수 없는 순수 컴포넌트
모든 GUI 컴포넌트가 상속받는 클래스 : java.awt.Component
스윙 컴포넌트가 상속받는 클래스 : javax.swingJComponent 최상위 컨테이너
다른 컨테이너에 포함되지 않고도 화면에 출력되어 독릭접으로 전제 가능한 컨테이너. 스윙 GUI 프로그램 만들기 스윙 GUI프로그램을 만드는 과정
스윙프레임 만들기
main() 메소드 작성
스윙 프레임에 스윙 컴포넌트 붙이기 스윙 프레임 : 모든 스윙 컴포넌트를 담는 최상위 컨테이너
JFrame을 상속받아 구현
컴포넌트를 화면에 보이려면 스윙 프레임에 부착 되어야함.
## 5월 17일 강의