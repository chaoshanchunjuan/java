package xi;

public class Dog extends Animal{
    @Override
    public void eat(String something){
        System.out.println(getAge() + "岁的" + getColor() +"颜色的狗的两个前腿死死的抱住" + something + "猛吃");
    }

    public void lookHome(){
        System.out.println("lookHome");
    }
}
