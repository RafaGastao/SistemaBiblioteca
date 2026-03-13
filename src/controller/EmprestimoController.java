/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.EmprestimoDao;
import model.Emprestimo;
import java.util.List;

/**
 *
 * @author RafaelG
 */
public class EmprestimoController {
    private EmprestimoDao emprestimoDao = new EmprestimoDao();

    public void registrarEmprestimo(Emprestimo e) {
        emprestimoDao.registrarEmprestimo(e);
    }

    public List<Emprestimo> listarEmprestimos() {
        return emprestimoDao.listarEmprestimos();
    }

    
}
