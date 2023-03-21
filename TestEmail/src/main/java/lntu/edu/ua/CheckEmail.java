package lntu.edu.ua;

public class CheckEmail {
    private static String pattern_regex = "^[a-zA-Z]{1}[a-zA-Z0-9\\.]*@([a-zA-Z0-9]+\\.)+[a-zA-Z0-9]{2,}$";

    public static boolean checkEmail(String text) {
        return text.matches(pattern_regex);
    }

}
