package backend.server.modules;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {



    @GetMapping("/")
    private HTTPMessage index(){
        return new HTTPMessage(
                "Hello there",
                200
        );
    }


    @Autowired
    private NotesRepository repo;

    @GetMapping("notes")
    private List<NotesEntity> allNotes() {
        return this.repo.findAll();
    }

}

record HTTPMessage(String message, int code) {};

