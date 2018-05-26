package com.emre.authserver.model;

import javax.persistence.*;
import java.util.Set;

/**
 * Role class for users
 */
@Entity(name = "role")
public class Role {

    private long id;
    private String name;
    private Set<User> users;

    @Id
    @GeneratedValue
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToMany(mappedBy = "roles", fetch = FetchType.EAGER)
    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
