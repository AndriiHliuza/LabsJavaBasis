package lab5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int wordLen = 2;
        Text poem = new Text(new StringBuilder("Чом ти не прийшов,\n" +
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
                "Бодай не зросла,\n" +
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
                "Схочу – перескочу.\n" +
                "Віддайте мене,\n" +
                "Моя матінко,\n" +
                "За кого я схочу.\n" +
                "\n" +
                "Чом ти не прийшов?"));

        Word[] words = Sentence.getWordsWithParticularLength(poem.getQuestionSentences(), wordLen);
        for (Word word : words) {
            System.out.println(word.toString().toLowerCase() + " (" + word + ")");
        }
    }
}
