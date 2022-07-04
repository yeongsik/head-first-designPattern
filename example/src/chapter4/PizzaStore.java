package chapter4;

public class PizzaStore {
    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = factory.createPizza(type);
        // new 연산자 대신 팩토리 객체에 있는 create 메소드 사용 , 구상 클래스의 인스턴스를 만들지 않아도 된다.
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;

    }

    // 기타 메소드
}
