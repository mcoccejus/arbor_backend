package eu.berrytopia.arbor.organisation;


import eu.berrytopia.arbor.arboruser.ArborUser;
import eu.berrytopia.arbor.geoobject.GeoObject;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
public class Organisation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    @OneToMany(mappedBy = "organisation", cascade = CascadeType.ALL) //owning side is ArborUsers
    private Set<ArborUser> arborUsers = new HashSet<>();

    @OneToMany(mappedBy = "organisation", cascade = CascadeType.ALL) //owning side is GeoObjects
    private Set<GeoObject> geoObjects = new HashSet<>();

    public Organisation(String name) {
        this.name = name;
    }

    public Organisation(String name,Set<ArborUser> arborUsers) {
        this.name = name;
        this.arborUsers = arborUsers;
    }

    public Organisation() {}
}