public final class Configurations10 {
    private final String key;
    private final String value;

    public Configurations10(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Configurations10{" + "key='" + key + '\'' + ", value='" + value + '\'' + '}';
    }

    public static void main(String[] args) {
        Configurations10 config = new Configurations10("AppMode", "Production");
        System.out.println(config);
    }
}
