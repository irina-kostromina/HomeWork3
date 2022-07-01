package lesson5;

public class Main {
    public static void main(String[] args) {
        Employee[] empCorp = new Employee[5];
        empCorp[0] = new Employee("Ivanov Ivan I.", "Manager", "ivivan@mail.com", "89231111111",60000,37);
        empCorp[1] = new Employee("Petrov Sergey N.", "Marketer", "petrov@mail.com", "89232222222",45000,29);
        empCorp[2] = new Employee("Kozlov Alexey I.", "PR manager", "kozlov@mail.com", "89233333333",50000,41);
        empCorp[3] = new Employee("Sidorov Ilya M.", "Accountant", "sidorov@mail.com", "89234444444",40000,23);
        empCorp[4] = new Employee("Smirnov Stepan S.", "Lawyer", "smirnov@mail.com", "89235555555",70000,39);
        for (Employee employee : empCorp) {
            if (employee.getAge() > 40)
                employee.info();
            }
        }

}

