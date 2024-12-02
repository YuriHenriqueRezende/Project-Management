package mange.moto.specifications;

import mange.moto.models.Motos;
import net.kaczmarzyk.spring.data.jpa.domain.EqualIgnoreCase;
import net.kaczmarzyk.spring.data.jpa.domain.LikeIgnoreCase;
import net.kaczmarzyk.spring.data.jpa.web.annotation.And;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Spec;
import org.springframework.data.jpa.domain.Specification;

public class MotosSpecification {

    @And({
            @Spec(path = "FRENTE.title", params = "FRENTETitle", spec = LikeIgnoreCase.class),
            @Spec(path = "MOTOR.title", params = "MOTORTitle", spec = LikeIgnoreCase.class),
            @Spec(path = "RODAFRENTE.title", params = "RODAFRENTETitle", spec = LikeIgnoreCase.class),
            @Spec(path = "RODATRASEIRA.title", params = "RODATRASEIRATitle", spec = LikeIgnoreCase.class),

            @Spec(path = "FRENTE.type", params = "FRENTEType", spec = EqualIgnoreCase.class),
            @Spec(path = "MOTOR.type", params = "MOTORType", spec = EqualIgnoreCase.class),
            @Spec(path = "RODAFRENTE.type", params = "RODAFRENTEType", spec = EqualIgnoreCase.class),
            @Spec(path = "RODATRASEIRA.type", params = "RODATRASEIRAType", spec = EqualIgnoreCase.class),

            @Spec(path = "FRENTE.id", params = "FRENTEId", spec = EqualIgnoreCase.class),
            @Spec(path = "MOTOR.id", params = "MOTORId", spec = EqualIgnoreCase.class),
            @Spec(path = "RODAFRENTE.id", params = "RODAFRENTEId", spec = EqualIgnoreCase.class),
            @Spec(path = "RODATRASEIRA.id", params = "RODATRASEIRAArmId", spec = EqualIgnoreCase.class),

    })
    public interface MotosEspec extends Specification<Robots> {}
}
