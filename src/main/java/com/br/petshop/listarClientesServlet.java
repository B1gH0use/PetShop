package com.br.petshop;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.br.petshop.Objs.Cliente;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.ServletException;

@WebServlet(name = "listarClientes", urlPatterns = { "/listarClientes" })
public class listarClientesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		Cliente ss = (Cliente)request.getSession().getAttribute("cliente");

		out.println("<html><body>");

		System.out.print(ss.getNome());
		System.out.print(ss.getEndereco());
		System.out.print(ss.getTelefone());
		
		out.println("</body></html>");
	}

}
