public class Intern extends Employee{
    public Intern(String name, String email, int age, double salary) {
        super(name, email, age, salary);
        if (salary > 2000){
            salary = 2000;
        }
    }

    @Override
    public void setSalary(double salary) {
        super.setSalary(salary);
        if (salary > 2000){
            salary = 2000;
        }
    }

}
