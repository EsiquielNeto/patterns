package br.com.studies.patterns.behavioral.state;

public class StateMain {
    public static void main(String[] args) {
        System.out.println("First Year");
        Kid firstYearKid = new Kid(1);
        firstYearKid.play();

        System.out.println("\nFifth Year");
        Kid fifthYearKid = new Kid(5);
        fifthYearKid.play();

        System.out.println("\nTenth Year");
        Kid tenthYearKid = new Kid(10);
        tenthYearKid.play();
    }
}
