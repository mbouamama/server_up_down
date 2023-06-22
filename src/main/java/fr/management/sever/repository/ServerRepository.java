package fr.management.sever.repository;

import fr.management.sever.model.Server;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServerRepository  extends JpaRepository<Server, Long> {


}
