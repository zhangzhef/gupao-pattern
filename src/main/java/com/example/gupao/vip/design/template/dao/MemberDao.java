package com.example.gupao.vip.design.template.dao;

import com.example.gupao.vip.design.template.JdbcTemplate;
import com.example.gupao.vip.design.template.RowMapper;
import com.example.gupao.vip.design.template.entity.Member;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @author zzf
 * @date 2018/6/21 06:59.
 */
public class MemberDao /*extends JdbcTemplate*/ {

//    public MemberDao(DataSource dataSource) {
//        super(dataSource);
//    }


    //为什么不继承， 解耦合！！！
    private JdbcTemplate jdbcTemplate = new JdbcTemplate(null);


    public List<Object> query() {
        String sql = "select * from t_member";

        return jdbcTemplate.executeQuery(sql, new RowMapper() {
            @Override
            public Member mapRow(ResultSet rs, int i) throws SQLException {
                Member member = new Member();

                member.setUsername(rs.getString("username"));
                member.setPassword(rs.getString("password"));
                member.setAge(rs.getInt("age"));
                member.setAddr(rs.getString("addr"));

                return member;
            }
        }, null);
    }

//    @Override
//    public Object processResult(ResultSet rs, int rowNum) throws Exception {
//        Member member = new Member();
//
//        member.setUsername(rs.getString("username"));
//        member.setPassword(rs.getString("password"));
//        member.setAge(rs.getInt("age"));
//        member.setAddr(rs.getString("addr"));
//
//        return member;
//    }
}
