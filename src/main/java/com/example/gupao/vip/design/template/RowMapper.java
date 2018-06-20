package com.example.gupao.vip.design.template;

import java.sql.ResultSet;

/**
 * @author zzf
 * @date 2018/6/21 07:18.
 */
public interface RowMapper<T> {


    T mapRow(ResultSet rs, int i) throws Exception;
}
