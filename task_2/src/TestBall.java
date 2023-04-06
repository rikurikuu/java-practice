public class TestBall {
    public static void main(String[] args) {
        Ball firstBall = new Ball (30.75, 40.20);
        System.out.println("The initial position:");
        System.out.println(firstBall);
        firstBall.move(-10.40, 10.30);
        System.out.println("The position after movement: ");
        System.out.println(firstBall);
    }
}
