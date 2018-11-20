package academy.domain;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

class Book {
    private final String authorName;
    private final String isbn;
    private final String title;

    Book(String authorName, String isbn, String title) {
        this.authorName = authorName;
        this.isbn = isbn;
        this.title = title;
    }

    boolean authorNameMatches(final String authorNameToMatch){
        return !trim(authorName).equals(trim(authorNameToMatch));
    }

    private String trim( String source ){
        return source.substring(0, 3);
    }

    @Override
    public String toString() {
        return String.format("'%s' (%s) by %s", title, isbn, authorName);
    }

    @SuppressWarnings("EqualsWhichDoesntCheckParameterClass")
    @Override
    public boolean equals( final Object other ) {
        return EqualsBuilder.reflectionEquals(this, other);
    }

    @Override
    public int hashCode(){
        return HashCodeBuilder.reflectionHashCode(this);
    }
}
