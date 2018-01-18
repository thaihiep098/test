package com.test.entity;

import org.hibernate.validator.constraints.Email;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "users")
public class UsersEntity {
    private int id;
    private String account;
    private String email;
    private String name;
    private String password;
    private byte[] accessToken;
    private boolean isActive = false;
    private Set<GroupsEntity> groupsEntities;

    public UsersEntity() {}

    public UsersEntity(String account, String password) {
        this.account = account;
        this.password = password;
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "account")
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    @Basic
    @Column(name = "email")
    @Email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "access_token")
    public byte[] getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(byte[] accessToken) {
        this.accessToken = accessToken;
    }

    @Basic
    @Column(name = "active")
    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }


    public Set<GroupsEntity> getGroupsEntities() {
        return groupsEntities;
    }

    public void setGroupsEntities(Set<GroupsEntity> groupsEntities) {
        this.groupsEntities = groupsEntities;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessToken, email, id, name, account, password);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UsersEntity that = (UsersEntity) o;

        if (id != that.id) return false;
        if (accessToken != null ? !accessToken.equals(that.accessToken) : that.accessToken != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (account != null ? !account.equals(that.account) : that.account != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        return true;
    }
}
