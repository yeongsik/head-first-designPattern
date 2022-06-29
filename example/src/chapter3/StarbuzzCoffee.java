package chapter3;

public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        beverage.setSize(Beverage.Size.GRANDE);
        System.out.println(beverage.getDescription()
            + " $ " + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2.setSize(Beverage.Size.VENTI);
        beverage2 = new Moka(beverage2);
        beverage2 = new Moka(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription()
            + " $ " + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Moka(beverage3);
        beverage3 = new Whip(beverage3);

        System.out.println(beverage3.getDescription()
                + " $ " + beverage3.cost());
    }
    /*
    나중에 팩토리와 빌더 패턴을 배울 때 이런 객체를 만드는 더 나은 방법을 알아보자
     */
}
