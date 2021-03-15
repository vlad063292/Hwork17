public class Employee extends User {
    private double Salary;
    private Double WorkExperience;

    Employee(Double Salary, Double WorkExperience, String FirstName, String LastName, String PhoneNumber, String MobilePhoneNumber, String Email, String Password) throws Exception {
        super(FirstName, LastName, PhoneNumber, MobilePhoneNumber, Email, Password);
        this.Salary = Salary;
        this.WorkExperience = WorkExperience;
    }

    Employee(Double Salary, Double WorkExperience, String Email, String Password) throws Exception {
        super(Email, Password);
        this.Salary = Salary;
        this.WorkExperience = WorkExperience;
    }

    public Double GetSalary() {
        return this.Salary;
    }

    public Double GetWorkExperience() {
        return this.WorkExperience;
    }

    public void RaiseSalary() {
        if (this.WorkExperience <= 2.0D) {
            this.Salary += this.Salary * 0.05D;
        } else if (this.WorkExperience > 2.0D && this.WorkExperience < 5.0D) {
            this.Salary += this.Salary * 0.1D;
        } else {
            this.Salary += this.Salary * 0.15D;
        }

    }
}