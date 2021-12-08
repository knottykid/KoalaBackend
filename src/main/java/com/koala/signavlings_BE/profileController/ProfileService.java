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

                new Profile(1L, "Bindushree", "November", "Lalaland", "I take what you develop and bring it to life!", "Junior Developer", "https://ca.slack-edge.com/T07DBAMS9-U02L8HYM4JD-fc03447b43b4-512"),
                new Profile(2L, "Elinda", "November", "Cologne", "I am using magic superpowers to create great FE stuff.", "Junior Frontend Engineer","https://ca.slack-edge.com/T07DBAMS9-U02K8SHNNE7-529ef3678417-512"),
                new Profile(3L, "Soria", "May", "Berlin", "I am using magic superpowers to create great FE stuff.", "Junior Frontend Engineer (PI)","https://ca.slack-edge.com/T07DBAMS9-U020J4T51EE-1bbec4c76afa-512"),
                new Profile(4L, "Nidhi", "November", "Berlin",  "I am using magic superpowers to create great FE stuff.", "Developer Associate (Front end)","https://ca.slack-edge.com/T07DBAMS9-U02K24RCEUW-94a3a446f1a5-512"),
                new Profile(5L, "Sigga", "November", "Berlin",  "I am using magic superpowers to create great FE stuff.", "FE koala","https://ca.slack-edge.com/T07DBAMS9-U02K8SG42JF-0c1ad1e98ef0-512"),
                new Profile(6L, "Martyn",  "November", "Berlin", "I am using magic superpowers to create great FE stuff. ", "Junior frontend engineer","https://ca.slack-edge.com/T07DBAMS9-U02K5SMTYJH-09e0302e4232-512"),
                new Profile(7L, "Frauke",  "November", "Berlin",  "I take what you develop and bring it to life!", "Developer Associate","https://ca.slack-edge.com/T07DBAMS9-U02MUFSM7C0-39e4e0aa6c93-512"),
                new Profile(8L, "Vijay", "November", "Lalaland", "I am using magic superpowers to create great BE stuff.", "Associate Developer","https://upload.wikimedia.org/wikipedia/commons/4/49/Koala_climbing_tree.jpg"),
                new Profile(9L, "Pruthvi","November", "Berlin", "I am using magic superpowers to create great BE stuff.", "Developer","https://ca.slack-edge.com/T07DBAMS9-U02JU67S7C7-812d1f28a9b0-512"),
                new Profile(10L, "Lido", "November", "Berlin", "I am using magic superpowers to create great BE stuff. ", "Junior Backend Developer","https://ca.slack-edge.com/T07DBAMS9-U02K8S9F3AN-2666f76a7be2-512"),
                new Profile(11L, "John",  "November", "Berlin", "I am an anti-hero/anti-villain mainly known for my eccentric sense of humor and outrageous adventures. Oftentimes, I’m regarded as a morally ambiguous character more than a true villain or hero.", "Front-End Developer","https://ca.slack-edge.com/T07DBAMS9-U02KMEKJ3B3-4dcb14f104ec-512"),
                new Profile(12L, "Cintia", "December", "Berlin", "Superhero", "Data Engineer","https://ca.slack-edge.com/T07DBAMS9-U02MUFSSYQ0-b7eb9376902f-512"),
                new Profile(13L, "Preeti ", "November", "Hamburg", "Preetis BIO", "Junior Backend Engineer","https://ca.slack-edge.com/T07DBAMS9-U02K8S7V950-5325a191b353-512"),
                new Profile(14L, "Meng", "November", "Berlin", "Hi, my name is Meng Li. I am a junior backend engineer at SAP/Siganvio, and I am also interested into cloud technologies. In my spare time I like listening to music and doing some sports. Nice to see you all in the company.", "Junior Backend Engineer","https://ca.slack-edge.com/T07DBAMS9-U02K5SPHFU5-aa20246489ff-512"),
                new Profile(15L, "Luise ", "November", "Berlin", "I am a junior BE developer and travel passionate. For both traveling and programming I make use of my problem solving skills. I enjoy learning new things everyday, and can imagine to start my own koala breeding in Australia someday.", "Junior Backend Engineer","https://ca.slack-edge.com/T07DBAMS9-U02KMEJ3C8H-7d0d388a0ca9-512"),
                new Profile(16L, "Zuzanna", "September", "Berlin", "I have joined Signavio this September after switching my career from digital marketing. Originally from Poland but hate the cold. In my free time I love to read, do crafts and drink tea.", "Junior Frontend Engineer","https://ca.slack-edge.com/T07DBAMS9-U02D29JCV8U-46745c6eed6e-512"),
                new Profile(17L, "Mintra", "November", "Berlin", "a cat lady who's into coding and sports. nothing more.", "Junior Frontend Engineer","img_2502.jpg (2304×3456) (slack.com)"),
                new Profile(18L, "Cécile", "November", "Berlin", "I am software developer with a front-end focus and back-end and data engineering curiosity. I'm a world citizen with a background in Communication, TV Production and Digital Marketing.", "Junior Data Engineer","https://ca.slack-edge.com/T07DBAMS9-U02KB31DP6G-43ffe4eec89b-512")

        );
    }


    public List<Profile> findAll() {
        List<Profile> list = new ArrayList<>();
        Iterable<Profile> items = repository.findAll();
        items.forEach(list::add);
        return list;
    }
}
