package com.neu.api.repository;

import com.neu.api.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends Repository<User, String> {
    public List<User> findAll();

    /*public Page<User> findAll(Pageable pageable);*/

    public Optional<User> findOne(String id);

    public Optional<User> findByEmail(String email);

//    Save() function can be used for Insert and Update both
    public User save(User user);

    public void delete(User user);

}
