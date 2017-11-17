package mainpackage;
/**
 * Copyright (c) 2017.
 * @author Radoslaw Madzia
 * @email radoslawmadzia@gmail.com 
 */




import narzedzia.*;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;






/**
 * Główna klasa kalkulatora ONP
 * @author radoslaw
 *
 */
public class Main {

	/**
     * Zmienne statyczne
     */
    private static final int CLEAR = 0;
    private static final int CLEAREVERYTHING = 1;
    private static final int CALC = 2;
    private static final String EXIT = "exit";
    private static final int UNDEFINED = -1;
    
    
    
    /**
     * Klasa inicjalizujaca
     */
    static void initialization()
    {
    	Lista l = new Lista();
    	Scanner odczyt = new Scanner(System.in);
        String command = odczyt.nextLine();
        Wyrazenie wyr;
        
        while( ! command.equals(EXIT) ) {

            switch (numberOfOperation(command)) {

                case CLEAREVERYTHING:

                    System.out.println("Wszystkie zmienne zostały skasowane");
                    l = new Lista();
                    break;

                case CLEAR:

                    deleteVariableFromList(l, command);
                    break;

                case CALC:

                    try {

                        wyr = new Wyrazenie(cutToOnlyONP(command), l);

                        l = AddVariableToList(l, wyr.wynik(), command);

                        System.out.println( wyr.wynik() );


                    } catch (WyjatekONP wyjatekONP) {
                        System.out.println( "[BŁĄD] : "+ wyjatekONP.getMessage() );
                    }

                    break;

                default:
                    throw new AssertionError(command);
            }
            command = odczyt.nextLine();
        }     
        odczyt.close();
    }


	/**
     * Zwraca rodzaj operacji
     * @param command string
     * @return int
     */
	private static int numberOfOperation(String command) {
		if( command.startsWith("clear") ) {
            if (command.matches("(?i).* \\p{Alpha}\\p{Alnum}*.*")) {
                return CLEAR;
            }
            return CLEAREVERYTHING;
        }
        if( command.startsWith("calc") )
            return CALC;

        return UNDEFINED;
	}
	
	/**
     * Usuwa zmienna/zmienne z listy
     * @param list lista zmiennych
     * @param ONP wyrazenie onp
     */
    private static void deleteVariableFromList(Lista list, String ONP) {
    	 ONP = ONP.replace("clear ", "");

         Matcher m = Pattern.compile("\\p{Alpha}\\p{Alnum}*").matcher(ONP);

         while (m.find()){
             System.out.println("Usuwam: "+ list.removeAt(list.search(m.group())));
         }
	}
    
    
    /**
     * Zmienia string do postaci samego wyrazenia ONP
     * @param string string
     * @return string cut
     */
    private static String cutToOnlyONP(String string) {
    	string = string.replace("calc ", "");

        if(howManyVariable(string) == 0)
            return string;


        int p = string.indexOf("=");

        String first = string.substring(0, p-2);

        return first;
	}

    /**
     * Ile jest zmiennych w wyrazeniu
     * @param string string
     * @return int
     */
	private static int howManyVariable(String string) {
		String pattern = "\\p{Alpha}\\p{Alnum}* =";

        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(string);

        int count = 0;
        while(m.find()) {
            count++;
        }

        return count;
	}
	/**
    *
    * @param l lista zmiennych
    * @param value wartość zmiennej
    * @param ONP wyrazenie
    * @return
    */
	private static Lista AddVariableToList(Lista l, double value, String ONP) {
		Matcher m = Pattern.compile("\\p{Alpha}\\p{Alnum}* =").matcher(ONP);

        while (m.find()){

            String variable = m.group().replace(" =", "");

            if( l.search(variable) > 0)
                l.removeAt(l.search(variable));


            l.insertLast(new Zmienna(variable, value));

        }

        return l;
	}
	
	public static void main(String[] args) throws WyjatekONP {

        initialization();

    }


}
