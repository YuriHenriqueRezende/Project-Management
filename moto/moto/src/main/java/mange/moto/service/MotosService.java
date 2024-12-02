package mange.moto.service;

import mange.moto.models.Motos
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;
import java.util.UUID;

public interface MotosService {

    Page<Motos> getAllRobots(Pageable page, Specification<Motos> spec);

    List<Motos> saveRobots(List<Motos> robots);

    Motos updateRobot(Motos robot);

    void deleteRobot(UUID id);
}