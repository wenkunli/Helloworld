package july12;

import july10.Workable;

public class Employee extends Person implements Workable {
    private int id;
    private int wage;

    public Employee(int id, String name, int wage) {
        super(name);
        this.id = id;
        this.wage = wage;
    }

    public int getId() {
        return id;
    }
    public String getPersonName(){
        return super.getName();
    }
    @Override

    public int work(int number) {
        return wage + number;
    }
}
