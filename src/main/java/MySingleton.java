public class MySingleton {
    private static MySingleton ourInstance = new MySingleton();
    private int value;

    public static MySingleton getInstance() {
        return ourInstance;
    }

    private MySingleton() {
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
