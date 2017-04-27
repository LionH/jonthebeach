package com.oracle.tesolin.initialize;

import javax.sql.DataSource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Autowired
	private DataSource dataSource;
	
	@Override
    protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable();
		http.headers().frameOptions().disable();
        http
            .authorizeRequests()
                .antMatchers(
                		"/",
                		"/*.ico",
                		"/login.html",
                		"/img/*", 
                		"/fonts/*", 
                		"/css/*", 
                		"/js/*",
                		"/sockjs-node/**",
                		"/node_modules/**",
                		"/index.html", 
                		"/addUser")
                .permitAll()
                .anyRequest().authenticated()
                .and().formLogin()
    			.and()
    			.httpBasic();;
    }
	
	@Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth
		.inMemoryAuthentication()
			.withUser("admin").password("Welcome1").roles("ADMIN");
	}
	
}
