package com.transport.service;

import com.transport.model.Route;
import com.transport.repository.RouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RouteService {
    private final RouteRepository routeRepository;

    @Autowired
    public RouteService(RouteRepository routeRepository) {
        this.routeRepository = routeRepository;
    }

    public List<Route> getAllRoutes() {
        return routeRepository.findAll();
    }

    public Optional<Route> getRouteById(Long routeId) {
        return routeRepository.findById(routeId);
    }

    public void add(Route route) {
        System.out.println(route.getId());
        System.out.println(route.getRouteName());
        routeRepository.save(route);
    }

    public void delete(Route route) {
        routeRepository.delete(route);
    }
}