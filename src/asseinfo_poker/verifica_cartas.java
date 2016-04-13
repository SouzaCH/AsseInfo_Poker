/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asseinfo_poker;

/**
 *
 * @author Carlos
 */
public class verifica_cartas {

    String vMsgP1 = null;
    String vMsgP2 = null;

    public String verificaP1(String pP1[]) {

        String v1 = null;
        String v2 = null;

        char Separa[] = new char[3];
        int carta;

        for (int i = 0; i < 5; i++) {

            Separa = pP1[i].toCharArray();

            int c = Separa.length;
            carta = i + 1;
            if (c == 2) {
                v1 = Character.toString(Separa[0]);
                v2 = Character.toString(Separa[1]);
                if (!"A".equals(v1) & !"K".equals(v1) & !"Q".equals(v1) & !"J".equals(v1)
                        & !"9".equals(v1) & !"8".equals(v1) & !"7".equals(v1) & !"6".equals(v1) & !"5".equals(v1)
                        & !"4".equals(v1) & !"3".equals(v1) & !"2".equals(v1)) {
                    vMsgP1 = "Player 2: Carta " + carta + " inválida";
                    break;
                } else if (!"S".equals(v2) & !"H".equals(v2) & !"C".equals(v2) & !"D".equals(v2)) {
                    vMsgP1 = "Player 2: Carta " + carta + " inválida";
                    break;
                } else {
                    vMsgP1 = "OK";
                }
            } else {
                v2 = Character.toString(Separa[2]);
                if (!"S".equals(v2) & !"H".equals(v2) & !"C".equals(v2) & !"D".equals(v2)) {
                    vMsgP1 = "Player 2: Carta " + carta + " inválida";
                    break;
                } else {
                    vMsgP1 = "OK";
                }
            }
        }

        return vMsgP1;
    }

    public String verificaP2(String pP2[]) {

        String v1 = null;
        String v2 = null;

        char Separa[] = new char[3];
        int carta;

        for (int i = 0; i < 5; i++) {

            Separa = pP2[i].toCharArray();

            int c = Separa.length;
            carta = i + 1;
            if (c == 2) {
                v1 = Character.toString(Separa[0]);
                v2 = Character.toString(Separa[1]);
                if (!"A".equals(v1) & !"K".equals(v1) & !"Q".equals(v1) & !"J".equals(v1)
                        & !"9".equals(v1) & !"8".equals(v1) & !"7".equals(v1) & !"6".equals(v1) & !"5".equals(v1)
                        & !"4".equals(v1) & !"3".equals(v1) & !"2".equals(v1)) {
                    vMsgP2 = "Player 2: Carta " + carta + " inválida";
                    break;
                } else if (!"S".equals(v2) & !"H".equals(v2) & !"C".equals(v2) & !"D".equals(v2)) {
                    vMsgP2 = "Player 2: Carta " + carta + " inválida";
                    break;
                } else {
                    vMsgP2 = "OK";
                }
            } else {
                v2 = Character.toString(Separa[2]);
                if (!"S".equals(v2) & !"H".equals(v2) & !"C".equals(v2) & !"D".equals(v2)) {
                    vMsgP2 = "Player 2: Carta " + carta + " inválida";
                    break;
                } else {
                    vMsgP2 = "OK";
                }
            }
        }

        return vMsgP2;
    }
}
