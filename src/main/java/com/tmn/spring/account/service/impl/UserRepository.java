/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tmn.spring.account.service.impl;


import com.tmn.spring.account.model.User;
import java.util.HashMap;
import org.apache.log4j.Logger;

/**
 *
 * @author roofimon
 */
public class UserRepository {
   private static Logger logger = Logger.getLogger(UserRepository.class);
    private HashMap<String, User> repository;
    public UserRepository(){
        repository = new HashMap<String, User>();
        User firstUser = new User("ohwow", "1234");
        User secondUser = new User("kik", "1234");
        User thirdUser = new User("tul", "1234");
        repository.put(firstUser.getUsername(), firstUser);
        repository.put(secondUser.getUsername(), secondUser);
        repository.put(thirdUser.getUsername(), thirdUser);
    }
    
    public User getUserByUsername(String username){
        logger.debug("Finding: "+username);
        return this.repository.get(username);
    }
}
