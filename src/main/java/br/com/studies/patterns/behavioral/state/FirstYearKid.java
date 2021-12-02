package br.com.studies.patterns.behavioral.state;

public class FirstYearKid implements KidState{
    @Override
    public void play() {
        System.out.println("learning to walk");
    }
}
