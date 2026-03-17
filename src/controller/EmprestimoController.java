package controller;

import dao.EmprestimoDao;
import model.Emprestimo;
import model.Usuario;
import model.Livro;
import java.util.List;

public class EmprestimoController {

    private EmprestimoDao emprestimoDao = new EmprestimoDao();

    // Método principal (usado no diagrama de sequência)
    public void realizarEmprestimo(Usuario usuario, Livro livro){

        if(livro.getQuantidade() > 0){

            Emprestimo emprestimo = new Emprestimo();

            emprestimo.setUsuario(usuario);
            emprestimo.setLivro(livro);

            emprestimoDao.registrarEmprestimo(emprestimo);

            System.out.println("Empréstimo realizado com sucesso!");

        } else {
            System.out.println("Livro indisponível!");
        }
    }

    // Mantém caso você já use em outro lugar
    public void registrarEmprestimo(Emprestimo e) {
        emprestimoDao.registrarEmprestimo(e);
    }

    public List<Emprestimo> listarEmprestimos() {
        return emprestimoDao.listarEmprestimos();
    }
}