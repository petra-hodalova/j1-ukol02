package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;

        zofka = new Turtle();

    }

    private void nakresliRovnostrannyTrojuhelnik(Turtle turtle, double velikostStrany){
        for (int i = 0; i <3 ; i++) {
            turtle.move(velikostStrany);
            turtle.turnRight(120);
        }
    }

    private void nakresliCtverec(Turtle turtle, double velikostStrany) {
       nakresliMnohouhelnik(turtle,velikostStrany,4);
    }

    private void nakresliObdelnik(Turtle turtle, double velikostStranyA, double velikostStranyB) {
        for (int i = 0; i < 2; i++) {
            turtle.move(velikostStranyA);
            turtle.turnRight(90);
            turtle.move(velikostStranyB);
            turtle.turnRight(90);
        }
    }

    private void nakresliKolecko(Turtle turtle, double velikostStrany) {
        nakresliMnohouhelnik(turtle,velikostStrany,36);
    }

    private void nakresliMnohouhelnik(Turtle turtle, double delkaStrany, int pocetStran) {
        double uhel= 360.0/pocetStran;
        for (int i = 0; i < pocetStran; i++) {
            turtle.move(delkaStrany);
            turtle.turnRight(uhel);
        }
    }
}
