package chapter4;

/*
피자가게 프레임워크 만들기
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza;
//        pizza = factory.createPizza(type);
        pizza = createPizza(type);
        // new 연산자 대신 팩토리 객체에 있는 create 메소드 사용 , 구상 클래스의 인스턴스를 만들지 않아도 된다.
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;

    }

    abstract Pizza createPizza(String type);
    // 팩토리 메서드가 추상 메서드로 변경


    // 기타 메소드
}
