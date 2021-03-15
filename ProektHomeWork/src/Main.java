public class Main {

    public static void main(String[] args) throws Exception {
        User user = new User("vladtruba@gmail.com", "test123456");
        System.out.println(user.GetEmail());
        Employee employee = new Employee(800.0D, 10.0D, "vladtruba@gmail.con", "23234543d");
        employee.RaiseSalary();
        System.out.println(employee.GetSalary());
    }
}
