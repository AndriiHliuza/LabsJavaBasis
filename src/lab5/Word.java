package lab5;

import java.util.Arrays;

public class Word implements SentenceMember{
    private Letter[] letters;
    public final int length;

    public Word(String word) {
        char[] letters = word.toCharArray();
        this.letters = new Letter[letters.length];
        for (int i = 0; i < letters.length; i++) {
            this.letters[i] = new Letter(letters[i]);
        }
        length = letters.length;
    }

    @Override
    public String toString() {
        StringBuilder word = new StringBuilder();
        for (Letter letter : letters) {
            word.append(letter);
        }
        return word.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Word word = (Word) o;
        return length == word.length && Arrays.equals(letters, word.letters);
    }
}
