package com.garage.Garage.service;

import com.garage.Garage.model.User;

import java.util.Collection;
import java.util.Optional;

public interface UserService {
    Optional<User> getById(Long id);
    Collection<User> getAll();
    User save(User user);
    void delete(User user);

}
