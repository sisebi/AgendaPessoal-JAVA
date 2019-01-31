
package DAO;

import Model.ContatosModel;
import UTIL.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class ContatosDAO {
    
    public void salvar(ContatosModel entidade) throws Exception{
        try {
            Conexao conexao = new Conexao();
            Connection con = conexao.criaConector();
            PreparedStatement ps = null;    
                    
            if (entidade.getId() ==  null){//INSERT
                ps = con.prepareStatement("INSERT INTO CONTATOS(NOME,COD_PAIS,DDD,TELEFONE,CELULAR,USUARIO_ID) VALUES(?,?,?,?,?,?)");                
            }else{ //UPDATE
                ps = con.prepareStatement("UPDATE CONTATOS SET NOME=?,COD_PAIS=?,DDD=?,TELEFONE=?,CELULAR=?,USUARIO_ID=? WHERE ID=?");
                ps.setInt(7, entidade.getId()); //pega a exceção                         
            }
            ps.setString(1, entidade.getNome()); 
            ps.setString(2, entidade.getCod_pais()); 
            ps.setString(3, entidade.getDdd()); 
            ps.setString(4, entidade.getTelefone()); 
            ps.setString(5, entidade.getCelular()); 
            ps.setInt(6, entidade.getUsuario_ID());
            ps.execute();
            ps.close();
            JOptionPane.showMessageDialog(null,"Contato Salvo com Sucesso !");
        }catch (SQLException e){
            throw new Exception("Erro ao Acessar o Bando de Dados :",e);
        }            
    }
    public void deletar(ContatosModel entidade) throws Exception{
        try{
        if (entidade.getId() ==null){
            throw new Exception("Não possui Usuario para ser Deletado !");
        }else {
            Conexao conexao = new Conexao();
            Connection con = conexao.criaConector();
            PreparedStatement ps;
            ps = con.prepareStatement("DELETE FROM CONTATOS WHERE ID=?");
            ps.setInt(1, entidade.getId());
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null,"Contato Deletado com Sucesso !");
        } 
        }catch (SQLException e){
            throw new Exception("Erro ao Acessar Banco de Dados :",e);
        }
    }
    public ContatosModel buscarEntidade(Integer user_ID, String nome) throws Exception{
        try{              
            ContatosModel entidade = new ContatosModel();
            Conexao conexao = new Conexao();
            Connection con = conexao.criaConector();
            ResultSet resultSet;
            PreparedStatement ps;
            ps = con.prepareStatement("SELECT * FROM CONTATOS WHERE USUARIO_ID=? AND NOME LIKE ? ");
            ps.setInt(1, user_ID);
            ps.setString(2, "%"+ nome +"%");
            resultSet = ps.executeQuery();
            while (resultSet.next()) {
                entidade.setId(resultSet.getInt("ID"));
                entidade.setNome(resultSet.getString("NOME"));
                entidade.setCod_pais(resultSet.getString("COD_PAIS"));
                entidade.setDdd(resultSet.getString("DDD"));
                entidade.setTelefone(resultSet.getString("TELEFONE"));
                entidade.setCelular(resultSet.getString("CELULAR"));
                entidade.setUsuario_ID(resultSet.getInt("USUARIO_ID"));               
            }
            ps.close();
            return entidade;
        }catch (SQLException e){
            throw new Exception("Erro ao Acessar Banco de Dados :",e);            
        }
    }
    public List<ContatosModel> mostrar(Integer user_ID,String nome) throws Exception{
        try{   
            List<ContatosModel> lista = new ArrayList<>();
            Conexao conexao = new Conexao();
            Connection con = conexao.criaConector();
            ResultSet resultSet;
            PreparedStatement ps;
            ps = con.prepareStatement("SELECT * FROM CONTATOS WHERE USUARIO_ID=? AND NOME LIKE ? ");
            ps.setInt(1, user_ID);
            ps.setString(2, "%"+ nome +"%");
            resultSet = ps.executeQuery();                   
            while (resultSet.next()) {
                ContatosModel entidade = new ContatosModel();
                entidade.setId(resultSet.getInt("ID"));
                entidade.setNome(resultSet.getString("NOME"));
                entidade.setCod_pais(resultSet.getString("COD_PAIS"));
                entidade.setDdd(resultSet.getString("DDD"));
                entidade.setTelefone(resultSet.getString("TELEFONE"));
                entidade.setCelular(resultSet.getString("CELULAR"));                
                entidade.setUsuario_ID(resultSet.getInt("USUARIO_ID"));
                lista.add(entidade);
            }
//            ps.close();
            return lista;
        }catch (SQLException e){
            throw new Exception("Erro ao Acessar Banco de Dados Itens :",e);            
        }  
    }
    
}
