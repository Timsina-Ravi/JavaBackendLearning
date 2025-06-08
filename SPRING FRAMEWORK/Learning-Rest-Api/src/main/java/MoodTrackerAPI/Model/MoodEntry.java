/*🧠 Question 4: Daily Mood Tracker API
Problem Statement:
 Model: MoodEntry
public class MoodEntry {
    private int id;
    private String date;       // Format: yyyy-MM-dd
    private String mood;       // e.g., "Happy", "Sad", "Angry", "Excited"
    private String note;       // Optional note about the day
}
Endpoints:
1. `GET /moods` – List all mood entries
2. `GET /moods/{id}` – Get a specific mood entry
3. `POST /moods` – Add a new mood entry
4. `PUT /moods/{id}` – Edit an existing mood entry
5. `DELETE /moods/{id}` – Delete a mood entry  */
package MoodTrackerAPI.Model;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class MoodEntry {
    private int id;
    private String date;       // Format: yyyy-MM-dd
    private String mood;       // e.g., "Happy", "Sad", "Angry", "Excited"
    private String note;       // Optional note about the day

    public MoodEntry() {

    }

    public MoodEntry(int id, String date, String mood, String note) {
        this.id = id;
        this.date = date;
        this.mood = mood;
        this.note = note;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
