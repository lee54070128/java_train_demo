package llq.mapper;

import llq.model.Company;

/**
 * Created by lilianqiang on 2017/10/27.
 */
public interface CompanyMapper {
    //根据公司id获取公司信息
    public Company getCompanyInfoById(Integer cid);

    //根据公司名字获取公司信息
    public Company getCompanyInfoByName(String com_name);
}
