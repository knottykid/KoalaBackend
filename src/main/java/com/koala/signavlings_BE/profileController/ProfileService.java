/**
 * The ProfileService class includes list of default items
 *
 * @author Preeti Thorat
 */
package com.koala.signavlings_BE.profileController;

import org.springframework.data.map.repository.config.EnableMapRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@EnableMapRepositories
public class ProfileService {


    private final CrudRepository<Profile, Long> repository;


    public ProfileService(CrudRepository<Profile, Long> repository) {
        this.repository = repository;

        this.repository.saveAll(defaultItems());
    }


    private static List<Profile> defaultItems() {
        return List.of(
                new Profile(1L, "Warren", "December", "Lalaland", "I am Archangle", "Archangle"),
                new Profile(2L, "James", "December", "Lalaland", "I am Professor X", "Professor X"),
                new Profile(3L, "Hugh", "December", "Lalaland", "I am Wolverine", "Wolverine")
        );
    }


    public List<Profile> findAll() {
        List<Profile> list = new ArrayList<>();
        Iterable<Profile> items = repository.findAll();
        items.forEach(list::add);
        return list;
    }
}
