package com.jdev.hotelsystemapi.repo;

import com.jdev.hotelsystemapi.model.entity.Facility;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacilityRepo extends JpaRepository<Facility, Long> {
}
