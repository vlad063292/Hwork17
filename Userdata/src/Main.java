public class Main {
    public static void main(String[] args) throws Exception{
        var user = new User("vladtruba@gmail.com", "test123456");
        System.out.println(user.GetEmail());
        var employee = new Employee(800.0, 10.0, "vladtruba@gmail.con","23234543d");
        employee.RaiseSalary();
        System.out.println(employee.GetSalary());
        employee.GetEmail();
    }

}