package homework3;

public class manager {
    private String name;
    private int id;
    private int salary;
    private int bonus;

    public manager(){

    }

    public void manager(String name,int id,int salary,int bonus){
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.bonus = bonus;
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
    public void setbonus(int bonus){
        this.bonus = bonus;
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
    public int getbonus(){
        return bonus;
    }
    public void work(){

    }
}
