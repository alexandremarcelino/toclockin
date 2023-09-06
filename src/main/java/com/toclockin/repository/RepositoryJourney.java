package com.toclockin.repository;



import com.toclockin.model.Workday;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryJourney extends JpaRepository<Workday, Long> {
}
