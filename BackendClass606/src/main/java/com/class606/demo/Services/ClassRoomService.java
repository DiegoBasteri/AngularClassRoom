package com.class606.demo.Services;

import com.class606.demo.Models.ClassRoom;
import com.class606.demo.Repositories.ClassRoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassRoomService {
    @Autowired
    ClassRoomRepository classRoomRepository;


    public List<ClassRoom> classRoomList (){
        return classRoomRepository.findAll();
    }

    public ClassRoom newClassRoom (String title,String description){
        return classRoomRepository.save(new ClassRoom(title,description));
    }
}
