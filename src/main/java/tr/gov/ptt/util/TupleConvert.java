package tr.gov.ptt.util;

import tr.gov.ptt.dto.MutabakatDTO;
import jakarta.persistence.Tuple;

import java.math.BigDecimal;

public class TupleConvert {

    public static MutabakatDTO convertTuple(Tuple gelen) {

        Long ekle = (Long) gelen.get("EKLE");
        Long cikar = (Long) gelen.get("CIKAR");

        return new MutabakatDTO(ekle, cikar);
    }
}
