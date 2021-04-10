package u2_practica2;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zara
 */
public class Potencia {
     public static int Pot(int x, int y){
        int res = 0;
        if(y==1){
           res = x*1;
        }else{
            y--;
            res = x*Pot(x,y);
        }
        return res;  
    }
}
