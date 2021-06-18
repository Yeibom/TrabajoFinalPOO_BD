/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author PROPIETARIO
 */
public class Usuario {
    private int codigo;
    private String nomusu;
    private String pasusu;
    private String tipusu;

    public Usuario() {
    }

    public Usuario(int codigo, String nomusu, String pasusu, String tipusu) {
        this.codigo = codigo;
        this.nomusu = nomusu;
        this.pasusu = pasusu;
        this.tipusu = tipusu;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomusu() {
        return nomusu;
    }

    public void setNomusu(String nomusu) {
        this.nomusu = nomusu;
    }

    public String getPasusu() {
        return pasusu;
    }

    public void setPasusu(String pasusu) {
        this.pasusu = pasusu;
    }

    public String getTipusu() {
        return tipusu;
    }

    public void setTipusu(String tipusu) {
        this.tipusu = tipusu;
    }
    
    
}
