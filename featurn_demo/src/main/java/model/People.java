package model;

/**
 * Created by lilianqiang on 2017/10/24.
 */

public class People {
    //其中姓名，年龄都是私有属性，外部只能通过get方法访问
    private String name;
    private int age;
    private String work;

    public void People(){
    };

    public void People(String name){
        this.name = name;
    };

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getWork() {
        return work;
    }

    //打印一个人name
    public void showName() {
        //相应的实现
        System.out.println(getName());
    }

    //打印一个人name
    public void showAge() {
        //相应的实现
        System.out.println(getAge());
    }

}
