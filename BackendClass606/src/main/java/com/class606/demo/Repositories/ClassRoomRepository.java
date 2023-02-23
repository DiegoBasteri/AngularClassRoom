package com.class606.demo.Repositories;

import com.class606.demo.Models.ClassRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassRoomRepository extends JpaRepository <ClassRoom,Integer> {
}
