package com.transport.controller;

import com.transport.service.BusService;
import com.transport.model.Bus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/bus")
public class BusController {
    private final BusService busService;

    @Autowired
    public BusController(BusService busService) {
        this.busService = busService;
    }

    @PostMapping("/add")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<String> addBus(@RequestBody Bus bus) {
        busService.addBus(bus);
        return ResponseEntity.ok("Bus added successfully");
    }

    @PutMapping("/update")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<String> updateBus(@RequestBody Bus bus) {
        busService.updateBus(bus);
        return ResponseEntity.ok("Bus updated successfully");
    }

    @DeleteMapping("/delete/{busId}")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<String> deleteBus(@PathVariable Long busId) {
        busService.deleteBusById(busId);
        return ResponseEntity.ok("Bus deleted successfully");
    }

    @GetMapping("/{busId}")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public Optional<Bus> getBusById(@PathVariable Long busId) {
        Optional<Bus> bus = busService.getBusById(busId);
        return bus;
    }
}