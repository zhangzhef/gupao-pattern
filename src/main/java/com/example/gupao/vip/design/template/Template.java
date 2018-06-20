//package com.example.gupao.vip.design.template;
//
//import javax.sql.DataSource;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.util.List;
//
///**
// * @author zzf
// * @date 2018/6/21 06:48.
// */
//public abstract class Template {
//
//    private DataSource dataSource;
//
//    public JdbcTemplate(DataSource dataSource) {
//        this.dataSource = dataSource;
//    }
//
//    public List<?> executeQuery(String sql, Object[] values){
//        try {
//            //获取链接
//            Connection conn = dataSource.getConnection();
//
//            //创建语句集
//            PreparedStatement pstmt = conn.prepareStatement(sql);
//
//            //执行语句集，并且获取结果集
//            ResultSet rs = pstmt.executeQuery();
//
//            //解析结果集
//            List<?> result = processResult(rs);
//
//            //关闭 结果集
//            rs.close();
//
//            //关闭 语句集
//            pstmt.close();
//            //关闭链接
//            conn.close();
//
//            return result;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//
//    public abstract List<?> processResult(ResultSet rs);
//}
