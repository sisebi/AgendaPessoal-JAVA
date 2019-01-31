
package Controle;

import DAO.ContatosDAO;
import Model.ContatosModel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ContatosControl {
    private ContatosModel entidade;
    private List<ContatosModel> itensLista;    
    private ContatosDAO contatosDAO = new ContatosDAO();
      
    public void novo(){
        if (entidade == null){
            entidade = new ContatosModel();
        }
        if (itensLista == null){
            itensLista = new ArrayList<ContatosModel>();
        }
    }
          
    public void salvar() throws Exception{        
        if ( entidade == null ||entidade.getUsuario_ID() == null || entidade.getUsuario_ID().equals("")){
            JOptionPane.showMessageDialog(null, "Nao possui Usuario Logado !!");
            return;            
        }        
        contatosDAO.salvar(entidade);
    }
    
    public void deletar() throws Exception{
        if ( entidade == null ||entidade.getId() == null || entidade.getId().equals("")){
            JOptionPane.showMessageDialog(null, "Nao foi encontrado nenhum Contato !!");
            return;            
        }  
        contatosDAO.deletar(entidade);
    }
    
    
    public void buscar(Integer usu_ID,String nome) throws Exception{        
        novo();        
        entidade = contatosDAO.buscarEntidade(usu_ID,nome);        
    }
    
    public void buscarItens(Integer user_ID,String nome) throws Exception{        
        novo();
        itensLista = contatosDAO.mostrar(user_ID,nome); 
        if (itensLista.size() == 0){
            JOptionPane.showMessageDialog(null, "Nao foi encontrado nenhum Contato !!");
        }
    }

    public ContatosModel getEntidade() {
        return entidade;
    }

    public void setEntidade(ContatosModel entidade) {
        this.entidade = entidade;
    }

    public List<ContatosModel> getItensLista() {
        return itensLista;
    }

    public void setItensLista(List<ContatosModel> itensLista) {
        this.itensLista = itensLista;
    }
        
    
}
