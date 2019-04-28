import processing.core.PApplet;

public class Apple {

    private static final int COLOR = 0xffff0000;

    //State
    private int x, y;
    private Field field;


    //Behaviour

    Apple(Field field, Snake snake) {
        this.field = field;

        do {
            x = (int) (Math.random() * field.getWidth());
            y = (int) (Math.random() * field.getHeight());

        } while (snake.collides(x, y));
    }

    void draw(PApplet applet) {
        float cellSize = field.getCellSize();
        float screenX = field.getScreenX(applet.width, x);
        float screenY = field.getScreenY(applet.height, y);


        applet.fill(COLOR);
        applet.rect(screenX, screenY, cellSize, cellSize);
    }

    public int getX() {
        return x;
    }

    int getY() {
        return y;
    }
}