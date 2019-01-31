
package DAO;

import Model.Itens_ContatoModel;
import UTIL.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Itens_ContatoDAO {
    
    public void salvar(Itens_ContatoModel entidade) throws Exception{
        try {
            Conexao conexao = new Conexao();
            Connection con = conexao.criaConector();
            PreparedStatement ps = null;    
                    
            if (entidade.getId() ==  null){//INSERT
                ps = con.prepareStatement("INSERT INTO ITENS_CONTATOS(COD_PAIS,DDD,TELEFONE,CELULAR,CONTATOS_ID) VALUES(?,?,?,?,?)");                
            }else{ //UPDATE
                ps = con.prepareStatement("UPDATE ITENS_CONTATOS SET COD_PAIS=?,DDD=?,TELEFONE=?,CELULAR=?,CONTATOS_ID=? WHERE ID=?");
                ps.setInt(6, entidade.getId()); //pega a exceção                         
            }
            ps.setString(1, entidade.getCod_pais()); 
            ps.setString(2, entidade.getDdd()); 
            ps.setString(3, entidade.getTelefone()); 
            ps.setString(4, entidade.getCelular()); 
            ps.setInt(5, entidade.getContatos_ID());
            ps.execute();
            ps.close();
            JOptionPane.showMessageDialog(null,"Contato Salvo com Sucesso !");
        }catch (SQLException e){
            throw new Exception("Erro ao Acessar o Banco de Dados :",e);
        }            
    }
    public void deletar(Itens_ContatoModel entidade) throws Exception{
        try{
        if (entidade.getId() ==null){
            throw new Exception("Não possui Usuario para ser Deletado !");
        }else {
            Conexao conexao = new Conexao();
            Connection con = conexao.criaConector();
            PreparedStatement ps;
            ps = con.prepareStatement("DELETE FROM ITENS_CONTATOS WHERE ID=?");
            ps.setInt(1, entidade.getId());
            ps.execute();
            ps.close();
            JOptionPane.showMessageDialog(null,"Contato Deletado com Sucesso !");
        } 
        }catch (SQLException e){
            throw new Exception("Erro ao Acessar Banco de Dados :",e);
        }
    }
    public List<Itens_ContatoModel> mostrar(Integer idContato) throws Exception{        
        try{   
            List<Itens_ContatoModel> lista = new ArrayList<>();
            Conexao conexao = new Conexao();
            Connection con = conexao.criaConector();
            ResultSet resultSet;
            PreparedStatement ps;
            ps = con.prepareStatement("SELECT * FROM ITENS_CONTATOS WHERE CONTATOS_ID="+idContato);            
            resultSet = ps.executeQuery();                   
            while (resultSet.next()) {
                Itens_ContatoModel entidade = new Itens_ContatoModel();
                entidade.setId(resultSet.getInt("ID"));
                entidade.setCod_pais(resultSet.getString("COD_PAIS"));
                entidade.setDdd(resultSet.getString("DDD"));
                entidade.setTelefone(resultSet.getString("TELEFONE"));
                entidade.setCelular(resultSet.getString("CELULAR"));                
                entidade.setContatos_ID(resultSet.getInt("CONTATOS_ID"));
                lista.add(entidade);
            }
            ps.close();
            return lista;
        }catch (SQLException e){
            throw new Exception("Erro ao Acessar Banco de Dados Itens :",e);            
        }        
    }
    
}
