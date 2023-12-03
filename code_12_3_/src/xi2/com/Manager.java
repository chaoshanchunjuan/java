package xi2.com;

public class Manager extends People{
    String managersalary;

    public Manager() {
    }

    public Manager(String managersalary) {
        this.managersalary = managersalary;
    }

    @Override
    public void work(){
        System.out.println("manager work");
    }

    /**
     * 获取
     * @return managersalary
     */
    public String getManagersalary() {
        return managersalary;
    }

    /**
     * 设置
     * @param managersalary
     */
    public void setManagersalary(String managersalary) {
        this.managersalary = managersalary;
    }


}
