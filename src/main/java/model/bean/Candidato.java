/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author batcomputador
 */
public class Candidato {
    
    private int id;
    private String nome;
    private int numero;
    private Partido partido;
    private byte[] foto;
    private byte[] foto_vice;

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public byte[] getFoto_vice() {
        return foto_vice;
    }

    public void setFoto_vice(byte[] foto_vice) {
        this.foto_vice = foto_vice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Partido getPartido() {
        return partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }
    
    
    
}
