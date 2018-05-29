package com.ucbcba.proyecto.repositories;

import com.ucbcba.proyecto.entities.History;
import com.ucbcba.proyecto.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import javax.transaction.Transactional;
import java.util.List;


@Transactional
public interface HistoryRepository extends CrudRepository<History, Integer> {
}
