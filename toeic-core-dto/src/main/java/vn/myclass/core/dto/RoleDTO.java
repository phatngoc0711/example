package vn.myclass.core.dto;

import javax.persistence.Column;
import java.io.Serializable;

public class RoleDTO implements Serializable {
    private Integer roleid;
    private String name;

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
