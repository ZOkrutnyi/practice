package main.java;

import java.util.logging.Logger;

public class Main {
    static private final Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        try {
            System.out.println("Hello " + args[0]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("There are no one to say hello to");
            log.severe("Index out of bound at " + e.getStackTrace()[e.getStackTrace().length - 1]);
        } catch (Exception e) {
            log.severe("Other exception at " + e.getStackTrace()[e.getStackTrace().length - 1]);
        }
    }
}