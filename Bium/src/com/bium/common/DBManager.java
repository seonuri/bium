package com.bium.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class DBManager {//singleton pattern
     private static Connection conn;
     
     private final static String DRIVER = "oracle.jdbc.driver.OracleDriver";
     private final static String URL = "jdbc:oracle:thin:@192.168.0.11:1521:xe";
     private final static String USER = "java";
     private final static String PASSWORD = "1234";
     
     //다른 class에서 객체생성을 하지 못하게 막는다.
     private DBManager(){
          
     }
     
     //instance를 생성 또는 기존 인스턴스를 반환하는 메서드
     public static Connection getConnection(){
          conn = null;
          if(conn == null){
              try {
                   Class.forName(DRIVER);
                   conn = DriverManager.getConnection(URL, USER, PASSWORD);
              } catch (Exception e) {
                   e.printStackTrace();
              }
          }
          return conn;
     }
     public static void close(Connection conn, PreparedStatement pstmt, ResultSet rs){
          try {
              if(conn != null){
                   try {
                        conn.close();
                   } catch (Exception e) {
                        e.printStackTrace();
                   }
                   
              if(pstmt !=null){
                   try {
                        pstmt.close();
                   } catch (Exception e) {
                        e.printStackTrace();
                   }
              }
                   if(rs != null){
                        try {
                             rs.close();
                   } catch (Exception e) {
                             e.printStackTrace();
                   }    
              }
              }
          } catch (Exception e) {
              e.printStackTrace();
          }
     }
     //insert, update, delete close 메서드
     public static void close(Connection conn, PreparedStatement pstmt){
          try {
              if(conn != null){
                   try {
                        conn.close();
                   } catch (Exception e) {
                        e.printStackTrace();
                   }
                   
              if(pstmt !=null){
                   try {
                        pstmt.close();
                   } catch (Exception e) {
                        e.printStackTrace();
                   }
              }           
              }
          } catch (Exception e) {
              e.printStackTrace();
          }
     }     
}