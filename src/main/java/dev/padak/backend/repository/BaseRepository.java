package dev.padak.backend.repository;

import dev.padak.backend.entity.TalimatEntity;
import jakarta.persistence.Tuple;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BaseRepository extends JpaRepository<TalimatEntity, Long> {

    Optional<TalimatEntity> findByKurumAndTelefonNoAndDurum(String kurum, String telefonNo, Integer durum);

    @Query("SELECT COUNT(talimatBaslangic) AS ekle, COUNT(talimatBitis) AS cikar FROM TalimatEntity t WHERE kurum = :kurum AND talimatBitis = :tarih OR talimatBaslangic = :tarih")
    Tuple mutabakatSorgula(String kurum, Integer tarih);

}
