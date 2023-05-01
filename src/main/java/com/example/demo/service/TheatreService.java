package com.example.demo.service;



import com.example.demo.service.impl.Theatre;

import java.util.List;

public interface TheatreService {
    List<Theatre> getAllTheatres();

    Theatre getTheatreById(Long theatre_id);

    Theatre pushTheatre(Theatre newTheatre);

    Theatre updateTheatre(Theatre updatedTheatre, Long theatre_id);

    void deleteTheatreById(Long theatre_id);
}
