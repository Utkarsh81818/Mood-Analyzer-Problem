package com.bridgelabz;

/**
 * Purpose  - “I am in Happy Mood” message in Constructor Should Return Happy
 * @author  - Utkarsh Mishra
 * @version - 16.0
 * @since   - 2021-10-05
 */

public class MoodAnalyser {
    public static String message;

    // Constructor
    public MoodAnalyser(String message) {
        this.message = message;
        analyseMood();
    }

    //Getter
    public String getMessage() {
        return message;
    }

    //Setter
    public void setMessage(String message) {
        this.message = message;
    }

    public String analyseMood() {
        if (message.toLowerCase().contains("sad")) {
            return "Sad";
        } else if (message.toLowerCase().contains("happy")) {
        }
        return "Happy";
    }
}