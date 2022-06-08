public class Person {

    public boolean checkUser(String username) {
        String regex = "/[^a-zA-Z\\d]+/g";
        return !username.matches(regex) || username.length() >= 8;
    }

    public boolean checkPassword(String password) {
        return !password.matches("/[^a-zA-Z\\d]+/g") || password.length() >= 8;
    }
}
