package xi;

import java.sql.SQLOutput;

public class Cat extends Animal{
    @Override
    public void eat(String something){
        System.out.println(getAge() + "岁的" + getColor() +"颜色的喵喵眯着眼睛侧着头吃" + something);
    }

    public void catchMouse(){
        System.out.println("catchmouse");
    }
}
