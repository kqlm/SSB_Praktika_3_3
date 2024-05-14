package com.example.ssb_l3.UserEntity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Clients {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID",unique = true, nullable = false)
    private long id;
    @Column(name = "name",nullable = false)
    private String name;

    @ManyToOne()
    @JoinColumn(name = "fotoname", nullable = false)
    private Photografs photografs;
}