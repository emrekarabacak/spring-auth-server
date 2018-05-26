package com.emre.authserver;

import com.emre.authserver.model.Role;
import com.emre.authserver.model.User;
import com.emre.authserver.repository.UserRepository;
import com.emre.authserver.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.util.Collections;

@SpringBootApplication
public class AuthorizationServer {
    public static void main(String[] args) {
        SpringApplication.run(AuthorizationServer.class, args);
    }

    @Component
    private class Runner implements ApplicationRunner {

        @Autowired
        UserRepository userRepository;

        @Autowired
        RoleRepository roleRepository;

        @Override
        public void run(ApplicationArguments args) throws Exception {

            User user1 = new User();
            user1.setEmail("user@example.com");
            user1.setPassword("1234");
            user1.setUsername("user");
            Role admin = new Role();
            admin.setName("ROLE_ADMIN");
            admin.setUsers(Collections.singleton(user1));
            user1.setRoles(Collections.singleton(admin));
            roleRepository.save(admin);
            userRepository.save(user1);
        }
    }
}
