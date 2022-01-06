package com.boa.inventoryservice.filters;

import java.io.IOException;
import java.util.Random;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.boot.ExitCodeGenerator;

import com.boa.inventoryservice.exceptions.JwtTokenMissingException;

public class InventoryFilter implements Filter,ExitCodeGenerator  {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		
		//filter to check header
		
		HttpServletRequest httpRequest=(HttpServletRequest) request;
		HttpServletResponse httpResponse=(HttpServletResponse) response;
		String header = httpRequest.getHeader("Authorization");

		if (header == null || !header.startsWith("Bearer")) {
			throw new JwtTokenMissingException("No JWT token found in the "
					+ "request headers"+this.getExitCode());
		}

		chain.doFilter(httpRequest, httpResponse);
		
	}

	@Override
	public int getExitCode() {
		// TODO Auto-generated method stub
		return new Random().nextInt(100000);
	}

}
