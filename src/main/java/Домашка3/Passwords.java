package Домашка3;

public class Passwords {
    public static void main (String[] args) {
        String[] passwords = {"ty$gds#fdFSFG","12345678QWERTY","4839jz","qwerty"} ;
         for (String pwd : passwords){
             boolean isValid = pwd.length() > 8 &&
                     !pwd.startsWith("1") &&
                     !pwd.endsWith("z") &&
                     !pwd.contains("1234") &&
                     !pwd.toLowerCase().contains("qwerty");
             System.out.println("пароль '" + pwd + "' прошел проверку: " + isValid);
         }
    }
}
