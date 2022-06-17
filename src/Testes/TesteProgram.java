package Testes;

import Conexao_BD.CategoriaDao;
import entidades.Categoria;

public class TesteProgram {
	public static void main(String[] args) {
		
		Categoria categoria = new Categoria();
		categoria.setNome("Comedia");
		categoria.setTipo('F'); // F - Filme J - Jogo 

		
		//CategoriaDao.inserir(categoria);
		//System.out.println(CategoriaDao.alterar(categoria));
		//System.out.println(CategoriaDao.excluir(3));
		//System.out.println(CategoriaDao.listar());
		
		
		
	}

}