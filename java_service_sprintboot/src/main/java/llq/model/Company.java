package llq.model;

/**
 * Created by lilianqiang on 2017/10/27.
 */
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class Company {
    private Integer cid;
    private String com_name;
    private String com_addr;
    private String com_tel;

    public Integer getCid() {
        return cid;
    }

    public String getCom_name() {
        return com_name;
    }

    public String getCom_addr() {
        return com_addr;
    }

    public String getCom_tel() {
        return com_tel;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public void setCom_name(String com_name) {
        this.com_name = com_name;
    }

    public void setCom_addr(String com_addr) {
        this.com_addr = com_addr;
    }

    public void setCom_tel(String com_tel) {
        this.com_tel = com_tel;
    }

    public JSONObject toJson(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("cid",cid);
        jsonObject.put("com_name",com_name);
        jsonObject.put("com_addr",com_addr);
        jsonObject.put("com_tel",com_tel);
        return jsonObject;
    }
}
