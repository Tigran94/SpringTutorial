package toshiba;

import interfaces.Leg;

public class ToshibaLeg implements Leg{
    @Override
    public void go() {
        System.out.println("Toshiba can't go to forward");
    }
}
