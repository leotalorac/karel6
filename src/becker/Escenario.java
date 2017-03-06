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
public class Escenario {
    private City c;
    private Wall[] paredes = new Wall[40];
    private Thing[] cajas = new Thing[8];
    public Escenario(City l){
        int i =0;
        c = l;
        
        //cuadrado 1
        for(int k =0; k<5;k++){
            paredes[i]= new Wall(this.c,k+6,1,Direction.WEST);
            i++;
        }
        for(int k =0; k<5;k++){
            paredes[i]= new Wall(this.c,6,k+1,Direction.NORTH);
            i++;
        }
        for(int k =0; k<5;k++){
            paredes[i]= new Wall(this.c,k+6,5,Direction.EAST);
            i++;
        }
        for(int k =0; k<4;k++){
            paredes[i]= new Wall(this.c,10,k+2,Direction.SOUTH);
            i++;
        }
        //cuadrado 2
        
        for(int k =0; k<5;k++){
            paredes[i]= new Wall(this.c,k+3,7,Direction.WEST);
            i++;
        }
        
        for(int k =0; k<5;k++){
            paredes[i]= new Wall(this.c,3,k+7,Direction.NORTH);
            i++;
        }
        
        for(int k =0; k<5;k++){
            paredes[i]= new Wall(this.c,k+3,11,Direction.EAST);
            i++;
        }
        
        for(int k =0; k<4;k++){
            paredes[i]= new Wall(this.c,7,k+8,Direction.SOUTH);
            i++;
        }
        i =0;
        //cajas
        cajas[i] = new Thing(this.c,6,2);i++;
        cajas[i] = new Thing(this.c,7,1);i++;
        cajas[i] = new Thing(this.c,6,4);i++;
        cajas[i] = new Thing(this.c,7,5);i++;
        cajas[i] = new Thing(this.c,9,1);i++;
        cajas[i] = new Thing(this.c,10,2);i++;
        cajas[i] = new Thing(this.c,9,5);i++;
        cajas[i] = new Thing(this.c,10,4);i++;

    }
    
}
