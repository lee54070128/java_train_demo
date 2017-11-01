package model;

import iface.IITWorker;

/**
 * Created by lilianqiang on 2017/10/24.
 */

public class ITWorker extends People implements IITWorker{
    private String company;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }


    public void working(){
        String name = getName();
        System.out.println(name + " 正在努力工作！");
    }

    public void gotoCompany(){
        String name = getName();
        System.out.println(name + " 在去公司的路上！");
    }

    @Override
    public void showName() {
        //相应的实现
        String name = getName();
        System.out.println("他名字是："+name);
    }
}
