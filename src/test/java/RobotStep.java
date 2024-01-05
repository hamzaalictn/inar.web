import java.awt.*;
import java.awt.event.KeyEvent;

public class RobotStep implements Runnable {

    private final Robot ROBOT;

    public RobotStep(Robot robot) {
        ROBOT = robot;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            ROBOT.keyPress(KeyEvent.VK_ENTER);
            ROBOT.keyPress(KeyEvent.VK_ENTER);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
