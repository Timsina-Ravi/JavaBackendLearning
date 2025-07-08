package MoodTrackerAPI.Controller;

import MoodTrackerAPI.Model.MoodEntry;
import MoodTrackerAPI.Service.MoodTracerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mood")
public class MoodTracerController {

    @Autowired  // connects this object with the service class
    // can be applied to fields, constructor parameters, or setter methods

    MoodTracerService mood;

    @PostMapping
    public String addMood(@RequestBody MoodEntry moodEntry){
        mood.addMood(moodEntry);
        return "Added Successfully";
    }


    @GetMapping
    public List<MoodEntry> viewAll( ){
        return mood.viewAll();
    }

    @GetMapping("/{id}")
    public MoodEntry viewById(@PathVariable int id){
       return mood.viewById(id);
    }

    @PutMapping("/{id}")
    public String updateMood(@PathVariable int id ,@RequestBody String newMood){
           return mood.updateMood(id,newMood);
    }

    @DeleteMapping("/{id}")
    public String deleteMood(@PathVariable int id){
       return mood.deleteMood(id);

    }
}
