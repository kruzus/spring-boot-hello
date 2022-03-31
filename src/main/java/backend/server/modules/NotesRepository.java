package backend.server.modules;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface NotesRepository extends JpaRepository<NotesEntity, Long> {

    @Override
    @Query(value = "select * from notes", nativeQuery = true)
    List<NotesEntity> findAll();
}
