package com.ivycomptech.OverridingDemo;

public class OverridingDriver {
    public static void main(String[] args) {
        IPL ipl=new IPL();
        IPL csk=new CSK();
        IPL rcb=new RCB();
        IPL klp=new KLP();

        ipl.tournamentWonBy();
        csk.tournamentWonBy();
        klp.tournamentWonBy();
        rcb.tournamentWonBy();
    }
}

