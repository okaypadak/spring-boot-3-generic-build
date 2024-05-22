package tr.gov.ptt.dto;

public class CachedToken {
    private String token;
    private long expiresAt;

    public CachedToken(String token, long expiresIn) {
        this.token = token;
        this.expiresAt = System.currentTimeMillis() + expiresIn * 1000; // Convert expiresIn to milliseconds
    }

    public String getToken() {
        return token;
    }

    public boolean isExpired() {
        return System.currentTimeMillis() >= expiresAt;
    }

    @Override
    public String toString() {
        return "CachedToken{" +
                "token='" + token + '\'' +
                ", expiresAt=" + expiresAt +
                '}';
    }
}
