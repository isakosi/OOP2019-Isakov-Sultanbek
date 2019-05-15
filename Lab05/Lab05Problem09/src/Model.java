class Model {
    int row, col;

    public void turnRight() {
        if (col < 7) {
            ++col;
        }
    }

    public void turnLeft() {
        if (col > 0) {
            --col;
        }
    }

    public void turnUp() {
        if (row > 0) {
            --row;
        }
    }

    public void turnDown() {
        if (row < 7) {
            ++row;
        }
    }
}