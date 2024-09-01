/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbitragem.Controller;

import arbitragem.Model.Partida_DAO;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author guiespim
 */
public class Partidas {
    
    private List<Partida_DAO> partidas = new ArrayList<>();
    
    public void add(Partida_DAO partida) {
        partidas.add(partida);
    }
    
    public List<Partida_DAO> getAll() {
        return partidas;
    }
    
    public Partida_DAO getOne(int id) {
        return partidas.stream().filter(a -> a.id == id).findFirst().orElse(null);
    }
    
    public void delete(int id) {
        partidas.removeIf(a -> a.id == id);
    }
    
    public void edit(int id, Partida_DAO arbitro) {
        for (int i = 0; i < partidas.size(); i++) {
            if (partidas.get(i).id == id) {
                partidas.set(id, arbitro);
            }
        }
    }
    
}
