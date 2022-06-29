package chapter3;

public class Moka extends CondimentDecorator{

    public Moka(Beverage beverage) {
        this.beverage = beverage;
        /*
         Moka 인스턴스에는 Beverage 의 레퍼런스가 들어 있다.
         2가지 필요
         (1) 감싸고자 하는 음료를 저장하는 인스턴스 변수
         (2) 인스턴스 변수를 감싸고자 하는 객체로 설정하는 생성자
         */

    }

    @Override
    public double cost() {
        return beverage.cost() + .20;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 모카";
    }
}
