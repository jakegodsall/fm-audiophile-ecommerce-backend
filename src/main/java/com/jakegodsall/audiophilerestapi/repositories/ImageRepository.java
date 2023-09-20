package com.jakegodsall.audiophilerestapi.repositories;

import com.jakegodsall.audiophilerestapi.entities.Image;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ImageRepository extends JpaRepository<Image, Long> {
    Optional<Image> findByName(String name);
}
