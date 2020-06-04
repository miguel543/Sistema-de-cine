
package sistema.champions;

import javax.swing.JOptionPane;

/**
 *
 * @author Miguel Enrique Orea Pérez
 */
public class SistemaChampions {

    public static void main(String[] args) {
        int op;
        
        //Menu
        do{
        op = Integer.parseInt(JOptionPane.showInputDialog("Uefa Champions League\n"
                + "1. Octavos de final\n"
                + "2. Cuartos de final\n"
                + "3. Semifinales\n"
                + "4. Finales\n"
                + "5. Campeón\n"
                + "6. Salir\n"));
        
        //Seleccionar opciones
        switch(op){
            case 1: JOptionPane.showMessageDialog(null, "2B | Tottenham                |3 |1 |4\n"+
                           "1A |borussia Dortmund      |0 |0 |0 \n"+			   
			   "2D | Schalke 04            |2 |0 |2\n" +
			   "1F | Manchester City       |3 |7 |10\n" +
			   "2E | Ajax                  |1 |4 |5\n" +
			   "1G | Real Madrid           |2 |1 |3\n" +
			   "2A | Atletico de Madrid    |2 |0 |2\n" +
			   "1H | Juventus              |0 |3 |3\n" +
			   "2H | Manchester United     |0 |3 |3\n" +
			   "1C | Paris Saint - Germain |2 |1 |3\n" +
			   "2F | Olympique de Lyon     |0 |1 |1\n" +
			   "1B | Barcelona             |0 |5 |5\n" +
			   "2C | Liverpool             |0 |3 |3\n" +
			   "1E | Mayern Munich         |0 |1 |1\n" +
			   "2G | Roma                  |2 |1 |3\n" +
			   "1D | Porto                 |1 |3 |4\n");
            break;
            case 2: JOptionPane.showMessageDialog(null, "2B | Tottenham             |1 |3 |4\n" +
			   "1F | Manchester City       |0 |4 |4\n" +
			   "2E | Ajax                  |1 |2 |3\n" +
			   "1H | Juventus              |1 |1 |2\n" +
			   "2H | Manchester United     |0 |0 |0\n" +
			   "1B | Barcelona             |1 |3 |4\n" +
			   "2C | Liverpool             |2 |4 |6\n" +
			   "1D | Porto                 |0 |1 |1\n");
            break;
            case 3: JOptionPane.showMessageDialog(null, "2B | Tottenham             |0 |3 |3\n" +
			   "2E | Ajax                  |1 |2 |3\n" +
			   "1B | Barcelona             |3 |0 |3\n" +
			   "2C | Liverpool             |0 |4 |4\n");
            break;
            case 4: JOptionPane.showMessageDialog(null, "2B | Tottenham             |0 |\n" +
		   "2C | Liverpool             |2 \n");
            break;
            case 5: JOptionPane.showMessageDialog(null, "LIVERPOOL");
            break;
            case 6: JOptionPane.showMessageDialog(null, "BYE");
            default:
        }
        } while(op!=6);
    }
}
    
