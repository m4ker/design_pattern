package structure.facade.modules;

import structure.facade.Company;

// 工商注册
public class AdminOfIndustry {

    public Company register(String name) {
        Company company = new Company();
        company.setName(name);
        return company;
    }
}
