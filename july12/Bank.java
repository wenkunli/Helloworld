package july12;


import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Employee> employees;
    private List<Account> accounts;

    public Bank() {
        this.employees =  new ArrayList<>();
        this.accounts = new ArrayList<>();
    }

    public void addemployee(Employee employee){
        this.employees.add(employee);
    }
    public void deleteemployee(int id){
        for(Employee e : employees){
        if(e.getId() == id){
            employees.remove(e);
        }
        }
    }
    public void addAccount(Account account){
        this.accounts.add(account);
    }
    public void deleteAccount(int accountNumber){
        for(Account a : accounts){
            if(a.getNumber() == accountNumber){
                accounts.remove(a);
            }
        }
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public List<Account> getAccounts() {
        return accounts;
    }
}
