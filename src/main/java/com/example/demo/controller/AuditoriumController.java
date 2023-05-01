package com.example.demo.controller;
import com.example.demo.model.Auditorium;
import com.example.demo.service.AuditoriumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuditoriumController {
    private AuditoriumService auditoriumService;

    @Autowired
    public AuditoriumController(AuditoriumService auditoriumService) {
        this.auditoriumService = auditoriumService;
    }

    @GetMapping("/auditoriums")
    public List<Auditorium> getAllTheatres() {
        return auditoriumService.getAllAuditoriums();
    }
}
