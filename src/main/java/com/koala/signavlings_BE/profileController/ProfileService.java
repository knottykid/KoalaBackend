/**
 * The ProfileService class includes list of default items
 *
 * @author Preeti Thorat, Luise Loparev
 */
package com.koala.signavlings_BE.profileController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProfileService {


    private ProfileRepository repository;

    @Autowired
    public ProfileService(ProfileRepository repository) {
        this.repository = repository;

        this.repository.saveAll(defaultItems());
    }


    private static List<Profile> defaultItems() {
        return List.of(
                new Profile(1L, "Bindushree", "November", "Lalaland", "I am Archangle", "DevOps koala", "https://upload.wikimedia.org/wikipedia/commons/4/49/Koala_climbing_tree.jpg"),
                new Profile(2L, "Frauke", "December", "Lalaland", "I am Professor X", "DevOps koala", "https://upload.wikimedia.org/wikipedia/commons/4/49/Koala_climbing_tree.jpg"),
                new Profile(3L, "Seedling 1", "December", "Lalaland", "I am Wolverine", "Wolverine", "https://upload.wikimedia.org/wikipedia/commons/4/49/Koala_climbing_tree.jpg"),
                new Profile(4L, "Preeti ", "December", "Lalaland", "", "BE koala", "https://ca.slack-edge.com/T07DBAMS9-U02K8S7V950-5325a191b353-512"),
                new Profile(5L, "Meng ", "December", "Lalaland", "Superhero", "BE koala", "https://ca.slack-edge.com/T07DBAMS9-U02K5SPHFU5-aa20246489ff-512"),
                new Profile(6L, "Luise ", "December", "Lalaland", "Superhero", "BE koala", "https://ca.slack-edge.com/T07DBAMS9-U02KMEJ3C8H-7d0d388a0ca9-512"),
                new Profile(7L, "Zuzanna ", "December", "Lalaland", "Superhero", "FE koala", "https://upload.wikimedia.org/wikipedia/commons/4/49/Koala_climbing_tree.jpg"),
                new Profile(8L, "Mintra ", "December", "Lalaland", "Superhero", "FE koala", "https://upload.wikimedia.org/wikipedia/commons/4/49/Koala_climbing_tree.jpg"),
                new Profile(9L, "Cécile", "December", "Lalaland", "Superhero", "FE koala", "https://upload.wikimedia.org/wikipedia/commons/4/49/Koala_climbing_tree.jpg"),
                new Profile(10L, "Cintia", "December", "Lalaland", "Superhero", "FE koala", "https://upload.wikimedia.org/wikipedia/commons/4/49/Koala_climbing_tree.jpg"),
                new Profile(11L, "John", "December", "Lalaland", "Superhero", "FE koala", "https://upload.wikimedia.org/wikipedia/commons/4/49/Koala_climbing_tree.jpg"),
                new Profile(12L, "Elinda", "December", "Lalaland", "Superhero", "FE koala", "https://upload.wikimedia.org/wikipedia/commons/4/49/Koala_climbing_tree.jpg"),
                new Profile(13L, "Soria", "December", "Lalaland", "Superhero", "FE koala", "https://upload.wikimedia.org/wikipedia/commons/4/49/Koala_climbing_tree.jpg"),
                new Profile(14L, "Nidhi", "December", "Lalaland", "Superhero", "FE koala", "https://upload.wikimedia.org/wikipedia/commons/4/49/Koala_climbing_tree.jpg"),
                new Profile(15L, "Sigga", "December", "Lalaland", "Superhero", "FE koala", "https://upload.wikimedia.org/wikipedia/commons/4/49/Koala_climbing_tree.jpg"),
                new Profile(16L, "Martyn", "December", "Lalaland", "Superhero", "FE koala", "https://upload.wikimedia.org/wikipedia/commons/4/49/Koala_climbing_tree.jpg"),
                new Profile(17L, "Vijay", "December", "Lalaland", "Superhero", "BE koala", "https://upload.wikimedia.org/wikipedia/commons/4/49/Koala_climbing_tree.jpg"),
                new Profile(18L, "Lido", "December", "Lalaland", "Superhero", "BE koala", "https://upload.wikimedia.org/wikipedia/commons/4/49/Koala_climbing_tree.jpg"),
                new Profile(19L, "Pruthvi", "December", "Lalaland", "Superhero", "BE koala", "https://upload.wikimedia.org/wikipedia/commons/4/49/Koala_climbing_tree.jpg")
        );
    }


    public List<Profile> findAll() {
        List<Profile> list = new ArrayList<>();
        Iterable<Profile> items = repository.findAll();
        items.forEach(list::add);
        return list;
    }
}
