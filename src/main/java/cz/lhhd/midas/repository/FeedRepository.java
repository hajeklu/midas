package cz.lhhd.midas.repository;

import cz.lhhd.midas.model.Feed;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedRepository extends JpaRepository<Feed, Integer> {
}
