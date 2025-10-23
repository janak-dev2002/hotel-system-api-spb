package com.jdev.hotelsystemapi.repo;

import com.jdev.hotelsystemapi.model.entity.Branch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BranchRepo extends JpaRepository<Branch,String> {
}
