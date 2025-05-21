package robots.gui;

import java.awt.*;

import robots.log.Logger;
import robots.log.RobotModel;

public class MainController {
    private final AppContext appContext;

    public MainController() {
        this.appContext = new AppContext(new LogWindow(Logger.getDefaultLogSource()), new GameWindow(), new RobotPositionWindow(RobotModel.getRobotPositionModel()));
    }

    public void createFrame() {
        MainApplicationFrame frame = new MainApplicationFrame(appContext);
        frame.pack();
        frame.setVisible(true);
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);
    }

}
