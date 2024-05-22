package tr.gov.ptt.exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ClientException extends RuntimeException {

    public ClientException(String message) {
        super(message);
    }
}