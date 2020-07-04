package modeloBens;

import java.util.Date;


public class BeansAgenda {
    private int agendaCod;
    private String nomeLocal;
    private String nomePel;
    private Date data;
    private String hora;

    public int getAgendaCod() {
        return agendaCod;
    }

    public void setAgendaCod(int agendaCod) {
        this.agendaCod = agendaCod;
    }

    public String getNomeLocal() {
        return nomeLocal;
    }

    public void setNomeLocal(String nomeLocal) {
        this.nomeLocal = nomeLocal;
    }

    public String getNomePel() {
        return nomePel;
    }

    public void setNomePel(String nomePel) {
        this.nomePel = nomePel;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
    
    
}
