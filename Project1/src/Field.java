import processing.core.PApplet;

class Field {
    //State
    private static final int COLOR = 0xffffffff;

    private int cellSize;
    private int width, height;

    //Behaviour
    Field(int width, int height, int cellSize) {
        this.width = width;
        this.height = height;
        this.cellSize = cellSize;
    }


    void draw(PApplet applet) {
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                float screenX = getScreenX(applet.width, x);
                float screenY = getScreenY(applet.height, y);

                applet.fill(COLOR);
                applet.rect(screenX, screenY, cellSize, cellSize);
            }
        }
    }

    float getCellSize() {
        return cellSize;
    }

    float getScreenX(int screenWidht, int x) {
        float fieldScreenWidth = cellSize * width;
        float centerinShiftX = (screenWidht - fieldScreenWidth) / 2;
        return centerinShiftX + x * cellSize;
    }

    float getScreenY(int screenHeight, int y) {
        float fieldScreenHeight = cellSize * width;
        float centerinShiftY = (screenHeight - fieldScreenHeight) / 2;
        return centerinShiftY + y * cellSize;
    }

    boolean isInside(int x, int y) {
        return x >= 0 && x < width &&
                y >= 0 && y < height;
    }

    int getWidth() {
        return width;
    }

    int getHeight() {
        return height;
    }
}