package com.transport.repository;

import com.transport.model.ERole;
import com.transport.model.Role;
import com.transport.model.Route;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RouteRepository extends JpaRepository<Route, Long> {
}
