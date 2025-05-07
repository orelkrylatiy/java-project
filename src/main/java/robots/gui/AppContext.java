package robots.gui;

public class AppContext {
    public final LogWindow logWindow;
    public final GameWindow gameWindow;
    public final MainController controller;
    public final RobotPositionWindow positionWindow;

    public AppContext(LogWindow logWindow, GameWindow gameWindow, MainController controller, RobotPositionWindow positionWindow) {
        this.logWindow = logWindow;
        this.gameWindow = gameWindow;
        this.controller = controller;
        this.positionWindow = positionWindow;
    }
}
