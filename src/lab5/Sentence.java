package lab5;

import java.util.ArrayList;
import java.util.Arrays;

public class Sentence {
    private SentenceMember[] sentenceMembers;
    private ArrayList<Word> sentenceWords = new ArrayList<>();

    public Sentence(String sentence) {
        ArrayList<String> sentenceMembers = new ArrayList<>(Arrays.asList(sentence.split("\\s*\\b")));
        for (int i = 0; i < sentenceMembers.size(); i++) {
            if (sentenceMembers.get(i).equals("")) {
                sentenceMembers.remove(sentenceMembers.get(i));
            }
        }
        this.sentenceMembers = new SentenceMember[sentenceMembers.size()];
        for (int i = 0; i < sentenceMembers.size(); i++) {
            if (sentenceMembers.get(i).matches("\\p{Punct}")) {
                this.sentenceMembers[i] = new PunctuationMark(sentenceMembers.get(i));
            } else {
                this.sentenceMembers[i] = new Word(sentenceMembers.get(i));
                sentenceWords.add(new Word(sentenceMembers.get(i)));
            }
        }
    }
    public static Word[] getWordsWithParticularLength(Sentence[] sentences, int wordLength) {
        ArrayList<Word> words = new ArrayList<>();
        for (Sentence sentence : sentences) {
            for (Word word : sentence.sentenceWords) {
                if (word.length == wordLength) {
                    words.add(word);
                }
            }
        }
        for (int i = 0; i < words.size() - 1; i++) {
            for (int j = i + 1; j < words.size(); j++) {
                if (words.get(i).equals(words.get(j))) {
                    words.remove(j);
                    j--;
                }
            }
        }
        return words.toArray(new Word[words.size()]);
    }


    public SentenceMember[] getSentenceMembers() {
        return sentenceMembers;
    }

    @Override
    public String toString() {
        StringBuilder sentence = new StringBuilder();
        for (int i = 0; i < sentenceMembers.length; i++) {
            if (i == sentenceMembers.length - 1) {
                sentence.append(sentenceMembers[i].toString());
            } else if (sentenceMembers[i] instanceof Word && sentenceMembers[i+1] instanceof PunctuationMark) {
                sentence.append(sentenceMembers[i].toString());
            } else {
                sentence.append(sentenceMembers[i].toString());
                sentence.append(" ");
            }
        }
        return sentence.toString();
    }
}
