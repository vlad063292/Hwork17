public class Employee extends User{
    private double Salary;
    private Double WorkExperience;

    Employee(Double Salary, Double WorkExperience, String FirstName,
             String LastName, String PhoneNumber, String MobilePhoneNumber,
             String Email, String Password) throws Exception{
        super(FirstName, LastName, PhoneNumber, MobilePhoneNumber, Email, Password);

        this.Salary = Salary;
        this.WorkExperience = WorkExperience;
    }

    Employee(Double Salary, Double WorkExperience,
             String Email, String Password) throws Exception{
        super(Email, Password);

        this.Salary = Salary;
        this.WorkExperience = WorkExperience;
    }

    public Double GetSalary(){
        return Salary;
    }

    public Double GetWorkExperience(){
        return WorkExperience;
    }

    public void RaiseSalary(){
        if(WorkExperience <= 2){
            Salary = Salary + Salary * 0.05;
        }else if(WorkExperience > 2 && WorkExperience <5){
            Salary = Salary + Salary * 0.1;
        }else{
            Salary = Salary + Salary * 0.15;
        }
    }
}