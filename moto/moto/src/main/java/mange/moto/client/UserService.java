package mange.moto.client;

import mange.moto.models.dto.UserDto
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Objects;
import java.util.UUID;


@Slf4j
@Component
public class UserService {

    @Autowired
    UserClient userClient;

    //busca o usuário no outro microsserviço
    public UserDto getUserIfExists(UUID id){
        try{
            return userClient.getUserById(id);
        } catch (Exception e){
            log.error("User not found or an unknown error happened!");
            return null;
        }
    }

    public boolean checkIfUserExists(UUID id){
        return Objects.nonNull(getUserIfExists((id)));
    }



}