package br.com.studies.patterns.creationals.builder;

public class BuilderMain {
    public static void main(String[] args) {

        Person person = PersonBuilder.builder()
                .name("Poka")
                .age(28)
                .gender("Man")
                .email("poka@gmail.com")
                .build();

        System.out.println(person);
    }
}
