package de.neuefische.tierquartett.database;

import de.neuefische.tierquartett.model.Tier;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TierDb {

    public List<Tier> animals = new ArrayList<Tier>(List.of(
            new Tier("Pinguine sind lit!",
                    "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Ab atque debitis eum eveniet excepturi incidunt ipsa labore laboriosam odio quia, quibusdam recusandae reiciendis sed sunt suscipit, temporibus vel vitae! Autem consequuntur dolores ea, nam optio provident quis temporibus voluptatum. Consequuntur?",
                    "https://cdn.pixabay.com/photo/2012/09/04/21/20/penguin-56101_1280.jpg"),
            new Tier("Eis-Eis-Bärby!",
                    "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Ab atque debitis eum eveniet excepturi incidunt ipsa labore laboriosam odio quia, quibusdam recusandae reiciendis sed sunt suscipit, temporibus vel vitae! Autem consequuntur dolores ea, nam optio provident quis temporibus voluptatum. Consequuntur?",
                    "https://cdn.pixabay.com/photo/2015/12/21/13/08/bear-1102605_1280.jpg"),
            new Tier("Polarfuchs for the win!",
                    "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Ab atque debitis eum eveniet excepturi incidunt ipsa labore laboriosam odio quia, quibusdam recusandae reiciendis sed sunt suscipit, temporibus vel vitae! Autem consequuntur dolores ea, nam optio provident quis temporibus voluptatum. Consequuntur?",
                    "https://cdn.pixabay.com/photo/2017/03/08/15/01/iceland-2126989_1280.jpg")
    ));

    public List<Tier> listAll() {
        return animals;
    }

    public List<Tier> getAnimals(String query) {
        if (query == null || query.isBlank()) {
            return animals;
        }

        List<Tier> filteredAnimals = new ArrayList<>();

        for (Tier animals : animals) {
            if (animals.getTitle() != null && animals.getTitle().toLowerCase().contains(query.toLowerCase())) {
                filteredAnimals.add(animals);
            }
        }
        return filteredAnimals;
    }
}


