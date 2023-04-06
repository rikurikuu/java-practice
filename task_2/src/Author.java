public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String inputName, String inputMail, char inputGender) {
        name = inputName;
        email = inputMail;
        gender = inputGender;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String userEmail) {
        email = userEmail;
    }
    public char getGender() {
        return gender;
    }
    public String toString() {
        return "Name of the author: " + name + "\nEmail: " + email + "\nGender: " + gender;
    }
}
