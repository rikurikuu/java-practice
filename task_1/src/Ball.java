public class Ball {
    private int age;
    private String color;

    public Ball(int inputAge, String inputColor) {
        age = inputAge;
        color = inputColor;
    }
    public Ball(int inputAge) {
        age = inputAge;
        color = "green";
    }
    public Ball(String inputColor) {
        age = 0;
        color = inputColor;
    }
    public Ball() {
        age = 0;
        color = "green";
    }
    public void setColor(String inputColor) {
        color = inputColor;
    }
    public void setAge(int inputAge) {
        age = inputAge;
    }
    public String getColor(String color) {
        return color;
    }
    public int getAge() {
        return age;
    }
    public String toString() {
        return color + "; age" + age;
    }
    public void ballYearOfBreak() {
        System.out.println("This ball will no longer be usable in " + age*3 + " years");
    }
}
