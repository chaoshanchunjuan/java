package homework4;

public class dog {
    private String color;
    private String breed;

    public dog() {
    }

    public dog(String color, String breed) {
        this.color = color;
        this.breed = breed;
    }

    /**
     * 获取
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * 设置
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * 获取
     * @return breed
     */
    public String getBreed() {
        return breed;
    }

    /**
     * 设置
     * @param breed
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public void eat(){
        System.out.println(color+"的"+breed+"在咪西");
    }

    public void lookHome(){
        System.out.println(color+"的"+breed+"在看门");
    }
}
