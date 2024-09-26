package lesson13;

import java.util.Scanner;

public class UserReg {
    public static void main(String[] args) {
        registr();
    }

    static void registr() {
        System.out.print("Please enter your login: ");
        String login = getScanner();
        System.out.print("Please enter your password: ");
        String password = getScanner();
        System.out.print("Please confirm your password: ");
        String confirmPassword = getScanner();

        try {
            boolean isValid = validateCredentials(login, password, confirmPassword);
            System.out.println("Verification successful: " + isValid);
        } catch (WrongLoginException e) {
            System.out.println("Login error: " + e.getMessage());
        } catch (WrongPasswordException e) {
            System.out.println("Password error: " + e.getMessage());
        }
    }

    public static boolean validateCredentials(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {

        if (login.length() >= 20 || login.contains(" ")) {
            throw new WrongLoginException("Login must be less than 20 characters and contain no spaces");
        }

        if (password.length() >= 20 || password.contains(" ") || !hasDigit(password)) {
            throw new WrongPasswordException
                    ("The password must be less than 20 characters, contain no spaces, and contain at least one number");
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Passwords don't match");
        }
        return true;
    }

    private static boolean hasDigit(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    static String getScanner() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
}




