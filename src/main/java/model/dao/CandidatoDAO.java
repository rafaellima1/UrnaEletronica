/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Candidato;



/**
 *
 * @author batcomputador
 */
public class CandidatoDAO {
    
    public static void create(Candidato c)throws SQLException {
        
        Connection con = ConnectionFactory.getConnection();
        
        String query = "select nome,nomevice,numero,partido,cargo";
        
        try (Statement stmt = con.createStatement()){
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()){
                String nome = rs.getString("nome");
                String nomevice = rs.getString("nomevice");
                int numero = rs.getInt("numero");
                String partido = rs.getString("partido");
                String cargo = rs.getString("cargo");
                
            
            }      
           
           } catch (SQLException ex) {
            Logger.getLogger(CandidatoDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        }finally{
            ConnectionFactory.closeConnection(con);
        }
    
    }
    
}
