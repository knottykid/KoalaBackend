/**
 * The ProfileService class includes list of default items
 *
 * @author Preeti Thorat, Luise Loparev
 */
package com.koala.signavlings_BE.profileController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


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
