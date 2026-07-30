package Q1.music.live;

import Q1.music.Playable;
import Q1.music.string.Veena;
import Q1.music.wind.Saxophone;

public class Test {

    public static void main(String[] args) {

        // a) Veena object
        Veena veena = new Veena();
        veena.play();

        // b) Saxophone object
        Saxophone saxophone = new Saxophone();
        saxophone.play();

        // c) Using Playable reference
        Playable p;

        p = veena;
        p.play();

        p = saxophone;
        p.play();
    }
}