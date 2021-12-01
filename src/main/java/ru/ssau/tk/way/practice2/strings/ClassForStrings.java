package ru.ssau.tk.way.practice2.strings;

import java.nio.charset.Charset;

import static org.testng.util.Strings.join;

public class ClassForStrings {
    public static void printChar(String s) {
        for (int i = 0; i < s.length(); ++i) {
            System.out.print(s.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void printBytes(String s) {
        byte[] array = s.getBytes();
        for (byte v : array) {
            System.out.print(v + " ");
        }
        System.out.println();
    }

    public static void stringComparison() {
        String s1 = "First string!";
        String s2 = new String(s1);
        System.out.print("==: ");
        System.out.print(s1 == s2);           //сравнивает ссылки на объект
        System.out.print("  equals: ");
        System.out.print(s1.equals(s2));       //сравнивает набор символов
        System.out.println();
    }

    public static boolean palindrome(String string) {
        for (int i = 0; i < string.length() / 2; ++i) {
            if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean stringComparisonIgnoreCase(String s1, String s2) {
        if (s1 == null || s2 == null) {
            return false;
        } else return !s2.equals(s1) & s2.equalsIgnoreCase(s1);
    }

    public static void studyingScreening() {
        int i = 0;
        System.out.println("Символ\t№" + ++i);   //табуляция
        System.out.println("Символ\b№" + ++i);   //удаляет последний символ
        System.out.println("Символ\n№" + ++i);   //переводит на новую строку
        System.out.println("Символ\r№" + ++i);   //заменяет предыдущий текст на следующий
        System.out.println("Символ\'№" + ++i);   //добавляет '
        System.out.println("Символ\"№" + ++i);   //добавляет "
        System.out.println("Символ\\№" + ++i);   //добавляет \, если же убрать один слэш, то компилятор выдаёт ошибку
        System.out.println();
    }

    public static int indexOfTheOccurrence(String s1, String s2) {
        return s1.indexOf(s2);
    }

    public static int firstIndexOfTheOccurrenceHalf(String s1, String s2) {
        return s1.indexOf(s2, s1.length() / 2);
    }

    public static int lastIndexOfTheOccurrenceHalf(String s1, String s2) {
        String s3 = s1.substring(0, s1.length() / 2);
        return s3.lastIndexOf(s2);
    }

    public static int countOfLines(String[] array, String prefix, String postfix) {
        int count = 0;
        for (String s : array) {
            if (s.startsWith(prefix) && s.endsWith(postfix)) {
                count++;
            }
        }
        return count;
    }
    public static int countOfLinesIgnoreTheSpace(String[] array, String prefix, String postfix) {
        int count = 0;
        for (String s : array) {
            if (s.trim().startsWith(prefix) && s.trim().endsWith(postfix)) {
                count++;
            }
        }
        return count;
    }

    public static String replacementTheString(String s1, String s2, String s3) {
        String s4 = s1;
        for (int i = 0; s4.contains(s2) && i < 100; ++i) {
            s4 = s4.replaceAll(s2, s3);
        }
        return s4;
    }

    public static String substringOfString(String s1, int from, int to) {
        if (from < 0) {
            from = 0;
        }
        if (to > s1.length()) {
            to = s1.length();
        }
        if (to <= from) {
            return "";
        }
        return s1.substring(from, to);
    }

    public static String descriptionOfObjects(Object o) {
        return "Описание объекта: " + o;
    }

    public static String[] splittingTheString(String s) {
        String[] array = s.split(" ");
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() == 1) {
                array[i] = array[i].toUpperCase();
            } else {
                array[i] = array[i].substring(0, 1).toUpperCase() + array[i].substring(1);
            }
        }
        return array;
    }

    public static String createOneString(String[] array) {
        return join(", ", array);
    }

    public static String createObject(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        for (int i = 0; i < stringBuilder.length(); ++i) {
            if (i % 2 == 0) {
                stringBuilder.replace(i, i + 1, Integer.toString(i));
            }
        }
        stringBuilder.reverse();
        return stringBuilder.toString();
    }

    public static String formTheString(int number) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < number; i++) {
            stringBuilder.append(i).append(" ");
        }
        return stringBuilder.toString();
    }

    public static String changingTheEncoding(String s, Charset o1, Charset o2) {
        return new String(s.getBytes(o1), o2);
    }
}

