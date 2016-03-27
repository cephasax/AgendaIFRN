package br.edu.ifrn.informatica.poo.interfaces;

import br.edu.ifrn.informatica.poo.Contato;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

/**
 * Implementação de Table Model para exibir os Sócios.
 * 
 * @author Eric Yuzo
 */
public class TmVerContatos extends AbstractTableModel {
	/* Lista de Sócios que representam as linhas. */
	private List<Contato> linhas;

	/* Array de Strings com o nome das colunas. */
	private String[] colunas = new String[] { "", "Nome", "Telefone"};

	/* Cria um FuncionarioTableModel vazio. */
	public TmVerContatos() {
		linhas = new ArrayList<Contato>();
	}

	/*
	 * Cria um FuncionarioTableModel carregado com a lista de sócios
	 * especificada.
	 */
	public TmVerContatos(List<Contato> listaContatos) {
		linhas = new ArrayList<Contato>(listaContatos);
	}

	/* Retorna a quantidade de colunas. */
	public int getColumnCount() {
		// Está retornando o tamanho do array "colunas".
		// Mas como o array é fixo, vai sempre retornar 4.
		return colunas.length;
	}

	/* Retorna a quantidade de linhas. */
	public int getRowCount() {
		// Retorna o tamanho da lista de sócios.
		return linhas.size();
	}

	/*
	 * Retorna o nome da coluna no índice especificado. Este método é usado pela
	 * JTable para saber o texto do cabeçalho.
	 */
	@Override
	public String getColumnName(int columnIndex) {
		return colunas[columnIndex];
	};

	/*
	 * Retorna a classe dos elementos da coluna especificada. Este método é
	 * usado pela JTable na hora de definir o editor da célula.
	 */
	@Override
	public Class<?> getColumnClass(int columnIndex) {
		switch (columnIndex) {
		case 1: // Nome
			return String.class;
		case 2: // Telefone
			return String.class;
		default:
			return null;
		}
	}

	/*
	 * Retorna o valor da célula especificada pelos índices da linha e da
	 * coluna.
	 */
	public Object getValueAt(int rowIndex, int columnIndex) {
		// Pega o sócio da linha especificada.
		Contato contato = linhas.get(rowIndex);

		switch (columnIndex) {
		case 1: // Nome
			return contato.getNome();
		case 2: // Telefone
			return contato.getTelefone();
		default:
			return null;
		}
	}

	/*
	 * Retorna um valor booleano que define se a célula em questão pode ser
	 * editada ou não. Este método é utilizado pela JTable na hora de definir o
	 * editor da célula. Neste caso, estará sempre retornando false, não
	 * permitindo que nenhuma célula seja editada.
	 */
	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return false;
	}

	/* Retorna o sócio da linha especificada. */
	public Contato getContato(int indiceLinha) {
		if (indiceLinha < linhas.size()) {
			return linhas.get(indiceLinha);
		}
		return null;
	}

	/* Verifica se este table model está vazio. */
	public boolean isEmpty() {
		return linhas.isEmpty();
	}

	public List<Contato> getLinhas() {
		return linhas;
	}

	public void setLinhas(List<Contato> linhas) {
		this.linhas = new ArrayList<Contato>(linhas);
	}

	public String[] getColunas() {
		return colunas;
	}

	public void setColunas(String[] colunas) {
		this.colunas = colunas;
	}

}