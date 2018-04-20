package br.com.alura.gerenciador.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.dao.EmpresaDAO;
import br.com.alura.gerenciador.model.Empresa;

@WebServlet(urlPatterns ="/novaEmpresa")
public class NovaEmpresa extends HttpServlet{
	
	private static final long serialVersionUID = 8147512659241148541L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//Teste
		String nome = req.getParameter("nome");
		
		Empresa empresa = new Empresa(nome);
		
		new EmpresaDAO().adiciona(empresa);
		
		PrintWriter writer = resp.getWriter();
		
		writer.println("<html><body> Empresa " + empresa.getNome() + " adiciona!</body></html>");
	}
}
