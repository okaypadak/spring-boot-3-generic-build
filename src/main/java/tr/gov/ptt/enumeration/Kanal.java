package tr.gov.ptt.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Kanal {
    POSTAWEB("POSTAWEB"),
    CASHMAN("CASHMAN"),
    IPC("IPC"),
    ATM("ATM");

    private String aciklama;}
