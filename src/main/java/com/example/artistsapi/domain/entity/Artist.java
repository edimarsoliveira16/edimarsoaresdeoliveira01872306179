
package com.example.artistsapi.domain.entity;
import jakarta.persistence.*;
import java.util.*;

@Entity
public class Artist {
 @Id @GeneratedValue private UUID id;
 private String name;
 @Enumerated(EnumType.STRING) private com.example.artistsapi.domain.enums.ArtistType type;
 @ManyToMany(mappedBy = "artists") private Set<Album> albums = new HashSet<>();
}
