package modeloDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloBens.BeansPeladeiros;
import modeloConnection.ConexaoBD;

/**
 *
 * @author F-BRAGA
 */
public class DaoPeladeiros {
    BeansPeladeiros pa = new BeansPeladeiros();
    ConexaoBD conex = new ConexaoBD();
    ConexaoBD conexBairro = new ConexaoBD();
    String nomeBairro;
    int codBai;
    
    public void Salvar(BeansPeladeiros pa){
        buscaBaiCod(pa.getNomeBairro());
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("INSERT INTO peladeiros (pe_nome, pe_telefone, pe_rua, pe_longitude, pe_latitude, peBai_cod) VALUES(?, ?, ?, ?, ?, ?)");
            pst.setString(1, pa.getNomePe());
            pst.setString(2, pa.getTelefonePe());
            pst.setString(3, pa.getRuaPe());
            pst.setString(4, pa.getLatitudePe());
            pst.setString(5, pa.getLongitudePe());
            pst.setInt(6, codBai);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Peladeiro salvo com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar Peladeiro!"+ex);
        }
        
        conex.desconectar();
    }
     public void Alterar(BeansPeladeiros pa){
        buscaBaiCod(pa.getNomeBairro());
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("UPDATE peladeiros SET pe_nome=?, pe_telefone=?, pe_rua=?, pe_longitude=?, pe_latitude=?, peBai_cod=? WHERE pe_cod=?");
            pst.setString(1, pa.getNomePe());
            pst.setString(2, pa.getTelefonePe());
            pst.setString(3, pa.getRuaPe());
            pst.setString(4, pa.getLatitudePe());
            pst.setString(5, pa.getLongitudePe());
            pst.setInt(6, codBai);
            pst.setInt(7, pa.getCodPe());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Peladeiro Alterado com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Alterado Peladeiro!"+ex);
        }
        
        conex.desconectar();
    }
    
    public void buscaBaiCod(String nome){
        conex.conexao();
        conex.executaSql("SELECT * FROM bairro WHERE bai_nome='"+nome+"'");
        try {
            conex.rs.first();
            codBai = conex.rs.getInt("bai_cod");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar bairro"+ex);
        }

        conex.desconectar();
    }
    public BeansPeladeiros buscaPeladeiro(BeansPeladeiros pe){
        conex.conexao();
        try {
            conex.executaSql("SELECT * FROM peladeiros WHERE pe_nome LIKE '%"+pe.getPesquisar()+"%'");
            conex.rs.first();
            buscaNomeBairro(conex.rs.getInt("pe_cod"));
            pe.setNomePe(conex.rs.getString("pe_nome"));
            pe.setCodPe(conex.rs.getInt("pe_cod"));
            pe.setTelefonePe(conex.rs.getString("pe_telefone"));
            pe.setRuaPe(conex.rs.getString("pe_rua"));
            pe.setLongitudePe(conex.rs.getString("pe_longitude"));
            pe.setLatitudePe(conex.rs.getString("pe_latitude"));
            pe.setNomeBairro(nomeBairro);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar Peladeiro"+ex);
        }
        conex.desconectar();
        return pe;
    }
    
    public void buscaNomeBairro(int cod){
        conexBairro.conexao();
        try {
            conexBairro.executaSql("SELECT * FROM bairro WHERE bai_cod="+cod);
            conexBairro.rs.first();
            nomeBairro = conexBairro.rs.getString("bai_nome");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar nome bairro"+ex);
        }
        
        conexBairro.desconectar();
    }
    public void Excluir(BeansPeladeiros pa){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("DELETE FROM peladeiros WHERE pe_cod=?");
            pst.setInt(1, pa.getCodPe());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Peladeiro excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir peladeiro"+ex);
        }
        
        
        conex.desconectar();
        
    }
}
