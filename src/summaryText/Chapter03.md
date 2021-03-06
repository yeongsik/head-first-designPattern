git conf# Chapter03 객체꾸미기 데코레이션 패턴

- 예시

  초대형 커피 프렌차이즈 , 엄청 많은 매장을 가지고 있다.

  → 빠르게 성장하다보니 , 다양한 음료를 포괄주문하는 시스템을 갖추고 있지 못하는 상황

  → 주문 시스템 개선을 하려고 하는 상황


- 주문 시스템 클래스 구성
    - Beverage ( 추상 클래스 ) 하나와 여러 음료 ( 서브 클래스 ) 들로 구성되어있다.
        - cost() 추상 메서드
    - 고객은 주문할 때 추가적인 사항을 요구할 때가 있다. 주문 시스템은 이러한 상황을 고려해야 한다.

  ⇒ 처음에는 하나의 추상클래스에 무수히 많은 서브클래스로 구현하는 방법으로 만들었다.

  ⇒ `클래스 폭발`

  ❓ 이러한 형태가 지키지 않고 있는 디자인 패턴의 원칙은 무엇인가?


### OCP (Open - Closed - Principle )

- 중요한 디자인 원칙

> 클래스는 확장에는 열려 있어야 하지만 변경에는 닫혀 있어야 한다.
>

- 목표 : 기존 코드를 건드리지 않고 , 확장으로 새로운 행동을 추가하는 것
    - 새로운 기능을 추가 할 때 급변하는 환경에 적응하는 유연한 디자인을 만들 수 있다.

### 데코레이터 패턴

> 객체에 추가 요소를 동적으로 더할 수 있다. 데코레이터를 사용하면 서브 클래스를 만들 때 보다 유연하게 기능 확장이 가능
>

- 테코레이터의 슈퍼클래스는 자신이 장식하고 있는 객체의 슈퍼클래스와 같다.
- 한 객체를 여러 개의 데코레이터를 감쌀 수 있다.
- 데코레이터는 자신이 감싸고 있는 객체와 같은 슈퍼클래스를 가지고 있기에 원래 객체 ( 싸여 있는 ) 가 들어갈 자리에 데코레이터 객체를 넣어도 상관 없다.
- 데코레이터는 자신이 장식하고 있는 객체에게 어떤 행동을 위임하는 일 말고도 추가 작업을 수행 가능
- 객체는 언제든지 감쌀 수 있으므로 실행 중에 필요한 데코레이터를 마음대로 적용 할 수 있다.

### 데코레이터가 적용된 예 : 자바 I/O

  java.io 패키지는 데코레이터 패턴을 바탕으로 만들어졌다.
  
파일에서 데이터를 읽어오는 스트림에 기능을 더하는 데코레이터 객체

  FileInputStream > BufferedInputStream > ZipInputStream

  데코레이터 패턴을 사용하면 잡다한 클래스가 너무 많아지는데 , java.io를 보면 알 수 있다. → 데코레이터 패턴의 단점

### 객체지향 원칙

- 바뀌는 부분은 캡슐화
- 상속보다는 구성을 활용
- 구현보다는 인터페이스에 맞춰서 프로그래밍
- 상호작용하는 객체 사이에서는 가능하면 느슨한 결합을 사용해야 한다.
- 클래스는 확장에는 열려 있어야 하지만 변경에는 닫혀 있어야 한다. ( OCP )

### 데코레이터 패턴

- 객체에 추가 요소를 동적으로 더 할 수 있다. 데코레이터를 사용하면 서브클래스를 만들 때보다 훨씬 유연하게 기능을 확장 할 수 있다.

### 핵심 정리

- 디자인의 유연성 면에서 보면 상속으로 확장하는 일을 별로 좋은 선택이 아니다.
- 기존 코드 수정 없이 행동을 확장해야 하는 상황이 있다.
- 구성과 위임으로 실행 중에 새로운 행동을 추가 할 수 있다.
- 상속 대신 데코레이터 패턴으로 행동을 확장할 수 있다.
- 데코레이터 패턴은 구상 구성 요소를 감싸주는 데코레이터를 사용
- 데코레이터 클래스의 형식은 그 클래스를 감싸는 클래스 형식을 반영
- 데코레이터는 자기가 감싸고 있는 구성 요소의 메소드를 호출한 결과에 새로운 기능을 더함으로써 행동을 확장
- 구성 요소를 감싸는 데코레이터의 개수는 제한 없다.
- 구성 요소의 클라이언트는 데코레이터의 존재를 알 수 없다. 클라이언트가 구성요소의 구체적인 형식에 의존하는 경우에는 예외
- 데코레이터 패턴을 사용하면 자잘한 객체가 많이 추가된다. 데코레이터를 너무 많이 사용하면 코드가 필요 이상으로 복잡해진다.