
package Model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class Itens_Table extends AbstractTableModel{
    private List<Itens_ContatoModel> lista = new ArrayList<>();
    private String[] colunas = {"COD.PAIS","DDD","TELEFONE","CELULAR"};

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
      switch(coluna){
          case 0:
              return lista.get(linha).getCod_pais();
          case 1:
              return lista.get(linha).getDdd();
          case 2:
              return lista.get(linha).getTelefone();
          case 3:
              return lista.get(linha).getCelular();         
      }  
      return null;        
    }

    @Override
    public void setValueAt(Object o, int i, int i1) {
        super.setValueAt(o, i, i1); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    public void addRow(Itens_ContatoModel dados){
        this.lista.add(dados);
        this.fireTableDataChanged(); //Atualiza Tabela
    }
    
    public void removeRow(int linha){
        this.lista.remove(linha);
        this.fireTableRowsDeleted(linha, linha);//Atualiza 
    }
    
}
