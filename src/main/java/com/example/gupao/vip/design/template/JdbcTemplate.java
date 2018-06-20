package com.example.gupao.vip.design.template;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zzf
 * @date 2018/6/21 06:48.
 */
public /*abstract*/ class JdbcTemplate {


    private DataSource dataSource;

    public JdbcTemplate(DataSource dataSource) {
        this.dataSource = dataSource;
    }


    private Connection getConnection() throws SQLException {
        return this.dataSource.getConnection();
    }

    private PreparedStatement createPreparedStatement(Connection connection, String sql) throws SQLException {
        return connection.prepareCall(sql);
    }

    private ResultSet executQuery(PreparedStatement pstm, Object[] values) throws SQLException {

        for (int i = 0; i < values.length; i++) {
            pstm.setObject(i, values[i]);
        }
        return pstm.executeQuery();
    }

    private void closeStatement(Statement stmt) throws SQLException {
        stmt.close();
    }

    private void closeResultSet(ResultSet rst) throws SQLException {
        rst.close();
    }

    private void closeConnection(Connection conn) throws SQLException {
        //放到连接池中回收
//        conn.close();
    }

    private List<Object> parseResultSet(ResultSet rs, RowMapper rowMapper) throws Exception {
        List<Object> result = new ArrayList();

        int rowNum = 1;
        while (rs.next()) {

            result.add(rowMapper.mapRow(rs, rowNum++));
        }
        return result;
    }

    public List<Object> executeQuery(String sql, RowMapper rowMapper, Object[] values){
        try {
            //获取链接
//            Connection conn = dataSource.getConnection();
            Connection conn = this.getConnection();

            //创建语句集
//            PreparedStatement pstmt = conn.prepareStatement(sql);
            PreparedStatement pstmt = this.createPreparedStatement(conn, sql);

            //执行语句集，并且获取结果集
//            ResultSet rs = pstmt.executeQuery();
            ResultSet rs = this.executQuery(pstmt, values);

            //解析结果集
//            List<Object> result = new ArrayList();
//            int rowNum = 1;
//            while (rs.next()) {
//
//                Object o = processResult(rs, rowNum++);
//                result.add(o);
//            }
            List<Object> result = this.parseResultSet(rs, rowMapper);

            //关闭 结果集
//            rs.close();
            this.closeResultSet(rs);
            //关闭 语句集
//            pstmt.close();
            this.closeStatement(pstmt);
            //关闭链接
//            conn.close();
            this.closeConnection(conn);

            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

//    public abstract Object processResult(ResultSet rs, int rowNum) throws Exception;
}
