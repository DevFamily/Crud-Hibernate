/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Visao.splash.Entrar;
import Visao.splash.Splash;
import java.awt.Toolkit;
import java.io.Serializable;

/**
 *
 * @author Atália Mufume
 */
public class Inicio implements Serializable{
      
    public static void main(String[] args) {
        Splash start = new Splash();
        start.setVisible(true);
        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(40);
                start.cont.setText(Integer.toString(i)+"%");
                start.barraprog.setValue(i);
                Entrar ent = new Entrar();
                if (i ==100) {
                    start.dispose();
                    ent.show();
                    
                }
                
            }
        } catch (Exception e) {
        }
    }
    
}
