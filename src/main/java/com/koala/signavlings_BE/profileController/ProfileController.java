/**
 * The ProfileController class includes Get and Post method for all profiles
 *
 * @author Preeti Thorat
 */
package com.koala.signavlings_BE.profileController;

import org.springframework.http.ResponseEntity;

import java.net.URI;
import java.util.List;


import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping("api/profile")
public class ProfileController {

    private final ProfileService service;


    public ProfileController(ProfileService service) {
        this.service = service;
    }


    @GetMapping
    public ResponseEntity<List<Profile>> findAll() {
        List<Profile> profiles = service.findAll();
        return ResponseEntity.ok().body(profiles);
    }

    @PostMapping
    public ResponseEntity<Profile> create(@RequestBody Profile profile) {
        Profile created = service.create(profile);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{profileID}")
                .buildAndExpand(created.getProfileID())
                .toUri();
        return ResponseEntity.created(location).body(created);
    }
}

