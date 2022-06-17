package Interface;


import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;

import Conexao_BD.CategoriaDao;
import entidades.Categoria;

public class ListaCategoriaUI  extends javax.swing.JFrame {
		
	ArrayList<Categoria> categorias;	
	private JTable tabCategorias;
	
    public void TelaListaCategoria() {
        montarListaCategorias();
    }
    
	public void montarListaCategorias() {
        categorias = CategoriaDao.listar();
        DefaultTableModel conteudo = (DefaultTableModel)tabCategorias.getModel();
        conteudo.setRowCount(0); // Eliminar as linhas da tabela
        for(Categoria cat : categorias) {
            Object[] linha = {
                cat.getNome(),
                cat.getTipo()
            };
            
            conteudo.addRow(linha);
        }
    }

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListaCategoriaUI frame = new ListaCategoriaUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public ListaCategoriaUI() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 821, 735);
		getContentPane().setLayout(null);
		
		tabCategorias = new JTable();
		tabCategorias.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Categoria", "Tipo"
			}
		));
		tabCategorias.setRowSelectionAllowed(false);
		tabCategorias.setBackground(Color.BLUE);
		tabCategorias.setEnabled(false);
		tabCategorias.setFillsViewportHeight(true);
		tabCategorias.setBounds(22, 665, 752, -610);
		getContentPane().add(tabCategorias);
	
	}
	
	
}
