package org.example.repository;

import org.example.Enum.Role;
import org.example.entity.User;
import org.example.services.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class RepositoryImplTest {

    @Test
    void create() {
        User user = new User("omid","heidary","omid@gmail.com", LocalDate.now(),"Aa123456@", Role.getFromString("customer"),true,0L);
        UserService userService = new UserService(new UserRepository());
        assertDoesNotThrow((Executable) userService.create(user));
    }
}