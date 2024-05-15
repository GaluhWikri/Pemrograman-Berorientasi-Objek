package Tugas7;

public class Tabung extends Bentuk {
    private String from;
    private String to;


    public void displayMessage() {
        content = "Tabung ";
        System.out.println(content);
        System.out.println(appendToMessage(content, "tabung"));
    }
    
    // Getter dan Setter untuk from
    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    // Getter dan Setter untuk to
    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }
}




