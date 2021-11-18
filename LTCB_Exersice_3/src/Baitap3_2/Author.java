package Baitap3_2;

import org.jetbrains.annotations.NotNull;

public class Author {
    private String name;
    private int birthYear;

    /**
     *
     * @param name
     * @param birthYear
     */
    public Author(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    /**
     *
     * @return birthYear >= 1940
     */
    public boolean currentAuthor() {
        return this.birthYear >= 1940;
    }

    /**
     *
     * @param otherAuthor
     * @return name == otherAuthor name and birthYear == otherAuthor birthYear
     *
     */
    public boolean same(@NotNull Author otherAuthor) {
        return (this.name.equals(otherAuthor.name))
                && (this.birthYear == otherAuthor.birthYear);
    }

    public boolean sameGeneration(@NotNull Author otherAuthor) {
        return Math.abs(this.birthYear - otherAuthor.birthYear) <= 10;
    }
}
