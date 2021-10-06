package com.bridgelabz;

/**
 * Purpose  - “I am in Any Mood” message Should Return HAPPY
 * @author  - Utkarsh Mishra
 * @version - 16.0
 * @since   - 2021-10-05
 */

public class MoodAnalyser {
    public static String analyseMood(String message) {
        if (message.toLowerCase().contains("sad")) {
            return "Sad";
        } else if (message.toLowerCase().contains("Any")) {
        }
        return "Happy";
    }
}