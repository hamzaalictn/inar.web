import java.awt.*;

public class RobotTest {
    public static void main(String[] args) {
        try {
            RobotStep robotStep = new RobotStep(new Robot());
            Thread thread = new Thread(robotStep);
            thread.start();
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
    }
}
