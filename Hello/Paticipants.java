public class Paticipants {
    private int photoid;
    private char sex;
    private int job;
    private int salary;

    public Paticipants(int photoid, char sex, int job, int salary) {
        this.photoid = photoid;
        this.sex = sex;
        this.job = job;
        this.salary = salary;
    }

    public int getPhotoid() {
        return photoid;
    }

    public void setPhotoid(int photoid) {
        this.photoid = photoid;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getJob() {
        return job;
    }

    public void setJob(int job) {
        this.job = job;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
