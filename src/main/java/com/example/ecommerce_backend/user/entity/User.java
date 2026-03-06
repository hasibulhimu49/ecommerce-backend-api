package com.example.ecommerce_backend.user.entity;

import com.example.ecommerce_backend.common.entity.BaseEntity;
import com.example.ecommerce_backend.common.entity.Role;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "users_table")
@Getter
@Setter
public class User extends BaseEntity {

    private String name;

    @Column(unique = true, nullable = false)
    @Email(message = "Should be valid email")
    private String email;

    @Column(nullable = false)
    private String password;

    private String address;

    @Enumerated(EnumType.STRING)
    private Role role;
}
