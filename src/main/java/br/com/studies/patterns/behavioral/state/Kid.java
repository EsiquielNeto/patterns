package br.com.studies.patterns.behavioral.state;

public class Kid {

    private int age;
    private KidState kidState;

    public Kid(int age) {
        this.setAge(age);
    }

    public void play() {
        kidState.play();
    }

    public void setAge(int age) {
        this.age = age;

        if (age == 1) {
            kidState = new FirstYearKid();
        } else if (age == 5) {
            kidState = new FifthYearKid();
        } else if (age == 10) {
            kidState = new TenthYearKid();
        } else {
            kidState = new FirstYearKid();
        }
    }
}
