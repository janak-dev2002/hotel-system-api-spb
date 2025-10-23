package com.jdev.hotelsystemapi.repo;

import com.jdev.hotelsystemapi.model.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address,String> {
}
