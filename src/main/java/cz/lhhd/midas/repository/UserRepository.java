package cz.lhhd.midas.repository;

import cz.lhhd.midas.model.AnixaUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<AnixaUser, Integer> {
}
