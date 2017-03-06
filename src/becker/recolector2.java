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
public class recolector2 {
    
    private Robot l;
    private int[] x;
    private int[] y;
    private int n=0;
    
    public recolector2(City c){
        l = new Robot(c,11,1,Direction.NORTH);
    }
    public void recoger(){
        contar();
        volver1();
        scan();
        volver1();
        movertobox();
        poner();
        volver1();
    }
    
    
    
    
    
    
    
    public void poner(){
        int o=0;
        int h=0;
        int r =0;
        int x2=0;
        int y2=0;
        for(int i=1; i<=5;i++){
            for(int j=0;j<4;j++){
                //System.out.println("objetos: " + this.l.countThingsInBackpack());
                x2 = this.l.getAvenue();
                y2 = this.l.getStreet();
                r=0;
                for(int k=0;k<n;k++){
                    if(x2==(x[k]+6) && y2==(y[k]-3)){
                        this.l.putThing();
                        r=1;
                    }
                }
                if(j!=4 && o==0){this.l.move();o=0;}
                if(j==0 && i==1){
                    girard();
                    this.l.move();
                    
                }
 
            }
            if(i%2 == 0 ){ 
                girard();
                if(r==0){
                    for(int k=0;k<n;k++){
                        x2 = this.l.getAvenue();
                        y2 = this.l.getStreet();
                        if(x2==(x[k]+6) && y2==(y[k]-3)){
                           this.l.putThing();
                        }   
                    }
                    r=1;
                }
                this.l.move();
                girard();
                
                
            }else{
                if(i<5){
                    this.l.turnLeft();
                    this.l.move();
                    this.l.turnLeft();
                    o =0;
                }
            }
        }
        /*for(int k=0;k<n;k++){
            System.out.println("el objeto :" +  k +" esta en x: "+ x[k] +" y y:" + y[k]);
        }*/
    }
   
    public void scan(){
        int o=0;
        int h=0;
        for(int i=1; i<=5;i++){
            for(int j=0;j<4;j++){
                if(this.l.canPickThing()){
                    this.l.pickThing();
                     x[h] = this.l.getAvenue();
                     y[h] = this.l.getStreet();
                     h++;
                }
                if(j!=4 && o==0){this.l.move();o=0;}
                if(j==0 && i==1){
                    girard();
                    this.l.move();
                }
 
            }
            if(i%2 == 0 && i<5){
                girard();
                if(this.l.canPickThing()){
                        this.l.pickThing();
                        x[h] =this.l.getAvenue();
                        y[h] = this.l.getStreet();
                        h++;                    
                    }
                this.l.move();                
                girard();
            }else{
                if(i<5){
                    this.l.turnLeft();
                    this.l.move();
                    if(this.l.canPickThing()){
                        this.l.pickThing();
                        x[h] =this.l.getAvenue();
                        y[h] = this.l.getStreet();
                        h++;                    
                    }
                    this.l.turnLeft();
                    o =0;
                }
            }
        }
        /*for(int k=0;k<n;k++){
            System.out.println("el objeto :" +  k +" esta en x: "+ x[k] +" y y:" + y[k]);
        }*/
            
    }
    
    public void volver1(){
        darvuelta();
        mover(4);
        this.l.turnLeft();
        mover(5);
        darvuelta();
    }
    
    
    public void movertobox(){
        girard();
        mover(6);
        this.l.turnLeft();
        mover(3);
    }
    
    
    public void contar(){
        int o=0;
        
        for(int i=1; i<=5;i++){
            for(int j=0;j<4;j++){
                if(this.l.canPickThing()){
                    n++; 
                }
                if(j!=4 && o==0){this.l.move();o=0;}
                if(j==0 && i==1){
                    girard();
                    this.l.move();
                }
 
            }
            if(i%2 == 0 && i<5){
                girard();
                this.l.move();
                if(this.l.canPickThing()){
                        n++; 
                    }
                girard();
            }else{
                if(i<5){
                    this.l.turnLeft();
                    this.l.move();
                    if(this.l.canPickThing()){
                        n++; 
                    }
                    this.l.turnLeft();
                    o =0;
                }
            }
        }
        x = new int[n];
        y = new int[n];
        //System.out.println("hay :" +n+" objetos");
        
        
    }
    
    
    
    
    public void girard(){
        for(int i=0;i<3;i++){
            this.l.turnLeft();
        }
    }
    public void darvuelta(){
        for(int i=0;i<2;i++){
            this.l.turnLeft();
        } 
    }
    public void mover(int n){
       for(int i=0;i<n;i++){
            this.l.move();
        } 
       
    }
    
    
    
    
}
