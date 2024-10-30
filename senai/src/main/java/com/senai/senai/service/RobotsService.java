package com.senai.senai.service;

import com.senai.senai.models.Robots;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;
import java.util.UUID;

public interface RobotsService {

    Page<Rotots> getAllParts(Pageable page, Specification<Rotots> spec);

    List<Rotots> saveParts(List<Rotots> parts);

    Rotots updateRobot(Rotots part);

    void deleteRobot(UUID id);
}
