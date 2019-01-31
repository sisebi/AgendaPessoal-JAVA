
package Model;

import java.util.Objects;

public class Itens_ContatoModel {
    private Integer id;
    private String cod_pais;
    private String ddd;
    private String telefone;
    private String celular;
    private Integer contatos_ID;

    public Itens_ContatoModel() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCod_pais() {
        return cod_pais;
    }

    public void setCod_pais(String cod_pais) {
        this.cod_pais = cod_pais;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Integer getContatos_ID() {
        return contatos_ID;
    }

    public void setContatos_ID(Integer contatos_ID) {
        this.contatos_ID = contatos_ID;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Itens_ContatoModel other = (Itens_ContatoModel) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
