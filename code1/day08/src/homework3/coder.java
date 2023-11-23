package homework3;

public class coder {
    private String name;
    private int id;
    private int salary;
    public coder(){

    }

    public void manager(String name,int id,int salary,int bonus){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void setname(String name){
        this.name = name;
    }
    public void setid(int id){
        this.id = id;
    }
    public void setsalary(int salary){
        this.salary = salary;
    }

    public  String getname(){
        return name;
    }
    public int getid(){
        return id;
    }
    public int getsalary(){
        return salary;
    }

}
