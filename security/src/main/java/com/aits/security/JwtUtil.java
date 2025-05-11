package com.aits.security;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.Claims;
import java.util.Date;
import javax.crypto.SecretKey;
import org.springframework.stereotype.Component;
 
@Component
public class JwtUtil {
    private static final String SECRET = "mySecretKeymySecretKeymySecretKeymySecretKey"; // 🔹 Must be at least 32 chars
    private static final SecretKey SECRET_KEY = Keys.hmacShaKeyFor(Decoders.BASE64.decode(SECRET));
 
    // 🔹 Generate JWT Token
    public String generateToken(String username) {
        return Jwts.builder()
            .subject(username)
            .issuedAt(new Date())
            .expiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60)) // 1 hour expiry
            .signWith(SECRET_KEY)
            .compact();
    }
 
    // 🔹 Validate JWT Token
    public boolean validateToken(String token) {
        try {
            Jwts.parser().verifyWith(SECRET_KEY).build().parseSignedClaims(token);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
 
    // 🔹 Extract Username from Token
    public String extractUsername(String token) {
        Claims claims = Jwts.parser()
            .verifyWith(SECRET_KEY)
            .build()
            .parseSignedClaims(token)
            .getPayload();
        return claims.getSubject();
    }
}
