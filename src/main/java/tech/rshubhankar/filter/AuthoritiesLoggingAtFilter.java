package tech.rshubhankar.filter;

import jakarta.servlet.*;
import lombok.extern.log4j.Log4j2;

import java.io.IOException;

/**
 * @author Rabiroshan Shubhankar
 * DATE : 12-09-2023
 */
@Log4j2
public class AuthoritiesLoggingAtFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        log.info("Authentication Validation is in progress");
        chain.doFilter(request, response);

    }
}
