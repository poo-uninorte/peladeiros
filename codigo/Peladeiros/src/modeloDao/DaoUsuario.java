package modeloDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloBens.BeansUsuario;
import modeloConnection.ConexaoBD;
/**
 *
 * @author F-BRAGA
 */
public class DaoUsuario {
    ConexaoBD conex = new ConexaoBD();
    BeansUsuario mod = new BeansUsuario();
    
    public void Salvar(BeansUsuario mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("INSERT INTO usuarios (user_nome, user_senha) VALUES (?, ?)");
            pst.setString(1, mod.getUserNome());
            pst.setString(2, mod.getUserSenha());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Usuário Inseridos com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Inserir Usuário!"+ex);
        }
        conex.desconectar();
    }
        public void Alterar(BeansUsuario mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("UPDATE usuarios SET user_nome=?, user_senha=? WHERE user_cod=?");
            pst.setString(1, mod.getUserNome());
            pst.setString(2, mod.getUserSenha());
            pst.setInt(3, mod.getUserCod());            
            pst.execute();
            JOptionPane.showMessageDialog(null, "Usuário Alterado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na alteração do Usuário!/nErro:"+ex);
        }
        
        
        conex.desconectar();
        
    }
        public BeansUsuario buscaUsuario(BeansUsuario mod){
        conex.conexao();
        conex.executaSql("SELECT * FROM usuarios WHERE user_nome LIKE '%"+mod.getUserPesquisar()+"%'");
        try {
            conex.rs.first();
            mod.setUserCod(conex.rs.getInt("user_cod"));
            mod.setUserNome(conex.rs.getString("user_nome"));
            mod.setUserSenha(conex.rs.getString("user_senha"));            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Usuário não Cadastrados!");
        }
        conex.desconectar();
        return mod;
    }
        public void Excluir(BeansUsuario mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("DELETE FROM usuarios WHERE user_cod = ?");
            pst.setInt(1, mod.getUserCod());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Usuário Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir Usuário!/nErro:"+ex);
        }
        
        conex.desconectar();
    }
}
