package br.com.alura.gerenciador.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.dao.UsuarioDAO;
import br.com.alura.gerenciador.model.Usuario;

public class Login extends HttpServlet{
	
	private static final long serialVersionUID = -3796313427747926879L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		
		String email = req.getParameter("email");
		
		String senha = req.getParameter("senha");
		
		Usuario usuario = new UsuarioDAO().buscaPorEmailESenha(email, senha);
		
		if (usuario.equals(null)) {
			writer.append("<html><body>Usu�rio ou senha inv�lida</body></html>");
		}
		
	}
}
