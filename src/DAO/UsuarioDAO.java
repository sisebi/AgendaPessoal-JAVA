
package DAO;

import Model.UsuarioModel;
import UTIL.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {   
    
    public UsuarioDAO() {      
    }
    
        
    public void salvar(UsuarioModel entidade) throws Exception{
        try {
            Conexao conexao = new Conexao();
            Connection con = conexao.criaConector();
            PreparedStatement ps = null;
            if (entidade.getId() ==  null){//INSERT
                ps = con.prepareStatement("INSERT INTO USUARIO(USUARIO,SENHA) VALUES(?,?)");                
            }else{ //UPDATE
                ps = con.prepareStatement("UPDATE USUARIO SET USUARIO=?, SENHA=? WHERE ID=?");
                ps.setInt(3, entidade.getId()); //pega a exceção                       
            }
            ps.setString(1, entidade.getUsuario()); 
            ps.setString(2, entidade.getSenha());
            ps.execute();
            ps.close();
        }catch (SQLException e){
            throw new Exception("Erro ao Acessar o Bando de Dados :",e);
        }            
    }
    public void deletar(UsuarioModel entidade) throws Exception{
        try{
        if (entidade.getId() ==null){
            throw new Exception("Não possui Usuario para ser Deletado !");
        }else {
            Conexao conexao = new Conexao();
            Connection con = conexao.criaConector();
            PreparedStatement ps;
            ps = con.prepareStatement("DELETE FROM USUARIO WHERE ID=?");
            ps.setInt(1, entidade.getId());
            ps.execute();
            ps.close();
        } 
        }catch (SQLException e){
            throw new Exception("Erro ao Acessar Banco de Dados :",e);
        }
    }
    public List<UsuarioModel> mostrar() throws Exception{
        try{   
            List<UsuarioModel> lista = new ArrayList<>();
            Conexao conexao = new Conexao();
            Connection con = conexao.criaConector();
            ResultSet resultSet;
            PreparedStatement ps;
            ps = con.prepareStatement("SELECT * FROM USUARIO");           
            resultSet = ps.executeQuery();
            while (resultSet.next()) {
                UsuarioModel entidade = new UsuarioModel();
                entidade.setId(resultSet.getInt("ID"));
                entidade.setUsuario(resultSet.getString("USUARIO"));
                entidade.setSenha(resultSet.getString("SENHA"));
                lista.add(entidade);
            }
            ps.close();
            return lista;            
        }catch (SQLException e){
            throw new Exception("Erro ao Acessar Banco de Dados :",e);            
        }        
    }
    public UsuarioModel validarUsuario(String userName) throws Exception{       
        try{           
            UsuarioModel entidade = new UsuarioModel(); 
            Conexao conexao = new Conexao();
            Connection con = conexao.criaConector();
            ResultSet resultSet;
            PreparedStatement ps;
            ps = con.prepareStatement("SELECT * FROM USUARIO WHERE USUARIO =?");
            ps.setString(1, userName);
            resultSet = ps.executeQuery();
            while (resultSet.next()) {
                    entidade.setId(resultSet.getInt("ID"));
                    entidade.setUsuario(resultSet.getString("USUARIO"));
                    entidade.setSenha(resultSet.getString("SENHA"));                 
                }
            return entidade;
            }catch (SQLException e){
                throw new Exception("Erro ao Acessar Banco de Dados :",e);            
            }        
    }
    
    
    /*Criar Primeiro Usuario*/
//    public static void main(String[] args) throws Exception {
//        UsuarioModel usuario = new UsuarioModel();
//        UsuarioDAO userDAO = new UsuarioDAO();        
//        usuario.setUsuario("bruna");
//        usuario.setSenha("123");
//        userDAO.salvar(usuario);              
//    }
 
    
}
