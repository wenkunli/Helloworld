package july12;



public class Bankmain {
    public static void main(String[] args) {
        Employee jhon = new Employee(1,"jhon",100);
        Account bomAccount = new Account(1,200,jhon);

        Bank bom = new Bank();
        bom.addAccount(bomAccount);
        bom.addemployee(jhon);

        System.out.println(bom.getAccounts());
        System.out.println(bom.getEmployees().get(0).getPersonName());

    }

}
