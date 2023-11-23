package homework2;

public class girlFriend {
    private String name;
    private int high;
    private double weight;
    public girlFriend(){

    }

    public void girlFriend(String name,int high,double weigth){
        this.name = name;
        this.high = high;
        this.weight = weigth;
    }

    public void setname(String name){
        this.name = name;
    }

    public String getname(){
        return name;
    }

    public void sethigh(int high){
        this.high = high;
    }

    public int gethigh(){
        return high;
    }

    public void setweight(double weight){
        this.weight = weight;
    }

    public double getweight(){
        return weight;
    }

    public void wash(){
        System.out.println("女朋友帮我洗衣服");
    }

    public void cook(){
        System.out.println("女朋友给我做饭");
    }

    public void show(String name,int high,double weight){
        System.out.println("我女朋友叫"+name+",身高"+high+"厘米，体重"+weight+"斤");
    }
}








