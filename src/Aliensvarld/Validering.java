
package Aliensvarld;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
  * @author oday_
  * @author Sumeya_
  * @author Isabell_
 */
public class Validering {
   
     public static boolean textFaltHarVarde(JTextField rutaAttKolla)  //Om textrutan �r tom s� visa att Inmatningsrutan �r tom.
    {
        boolean resultat = true;        
        if(rutaAttKolla.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Inmatningsrutan �r tom!");
            resultat = false;
            rutaAttKolla.requestFocus();
        }       
        return resultat;
    }
        public static boolean isHeltal(JTextField rutaAttKolla) {  //Om anv�ndare har inte skrivit heltal s� visa ett meddelande.
                boolean resultat = true;
                try {
            String inStrang = rutaAttKolla.getText();
            Integer.parseInt(inStrang);
            rutaAttKolla.requestFocus();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Var god ange ett heltal!");
            resultat = false;
        }
        return resultat;
    }
//     public static boolean inlogg(JTextField rutaAttKolla)
//    {
//        boolean losenord = false; 
//        boolean username = true;  
//        if(rutaAttKolla.getText()..getText().getText())){
//            JOptionPane.showMessageDialog(null, "Fel pass!");
//            losenord = true;
//           
//        }       
//        return resultat;
//    }  
}
