/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package becker;
import becker.robots.*;
/**
 *
 * @author lotalorafox
 */
public class ej6f {
    public static void main(String[] args){
        City map = new City(12,13);
        Escenario e = new Escenario(map);
        recolector2 laura = new recolector2(map);
        laura.recoger();
        
    }
}
