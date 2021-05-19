package main;

import java.util.Arrays;
import java.util.logging.Logger;

public class Main {
    static private final Logger log = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        try {
            System.out.println("Hello " + args[0]);
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("There are no one to say hello to");
            log.severe("Index out of bound " + Arrays.toString(e.getStackTrace()));
        } catch (Exception e)
        {
            log.severe("Other exception" + Arrays.toString(e.getStackTrace()));
        }
    }
}