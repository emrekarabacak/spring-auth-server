package com.veeb.constructionapp.repository;

import com.veeb.constructionapp.model.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository class for user roles
 */
@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {

}
