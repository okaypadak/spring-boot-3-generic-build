package tr.gov.ptt.repository;

import tr.gov.ptt.entity.TalimatEntity;
import jakarta.persistence.Tuple;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TurkcellRepository extends BaseRepository {

}
