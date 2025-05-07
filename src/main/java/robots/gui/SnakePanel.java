package robots.gui;

import robots.log.Logger;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.AffineTransform;
import java.util.Timer;
import java.util.TimerTask;

public class SnakePanel extends JPanel {
    private double snakeX = 100;
    private double snakeY = 100;
    private double direction = 0;

    private int targetX = 150;
    private int targetY = 100;

    private static final double SPEED = 1.5;
    private static final double ROTATION_SPEED = 0.05;

    public SnakePanel() {
        setBackground(Color.WHITE);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                targetX = e.getX();
                targetY = e.getY();
                SwingUtilities.invokeLater(() -> {
                    repaint();
                });

            }
        });

        Timer timer = new Timer(true);
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                updateModel();
                SwingUtilities.invokeLater(() -> {
                    repaint();
                });            }
        }, 0, 10);
    }

    private void updateModel() {
        double angleToTarget = Math.atan2(targetY - snakeY, targetX - snakeX);
        double angleDiff = normalizeAngle(angleToTarget - direction);

        if (Math.abs(angleDiff) > ROTATION_SPEED) {
            direction += Math.signum(angleDiff) * ROTATION_SPEED;
        } else {
            direction = angleToTarget;
        }

        double dx = SPEED * Math.cos(direction);
        double dy = SPEED * Math.sin(direction);

        if (distance(snakeX, snakeY, targetX, targetY) > SPEED) {
            snakeX += dx;
            snakeY += dy;
        }
        Logger.getrobotPositionModel().setPosition(snakeX, snakeY);
    }

    private double normalizeAngle(double angle) {
        while (angle < -Math.PI) angle += 2 * Math.PI;
        while (angle > Math.PI) angle -= 2 * Math.PI;
        return angle;
    }

    private double distance(double x1, double y1, double x2, double y2) {
        return Math.hypot(x1 - x2, y1 - y2);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawSnake((Graphics2D) g);
        drawTarget((Graphics2D) g);
    }

    private void drawSnake(Graphics2D g) {
        int bodyLength = 30;
        int bodyWidth = 10;

        AffineTransform old = g.getTransform();
        g.rotate(direction, snakeX, snakeY);

        g.setColor(Color.MAGENTA);
        g.fillOval((int)(snakeX - bodyLength / 2), (int)(snakeY - bodyWidth / 2), bodyLength, bodyWidth);
        g.setColor(Color.BLACK);
        g.drawOval((int)(snakeX - bodyLength / 2), (int)(snakeY - bodyWidth / 2), bodyLength, bodyWidth);

        g.setTransform(old);
    }

    private void drawTarget(Graphics2D g) {
        g.setColor(Color.GREEN);
        g.fillOval(targetX - 4, targetY - 4, 8, 8);
        g.setColor(Color.BLACK);
        g.drawOval(targetX - 4, targetY - 4, 8, 8);
    }
}
