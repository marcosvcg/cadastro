package br.com.cadastro.controller;


import java.io.IOException;
import java.util.List;

import br.com.cadastro.model.Coordenador;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/excluir")
public class ExcluirController extends HttpServlet {
	// http://localhost:8080/blog/excluir?titulo=aaaaaa
	@Override
	protected void doGet(HttpServletRequest req,
			HttpServletResponse resp) throws ServletException, IOException {
		List<Coordenador> coordenadores = (List<Coordenador>) req.getSession().getAttribute("coordenadores");
		String nome = req.getParameter("nome");
		String id = req.getParameter("id");
		
		int indice = -1;

		for (int i = 0; i < coordenadores.size(); i++) {
			if(coordenadores.get(i).getId() == Integer.parseInt(id)){
				indice = i;
			}
		}
		
		if(indice != -1) coordenadores.remove(indice);
		resp.sendRedirect("/cadastro/");
	}
}

