public class TestBall {
    public static void main(String[] args)
    {
        Ball firstBall = new Ball(5, "green");
        Ball secondBall = new Ball("Red");
        Ball thirdBall = new Ball(10);
        Ball fourthBall = new Ball();
        secondBall.setAge(5);
        fourthBall.setColor("Pink");
        System.out.println(thirdBall);
        firstBall.ballYearOfBreak();
        secondBall.ballYearOfBreak();
        thirdBall.ballYearOfBreak();
        fourthBall.ballYearOfBreak();
    }
}
