/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema_cine;

import javax.swing.JOptionPane;

/**
 *
 * @author Miguel Enrique Orea Pérez
 */
public class Sistema_cine {


    public static void main(String[] args) {
        String c,cc,ca,v,d,m;
        int b,e;
        int op;
        
        do{
        op = Integer.parseInt(JOptionPane.showInputDialog("Menu \n 1. Selecciona tu ciudad \n 2. Selecciona tu cine \n 3. Cartelera \n 4. Cartelera VIP"
                + "\n 5. Boletos \n 6. Dulceria \n 7. Método de pago \n 8. Estacionamiento \n 9. Salir"));
        switch(op){
            case 1:
                c = JOptionPane.showInputDialog("Aguascalientes\n" +
                 "\n" +
                 "Baja California\n" +             
                 "Baja California Sur\n" +                
                 "Campeche\n" +                
                 "Chiapas\n" +                
                 "Chihuahua\n" +                 
                 "Coahuila\n" +                
                 "Colima\n" +                 
                 "Ciudad de México\n" +               
                 "Durango\n" +                 
                 "Estado de México\n" +                 
                 "Guanajuato\n" +                
                 "Guerrero\n" +                
                 "Hidalgo\n" +                 
                 "Jalisco\n" +                 
                 "Michoacán\n" +                
                 "Morelos\n" +
                 "Nayarit\n" +                 
                 "Nuevo León\n" +
                 "Oaxaca\n" +
                 "Puebla\n" +
                 "Querétaro\n" +
                 "Quintana Roo\n" +
                 "San Luis Potosí\n" +
                 "Sinaloa\n" +
                 "Sonora\n" +
                 "Tabasco\n" +
                 "Tamaulipas\n" +
                 "Tlaxcala\n" +
                 "Veracruz\n" +
                 "Yucatán\n" +
                 "Zacatecas");
                JOptionPane.showMessageDialog(null, "Ciudad: "+c);
                break;
            case 2:
                cc = JOptionPane.showInputDialog("Cinecrack misterios \n"
                        + "Cinecrack lindavista\n"
                        + "Cinecrack aztec\n"
                        + "Cinecrack la villa\n"
                        + "Cinecrack fortuna\n");
                JOptionPane.showMessageDialog(null, "Cine: "+cc);
                break;
            case 3:
                ca = JOptionPane.showInputDialog("Jhon Wick 17:00 - 19:00\n"
                        + "Hallooween  20:00 - 22:00\n"
                        + "Avengers  17:30 - 19:30\n"
                        + "Coco  15:00 - 17:00\n");
                 JOptionPane.showMessageDialog(null, "Película: "+ca);
                break;
            case 4:
                v = JOptionPane.showInputDialog("Buscando a dory 13:00 - 15:00\n"
                        + "Tiburón 3D 14:00 - 16:30\n"
                        + "Maldición 13:50 - 15:00\n"
                        + "Rapidos y furiosos 4D 20:00 - 22:00\n");
                JOptionPane.showMessageDialog(null, "Película: "+v);
                break;
            case 5:
                b = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de boletos [Adulto ($70)]\n"
                        + "[Menores de edad ($55)]\n"));
                JOptionPane.showMessageDialog(null, "Cantidad de boletos" + b);
                break;
            case 6:
                 d = JOptionPane.showInputDialog("Combos\n"
                         + "Palomas\n"
                         + "Nachos\n"
                         + "Refrescos\n"
                         + "Dulces\n");
                break;
            case 7:
                m = JOptionPane.showInputDialog("Tarjeta de debito/crédito\n"
                        + "Paypal\n"
                        + "Tarjeta Cinecrack\n");
                break;
            case 8:
                break;
            case 9:
                JOptionPane.showMessageDialog(null, "Gracias por su visita");
            default:
                     
        }
        }while(op != 9);
    }
    
}
