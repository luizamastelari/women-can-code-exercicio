package com.womencancode.projetofinal.service;

import com.womencancode.projetofinal.exception.ServiceException;
import com.womencancode.projetofinal.validator.ModelValidator;
import com.womencancode.projetofinal.validator.ValidatorFactory;
import com.womencancode.projetofinal.repository.UserRepository;
import com.womencancode.projetofinal.model.User
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.womencancode.projetofinal.repository.RoleRepository;

@Slf4j
@Service
public class UserService {
    @Autowired
    private UserRepository  repository;
    private ModelValidator validator;

    public UserService (@Autowired UserRepository  repository){
        this.repository = repository;
        this.validator = ValidatorFactory.getValidator(User.class, repository);

    }
    public User insertUser (User user) throws Exception{
        validator.validateInsert(user);

    }
    public User updateUser(User user) throws ServiceException{
        validator.validateId(user.getId);
        return repository.save(user);
    }
}
