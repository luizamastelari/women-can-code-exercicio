package com.womencancode.projetofinal.validator;

import com.womencancode.projetofinal.repository.RoleRepository;
import org.springframework.data.repository.CrudRepository;

public class ValidatorFactory {
    public static < T extends BaseModel> ModelValidator getValidator (Class<T > clazz, CrudRepository repository){
        if (User.class.equals(clazz))
            return new UserValidator ((UserRepository)repository);

        if (Role.class.equals(clazz))
            return new RoleValidator ((RoleRepository) repository);

        return null;
    }

}
