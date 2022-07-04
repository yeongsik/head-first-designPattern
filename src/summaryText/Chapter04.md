# Chapter04 객체지향 빵굽기 - 팩토리 패턴

- new 연산자가 눈에 띈다면 `구상`이라는 용어를 떠올리자
    - new을 사용하면 구상 클래스의 인스턴스가 만들어진다. 인터페이스가 아닌 특정 구현을 사용하는 것

    ```java
    Duck duck = new MallardDuck();
    
    그럼에도 구상 클래스의 인스턴스를 만들어야 한다. 
    인터페이스를 써서 코드를 유연하게 만든다.
    ```

  일련의 구상 클래스가 있다면 다음과 같은 코드를 만들어야 한다.

  ```java
    Duck duck;
    if( picnic) {
    duck = new MallardDuck();
    } else if ( hunting ) {
    duck = new DecoyDuck();
    } else if ( inBathTub ) {
    duck = new RubberDuck();
    }
    
    오리를 나타내는 클래스는 여러가지지만 ,
    컴파일 하기전엔 어떤 인스턴스가 생성되는지 알 수 없다. 
    ```

### `간단한 팩토리`의 정의

Simple Factory 는 디자인 패턴이라기보다 프로그래밍에서 자주 쓰이는 `관용구`에 가깝다.

정확하게 패턴이라고 볼순 없다.

간단한 팩토리는 워밍업이라고 생각하자 , 진짜 팩토리 패턴은 따로 있다.