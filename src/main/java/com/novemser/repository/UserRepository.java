package com.novemser.repository;

import com.novemser.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Project: SpringMVCDemo
 * Package: com.novemser.repository
 * Author:  Novemser
 * 2016/11/20
 */
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {

    @Transactional  // 说明方法是事务性操作
    @Modifying      // 说明方法是修改操作
    @Query("update UserEntity us set " +
            "us.nickname=:qNickName," +
            "us.firstName=:qFirstName," +
            "us.lastName=:qLastName," +
            "us.password=:qPassword " +
            "where us.id=:qId")
    void updateUser(@Param("qNickName") String nickName, @Param("qFirstName") String firstName,
                    @Param("qLastName") String lastName, @Param("qPassword") String password,
                    @Param("qId") Integer id);
}
