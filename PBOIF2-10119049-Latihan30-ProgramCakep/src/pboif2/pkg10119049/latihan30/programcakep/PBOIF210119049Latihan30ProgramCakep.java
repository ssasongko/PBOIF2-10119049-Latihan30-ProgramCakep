/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119049.latihan30.programcakep;

import java.util.Scanner;

/**
 * Nama  : Nur Sasongko
 * Kelas : PBOIF2
 * NIM   : 10119049
 * Deskipsi : program cakep
 */
public class PBOIF210119049Latihan30ProgramCakep {
    public static Scanner scan = new Scanner(System.in);
    public static String answer;
    
    // const font color
    public static final String CRESET = "\u001B[0m";
    public static final String CBLACK = "\u001B[30m";
    public static final String CRED = "\u001B[31m";
    public static final String CGREEN = "\u001B[32m";
    public static final String CYELLOW = "\u001B[33m";
    public static final String CBLUE = "\u001B[34m";
    public static final String CPURPLE = "\u001B[35m";
    public static final String CCYAN = "\u001B[36m";
    public static final String CWHITE = "\u001B[37m";
    
    // const bgcolor
    public static final String BGBLACK = "\u001B[40m";
    public static final String BGRED = "\u001B[41m";
    public static final String BGGREEN = "\u001B[42m";
    public static final String BGYELLOW = "\u001B[43m";
    public static final String BGBLUE = "\u001B[44m";
    public static final String BGPURPLE = "\u001B[45m";
    public static final String BGCYAN = "\u001B[46m";
    public static final String BGWHITE = "\u001B[47m";    
      
    public static void main(String[] args) {
        System.out.println(CRED + "Kamu" + CGREEN + " ngerjain sendiri" + CYELLOW + " latihan 17 sampe" + CBLUE + " latihan 30 ini?" + CRESET);
        System.out.print(CBLUE + "Jawab " + CRED + "(Yoi/Enggak) : " + CRESET);
        answer = scan.next();
        answer = answer.toUpperCase();
        
        if(answer.equals("YOI")){
            System.out.printf("%n%sCakep Bener.%s Good Job%s%n",CRED, CPURPLE,CRESET);
        }
        else{
            System.out.printf("%n%sTetep cakep sih.%n%sSing penting paham konsep nya yee.%n%sKeep The code works dude %n",CRED,CCYAN,CRESET);
        }
    }
    
}
