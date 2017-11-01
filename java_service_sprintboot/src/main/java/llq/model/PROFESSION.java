package llq.model;

/**
 * Created by lilianqiang on 2017/10/27.
 */
public enum PROFESSION {
    PD(0,"PD","产品开发工程师"),
    RD(1,"RD","产品经理"),
    UI(2,"UI","界面交互设计师"),
    QA(3,"QA","测试工程师"),
    PM(4,"PM","项目经理"),
    OTH(5,"OTH","其他");

    private int id;
    //职位简称
    private String profession;
    //职位描述
    private String desc;

    PROFESSION(int id,String profession,String desc){
        this.id = id;
        this.profession = profession;
        this.desc = desc;
    }

    public int getId() {
        return id;
    }

    public String getProfession() {
        return profession;
    }

    public String getDesc() {
        return desc;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
