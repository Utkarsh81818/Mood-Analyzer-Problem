package com.bridgelabz;

/**
 * Purpose  - ability to analyse and respond happy or sad mood
 * @author  - Utkarsh Mishra
 * @version - 16.0
 * @since   - 2021-10-05
 */

public class MoodAnalyser {
    public static String analyseMood(String message) {
        if (message.toLowerCase().contains("sad")) {
            return "Sad";
        } else if (message.toLowerCase().contains("happy")) {
            return "Happy";
        }
        return null;
    }

    public static void main(String[] args) {
        String mood = MoodAnalyser.analyseMood("User is Happy");
        System.out.println(mood);
        mood = MoodAnalyser.analyseMood("User is Sad");
        System.out.println(mood);
    }
}