package mange.moto.models.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import mange.moto.models.Parts;
import mange.moto.models.Motos;
import lombok.Data;

import java.io.Serializable;
import java.util.UUID;

@Data
public class MotosDto implements Serializable {

    private UUID head;
    private UUID base;
    private UUID leftArm;
    private UUID rightArm;
    private UUID torso;
    private UUID userId;

    @JsonIgnore
    public Motos mapToRobot(){
        return Motos.builder()
                .FRENTE(Parts.builder().id(this.head).build())
                .MOTOR(Parts.builder().id(this.base).build())
                .RODAFRENTE(Parts.builder().id(this.leftArm).build())
                .RODATRASEIRA(Parts.builder().id(this.rightArm).build())
                .userId(this.userId)
                .build();
    }
}