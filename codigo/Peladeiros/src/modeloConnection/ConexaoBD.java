package modeloConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author F-BRAGA
 */
public class ConexaoBD {
    public Statement stm;
    public ResultSet rs;
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/peladasi";
    private static final String USER = "root";
    private static final String PASS = "root";
    public Connection con;
    
    public void conexao(){
        System.setProperty("jdbc.Drivers", DRIVER);
        try {
            con = DriverManager.getConnection(URL, USER, PASS);
            //JOptionPane.showMessageDialog(null, "Conexão Efetuada com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na Conexão com o Banco de Dados:/n"+ex.getMessage());
        } 
    }
    public void executaSql(String sql){
        try {
            stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ExecutaSql:\n"+ex.getMessage());
        }
    }    
    public void desconectar(){
        try {
            con.close();
           // JOptionPane.showMessageDialog(null, "BD Desconectado com Sucesso!");
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao Fechar a Conexão com o BD:/n"+ex.getMessage());
        }
    }
    
}
