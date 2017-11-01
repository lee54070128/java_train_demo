package llq.service;

import llq.mapper.CompanyMapper;
import llq.mapper.UserMapper;
import llq.model.Company;
import llq.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zl on 2015/8/27.
 */

@Service
public class CompanyService {

    @Autowired
    private CompanyMapper companyMapper;

    public Company getCompanyInfoById(Integer cid)throws Exception{
        Company company=companyMapper.getCompanyInfoById(cid);
        return company;
    }

    public Company getCompanyInfoByName(String com_name)throws Exception{
        Company company=companyMapper.getCompanyInfoByName(com_name);
        return company;
    }
}
