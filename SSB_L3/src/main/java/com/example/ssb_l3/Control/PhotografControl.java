package com.example.ssb_l3.Control;

import com.example.ssb_l3.UserEntity.Photografs;
import com.example.ssb_l3.Repository.PhotografsRepository;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class PhotografControl  {
    private final PhotografsRepository photografsRepository;

    public PhotografControl(PhotografsRepository photografsRepository) {
        this.photografsRepository = photografsRepository;
    }
    @QueryMapping
    Iterable<Photografs> photografs(){
        return photografsRepository.findAll();
    }
}