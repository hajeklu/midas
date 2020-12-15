package cz.lhhd.midas.repository;

import cz.lhhd.midas.model.Contest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContestRepository extends JpaRepository<Contest, Integer> {
}
