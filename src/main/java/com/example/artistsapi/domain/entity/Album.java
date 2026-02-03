
package com.example.artistsapi.domain.entity;
import jakarta.persistence.*;
import java.util.*;

@Entity
public class Album {
 @Id @GeneratedValue private UUID id;
 private String title;
 private Integer releaseYear;
 @ManyToMany
 @JoinTable(name="artist_album",
 joinColumns=@JoinColumn(name="album_id"),
 inverseJoinColumns=@JoinColumn(name="artist_id"))
 private Set<Artist> artists = new HashSet<>();
}
