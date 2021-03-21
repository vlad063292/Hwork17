
public class User {
    private String FirstName;
    private String LastName;
    private String PhoneNumber;
    private String MobilePhoneNumber;
    private String Email;
    private String Password;

    User(String Email, String Password) throws Exception{
        ValidateEmail(Email);
        ValidatePassword(Password);

        this.Email = Email;
        this.Password = Password;
    }

    User(String FirstName, String LastName, String PhoneNumber,
         String MobilePhoneNumber, String Email, String Password) throws Exception{
        ValidateEmail(Email);
        ValidatePassword(Password);

        this.FirstName = FirstName;
        this.LastName = LastName;
        this.PhoneNumber = PhoneNumber;
        this.MobilePhoneNumber = MobilePhoneNumber;
        this.Email = Email;
        this.Password = Password;
    }

    public String GetFirstName(){
        return FirstName;
    }

    public String GetLastName(){
        return LastName;
    }

    public String GetPhoneNumber(){
        return PhoneNumber;
    }

    public String GetMobilePhoneNumber(){
        return MobilePhoneNumber;
    }

    public String GetEmail(){
        return Email;
    }

    public String GetPassword(){
        return Password;
    }

    private void ValidateEmail(String email) throws Exception{
        for (char ch: email.toCharArray()) {
            if(ch == '@'){
                return;
            }
        }
        throw new Exception("Email must contains @");
    }

    private void ValidatePassword(String password) throws Exception{
        var passwordLength = password.length();

        if(passwordLength < 8 || passwordLength > 16){
            throw new Exception("Password must be >= 8 and <= 16 symbols");
        }
    }
}