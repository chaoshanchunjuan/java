package com.xi;

import javax.xml.transform.Source;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //登录操作
        ArrayList<User> list_user = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        do {
            for(int i =0;i < list_user.size();i++){
                User u = list_user.get(i);
                System.out.println(u.getIdcard() + " " + u.getUsername() + " " + u.getPhonenumber() + " " + u.getPassword());
            }
            System.out.println("欢迎来到学生管理系统");
            System.out.println("请选择操作1登录 2注册 3忘记密码");
            //Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            //ArrayList<User> list_user = new ArrayList<>();
            User u = new User();
            switch (choice) {
                case 1:
                    boolean result_signin = sign_in(list_user);
                    if(!result_signin){
                        System.out.println("用户名未注册，请先注册");
                    }
                    break;
                case 2:
                    sign_up(list_user,u);
                    list_user.add(u);
                    break;
                case 3:
                    boolean result_forget = forget(list_user);
                    if(!result_forget){
                        System.out.println("未注册");
                    }
                    break;
            }
        }while (true) ;
    }

    //登录
    public static boolean sign_in(ArrayList<User> list_user){
        //用户名如果未注册，直接结束方法，并提示：用户名未注册，请先注册
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = sc.next();
       // System.out.println(list_user.size());
        //System.out.println(list_user.get(0));
        for(int i = 0;i < list_user.size();i++){
            User temp = list_user.get(i);
            if(username.equals(temp.getUsername())){
                //说明已经注册过
                //输入验证码判断验证码
                boolean result_authcode;
                do{
                    System.out.println("请输入验证码");
                    String authcode = sc.next();
                    result_authcode = judge_authcode(authcode);
                }while(!result_authcode);
                //输入密码
                int count_authcode = 0;
                do{
                    System.out.println("请输入密码");
                    String password = sc.next();
                    boolean result_password = password.equals(temp.getPassword());
                    if(result_password){
                        //转入登录界面
                        Student_management_System();
                    }else{
                        System.out.println("还剩下" + (3-i) + "次机会");
                        count_authcode++;
                    }
                }while(count_authcode<3);
                System.out.println("请重新登录");
                return false;
            }
        }
        //System.out.println("aaa");
        return false;
    }

    //注册
    public static void sign_up(ArrayList<User> list_user,User u){
        //用户名
        //User u = new User();
        Scanner sc= new Scanner(System.in);
        String username;
        boolean result = true;
        do {
            System.out.println("请输入用户名");
            username = sc.next();
            //判断名字是否符合
            result = judge_name(username, list_user);
            //System.out.println(result);
        }while(!result);
        u.setUsername(username);

        boolean result2 = true;
        //密码
        String password_first;
       do {
        System.out.println("请输入密码");
        password_first = sc.next();
        System.out.println("请再次输入密码");
        String password_second = sc.next();
        result2 = password_first.equals(password_second);
       }while(!result2);
       u.setPassword(password_first);

       //身份证验证
        boolean result_idcard;
        String idcard;
        do{
            System.out.println("请输入身份证号码");
            idcard = sc.next();
            result_idcard = judge_idcard(idcard);
        }while(!result_idcard);
        u.setIdcard(idcard);

        //手机号
        boolean result_phone;
        String phone;
        do{
            System.out.println("请输入手机号");
            phone = sc.next();
            //判断是否合格
            result_phone = judge_phone(phone);
        }while(!result_phone);
        u.setPhonenumber(phone);
    }


    //忘记密码
    public static boolean forget(ArrayList<User> list_user){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = sc.next();
        for(int i = 0;i < list_user.size();i++){
            User temp = list_user.get(i);
            if(temp.getUsername().equals(username)){
                //存在
                //键盘录入身份证号码和手机号码
                System.out.println("请输入身份证号码");
                String idcard = sc.next();
                System.out.println("请输入手机号码");
                String phonenumber = sc.next();
                if(idcard.equals(temp.getIdcard()) && phonenumber.equals(temp.getPhonenumber())){
                    System.out.println("请输入想要修改的密码");
                    String password_change = sc.next();
                    //修改密码
                    temp.setPassword(password_change);
                }else{
                    System.out.println("账号信息不匹配，修改失败");
                    return false;
                }
            }else{
                //不存在
                return false;
            }
        }
        return true;
    }

    public static boolean judge_authcode(String authcode){
        //长度为5
        //
        //​	由4位大写或者小写字母和1位数字组成，同一个字母可重复
        //
        //​	数字可以出现在任意位置
        if(authcode.length() != 5){
            return false;
        }
        int count_word = 0;
        int count_num = 0;
        for(int i = 0;i < 5;i++){
            if(judge_word(authcode.charAt(i))){
                count_word++;
            }else if(judge_num(authcode.charAt(i))){
                count_num++;
            }else{
                return false;
            }
        }
        if(!(count_word == 4 && count_num ==1)){
            return false;
        }
        return true;
    }


    public static boolean judge_phone(String phone){
        //长度为11位
        //
        //​			不能以0为开头
        //
        //​			必须都是数字
        if(phone.length() != 11){
            System.out.println("11");
            return false;
        }
        if(phone.charAt(0) == '0'){
            System.out.println("22");
            return false;
        }
        for(int i = 0; i < 11;i++){
            if(!(phone.charAt(i) >= '0' && phone.charAt(i) <= '9')){
                System.out.println("33");
                return false;
            }
        }
        return true;
    }

    public static boolean judge_name(String username,ArrayList<User> list_user){
        //用户名唯一
        //
        //​			用户名长度必须在3~15位之间
        //
        //​			只能是字母加数字的组合，但是不能是纯数字
        //判断唯一性
        //System.out.println(list_user.size());
        for(int i =0;i < list_user.size();i++){
            User u = list_user.get(i);
            if(u.getUsername().equals(username)){
                return false;
            }
        }
        //System.out.println("weiyi");
        //判断长度
        if(username.length() < 3 || username.length() > 15){
            return false;
        }
        //System.out.println("changdu");
        //判断数字和字母
        char arr[] = username.toCharArray();
        int countword = 0;
        for(int i=0;i < username.length();i++){//判断是不是字母数字
            //判断是不是字母
            boolean result_word = judge_word(arr[i]);
            if(result_word){
                countword++;
            }
            //判断是不是数字
            boolean result_num = judge_num(arr[i]);
            if(!result_word && !result_num){
                return false;
            }
        }
        if(countword == 0){//判断不全为数字
            return false;
        }
        return true;
    }

    public static boolean judge_num(char arr){
        if(arr <= '9' && arr >= '0')
            return true;
        return false;
    }

    public static boolean judge_word(char arr){
        char arr1[] = new char[52];
        for(int i =0 ;i < 26;i++){
            arr1[i] = (char)('a' + i);
        }
        for(int i = 26;i < 52;i++){
            arr1[i] = (char)('A' + i - 26);
        }
        for(int i = 0;i < 52;i++){
            if(arr == arr1[i])
                return true;
        }
        return false;
    }

    public static boolean judge_idcard(String idcard){
        //身份证号码需要验证。
        //
        //​		验证要求：
        //
        //​			长度为18位
        //
        //​			不能以0为开头
        //
        //​			前17位，必须都是数字
        //
        //​			最为一位可以是数字，也可以是大写X或小写x
        if(idcard.length() != 18){
            //System.out.println("11");
            return false;
        }
        if(idcard.charAt(0) == '0'){
            //System.out.println("22");
            return false;
        }
        for(int i = 0;i < 17;i++){
            if(idcard.charAt(i) <= '0' && idcard.charAt(i) >= '9'){
                System.out.println("33");
                return false;
            }
        }
        if(idcard.charAt(17) != 'x' && idcard.charAt(17) != 'X' && !(idcard.charAt(17) > '0' && idcard.charAt(17) < '9')){
            //System.out.println("44");
            return false;
        }
        return true;
    }

    //登录后的界面
    public static void Student_management_System(){
        //"-------------欢迎来到黑马学生管理系统----------------"
        //"1：添加学生"
        //"2：删除学生"
        //"3：修改学生"
        //"4：查询学生"
        //"5：退出"
        //"请输入您的选择:"
        ArrayList<Student> list_Student = new ArrayList<>();
        int num;
        do{
            System.out.println("-------------欢迎来到黑马学生管理系统----------------");
            System.out.println("1：添加学生");
            System.out.println("2：删除学生");
            System.out.println("3：修改学生");
            System.out.println("4：查询学生");
            System.out.println("5：退出");
            Scanner sc = new Scanner(System.in);
            num = sc.nextInt();

            switch(num){
                case 1:{
                    Student u = new Student();
                    boolean result_addStudent = addStudent(list_Student,u);
                    break;
                }
                case 2:subStudent(list_Student);break;
                case 3:alterStudent(list_Student);break;
                case 4:searchStudent(list_Student);break;
                case 5:break;
            }
        }while(num != 5);
    }

    //添加学生
    public static boolean addStudent(ArrayList<Student> List_Student,Student u){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生id");
        String id = sc.next();
        for(int i=0;i < List_Student.size();i++){
            Student temp = List_Student.get(i);
            if(id.equals(temp.getId())){
                System.out.println("id重复");
                return false;
            }
        }
                //不重复就添加
                System.out.println("请输入名字");
                String name = sc.next();
                System.out.println("请输入年龄");
                int age = sc.nextInt();
                System.out.println("请输入地址");
                String address = sc.next();
                u.setName(name);
                u.setAge(age);
                u.setAddress(address);
                u.setId(id);
                List_Student.add(u);
        return true;
    }

    //删除学生
    public static void subStudent(ArrayList<Student> List_Student){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入想要删除学生的id");
        String id = sc.next();
        for(int i = 0;i < List_Student.size();i++) {
            Student temp = List_Student.get(i);
            if (id.equals(temp.getId())) {
                List_Student.remove(i);
            }else{
                System.out.println("id不存在");
                break;
            }
        }
    }

    //修改学生
    public static void alterStudent(ArrayList<Student> List_Student){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入想要修改学生的id");
        String id = sc.next();
        for(int i = 0;i < List_Student.size();i++) {
            Student temp = List_Student.get(i);
            if (id.equals(temp.getId())) {
                System.out.println("请输入修改后的名字");
                String name = sc.next();
                temp.setName(name);
                System.out.println("请输入修改后的年龄");
                int age = sc.nextInt();
                temp.setAge(age);
                System.out.println("请输入修改后的地址");
                String address = sc.next();
                temp.setAddress(address);
            }else{
                System.out.println("id不存在");
                break;
            }
        }

    }

    //查询学生
    public static void searchStudent(ArrayList<Student> List_Student){
        //Scanner sc = new Scanner(System.in);
        if(List_Student.size() == 0){
            System.out.println("当前无学生信息，请添加后再查询");
        }else{
            for(int i = 0;i < List_Student.size();i++){
                Student temp = List_Student.get(i);
                System.out.println(temp.getId() + "\t" + temp.getName() + "\t" + temp.getAge() + "\t" + temp.getAddress() +"\t");
            }
        }
    }














}
