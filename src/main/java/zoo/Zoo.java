package zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo<T extends Habitat<?>> {

    private final List<T> habitats = new ArrayList<>();

    public void build(T habitat) {
        if (!habitats.contains(habitat)) {
            habitats.add(habitat);
        }
    }

    public void abandon(T habitat) {
        habitats.remove(habitat);
    }

    public void visitAllHabitats() {
        for (T habitat : habitats) {
            System.out.println(habitat.getName());
        }
    }
}
