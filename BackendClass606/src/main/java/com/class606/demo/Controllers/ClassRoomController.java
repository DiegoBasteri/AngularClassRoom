package com.class606.demo.Controllers;

import com.class606.demo.Models.ClassRoom;
import com.class606.demo.Services.ClassRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ClassRoomController {
    @Autowired
    ClassRoomService classRoomService;

    @GetMapping("/getAllClassRooms")
    @CrossOrigin
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<ClassRoom> classRoomList (){
        return classRoomService.classRoomList();
    }

    @PostMapping("/newClassRoom")
    @CrossOrigin
    @ResponseStatus(HttpStatus.CREATED)
    public ClassRoom newClassRoom(@RequestParam String title,@RequestParam String description){
        return classRoomService.newClassRoom(title,description);
    }
}
