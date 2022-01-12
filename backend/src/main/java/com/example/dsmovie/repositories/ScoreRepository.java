package com.example.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dsmovie.entities.Score;
import com.example.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
