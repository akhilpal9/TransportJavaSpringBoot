package com.transport.repository;

import com.transport.model.Bus;
import com.transport.model.ERole;
import com.transport.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BusRepository extends JpaRepository<Bus, Long> {

}
