package zoo;

import zoo.mammals.cats.Lion;
import zoo.mammals.rodents.Hamster;
import zoo.reptiles.Turtle;
import zoo.fishes.*;

public class Main {
    public static void main(String[] args) {
        Habitat<Lion> loewengehege = new Habitat<>("Loewengehege");
        Habitat<Hamster> hamstergehege = new Habitat<>("Hamstergehege");

        Lion simba = new Lion();
        Lion nala = new Lion();
        Hamster hansi = new Hamster();
        Habitat<Fish> troutHabitat = new Habitat<>("Forellenbecken");
        troutHabitat.add(new Trout());

        loewengehege.add(simba);
        loewengehege.add(nala);
        loewengehege.add(simba);

        hamstergehege.add(hansi);
        Habitat<Fish> salmonHabitat = new Habitat<>("Lachsbecken");
        salmonHabitat.add(new Salmon());

        loewengehege.remove(nala);
        hamstergehege.remove(new Hamster());

        Lion test = new Lion();
        Aquarium aquarium = new Aquarium();
        aquarium.build(troutHabitat);
        aquarium.build(salmonHabitat);


        Zoo<Habitat<?>> zoo = new Zoo<>();
        zoo.build(loewengehege);
        zoo.build(hamstergehege);
        Habitat<Turtle> schildkroetengehege = new Habitat<>("Schildkroetengehege");

        zoo.build(schildkroetengehege);
        zoo.abandon(schildkroetengehege);
        zoo.visitAllHabitats();

        aquarium.visitAllHabitats();
    }
}
