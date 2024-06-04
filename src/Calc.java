public class Calc {
    public static String calc(String input) {
        int a;
        int b;
        boolean isRoman = false;
        String[] parts = input.split(" ");
        if (parts.length != 3) throw new IllegalArgumentException("Недопустимое выражение");
        if (Converter.isRoman(parts[0]) && Converter.isRoman(parts[2])) {
            a = Converter.romanToArabian(parts[0]);
            b = Converter.romanToArabian(parts[2]);
            isRoman = true;
        } else if (!Converter.isRoman(parts[0]) && !Converter.isRoman(parts[2])) {
            a = Integer.parseInt(parts[0]);
            b = Integer.parseInt(parts[2]);
        } else throw new IllegalArgumentException("Оба числа должны быть либо Римскими либо Арабскими");
        String op = parts[1];
        String result;

        if (a <= 10 && a >= 1 && b <= 10 && b >= 1) {
            switch (op) {
                case "+" -> result = String.valueOf(a + b);
                case "-" -> result = String.valueOf(a - b);
                case "*" -> result = String.valueOf(a * b);
                case "/" -> result = String.valueOf(a / b);
                default -> throw new IllegalArgumentException("Такой операции не существует");
            }
        } else throw new IllegalArgumentException("Число должно быть от 1 до 10");
        if (isRoman) {
            return Converter.arabianToRoman(Integer.parseInt(result));
        } else return result;
    }
}
