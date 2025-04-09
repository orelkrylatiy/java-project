package gui;

import java.awt.Frame;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class RobotsProgram
{
    public static void main(String[] args) {

      try {
        UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
      } catch (Exception e) {
        e.printStackTrace();
      }

      SwingUtilities.invokeLater(() -> {
        MainController mainController = new MainController();
        MainApplicationFrame _ = mainController.createFrame();
      });

    }
}
