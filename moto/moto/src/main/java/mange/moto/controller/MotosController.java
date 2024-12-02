package mange.moto.controller;

package mange.moto.controller;

import mange.moto.models.Motos;
import mange.moto.models.dto.MotosDto;
import mange.moto.models.dto.UpdateMotosDto;
import mange.moto.service.MotosService;
import mange.moto.specifications.MotosSpecification;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/motos")
@CrossOrigin(origins = "*")
public class RobotsController {

    @Autowired
    MotosService robotsService;

    @GetMapping
    public ResponseEntity<Page<Motos>> getAllRobots(
            Pageable pageable,
            MotosSpecification.MotosSpec spec ) {
        return ResponseEntity.ok(
                robotsService.getAllRobots(pageable,spec)
        );
    }

    @PostMapping
    public ResponseEntity<List<Motos>> addNewRobot(@RequestBody @Valid List<MotosDto> Motos) {

        List<Motos> MotosList = Motos.stream().map(MotosDto::mapToRobot).toList();
        return ResponseEntity.status(HttpStatus.CREATED).body(
                robotsService.saveMotos(MotosList));
    }


    @PutMapping("/{id}")
    public ResponseEntity<Motos> updateRobot(
            @PathVariable UUID id,
            @RequestBody @Valid UpdateMotosDto robot) {

        Motos convertedMotos = robot.mapToMoto();
        convertedMotos.setId(id);

        return ResponseEntity.status(HttpStatus.ACCEPTED).body(
                robotsService.updateRobot(convertedMotos));
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void deleteMoto(@PathVariable UUID id) {
        motosService.deleteMoto(id);
    }



}

