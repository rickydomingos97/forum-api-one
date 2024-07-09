package br.com.ricky_forum_hub_api.forum.api.security;

import br.com.ricky_forum_hub_api.forum.api.model.Usuario;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

@Service
public class TokenService {

    @Value("${api.security.token.secret}")
    private String secret;

    private static final String ISSUER = "Forum API";
    public String gerarToken(Usuario usuario){
        try {
            var algoritmo = Algorithm.HMAC256(secret);
            return com.auth0.jwt.JWT.create()
                    .withIssuer(ISSUER)
                    .withSubject(usuario.getEmail())
                    .withExpiresAt(dataExpiracao())
                    .sign(algoritmo);


        } catch (JWTCreationException ex){
            throw new RuntimeException("Erro ao gerar o token", ex);
        }

    }

    public String getSubject(String tokenJWT){
        try {
            var algoritomo = Algorithm.HMAC256(secret);
            return com.auth0.jwt.JWT.require(algoritomo)
                    .withIssuer(ISSUER)
                    .build()
                    .verify(tokenJWT)
                    .getSubject();
        } catch (JWTVerificationException ex){
            throw new RuntimeException("INVALID OR EXPIRED TOKEN", ex);
        }
    }

    private Instant dataExpiracao() {
        return LocalDateTime.now().plusHours(48)
                .toInstant(ZoneOffset.of("-03:00"));
    }
}