package com.liaokuo.springcloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * Created by Rain on 2020/8/18.
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)
public class Dept implements Serializable {
    private Long deptno;

    private String dname;

    private String db_source;

    public Dept(String dname) {
        this.dname = dname;
    }
}
