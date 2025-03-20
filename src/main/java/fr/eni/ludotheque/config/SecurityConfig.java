package fr.eni.ludotheque.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable()) // Désactive la protection CSRF
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/clients/**").permitAll() // Autorise l'accès sans authentification
                        .anyRequest().authenticated()
                )
                .formLogin(form -> form.disable()) // Désactive le formulaire de login par défaut
                .httpBasic(basic -> basic.disable()); // Désactive l'authentification basique

        return http.build();
    }
}
