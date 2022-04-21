package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;

        zofka = new Turtle();

        nakresliZmrzlinu(zofka, 50, 250);
        nakresliSnehulaka(zofka,500,100);
        nakresliMasinku(zofka, 750,400);
    }

    private void nakresliZmrzlinu(Turtle turtle, double x, double y) {
        turtle.setLocation(x, y);
        nakresliKolecko(turtle, 15.0);
        turtle.turnRight(90);
        turtle.setLocation(x + 7.7, y + 28.9);
        nakresliRovnostrannyTrojuhelnik(turtle, 156.0);
        turtle.turnLeft(90);
    }

    private void nakresliSnehulaka(Turtle turtle, double x, double y) {
        turtle.setLocation(x,y);
        nakresliKolecko(turtle,10);
        turtle.setLocation(x+57.4-86.1,y+57.4+86.1);
        nakresliKolecko(turtle,15);
        turtle.setLocation(x+57.4-114.7,y+57.4+86.1*2+114.7);
        nakresliKolecko(turtle,20);
        turtle.setLocation(x-86.1,y+57.4+86.1);
        nakresliKolecko(turtle,5);
        turtle.setLocation(x+57.4+86.1,y+57.4+86.1);
        nakresliKolecko(turtle,5);
    }

    private void nakresliMasinku(Turtle turtle, double x, double y){
        turtle.setLocation(x,y);
        turtle.turnRight(60);
        nakresliRovnostrannyTrojuhelnik(turtle,100);
        turtle.turnLeft(60);
        turtle.setLocation(x+86.6,y+20);
        nakresliObdelnik(turtle,100,200);
        turtle.setLocation(x+86.6+200,y+20);
        nakresliObdelnik(turtle,180,120);
        turtle.setLocation(x+86.6+200,y+25);
        nakresliKolecko(turtle,10.5);
        turtle.setLocation(x+86.6+25,y+52.6);
        nakresliKolecko(turtle,5.2);
        turtle.setLocation(x+86.6+125,y+52.6);
        nakresliKolecko(turtle,5.2);
    }


    private void nakresliRovnostrannyTrojuhelnik(Turtle turtle, double velikostStrany) {
        for (int i = 0; i < 3; i++) {
            turtle.move(velikostStrany);
            turtle.turnRight(120);
        }
    }

    private void nakresliCtverec(Turtle turtle, double velikostStrany) {
        nakresliMnohouhelnik(turtle, velikostStrany, 4);
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
        nakresliMnohouhelnik(turtle, velikostStrany, 36);
    }

    private void nakresliMnohouhelnik(Turtle turtle, double delkaStrany, int pocetStran) {
        double uhel = 360.0 / pocetStran;
        for (int i = 0; i < pocetStran; i++) {
            turtle.move(delkaStrany);
            turtle.turnRight(uhel);
        }
    }
}
