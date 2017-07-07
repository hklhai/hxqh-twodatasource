package com.hxqh.twodatasource.repository.second;

import javax.persistence.*;

/**
 * Created by Ocean lin on 2017/7/1.
 */
@Entity
@Table(name = "tb_user")
public class SecondUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;
    private String password;

    public SecondUser() {
    }

    public SecondUser(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
