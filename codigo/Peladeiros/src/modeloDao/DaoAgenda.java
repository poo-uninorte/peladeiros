/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modeloBens.BeansAgenda;
import modeloConnection.ConexaoBD;

/**
 *
 * @author F-BRAGA
 */
public class DaoAgenda {
    BeansAgenda agenda = new BeansAgenda();
    ConexaoBD conex = new ConexaoBD();
    ConexaoBD conexPela = new ConexaoBD();
    ConexaoBD conexLocal = new ConexaoBD();
    
    int codLocal;
    int codPela;
    public void Salvar(BeansAgenda agenda){
        BuscarLocal(agenda.getNomeLocal());
        BuscaPela(agenda.getNomePel());
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("INSERT INTO agendaPelada (agenda_codPeladeiro, agenda_codLocal, agenda_data, agendaHora) VALUES (?,?,?,?)");
            pst.setInt(1, codPela);
            pst.setInt(2, codLocal);
            pst.setDate(3, new java.sql.Date(agenda.getData().getTime()));
            pst.setString(4, agenda.getHora());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Agendamento com Sucesso!" );
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro no ao Confirmar o Agendamento"+ex );
            
        }
        
        conex.desconectar();
        
    }
    public void BuscarLocal(String nomeLocal){
        conexLocal.conexao();
        conexLocal.executaSql("SELECT * FROM  localjogo WHERE nome ='"+nomeLocal+"'");
        try {
            conexLocal.rs.first();
            codLocal= conexLocal.rs.getInt("codigo");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Local de jogo não cadastrado"); 
        }
    }
    public void BuscaPela(String nomePeladeiro){
        conexPela.conexao();
        conexPela.executaSql("SELECT * FROM  peladeiros WHERE pe_nome ='"+nomePeladeiro+"'");
        try {
            conexPela.rs.first();
            codPela= conexPela.rs.getInt("pe_cod");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Peladeiro não cadastrado"); 
        }
    }
}
