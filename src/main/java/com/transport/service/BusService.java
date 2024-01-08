package com.transport.service;

import com.transport.model.Bus;
import com.transport.repository.BusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BusService {
    private final BusRepository busRepository;

    @Autowired
    public BusService(BusRepository busRepository) {
        this.busRepository = busRepository;
    }

    public void addBus(Bus bus) {
        busRepository.save(bus);
    }

    public void updateBus(Bus bus) {
        busRepository.save(bus);
    }

    public Optional<Bus> getBusById(Long busId) {
        return busRepository.findById(busId);
    }

    public void deleteBusById(Long busId) { busRepository.deleteById(busId); }
}