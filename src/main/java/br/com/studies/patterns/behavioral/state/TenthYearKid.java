package br.com.studies.patterns.behavioral.state;

public class TenthYearKid implements KidState{
    @Override
    public void play() {
        System.out.println("Playing soccer");
    }
}
