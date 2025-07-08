package MoodTrackerAPI.Service;

import MoodTrackerAPI.Model.MoodEntry;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service   // @Component /// this is used to get an object of this class (Dependency Injection )_

public class MoodTracerService {
    List<MoodEntry> moodEntries = new ArrayList<>();

    public String addMood(MoodEntry moodEntry) {
        moodEntries.add(moodEntry);
        return "Added Successfully";
    }

    public List<MoodEntry> viewAll() {
        return moodEntries;
    }

    public MoodEntry viewById(int id) {
        for (int i = 0; i < moodEntries.size(); i++) {
            if (moodEntries.get(i).getId() == id) {
                return moodEntries.get(i);
            }
        }
        return null;
    }

    public String updateMood(int id, String newMoodEntry) {
        for (MoodEntry moodEntry : moodEntries) {
            if (moodEntry.getId() == id) {
                moodEntry.setMood(newMoodEntry);
              return "Updated Successfully";
            }
        }
        return "Moods not found";
    }

    public String deleteMood(int id) {
        for (int i = 0; i < moodEntries.size(); i++) {
            if (moodEntries.get(i).getId() == id) {
                moodEntries.remove(i);
                return "Deleted Successfully";
            }
        }
        return "Mood not found to delete";
    }
}