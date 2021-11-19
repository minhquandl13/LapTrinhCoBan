package Baitap3_2;

import java.time.LocalTime;

public class Author {
    private String name;
    private int birthYear;
    private LocalTime birthDate;

    /**
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
     * Example :
     * Author doraemonAuthor = new Author("Doraemon Author", 1960)
     * doraemonAuthor.currentAuthor() --> Result : true
     */
    public boolean currentAuthor() {
        return this.birthYear >= 1940;
    }

    /**
     * @param otherAuthor
     * @return name == otherAuthor name and birthYear == otherAuthor birthYear
     * Example :
     * Author doraemonAuthor = new Author("Doraemon Author", 1960)
     * Author dragonballAuthor = new Author("Dragonball Author", 1939)
     * doraemonAuthor.same(dragonballAuthor) --> Result : false
     */
    public boolean same(Author otherAuthor) {
        return (this.name.equals(otherAuthor.name))
                && (this.birthYear == otherAuthor.birthYear);
    }

    /**
     * Determines whether two books were written by two authors born less than 10 year apart
     *
     * @param otherAuthor
     * @return abs(birthYear - otherAuthor birthYear) <= 10
     * Example :
     * Author doraemonAuthor = new Author("Doraemon Author", 1960)
     * Author dragonballAuthor = new Author("Dragonball Author", 1939)
     * doraemonAuthor.sameGeneration(dragonballAuthor) --> Result : false
     */
    public boolean sameGeneration(Author otherAuthor) {
        return Math.abs(this.birthYear - otherAuthor.birthYear) <= 10;
    }

    /**
     * @param object
     * @return name = otherAuthor name and birthYear = otherAuthor birthYear
     * Example :
     * Author doraemonAuthor = new Author("Doraemon Author", 1960)
     * Author dragonballAuthor = new Author("Dragonball Author", 1939)
     * ddoraemonAuthor.equals(dragonballAuthor) --> Result : false
     */
    public boolean equals(Object object) {
        if (!(object instanceof Author otherAuthor)) {
            return false;
        } else {
            return (this.name.equals(otherAuthor.name))
                    && (this.birthYear == otherAuthor.birthYear);
        }
    }
}
