package lab5;

import java.util.Objects;

public class Letter {
    private char letter;
    public Letter(char letter) {
        this.letter = letter;
    }

    @Override
    public String toString() {
        return String.valueOf(letter);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Letter letter1 = (Letter) o;
        return String.valueOf(letter).equalsIgnoreCase(String.valueOf(letter1.letter));
    }
}
