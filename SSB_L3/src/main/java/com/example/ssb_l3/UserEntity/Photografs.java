package com.example.ssb_l3.UserEntity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Photografs {
    @Id
    @Column(name = "ID",unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "fotoname", nullable = false)
    private String name;

    @OneToMany(mappedBy = "photografs", cascade = CascadeType.ALL)
    private List<Clients> clients = new ArrayList<>();
}