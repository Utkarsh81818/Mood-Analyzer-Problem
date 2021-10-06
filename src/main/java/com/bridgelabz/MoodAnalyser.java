package com.bridgelabz;

/**
 * Purpose  - Given Null Mood Should Return Happy
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

    public static String analyseMood() {
        try {
            if (message.toLowerCase().contains("sad")) {
                return "Sad";
            } else {
                return "Happy";
            }
        } catch (NullPointerException e) {
            return "Happy";
        }
    }
}