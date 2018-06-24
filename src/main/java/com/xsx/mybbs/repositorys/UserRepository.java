package com.xsx.mybbs.repositorys;

import com.xsx.mybbs.entitys.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

public interface UserRepository extends JpaRepository<User, Long>, JpaSpecificationExecutor<User>, Serializable {

}
