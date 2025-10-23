package com.jdev.hotelsystemapi.repo;

import com.jdev.hotelsystemapi.model.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepo extends JpaRepository<Hotel, String> {
}
