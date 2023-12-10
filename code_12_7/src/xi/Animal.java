package xi;

public class Animal {
    private int Age;
    private String Color;

    public Animal() {
    }

    public Animal(int Age, String Color) {
        this.Age = Age;
        this.Color = Color;
    }

    /**
     * 获取
     * @return Age
     */
    public int getAge() {
        return Age;
    }

    /**
     * 设置
     * @param Age
     */
    public void setAge(int Age) {
        this.Age = Age;
    }

    /**
     * 获取
     * @return Color
     */
    public String getColor() {
        return Color;
    }

    /**
     * 设置
     * @param Color
     */
    public void setColor(String Color) {
        this.Color = Color;
    }
//    public Animal(){}
//    public Animal(int Age,String Color){
//        this.Age = Age;
//        this.Color = Color;
//    }
//
//    public void setAge(int Age){
//        this.Age = Age;
//    }
//
//    public int getAge(){
//        return Age;
//    }
//
//    public void setColor(String Color){
//        this.Color = Color;
//    }
//
//    public String getColor(){
//        return Color;
//    }
    public void eat(String something){
        System.out.println();
    }



}
