package Tugas7;

public abstract class Bentuk implements MyInterface {
    protected String content;

    // Metode ini akan diimplementasikan oleh kelas turunan
    public abstract void displayMessage();

    protected String appendToMessage(String message, String append) {
        return message + append;
    }
    
    // Getter dan Setter untuk content
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}