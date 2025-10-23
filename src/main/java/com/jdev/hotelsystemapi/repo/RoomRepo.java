package com.jdev.hotelsystemapi.repo;

import com.jdev.hotelsystemapi.model.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepo extends JpaRepository<Room,String> {
}
