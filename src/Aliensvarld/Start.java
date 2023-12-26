    package Aliensvarld;
    import javax.swing.JOptionPane;
    import oru.inf.InfDB;
    import oru.inf.InfException;
/**
 * @author oday_
 * @author Sumeya_
 * @author Isabell_
 */
    public class Start {
    private static InfDB mibDB;

    public Start(){

    }
    public static void main(String[] args) {//Denna kommentar är för mig, jag är Oday Darweesh i framtiden. 
        //Kom ihåg att detta är det första programmet du skapade här med din grupp. 
        //Det var ett bra jobb vid den tiden. Men nu kan du säga.... 
        //Vilka är dessa dumma koder? Dessa koder kunde ha skrivits mycket bättre.
         try{ //Här deklareras en feltyp
    mibDB = new InfDB("C:\\db\\MIBDB.FDB"); //Lägger till sökvägen dit databasen är placerad i undermappen "db" 
    }
    catch(InfException e){ //här fångas felet upp med sökvägen och felet hanteras av programmet. Detta undantag kan endast inträffa inuti try-blocket. 

    JOptionPane.showMessageDialog(null,"Login misslyckad"); //Meddelandet visas vid undantag.
    System.out.println("DBuppkoplingen misslyckad. Felmeddelande: " + e.getMessage()); //Printar ut felmeddelande.
    }
        new Login (mibDB).setVisible(true); //Typ boolean, om sant så visas fönstret och om falskt så visas det inte.

        }  
    }
