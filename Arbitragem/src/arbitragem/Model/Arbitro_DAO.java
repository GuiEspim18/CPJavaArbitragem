/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbitragem.Model;

/**
 *
 * @author guiespim
 */
public class Arbitro_DAO {
    
    public int id;
    public String nome;
    public String sobrenome;
    public String email;
    public String serie;
    public String esporte;
    public String experiencia;
    public String telefone;
    public String estado;
    public String status;
    
    public Arbitro_DAO() {
    }

    public Arbitro_DAO(int id, String nome, String sobrenome, String email, String serie, String esporte, String experiencia, String telefone, String estado, String status) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.serie = serie;
        this.esporte = esporte;
        this.experiencia = experiencia;
        this.telefone = telefone;
        this.estado = estado;
        this.status = status;
    }
    
    
    
}
