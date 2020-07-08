package com.example.mental_health_care;

//information for Chat info
public class Chat {


    public String email;
    public String text;
    //no argument class

    public Chat() {

    }



    public Chat(String email, String text) {
        this.email = email;
        this.text = text;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}