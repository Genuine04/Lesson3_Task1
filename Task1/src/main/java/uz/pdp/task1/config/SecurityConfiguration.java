package uz.pdp.task1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .cors()
                .and()
                .csrf()
                .disable()
                .sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                .authorizeRequests()
                .antMatchers(HttpMethod.POST, "/api/**").hasAnyRole("SUPER_ADMIN","MODERATOR","OPERATOR")
                .antMatchers(HttpMethod.PUT, "/api/**").hasAnyRole("SUPER_ADMIN","MODERATOR")
                .antMatchers(HttpMethod.GET, "/api/**").hasAnyRole("SUPER_ADMIN","OPERATOR")
                .antMatchers(HttpMethod.DELETE, "/api/**").hasRole("SUPER_ADMIN")
                .anyRequest()
                .authenticated()
                .and()
                .httpBasic();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .inMemoryAuthentication()
                .withUser("super_admin").password(passwordEncoder().encode("111"))
                .roles("SUPER_ADMIN")
                .and().withUser("moderator").password(passwordEncoder().encode("222"))
                .roles("MODERATOR")
                .and().withUser("operator").password(passwordEncoder().encode("333"))
                .roles("OPERATOR");
    }
//    authorities("GET_ALL_PRODUCTS","GET_PRODUCT_BY_ID","POST_PRODUCT"
//                        ,"PUT_PRODUCT","DELETE_PRODUCT")

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
