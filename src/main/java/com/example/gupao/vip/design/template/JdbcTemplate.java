package com.example.gupao.vip.design.template;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zzf
 * @date 2018/6/21 06:48.
 */
public class JdbcTemplate {


    private DataSource dataSource;

    public JdbcTemplate(DataSource dataSource) {
        this.dataSource = dataSource;
    }


    /**
     * 建立 连接
     * @return
     * @throws SQLException
     */
    private Connection getConnection() throws SQLException {
        return this.dataSource.getConnection();
    }

    /**
     * 创建 语句集
     * @param connection
     * @param sql
     * @return
     * @throws SQLException
     */
    private PreparedStatement createPreparedStatement(Connection connection, String sql) throws SQLException {
        return connection.prepareCall(sql);
    }

    private ResultSet executQuery(PreparedStatement pstm, Object[] values) throws SQLException {

        for (int i = 0; i < values.length; i++) {
            pstm.setObject(i, values[i]);
        }
        return pstm.executeQuery();
    }

    /**
     * 关闭 语句集
     * @param stmt
     * @throws SQLException
     */
    private void closeStatement(Statement stmt) throws SQLException {
        stmt.close();
    }

    /**
     * 关闭 结果集
     * @param rst
     * @throws SQLException
     */
    private void closeResultSet(ResultSet rst) throws SQLException {
        rst.close();
    }

    /**
     * 关闭连接
     * @param conn
     * @throws SQLException
     */
    private void closeConnection(Connection conn) throws SQLException {
        //放到连接池中回收
    }

    /**
     * 解析结果集
     * @param rs
     * @param rowMapper
     * @return
     * @throws Exception
     */
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
            Connection conn = this.getConnection();

            //创建语句集
            PreparedStatement pstmt = this.createPreparedStatement(conn, sql);

            //执行语句集，并且获取结果集
            ResultSet rs = this.executQuery(pstmt, values);

            //解析结果集
            List<Object> result = this.parseResultSet(rs, rowMapper);

            //关闭 结果集
            this.closeResultSet(rs);
            //关闭 语句集
            this.closeStatement(pstmt);
            //关闭链接
            this.closeConnection(conn);

            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

//    public abstract Object processResult(ResultSet rs, int rowNum) throws Exception;
}
