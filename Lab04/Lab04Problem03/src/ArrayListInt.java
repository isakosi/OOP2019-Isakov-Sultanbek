public class ArrayListInt {
    private int[] items;

    ArrayListInt() {
        items = new int[0];
    }

    int size() {
        return items.length;
    }

    int get(int i) {
        return items[i];
    }

    void set(int i, int value) {
        items[i] = value;
    }


    void add(int value) {
        int[] newItems = new int[items.length + 1];

        for (int i = 0; i < items.length; ++i) {
            newItems[i] = items[i];
        }

        newItems[items.length] = value;

        items = newItems;
    }

    void add(int insertPosition, int value) {
        int[] newItems = new int[items.length + 1];

        for (int i = 0; i < items.length; ++i) {
            newItems[i] = items[i];
        }

        newItems[insertPosition] = value;

        for (int i = insertPosition; i < items.length; ++i) {
            newItems[i + 1] = items[i];
        }

        items = newItems;
    }

    void remove(int removalPosition) {
        int[] newItems = new int[items.length - 1];

        for (int i = 0; i < removalPosition; ++i) {
            newItems[i] = items[i];
        }
        for (int i = removalPosition + 1; i < items.length; ++i) {
            newItems[i - 1] = items[i];
        }
    }
}