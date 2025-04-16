package gui;

import java.awt.*;

import log.Logger;

public class MainController {
    private final LogWindow logWindow;
    private final GameWindow gameWindow;

    public MainController() {
        this.logWindow = new LogWindow(Logger.getDefaultLogSource());
        this.gameWindow = new GameWindow();
    }

    public MainApplicationFrame createFrame() {
        MainApplicationFrame frame = new MainApplicationFrame(logWindow, gameWindow);
        frame.pack();
        frame.setVisible(true);
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);
        return frame;
    }


    private void handleExit() {
        // логика выхода
    }

}
