public class User {
    private String FirstName;
    private String LastName;
    private String PhoneNumber;
    private String MobilePhoneNumber;
    private String Email;
    private String Password;

    User(String Email, String Password) throws Exception {
        this.ValidateEmail(Email);
        this.ValidatePassword(Password);
        this.Email = Email;
        this.Password = Password;
    }

    User(String FirstName, String LastName, String PhoneNumber, String MobilePhoneNumber, String Email, String Password) throws Exception {
        this.ValidateEmail(Email);
        this.ValidatePassword(Password);
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.PhoneNumber = PhoneNumber;
        this.MobilePhoneNumber = MobilePhoneNumber;
        this.Email = Email;
        this.Password = Password;
    }

    public String GetFirstName() {
        return this.FirstName;
    }

    public String GetLastName() {
        return this.LastName;
    }

    public String GetPhoneNumber() {
        return this.PhoneNumber;
    }

    public String GetMobilePhoneNumber() {
        return this.MobilePhoneNumber;
    }

    public String GetEmail() {
        return this.Email;
    }

    public String GetPassword() {
        return this.Password;
    }

    private void ValidateEmail(String email) throws Exception {
        char[] var2 = email.toCharArray();
        int var3 = var2.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            char ch = var2[var4];
            if (ch == '@') {
                return;
            }
        }

        throw new Exception("Email must contains @");
    }

    private void ValidatePassword(String password) throws Exception {
        int passwordLength = password.length();
        if (passwordLength < 8 || passwordLength > 16) {
            throw new Exception("Password must be >= 8 and <= 16 symbols");
        }
    }
}
