package br.com.studies.patterns.behavioral.state;

public class FifthYearKid implements KidState{
    @Override
    public void play() {
        System.out.println("playing in the park");
    }
}
