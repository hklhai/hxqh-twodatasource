package com.hxqh.twodatasource.repository.primary;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Ocean lin on 2017/7/17.
 */

@Entity
@Table(name="tb_user")
//@NamedStoredProcedureQueries({@NamedStoredProcedureQuery(name = "p_truncate_twodatasource.trun_TB_USER", procedureName = "p_truncate_twodatasource.trun_TB_USER")})
public class User implements Serializable {

    @Id
    private Integer id;

    private String name;

    private String password;

    public User() {
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
