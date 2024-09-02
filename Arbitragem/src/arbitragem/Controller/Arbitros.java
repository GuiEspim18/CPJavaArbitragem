/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbitragem.Controller;

import arbitragem.Model.Arbitro_DAO;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author guiespim
 */
public class Arbitros {
    
    private static List<Arbitro_DAO> arbitros = new ArrayList<Arbitro_DAO>();
           
    public static void add(Arbitro_DAO arbitro) {
        arbitros.add(arbitro);
    }
    
    public static List<Arbitro_DAO> getAll() {
        return arbitros;
    }
    
    public static Arbitro_DAO getOne(int id) {
        return arbitros.stream().filter(a -> a.id == id).findFirst().orElse(null);
    }
    
    public static void delete(int id) {
        arbitros.removeIf(a -> a.id == id);
    }
    
    public static void edit(int id, Arbitro_DAO arbitro) {
        System.out.println(arbitros.size());
        for (int i = 0; i < arbitros.size(); i++) {
            if (arbitros.get(i).id == id) {
                arbitros.set(i, arbitro);
            }
        }
    }
}
