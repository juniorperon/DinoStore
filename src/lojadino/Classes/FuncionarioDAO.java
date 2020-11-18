/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojadino.Classes;

import Conexão.SQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class FuncionarioDAO {
    
        Connection conn;
        
          public ResultSet autenticacaoUsuario(Funcionario objFuncionario){
             SQL mysql = new SQL();
                 mysql.conectaBanco();
            try {
            String sql = "select * from cadastrofuncionario where cpf_func = ? and senha_func = ? ";
            
                PreparedStatement pstm = conn.prepareStatement(sql);
                
                pstm.setString(1, objFuncionario.getCpf());
                pstm.setString(1, objFuncionario.getSenha());
                
                ResultSet rs = pstm.executeQuery();
                return rs;
                
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Funcionario"+ e);
             return null;
        }
           
     }
}
