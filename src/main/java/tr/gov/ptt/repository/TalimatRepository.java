package tr.gov.ptt.repository;

import tr.gov.ptt.entity.TalimatEntity;
import jakarta.persistence.Tuple;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TalimatRepository extends JpaRepository<TalimatEntity, Long> {

    List<TalimatEntity> findByDurumOrTandemDurum(Integer clientDurum, Integer tandemDurum);

    List<TalimatEntity> findByDurum(Integer clientDurum);

    List<TalimatEntity> findByTelefonNo(String telefonNo);

    Optional<TalimatEntity> findByTelefonNoAndDurum(String telefonNo, Integer durum);

    Optional<TalimatEntity> findByKurumAndTelefonNoAndDurum(String kurum, String telefonNo, Integer durum);

    @Query("SELECT COUNT(talimatBaslangic) AS ekle, COUNT(talimatBitis) AS cikar FROM TalimatEntity t WHERE kurum = :kurum AND talimatBitis = :tarih OR talimatBaslangic = :tarih")
    Tuple mutabakatSorgula(String kurum, Integer tarih);

}
