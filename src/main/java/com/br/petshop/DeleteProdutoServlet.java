package com.br.petshop;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import com.br.petshop.Objs.Produto;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;

@WebServlet(name = "DeleteProduto", urlPatterns = { "/DeleteProduto" })
public class DeleteProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nomeProduto = request.getParameter("nomeProduto");
		PrintWriter out = response.getWriter();
		
		ArrayList<Produto> listaProdutos = (ArrayList<Produto>)request.getSession().getAttribute("listaProdutos");
		for (Produto produto : listaProdutos) {
			if(produto.getNome().equals(nomeProduto)) {
				listaProdutos.remove(produto);
				break;
			}
		}
		request.setAttribute("listaProdutos", listaProdutos);
		
		
		RequestDispatcher rd = request.getRequestDispatcher("/produtoDeletado.jsp");
		request.setAttribute("nomeCliente", nomeProduto);
		rd.forward(request, response);
	}

}
