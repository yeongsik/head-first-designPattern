# Chapter 01 디자인 패턴 소개와 전략 패턴

### 디자인 원칙

1. 애플리케이션에서 달라지는 부분을 찾아내고 ,달라지지 않는 부분과 분리
2. 구현보다는 인터페이스에 맞춰서 프로그래밍한다.
3. 상속보다는 구성을 활용

인터페이스에 맞춰서 프로그래밍한다 → 상위 형식에 맞춰서 프로그래밍을 한다라는 말

- 실제 실행 시 쓰이는 객체가 코드에 고정되지 않도록 상위 형식에 맞춰서 프로그래밍을 하여 다형성을 활용해야 한다.
- 변수를 선언할 때 , 추상 클래스나 인터페이스 상위 형식으로 선언해야한다. → 구체적으로 구현한 형식이 언제든지 상위형식에 넣을 수 있기 때문

### 클래스 사이의 관계

- A는 B이다
- A에는 B가 있다.
- A가 B를 구현하는 관계

### 전략 패턴

하나의 객체에서 행동이 상황에 맞게 유연하고 동적으로 변경가능하도록

하나의 클래스와 해당 클래스의 메서드가 아닌 변경가능한 행동들을 추상화한 인터페이스를 property로 설정

- 책에서 나온 예제 문제

    ```
    액션 어드벤쳐 게임에서 사용할 클래스와 인터페이스 정리 
    설명 : 게임 캐릭터용 클래스 , 캐릭터가 사용할 무기의 행동 클래스
    		   캐릭터가 사용하는 무기의 인터페이스를 정리해보자
    
    캐릭터 클래스
    속성 : WeaponBehavior weapon
    행동 : fight() 
    
    캐릭터 클래스를 상속해서 여러가지 캐릭터들을 생성할 수 있다.
    각 캐릭터마다 가지고 있는 무기 행동이 다르고 , 중간에 동적으로 무기를 바꿀 수 있게 구현
    
    Interface 인 WeaponBehavior 를 여러개의 구현체를 만들고 
    캐릭터 Class에 setWeapon 이라는 메서드를 생성해 
    객체가 중간에 무기를 변경할 수 있도록 하자 
    ```


## 디자인 패턴 만나기

하나의 메뉴를 일일히 설명하면서 주문하기 vs 메뉴 이름으로 주문 ( 메뉴 이름으로 주문하는 것이 주방장이 더 편하다 )

객체수준에서의 생각 vs 패턴 수준의 생각

⇒ 디자인 패턴은 개발자 사이에서 서로 모두 이애할 수 있는 용어를 제공 , 용어를 이해하면 다른 개발자와 더 쉽게 대화할 수 있고 , 패턴 수준에서의 생각은 아키텍처를 생각하는 수준도 끌어 올릴 수 있다.

### 패턴과 전문 용어

1. 서로 알고 있는 패턴은 막강하다 .

   ⇒ 패턴으로 소통하면 안에 담겨 있는 내용 등을 함께 이야기 할 수 있다.

2. 패턴을 사용하면 간단한 단어로 많은 이야기를 할 수 있다.

   ⇒ 패턴을 사용하면 다른 개발자가 좀 더 빠르게 정확하게 파악 가능

3. 패턴 수준에서 이야기하면 `디자인`에 더 오랫동안 집중

   ⇒ 소프트웨어 시스템을 이야기 할 때 객체와 클래스 구현이 아닌 디자인 수준에서 `초점`을 맞출 수 있다.

4. 전문 용어를 사용하면 개발팀의 능력 `극대화`

   ⇒ 모두 패턴에 대해 알고 있으면 소통에 오해의 소지가 줄어서 빠른 작업 가능

5. 전문 용어는 신입 개발자에게 훌륭한 `자극제`

### 디자인 패턴 사용법

자바의 방대한 라이브러리와 프레임워크는 더 이해하기 쉽고, 관리하기 쉬운 유연한 애플리케이션의 구조를 만드는데 도움을 주지 못한다. 이 부분에 도움을 주는 것은 디자인 패턴

디자인 패턴은 코드에서부터 시작하는 것이 아니다. 개발자의 머릿 속에서 부터 시작

패턴을 완전히 익혀두면 어떤 코드가 유연성이 없는 스파게티 코드인지 빠르게 파악할 수 있다.

그 스파게티 코드를 수정할 때 패턴을 적용해서 개선할 능력이 생김

- 디자인 패턴은 라이브러리보다 높은 단계에 속한다. 디자인 패턴은 클래스와 객체를 구성해서 어떤 문제를 해결하는 방법을 제공 , 특정 애플리케이션에 맞는 디자인을 찾아서 사용하는 것은 개발자의 몫

- 라이브러리나 프레임워크는 디자인패턴이 아님

### 전략패턴

- 알고리즘 군을 정의하고 , 캡슐화해서 각각의 알고리즘군을 수정해서 쓸 수 있게 해준다.
- 전략 패턴을 사용하면 클라이언트로부터 알고리즘을 분리해서 독립적으로 변경 가능



### 핵심정리

### 참고 링크

[전략패턴](https://victorydntmd.tistory.com/292)