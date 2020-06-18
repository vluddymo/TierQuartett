package de.neuefische.tierquartett.TierService;

import de.neuefische.tierquartett.database.TierDb;
import de.neuefische.tierquartett.model.Tier;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TierService {

    private final TierDb tierDb;


    public List<Tier> listAllAnimals (){
        return tierDb.listAll();
    }


    public List<Tier> getAnimals(String query) {
        return tierDb.getAnimals(query);
    }
}
