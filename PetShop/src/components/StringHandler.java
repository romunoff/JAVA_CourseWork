package components;

public class StringHandler {

    public static String changeNumberFormat(int number) {
        String[] format = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        StringBuilder stringBuilder = new StringBuilder();
        String stringNumber = Integer.toString(number);
        char[] numberArray = stringNumber.toCharArray();
        for (int i = 0; i < numberArray.length; i++) {
            stringBuilder.append(format[numberArray[i] - '0']);
            if (i + 1 != numberArray.length) {
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    }

}
