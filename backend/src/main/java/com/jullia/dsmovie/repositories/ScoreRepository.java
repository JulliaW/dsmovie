package com.jullia.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jullia.dsmovie.entities.Score;
import com.jullia.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
