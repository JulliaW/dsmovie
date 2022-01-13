package com.jullia.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jullia.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
