package de.neuefische.tierquartett.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

@Data
@Repository
@AllArgsConstructor
@NoArgsConstructor
public class Tier {

    private String title;
    private String text;
    private String imgSource;
}
