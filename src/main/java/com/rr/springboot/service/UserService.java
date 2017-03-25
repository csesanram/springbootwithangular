/**
 * 
 */
package com.rr.springboot.service;

import java.util.List;

import com.rr.springboot.model.User;

/**
 * @author sankar.ramasamy
 *
 */
public interface UserService {

	User findById(long id);
    
    User findByName(String name);
     
    void saveUser(User user);
     
    void updateUser(User user);
     
    void deleteUserById(long id);
 
    List<User> findAllUsers();
     
    void deleteAllUsers();
     
    boolean isUserExist(User user);
}
