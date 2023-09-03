package br.com.cadastro.controller;

import java.io.IOException;
import java.util.List;

import br.com.cadastro.model.Coordenador;
import br.com.cadastro.model.Curso;
import br.com.cadastro.model.Periodo;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/atualizar")
public class AtualizarController extends HttpServlet {

	private static final long serialVersionUID = 873256145902791570L;
	
	protected void doGet(HttpServletRequest req, 
			HttpServletResponse resp) throws ServletException, IOException {
		List<Coordenador> coordenadores = (List<Coordenador>) req.getSession().getAttribute("coordenadores");
		String id = req.getParameter("id");
		int idvalue = Integer.parseInt(id);
		
		Coordenador coordenador = null;
		for (int i = 0; i < coordenadores.size(); i++) {
			if(coordenadores.get(i).getId() == idvalue ){
				coordenador = coordenadores.get(i);
			}
		}
		req.setAttribute("coordenador", coordenador);
		RequestDispatcher rd = req.getRequestDispatcher("atualizar.jsp");
		rd.forward(req, resp);
	}
	
	protected void doPost(HttpServletRequest req, 
			HttpServletResponse resp) throws ServletException, IOException {
		List<Coordenador> coordenadores = (List<Coordenador>) req.getSession().getAttribute("coordenadores");
		String nome = req.getParameter("nome");
		String disciplina = req.getParameter("curso");
		String dia = req.getParameter("dia");
		String horaInicial = req.getParameter("horaInicial");
		String horaFinal = req.getParameter("horaFinal");
		String id = req.getParameter("id");
		
		int idvalue = Integer.parseInt(id);
		Coordenador coordenador = null;
		for (int i = 0; i < coordenadores.size(); i++) {
			if(coordenadores.get(i).getId() == idvalue){
				coordenador = coordenadores.get(i);
			}
		}
		
		Curso curso = new Curso(disciplina);
		Periodo periodo = new Periodo(dia, horaInicial, horaFinal);
		
		coordenador.setNome(nome);
		coordenador.setCurso(curso);
		coordenador.setPeriodo(periodo);
		
		resp.sendRedirect("/cadastro/");
	}
	
}
