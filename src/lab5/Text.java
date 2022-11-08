package lab5;

import java.util.ArrayList;

public class Text {
    private Sentence[] sentences;

    public Text(StringBuilder stringBuilderText) {
        String text = stringBuilderText.toString();
        String[] sentences = text.split("(?<=(!|\\.|\\?))");
        this.sentences = new Sentence[sentences.length];
        for (int i = 0; i < sentences.length; i++) {
            sentences[i] = sentences[i].replace("\n", " ");
            sentences[i] = sentences[i].replaceAll("\\s+", " ");
            sentences[i] = sentences[i].trim();
            this.sentences[i] = new Sentence(sentences[i]);
        }
    }
    public Sentence[] getQuestionSentences() {
        ArrayList<Sentence> questionSentences = new ArrayList<>();
        PunctuationMark questionMark = new PunctuationMark("?");
        for (Sentence sentence : sentences) {
            if (questionMark.equals(sentence.getSentenceMembers()[sentence.getSentenceMembers().length - 1])) {
                questionSentences.add(sentence);
            }
        }
        return questionSentences.toArray(new Sentence[questionSentences.size()]);
    }
}
