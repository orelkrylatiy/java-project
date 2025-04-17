package robots.gui;

import java.awt.*;

import robots.log.Logger;

public class MainController {
    private final LogWindow logWindow;
    private final GameWindow gameWindow;
    private MainApplicationFrame frame;

    public MainController() {
        this.logWindow = new LogWindow(Logger.getDefaultLogSource());
        this.gameWindow = new GameWindow();
    }

    public void createFrame() {
        frame = new MainApplicationFrame(logWindow, gameWindow, this);
        frame.pack();
        frame.setVisible(true);
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);
    }

    public void onAddLogMessage() {
        Logger.debug("Новая строка");
    }

    public void handleExit() {
        if (frame != null)
            frame.saveWindowStates();
        System.exit(0);
    }

}
