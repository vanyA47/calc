//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class calc {

    public static void main(String[] args) throws ScannerException {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String[] m = s1.split(" ");
        String[] roman = new String[]{"I", " II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
                "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX",
                "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L",
                "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "LCI", "LCII", "LCIII", "LCIV", "LCV", "LCVI", "LCII", "LCVIII", "LCIX", "C", "CI"};
        if (m.length != 3) {
            throw new ScannerException("Формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        } else {
            int res;
            try {
                int a = Integer.parseInt(m[0]);
                int b = Integer.parseInt(m[2]);
                String c = m[1];
                if (a >= 1 && a <= 10) {
                    if (b >= 1 && b <= 10) {
                        switch (c) {
                            case "+":
                                res = a + b;
                                break;
                            case "-":
                                res = a - b;
                                break;
                            case "*":
                                res = a * b;
                                break;
                            case "/":
                                res = a / b;
                                break;
                            default:
                                throw new ScannerException("Неверный знак математической операции");
                        }
                        System.out.println(res);
                    }
                } else
                    throw new ScannerException("Формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
            } catch (IllegalArgumentException e) {
                try {
                    Rim rom1 = Rim.valueOf(m[0]);
                    Rim rom2 = Rim.valueOf(m[2]);
                    int a = rom1.getTranslation();
                    int b = rom2.getTranslation();
                    System.out.println();
                    String c = m[1];
                    if (m.length != 3) {
                        throw new ScannerException("Формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
                    } else {
                        if (a >= 1 && a <= 10 && b >= 1 && b <= 10) {
                            switch (c) {
                                case "+":
                                    res = a + b;
                                    for (int i = 0; i < roman.length; i++) {
                                        if (i == res) {

                                            System.out.println(roman[i - 1]);
                                        }
                                    }
                                    return;
                                case "-":
                                    if( a > b) {
                                        res = a - b;
                                        for (int i = 0; i < roman.length; i++) {
                                            if (i == res) {
                                                System.out.println(roman[i - 1]);
                                            }
                                        }
                                    } else {throw new ScannerException("В римской системе нет отрицательных чисел");}
                                    return;

                                case "*":
                                    res = a * b;
                                    for (int i = 0; i < roman.length; i++) {
                                        if (i == res) {

                                            System.out.println(roman[i - 1]);
                                        }
                                    }
                                    return;
                                case "/":
                                    res = a / b;
                                    for (int i = 0; i < roman.length; i++) {
                                        if (i == res) {
                                            System.out.println(roman[i - 1]);
                                        }
                                    }
                                    break;
                                default:
                                    throw new ScannerException("Неверный знак математической операции");
                            }
                        }
                    }
                } catch (IllegalArgumentException E) {
                    throw new ScannerException("Используются одновременно разные системы счисления");
                }
            }
        }

    }
}



