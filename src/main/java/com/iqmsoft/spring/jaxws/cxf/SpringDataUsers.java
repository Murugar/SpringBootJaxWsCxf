package com.iqmsoft.spring.jaxws.cxf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SpringDataUsers implements Users {

    private final UsersRepository repository;

    @Autowired
    public SpringDataUsers(UsersRepository repository) {
        this.repository = repository;
    }

   
    public Long create(User user) {
        return repository.save(user).getId();
    }

    public User retrieve(Long id) {
        return repository.findOne(id);
    }

    public void update(User user) {
        repository.save(user);
    }

    public void delete(Long id) {
        repository.delete(id);
    }
}
