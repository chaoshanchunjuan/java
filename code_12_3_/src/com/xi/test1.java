package com.xi;

public class test1 {
    public static void main(String[] args) {
        Teacher t = new Teacher("老师","张三");
        System.out.print(t.getId() + "\t" + t.getName() + "\t");
        t.work();

        Adminstaff as = new Adminstaff("管理人员","李四");
        System.out.print(as.getId() + "\t" + as.getName() + "\t");
        as.work();

        Lecture l = new Lecture("讲师","王五");
        System.out.print(l.getId() + "\t"  + l.getName() + "\t");
        l.work();

        Tutor tu = new Tutor("助教","老六");
        System.out.print(tu.getId() + "\t" + tu.getName() + "\t");
        tu.work();

        Maintainer m = new Maintainer("维护专员","老七");
        System.out.print(m.getId() + "\t" + m.getName() + "\t");
        m.work();

        Buyer b = new Buyer("购买人员","老八");
        System.out.print(b.getId() + "\t" + b.getName() + "\t");
        b.work();
    }
}
