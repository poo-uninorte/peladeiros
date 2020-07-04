/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloBens;

/**
 *
 * @author F-BRAGA
 */
public class BeansUsuario {
    private Integer userCod;
    private String userNome;
    private String userSenha;
    private String userPesquisar;

    public String getUserPesquisar() {
        return userPesquisar;
    }

    public void setUserPesquisar(String userPesquisar) {
        this.userPesquisar = userPesquisar;
    }

    public Integer getUserCod() {
        return userCod;
    }

    public void setUserCod(Integer userCod) {
        this.userCod = userCod;
    }

    public String getUserNome() {
        return userNome;
    }

    public void setUserNome(String userNome) {
        this.userNome = userNome;
    }

    public String getUserSenha() {
        return userSenha;
    }

    public void setUserSenha(String userSenha) {
        this.userSenha = userSenha;
    }

}