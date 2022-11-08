package lab3;

/*
C3 = 0 (StringBuilder)
C17 = 3 (В усіх питальних реченнях заданого тексту знайти та надрукувати без повторень слова заданої довжини.)
 */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter word's length: ");
        int wordLength = scanner.nextInt();

        StringBuilder text = new StringBuilder("Чом ти не прийшов,\n" +
                "Як місяць зійшов?\n" +
                "Я тебе чекала.\n" +
                "Чи коня не мав,\n" +
                "Чи стежки не знав,\n" +
                "Мати не пускала?\n" +
                "\n" +
                "І коня я мав,\n" +
                "І стежку я знав,\n" +
                "І мати пускала.\n" +
                "Найменша сестра,\n" +
                "Бодай не зросла?\n" +
                "Сідельце сховала.\n" +
                "\n" +
                "А старша сестра\n" +
                "Сідельце знайшла,\n" +
                "Коня осідлала:\n" +
                "\"Поїдь, братику,\n" +
                "До дівчиноньки,\n" +
                "Що тебе чекала\".\n" +
                "\n" +
                "Тече річенька\n" +
                "Невеличенька,\n" +
                "Схочу – перескочу...\n" +
                "Віддайте мене,\n" +
                "Моя матінко,\n" +
                "За кого я схочу.");
        String stringText = text.toString();

        String questionSentences = getQuestionSentences(stringText);
        String[] words = getUniqueWords(questionSentences);

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == wordLength) {
                System.out.println(words[i]);
            }
        }
    }

    public static String getQuestionSentences(String text) {
        String questionSentences = "";
        String[] sentences = text.split("(?<=(!|\\.|\\?))");
        for (int i = 0; i < sentences.length; i++) {
            if (sentences[i].matches("((.|\\n)*)\\?")) {
                questionSentences += sentences[i] + " ";
            }
        }
        return questionSentences;
    }
    public static String[] getUniqueWords(String text) {
        String[] words = text.split("[\\p{Punct}\\s]+");
        for (int i = 0; i < words.length-1; i++) {
            if (words[i].equals("")) {
                continue;
            }
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    words[j] = "";
                }
            }
        }
        text = "";
        for (int i = 0; i < words.length; i++) {
            text += words[i] + " ";
        }
        return text.split("\\s");
    }
}
