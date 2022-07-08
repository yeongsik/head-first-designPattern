package chapter4;

public class MainExample {

    public static void main(String[] args) {

        NYPizzaFactory nyPizzaFactory = new NYPizzaFactory();
//        PizzaStore nyStore = new PizzaStore(nyPizzaFactory);
//        nyStore.orderPizza("Veggie");

        ChicagoPizzaFactory chicagoPizzaFactory = new ChicagoPizzaFactory();
//        PizzaStore chicagoStore = new PizzaStore(chicagoPizzaFactory);
//        chicagoStore.orderPizza("Veggie");

        /**
         * SimplePizzaFactory를 인터페이스로 지정 후 각 지점 팩토리에 특유의 피자 제조 방법을 설정 후
         * 다양한 팩토리를 쓸 수 있다.
         */
    }
}
