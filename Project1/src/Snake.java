import processing.core.PApplet;

import java.awt.*;
import java.util.ArrayList;

class Snake {
    //State

    private static int COLOR = 0xff000000;
    private static final int COLOR_DEAD = 0xffff0000;

    private Field field;
    private ArrayList<Point> body;
    private int dx, dy;
    private int head;
    private boolean dead;


    //Behaviour

    Snake(Field field, int x, int y, int dx, int dy) {
        this.field = field;

        body = new ArrayList<>();

        body.add(new Point(x, y));
        head = 0;
        this.dx = dx;
        this.dy = dy;
        dead = false;
    }

    void move() {
        if (dead) return;
        int nextX = getX() + dx;
        int nextY = getY() + dy;
        head = (head + 1) % body.size();

        if (!field.isInside(nextX, nextY)) {
            dead = true;
        } else {
            setX(nextX);
            setY(nextY);
        }
    }

    private int getX() {
        return body.get(head).x;
    }

    private int getY() {
        return body.get(head).y;
    }

    private void setX(int x) {
        body.get(head).x = x;

    }

    private void setY(int y) {
        body.get(head).y = y;

    }

    void draw(PApplet applet) {
        float cellSize = field.getCellSize();

        int red = (int) applet.random(256);
        int green = (int) applet.random(256);
        int blue = (int) applet.random(256);
        for (int i = 0; i < body.size(); i++) {
            applet.fill(red,green,blue);
        }
        //applet.fill(dead ? COLOR_DEAD : COLOR);

        for (Point bodypart : body) {
            float screenX = field.getScreenX(applet.width, bodypart.x);
            float screenY = field.getScreenY(applet.height, bodypart.y);
            applet.rect(screenX, screenY, cellSize, cellSize);
        }
    }

    boolean collides(int x, int y) {
        for (Point bodypart : body) {
            if (x == bodypart.x && y == bodypart.y) {
                return true;
            }
        }
        return false;
    }

    boolean headCollides(Apple apple) {
        return getX() == apple.getX() && getY() == apple.getY();
    }

    void grow() {
        body.add(head + 1, new Point(getX(), getY()));
        move();
    }

    void turnUp() {
        if (dy != 1) {
            dx = 0;
            dy = -1;
        }
    }

    void turnDown() {
        if (dy != -1) {
            dx = 0;
            dy = 1;
        }
    }

    void turnLeft() {
        if (dx != 1) {
            dy = 0;
            dx = -1;
        }
    }

    void turnRight() {
        if (dx != -1) {
            dy = 0;
            dx = 1;
        }
    }

    boolean isDead() {
        return dead;
    }

    int getBody() {
        return body.size();
    }
}