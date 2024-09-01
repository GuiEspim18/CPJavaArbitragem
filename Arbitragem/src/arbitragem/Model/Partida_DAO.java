/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbitragem.Model;

import java.util.Date;

/**
 *
 * @author guiespim
 */
public class Partida_DAO {
    
    public int id;
    public Date data;
    public String hora;
    public String email;
    public String serie;
    public String esporte;
    public String timeA;
    public String timeB;
    public String duracao;
    public String tipo;
    public String fase;

    public Partida_DAO() {
    }

    public Partida_DAO(int id, Date data, String hora, String email, String serie, String esporte, String timeA, String timeB, String duracao, String tipo, String fase) {
        this.id = id;
        this.data = data;
        this.hora = hora;
        this.email = email;
        this.serie = serie;
        this.esporte = esporte;
        this.timeA = timeA;
        this.timeB = timeB;
        this.duracao = duracao;
        this.tipo = tipo;
        this.fase = fase;
    }
    
    
    
}
