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
    public static void main(String[] args) {//Denna kommentar �r f�r mig, jag �r Oday Darweesh i framtiden. 
        //Kom ih�g att detta �r det f�rsta programmet du skapade h�r med din grupp. 
        //Det var ett bra jobb vid den tiden. Men nu kan du s�ga.... 
        //Vilka �r dessa dumma koder? Dessa koder kunde ha skrivits mycket b�ttre.
         try{ //H�r deklareras en feltyp
    mibDB = new InfDB("C:\\db\\MIBDB.FDB"); //L�gger till s�kv�gen dit databasen �r placerad i undermappen "db" 
    }
    catch(InfException e){ //h�r f�ngas felet upp med s�kv�gen och felet hanteras av programmet. Detta undantag kan endast intr�ffa inuti try-blocket. 

    JOptionPane.showMessageDialog(null,"Login misslyckad"); //Meddelandet visas vid undantag.
    System.out.println("DBuppkoplingen misslyckad. Felmeddelande: " + e.getMessage()); //Printar ut felmeddelande.
    }
        new Login (mibDB).setVisible(true); //Typ boolean, om sant s� visas f�nstret och om falskt s� visas det inte.

        }  
    }
