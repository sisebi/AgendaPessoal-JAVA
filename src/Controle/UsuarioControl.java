
package Controle;

import DAO.UsuarioDAO;
import Model.UsuarioModel;

public class UsuarioControl {
    private UsuarioModel userLogado;    

    public UsuarioControl() {
    }
    
    public boolean validarUsuario(String user, String senha) throws Exception{
        if (userLogado == null){
            userLogado = new UsuarioModel();
        }     
        UsuarioDAO dao = new UsuarioDAO();
        userLogado = dao.validarUsuario(user);
        /*Verifica se existe algum usuario Retornado*/
        if (userLogado.getId() == null || userLogado.getId().equals("")){          
            return false;         
        }
        /*Valida Usuario e Senha*/
        if (userLogado.getUsuario().equals(user) && userLogado.getSenha().equals(senha)){           
            return true;
        }else{
            userLogado = null;
            return false;
        }
    }

    public UsuarioModel getUserLogado() {       
        return userLogado;
    }

    public void setUserLogado(UsuarioModel userLogado) {
        this.userLogado = userLogado;
    }
    
}
