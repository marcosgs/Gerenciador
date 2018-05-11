package br.com.alura.gerenciador.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.alura.gerenciador.dao.UsuarioDAO;
import br.com.alura.gerenciador.model.Usuario;

@WebServlet(urlPatterns = "/login")
public class Login implements Tarefa {

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse resp) {
		String email = req.getParameter("email");
		String senha = req.getParameter("senha");

		Usuario usuario = new UsuarioDAO().buscaPorEmailESenha(email, senha);

		if (usuario != null) {
			HttpSession session = req.getSession();
			session.setAttribute("usuarioLogado", usuario); // Adiciona usu�rio logado a sess�o
		}
			
		return "/WEB-INF/paginas/login.jsp";
	}

//	private static final long serialVersionUID = -3796313427747926879L;

	// public final static Map<String, String> USUARIOS_LOGADOS = new HashMap<>();

//	@Override
//	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		PrintWriter writer = resp.getWriter();
//
//		String email = req.getParameter("email");
//		String senha = req.getParameter("senha");
//
//		Usuario usuario = new UsuarioDAO().buscaPorEmailESenha(email, senha);
//
//		if (usuario == null) {
//			writer.println("<html><body>Usu�rio ou senha inv�lida</body></html>");
//		} else {
//
//			HttpSession session = req.getSession();
//			session.setAttribute("usuario.logado", usuario); // Adiciona usu�rio logado a sess�o
//
//			writer.println("<html><body>Usu�rio " + email + " est� logado!</body></html>");
//
//		}
//
//	}
}
