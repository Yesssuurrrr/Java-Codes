public class TypeConversion {
    public static void main(String[] args) {
        // Example values
        String stringValue = "123";
        int intValue = 456;
        double doubleValue = 789.12;

        // Convert String to different types
        byte byteFromString = Byte.parseByte(stringValue);
        int intFromString = Integer.parseInt(stringValue);
        float floatFromString = Float.parseFloat(stringValue);
        double doubleFromString = Double.parseDouble(stringValue);

        // Convert int to different types
        byte byteFromInt = (byte) intValue;
        float floatFromInt = (float) intValue;
        double doubleFromInt = (double) intValue;

        // Convert double to different types
        byte byteFromDouble = (byte) doubleValue;
        int intFromDouble = (int) doubleValue;
        float floatFromDouble = (float) doubleValue;

        // Print converted values
        System.out.println("Conversions from String:");
        System.out.println("byte: " + byteFromString);
        System.out.println("int: " + intFromString);
        System.out.println("float: " + floatFromString);
        System.out.println("double: " + doubleFromString);

        System.out.println("\nConversions from int:");
        System.out.println("byte: " + byteFromInt);
        System.out.println("float: " + floatFromInt);
        System.out.println("double: " + doubleFromInt);

        System.out.println("\nConversions from double:");
        System.out.println("byte: " + byteFromDouble);
        System.out.println("int: " + intFromDouble);
        System.out.println("float: " + floatFromDouble);
    }
}
