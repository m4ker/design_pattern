package structure.facade;

import structure.facade.modules.AdminOfIndustry;
import structure.facade.modules.Bank;
import structure.facade.modules.Taxation;

public class Client {

    public static void main(String[] args) {

        Facade facade = new Facade(new AdminOfIndustry(), new Bank(), new Taxation());
        Company company = facade.openCompany("吉兴牧业");
    }
}
