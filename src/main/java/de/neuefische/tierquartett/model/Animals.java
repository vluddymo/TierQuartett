package de.neuefische.tierquartett.model;

import de.neuefische.tierquartett.model.Tier;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Data
@Repository
@AllArgsConstructor
@NoArgsConstructor
public class Animals {

    private ArrayList<ArrayList<Tier>> animals;
}