public class DataTypes {

    public static void showDataTypes() {

        // Primitive data types
        byte smallNumber = 100;
        System.out.println("Byte value: " + smallNumber);

        short shortNumber = 30000;
        System.out.println("Short value: " + shortNumber);

        int number = 10;
        System.out.println("Integer value: " + number);

        long bigNumber = 100000L;
        System.out.println("Long value: " + bigNumber);

        float floatNumber = 5.75f;
        System.out.println("Float value: " + floatNumber);

        double decimal = 5.5;
        System.out.println("Double value: " + decimal);

        char character = 'A';
        System.out.println("Character value: " + character);

        boolean flag = true;
        System.out.println("Boolean value: " + flag);

        // Non-primitive data type
        String text = "Hello, World!";
        System.out.println("String value: " + text);
    }

    public static void main(String[] args) {
        showDataTypes();
    }
}
