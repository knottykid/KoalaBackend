/**
 * The Profile class contains the declaration of user profile attributes
 *
 * @author Preeti Thorat
 */

package com.koala.signavlings_BE.profileController;


import org.springframework.data.annotation.Id;

public class Profile {

    private final Long profileID;

    private final String name;

    private final String joiningMonth;

    private final String location;

    private final String bio;

    private final String role;


    public Profile(
            Long profileID,
            String name,
            String joiningMonth,
            String location,
            String bio,
            String role
    ) {
        this.profileID = profileID;
        this.name = name;
        this.joiningMonth = joiningMonth;
        this.location = location;
        this.bio = bio;
        this.role = role;
    }


    @Id
    public Long getProfileID() {
        return profileID;
    }


    public String getName() {
        return name;
    }


    public String getJoiningMonth() {
        return joiningMonth;
    }


    public String getLocation() {
        return location;
    }

    public String getBio() {
        return bio;
    }

    public String getRole() {
        return role;
    }


    public Profile updateWith(Profile profile) {
        return new Profile(
                this.profileID,
                profile.name,
                profile.joiningMonth,
                profile.location,
                profile.bio,
                profile.role
        );
    }

}
