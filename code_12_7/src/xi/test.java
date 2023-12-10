package xi;

public class test {
    public static void main(String[] args){
        Person p = new Person();
        Dog d = new Dog();
        d.setAge(2);
        d.setColor("黑");
        Cat c = new Cat();
        c.setAge(3);
        c.setColor("灰");
        p.keepPet(d,"si");
        p.keepPet(c,"fish");
        d.lookHome();
        c.catchMouse();
    }
}
