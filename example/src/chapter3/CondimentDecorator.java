package chapter3;

public abstract class CondimentDecorator extends Beverage{
    Beverage beverage; // 각 데코레이터가 감쌀 음료를 나타내는 Beverage 객체를 여기서 지정
    // 음료를 지정할 때 데코레이터에서 어떤 음료든 감쌀 수 있도록 Beverage 슈퍼클래스 유형을 사용

    public abstract String getDescription();
    // ㅁ도느 첨가물 데코레이터에 getDescription() 메소드를 새로 구현하도록 만들 계획 , 그래서 추상 메서드로 선언
}
