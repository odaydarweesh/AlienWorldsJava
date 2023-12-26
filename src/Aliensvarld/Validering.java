
package Aliensvarld;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
  * @author oday_
  * @author Sumeya_
  * @author Isabell_
 */
public class Validering {
   
     public static boolean textFaltHarVarde(JTextField rutaAttKolla)  //Om textrutan är tom så visa att Inmatningsrutan är tom.
    {
        boolean resultat = true;        
        if(rutaAttKolla.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Inmatningsrutan är tom!");
            resultat = false;
            rutaAttKolla.requestFocus();
        }       
        return resultat;
    }
        public static boolean isHeltal(JTextField rutaAttKolla) {  //Om användare har inte skrivit heltal så visa ett meddelande.
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
