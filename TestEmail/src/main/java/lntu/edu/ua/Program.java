package lntu.edu.ua;

public class Program {
    public static void main(String[] args)
    {
        String[] emails = {
                "Vasil@domain.com",
                "user.name1234@sub.domain.co.uk",
                "invalid.email.address",
                "user@domain.c",
                "user@domain.12",
                "user@domain..com",
                "k.asd@example.c"
        };

        for (String email : emails) {
            boolean isValid = CheckEmail.checkEmail(email);
            System.out.println(email + ": " + isValid);
        }
    }
}
