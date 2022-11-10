package structure.facade;

import structure.facade.modules.AdminOfIndustry;
import structure.facade.modules.Bank;
import structure.facade.modules.Taxation;

// 目的是把复杂的子系统交互隐藏起来，化繁为简
public class Facade {

    public Facade(AdminOfIndustry admin, Bank bank, Taxation taxation) {
        this.admin = admin;
        this.bank = bank;
        this.taxation = taxation;
    }

    private AdminOfIndustry admin;

    private Bank bank;

    private Taxation taxation;

    public Company openCompany(String name) {
        Company company = this.admin.register(name);
        company.setBankAccount(this.bank.openAccount(company.getId()));
        company.setTaxCode(this.taxation.applyTaxCode(company.getId()));
        return company;
    }


}
