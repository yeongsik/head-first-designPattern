package chapter3;

public class Espresso extends Beverage{

    public Espresso(){
        description = "에스프레소"; // 생성자에서 description 변수값을 설정
    }
    @Override
    public double cost() {
        return 1.99; // 에스프레소 가격 계산 , 첨가물 가격을 걱정 할 필요 없이 기본 가격을 리턴으로 설정
    }
}
