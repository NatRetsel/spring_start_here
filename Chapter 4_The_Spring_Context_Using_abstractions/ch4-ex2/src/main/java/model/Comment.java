package model;

public class Comment {
    /*
     * POJO class to define the comment
     */
    private String author;
    private String text;

    // getters
    public String getAuthor(){
        return this.author;
    }

    public String getText() {
        return this.text;
    }

    // setters
    public void setAuthor(String author) {
        this.author = author;
    }

    public void setText(String text) {
        this.text = text;
    }
}
