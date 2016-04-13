/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asseinfo_poker;

import java.util.Arrays;

/**
 *
 * @author Carlos
 */
public class testa_ganhador {

    int[] vResultado = new int[2];
    
    public int[] Test(String pP1carta[], String pP2carta[]) {

        int r1, r2, r3, r4;
        char Separa[] = new char[3];
        String P1CartaNumero[] = new String[5];
        int P1Num[] = new int[5];
        String P1CartaNipe[] = new String[5];
        String P2CartaNumero[] = new String[5];
        int P2Num[] = new int[5];
        String P2CartaNipe[] = new String[5];
        
        /**
         * * PLAYER 1 **
         */
        for (int i = 0; i < 5; i++) {
            Separa = pP1carta[i].toCharArray();

            int c = Separa.length;
            if (c == 2) {
                P1CartaNumero[i] = Character.toString(Separa[0]);
                switch (P1CartaNumero[i]) {
                    case "A":
                        P1CartaNumero[i] = "14";
                        break;
                    case "K":
                        P1CartaNumero[i] = "13";
                        break;
                    case "Q":
                        P1CartaNumero[i] = "12";
                        break;
                    case "J":
                        P1CartaNumero[i] = "11";
                        break;
                }
                P1CartaNipe[i] = Character.toString(Separa[1]);
            } else {
                P1CartaNumero[i] = "10";
                P1CartaNipe[i] = Character.toString(Separa[2]);
            }
        }

        for (int i = 0; i < 5; i++) {
            P1Num[i] = Integer.parseInt(P1CartaNumero[i]);
        }
        Arrays.sort(P1Num);
        r1 = P1Num[4] - P1Num[3];
        r2 = P1Num[3] - P1Num[2];
        r3 = P1Num[2] - P1Num[1];
        r4 = P1Num[1] - P1Num[0];
        //ROYAL FLUSH, STRAIGHT FLUSH E FLUSH
        if (P1CartaNipe[0].equals(P1CartaNipe[1]) & P1CartaNipe[1].equals(P1CartaNipe[2])
                & P1CartaNipe[2].equals(P1CartaNipe[3]) & P1CartaNipe[3].equals(P1CartaNipe[4])) {
            if (P1Num[4] == 14 & P1Num[3] == 13 & P1Num[2] == 12
                    & P1Num[1] == 11 & P1Num[0] == 10) {
                System.out.println("Player1: Royal Straight Flush");
                vResultado[0] = 10;
            } else {
                if (r1 == 1 & r2 == 1 & r3 == 1 & r4 == 1) {
                    System.out.println("Player1: Straight Flush");
                    vResultado[0] = 9;
                } else {
                    System.out.println("Player1: Flush");
                    vResultado[0] = 6;
                }
            }
        } else if ((P1Num[0] == P1Num[1] & P1Num[1] == P1Num[2]
                & P1Num[2] == P1Num[3]) | (P1Num[1] == P1Num[2]
                & P1Num[2] == P1Num[3] & P1Num[3] == P1Num[4])) {
            System.out.println("Player1: Quadra");
            vResultado[0] = 8;
            //FULA, TRINCA, 2 PARES OU PAR
        } else if ((P1Num[0] == P1Num[1]
                & P1Num[2] == P1Num[3]
                & P1Num[3] == P1Num[4])
                | (P1Num[0] == P1Num[1]
                & P1Num[1] == P1Num[2]
                & P1Num[3] == P1Num[4])) {
            System.out.println("Player 1: Fula");
            vResultado[0] = 7;
        } else if ((P1Num[0] == P1Num[1]
                & P1Num[1] == P1Num[2])
                | (P1Num[1] == P1Num[2]
                & P1Num[2] == P1Num[3])
                | (P1Num[2] == P1Num[3]
                & P1Num[3] == P1Num[4])) {
            System.out.println("Player 1:Trinca");
            vResultado[0] = 4;
        } else if ((P1Num[0] == P1Num[1]
                & P1Num[2] == P1Num[3])
                | (P1Num[1] == P1Num[2]
                & P1Num[3] == P1Num[4])
                | (P1Num[0] == P1Num[1]
                & P1Num[3] == P1Num[4])) {
            System.out.println("Player 1: 2 Pares");
            vResultado[0] = 3;
        } else if (P1Num[0] == P1Num[1]
                | P1Num[1] == P1Num[2]
                | P1Num[2] == P1Num[3]
                | P1Num[3] == P1Num[4]) {
            System.out.println("Player 1: Par");
            vResultado[0] = 2;
        } else if (r1 == 1 & r2 == 1 & r3 == 1 & r4 == 1) {
            System.out.println("Player 1 Seguencia");
            vResultado[0] = 5;
        } else {
            System.out.println("Player 1 Carta Alta:" + P1Num[4]);
            vResultado[0] = 1;
        }

        /**
         * * PLAYER 2 **
         */
        for (int i = 0; i < 5; i++) {
            Separa = pP2carta[i].toCharArray();
            int c = Separa.length;
            if (c == 2) {
                P2CartaNumero[i] = Character.toString(Separa[0]);
                switch (P2CartaNumero[i]) {
                    case "A":
                        P2CartaNumero[i] = "14";
                        break;
                    case "K":
                        P2CartaNumero[i] = "13";
                        break;
                    case "Q":
                        P2CartaNumero[i] = "12";
                        break;
                    case "J":
                        P2CartaNumero[i] = "11";
                        break;
                }
                P2CartaNipe[i] = Character.toString(Separa[1]);
            } else {
                P2CartaNumero[i] = "10";
                P2CartaNipe[i] = Character.toString(Separa[2]);
            }
        }

        for (int i = 0; i < 5; i++) {
            P2Num[i] = Integer.parseInt(P2CartaNumero[i]);
        }

        Arrays.sort(P2Num);
        r1 = P2Num[4] - P2Num[3];
        r2 = P2Num[3] - P2Num[2];
        r3 = P2Num[2] - P2Num[1];
        r4 = P2Num[1] - P2Num[0];
        //ROYAL FLUSH, STRAIGHT FLUSH E FLUSH
        if (P2CartaNipe[0].equals(P2CartaNipe[1]) & P2CartaNipe[1].equals(P2CartaNipe[2])
                & P2CartaNipe[2].equals(P2CartaNipe[3]) & P2CartaNipe[3].equals(P2CartaNipe[4])) {
            if (P2Num[4] == 14 & P2Num[3] == 13 & P2Num[2] == 12
                    & P2Num[1] == 11 & P2Num[0] == 10) {
                System.out.println("Player2: Royal Straight Flush");
                vResultado[1] = 10;
            } else {
                if (r1 == 1 & r2 == 1 & r3 == 1 & r4 == 1) {
                    System.out.println("Player2: Straight Flush");
                    vResultado[1] = 9;
                } else {
                    System.out.println("Player2: Flush");
                    vResultado[1] = 6;
                }
            }
        } else if ((P2Num[0] == P2Num[1] & P2Num[1] == P2Num[2]
                & P2Num[2] == P2Num[3]) | (P2Num[1] == P2Num[2]
                & P2Num[2] == P2Num[3] & P2Num[3] == P2Num[4])) {
            System.out.println("Player2: Quadra");
            vResultado[1] = 8;
            //FULA, TRINCA, 2 PARES OU PAR
        } else if ((P2Num[0] == P2Num[1]
                & P2Num[2] == P2Num[3]
                & P2Num[3] == P2Num[4])
                | (P2Num[0] == P2Num[1]
                & P2Num[1] == P2Num[2]
                & P2Num[3] == P2Num[4])) {
            System.out.println("Player 2: Fula");
            vResultado[1] = 7;
        } else if ((P2Num[0] == P2Num[1]
                & P2Num[1] == P2Num[2])
                | (P2Num[1] == P2Num[2]
                & P2Num[2] == P2Num[3])
                | (P2Num[2] == P2Num[3]
                & P2Num[3] == P2Num[4])) {
            System.out.println("Player 2:Trinca");
            vResultado[1] = 4;
        } else if ((P2Num[0] == P2Num[1]
                & P2Num[2] == P2Num[3])
                | (P2Num[1] == P2Num[2]
                & P2Num[3] == P2Num[4])
                | (P2Num[0] == P2Num[1]
                & P2Num[3] == P2Num[4])) {
            System.out.println("Player 2: 2 Pares");
            vResultado[1] = 3;
        } else if (P2Num[0] == P2Num[1]
                | P2Num[1] == P2Num[2]
                | P2Num[2] == P2Num[3]
                | P2Num[3] == P2Num[4]) {
            System.out.println("Player 2: Par");
            vResultado[1] = 2;
        } else if (r1 == 1 & r2 == 1 & r3 == 1 & r4 == 1) {
            System.out.println("Player 2 Seguencia");
            vResultado[1] = 5;
        } else {
            System.out.println("Player 2 Carta Alta:" + P1Num[4]);
            vResultado[1] = 1;
        }

        return vResultado;
    }

}
