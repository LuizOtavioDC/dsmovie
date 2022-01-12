package com.example.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
