import processing.core.PApplet;

enum State {
    Title,
    Speed,
    Game,
    Results
}

public class Main extends PApplet {
    private static final int TITLE_STATE = 0;
    private static final int SPEED_SELECTION = 1;
    private static final int GAME_STATE = 2;
    private static final int RESULTS = 3;

    private int state = TITLE_STATE;


    private Field field;
    private Apple apple;
    private Snake snake;

    private static int num;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        final int WIDTH = 30, HEIGHT = 30;
        int cellSize = min(width / 30, height / 30);
        field = new Field(WIDTH, HEIGHT, cellSize);
        snake = new Snake(field, 0, 0, 1, 0);
        apple = new Apple(field, snake);
        num = 1;
    }

    public void draw() {
        switch (state) {
            case TITLE_STATE:
                drawUpdTitle();
                break;
            case SPEED_SELECTION:
                //TODO
                drawUpdSpeed();
                break;
            case GAME_STATE:
                drawUpdGame();

                break;
            case RESULTS:
                //TODO
                drawUpdRes();
                break;
        }
    }


    private void drawUpdTitle() {
        background(0);
        final int TOP_MARGIN = 100;

        fill(255, 0, 0);
        textSize(80);
        textAlign(CENTER, CENTER);
        text("Super Snake", width / 2, TOP_MARGIN);

        fill(255, 255, 0);
        textSize(60);
        textAlign(CENTER, CENTER);
        text("Created by Sultanbek", width / 2, height / 2);


        fill(0, 255, 0);
        textSize(50);
        textAlign(CENTER, CENTER);
        text("Press ENTER to continue", width / 2, height - TOP_MARGIN);

    }

    private void drawUpdSpeed() {
        background(0);

        final int TOP_MARGIN = 100;

        fill(255, 0, 0);
        textSize(60);
        textAlign(CENTER, CENTER);
        text("Select Speed", width / 2, TOP_MARGIN);

        fill(255, 255, 0);
        textSize(80);
        text(num, width / 2, height / 2);

        fill(0, 255, 0);
        textSize(50);
        textAlign(CENTER, CENTER);
        text("Change: Arrow-UP/DOWN. ENTER to continue", width / 2, height - TOP_MARGIN);

    }

    private void drawUpdGame() {
        background(255);
        snake.move();
        if (snake.headCollides(apple)) {
            snake.grow();
            apple = new Apple(field, snake);
        }

        if (snake.isDead()) {
            state = RESULTS;
        }
        field.draw(this);
        apple.draw(this);
        snake.draw(this);

        delay(100 - (num * 10));

        fill(0);
        textSize(30);
        textAlign(CENTER, CENTER);
        text( "Score: ", 100, 100);

        fill(255,0,0);
        textSize(30);
        textAlign(CENTER, CENTER);
        text( snake.getBody() - 1, 160, 100);





    }

    private void drawUpdRes() {
        background(0);

        final int TOP_MARGIN = 100;

        fill(255, 255, 0);
        textSize(50);
        textAlign(CENTER, CENTER);
        text("Your score is: ", width / 2, TOP_MARGIN);

        fill(255, 0, 0);
        textSize(50);
        textAlign(CENTER, CENTER);
        text(snake.getBody() - 1, width / 2 + 190, TOP_MARGIN);

        fill(255, 0, 0);
        textSize(120);
        textAlign(CENTER, CENTER);
        text("GAME OVER", width / 2, height / 2);

        fill(0, 255, 0);
        textSize(50);
        textAlign(CENTER, CENTER);
        text("Press ENTER to restart", width / 2, height - TOP_MARGIN);

    }


    public void keyPressed() {
        switch (state) {
            case TITLE_STATE:
                keyPressedTitle();
                break;
            case SPEED_SELECTION:
                keyPressedSpeed();
                break;
            case GAME_STATE:
                keyPressedGame();
                break;
            case RESULTS:
                keyPressedRes();
                break;
        }
    }

    private void keyPressedTitle() {
        if (keyCode == ENTER) {
            state = SPEED_SELECTION;
        }
    }

    private void keyPressedSpeed() {
        switch (keyCode) {
            case UP:
                if (num < 10) {
                    num++;
                } else {
                    num--;
                }
                break;
            case DOWN:
                if (num > 0) {
                    num--;
                } else {
                    num++;
                }
                break;

            case ENTER:
                state = GAME_STATE;
                break;
        }

    }

    private void keyPressedGame() {
        switch (keyCode) {
            case UP:
                snake.turnUp();
                break;
            case DOWN:
                snake.turnDown();
                break;
            case LEFT:
                snake.turnLeft();
                break;
            case RIGHT:
                snake.turnRight();
                break;
        }
    }

    private void keyPressedRes() {
        if (keyCode == ENTER) {
            setup();
            state = SPEED_SELECTION;
        }
    }

    public static void main(String... args) {
        PApplet.main("Main");
    }
}