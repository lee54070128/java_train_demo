package llq.model;

import com.alibaba.fastjson.JSONObject;

/**
 * Created by zl on 2015/8/27.
 */
public class User {
    private Integer id;
    private String uid;
    private String name;
    private Integer age;
    private Company company;
    private PROFESSION profession;

    public Integer getId() {
        return id;
    }

    public String getUid() {
        return uid;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Company getCompany() {
        return company;
    }

    public PROFESSION getProfession() {
        return profession;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setProfession(PROFESSION profession) {
        this.profession = profession;
    }

    public JSONObject toJson(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id",id);
        jsonObject.put("uid",uid);
        jsonObject.put("name",name);
        jsonObject.put("age",age);
        jsonObject.put("profession",profession.getProfession());
        if(company == null){
            jsonObject.put("company",null);
        }else {
            jsonObject.put("company",company.toJson());
        }
        return jsonObject;
    }
}
