package lesson5;

public class Employee {
    private String FIO;
    private String position;
    private String email;
    private String phone;
    private double salary;
    private int age;

    public Employee(String fio, String pos, String em, String pho, double zp, int ag ) {
        FIO = fio;
        position = pos;
        email = em;
        phone = pho;
        salary = zp;
        age = ag;
    }

    public String getFIO() {
        return FIO;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void info(){
        System.out.println("[" + FIO + ", " + position + ", " + email + ", " + phone + ", " + salary + ", " + age + "]");
    }
}
