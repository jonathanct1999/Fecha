/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fecha;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author redes
 */
public class Fecha {
    SimpleDateFormat formato;
    Date hoy;
    
    public Fecha(){
        hoy=new Date();
    }
    
    public String devuelveFecha(int tipo){
        String cad="";
        switch (tipo){
            case 1:{
                formato=new SimpleDateFormat("yyyy/MM");
                cad=formato.format(hoy);
                break;
            }
            case 2: {
                formato=new SimpleDateFormat("MM/yyyy");
                cad=formato.format(hoy);
                break;
            }
            case 3: {
                formato=new SimpleDateFormat("MM/yy");
                cad=formato.format(hoy);
                break;
            }
            default:{
                cad="ERROR";
            }
        }
        return cad;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Fecha fecha = new Fecha();
        System.out.println(fecha.devuelveFecha(1));
        System.out.println(fecha.devuelveFecha(2));
        System.out.println(fecha.devuelveFecha(3));
        System.out.println(fecha.devuelveFecha(4));
    }
    
}
