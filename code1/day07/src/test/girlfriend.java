package test;

public class girlfriend {

//        private int age;
//        private String name;
//
//        public void setage(int a){
//            if(a > 0){
//               age = a;
//            }
//        }
//        public int getage(){
//            return age;
//        }
//
//        public void setname(String n){
//            name = n;
//        }
//
//        public String getname(){
//            return name;
//        }
//
//        public void eat(){
//            System.out.println("正在咪西");
//        }
//        public void playgame(){
//            System.out.println("正在娱乐");
//
//    }

    private int age;
    private String gender;

    public void age(int age){
        this.age = age;
    }

    public void setage(int age){
        if(age > 0){
            this.age = age;
        }
    }

    public int getage(){
        return age;
    }

    public void gender(String gender){
        this.gender = gender;
    }


    public void setgender(String gender){
        this.gender = gender;
    }

    public String getgender(){
        return gender;
    }


}
