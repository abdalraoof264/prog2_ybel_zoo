package zoo;

import zoo.mammals.cats.Lion;
import zoo.mammals.rodents.Hamster;
import zoo.reptiles.Turtle;

public class Main {
    public static void main(String[] args) {
        Habitat<Lion> loewengehege = new Habitat<>("Loewengehege");
        Habitat<Hamster> hamstergehege = new Habitat<>("Hamstergehege");
        Lion simba = new Lion();
        Lion nala = new Lion();
        Hamster hansi = new Hamster();
        loewengehege.add(simba);
        loewengehege.add(nala);
        loewengehege.add(simba);
        hamstergehege.add(hansi);
        loewengehege.remove(nala);
        hamstergehege.remove(new Hamster());

        Lion test = new Lion();


        Zoo<Habitat<?>> zoo = new Zoo<>();
        zoo.build(loewengehege);
        zoo.build(hamstergehege);
        Habitat<Turtle> schildkroetengehege = new Habitat<>("Schildkroetengehege");

        zoo.build(schildkroetengehege);
        zoo.abandon(schildkroetengehege);
        zoo.visitAllHabitats();

    }
}
