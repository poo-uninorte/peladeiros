package modeloDao;

import modeloConnection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloBens.BeansCampoQuadra;
/**
 *
 * @author F-BRAGA
 */
public class DaoCampoQuadra {
    ConexaoBD conex = new ConexaoBD();
    BeansCampoQuadra mod = new BeansCampoQuadra();
    
    public void Salvar(BeansCampoQuadra mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("INSERT INTO localjogo (nome) VALUES (?)");
            pst.setString(1, mod.getNome());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados Inseridos com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Inserir Dados!"+ex);
        }
        conex.desconectar();
    }
    public void Editar(BeansCampoQuadra mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("UPDATE localjogo SET nome=? WHERE codigo=?");
            pst.setString(1, mod.getNome());
            pst.setInt(2, mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados Alterados com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na alteração dos dados!/nErro:"+ex);
        }
        
        
        conex.desconectar();
        
    }
    public void Excluir(BeansCampoQuadra mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("DELETE FROM localjogo WHERE codigo = ?");
            pst.setInt(1, mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados Excluidos com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir dados!/nErro:"+ex);
        }
        
        conex.desconectar();
    }
            
    public BeansCampoQuadra buscaCampoQuadra(BeansCampoQuadra mod){
        conex.conexao();
        conex.executaSql("SELECT * FROM localjogo WHERE nome LIKE '%"+mod.getPesquisa()+"%'");
        try {
            conex.rs.first();
            mod.setCodigo(conex.rs.getInt("codigo"));
            mod.setNome(conex.rs.getString("nome"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Local não Cadastrados!");
        }
        conex.desconectar();
        return mod;
    }
}
