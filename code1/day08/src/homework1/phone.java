package homework1;

public class phone {
    //定义手机类，手机有品牌(brand),价格(price)和颜色(color)三个属性，有打电话call()和sendMessage()两个功能。
    //
    //请定义出手机类，类中要有空参、有参构造方法，set/get方法。
    //
    //定义测试类，在主方法中使用空参构造创建对象，使用set方法赋值。
    //
    //调用对象的两个功能，打印效果如下：
    //
    //```
    //正在使用价格为3998元黑色的小米手机打电话....
    //正在使用价格为3998元黑色的小米手机发短信....
    //```
    private String brand;
    private int price;
    private String color;

    public  phone(){

    }

    public void phone(String brand,int price,String color){
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    public void setbrand(String brand){
        this.brand = brand;
    }

    public String getbrand(){
        return brand;
    }

    public void setprice(int price){
        this.price = price;
    }

    public int getprice(){
        return price;
    }

    public void setcolor(String color){
        this.color = color;
    }

    public String getcolor(){
        return color;
    }
}
