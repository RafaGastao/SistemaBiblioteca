/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.Emprestimo;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author RafaelG
 */
public class EmprestimoDao {
    private List<Emprestimo> emprestimos = new ArrayList<>();

    public void registrarEmprestimo(Emprestimo e) {
        emprestimos.add(e);
    }

    public List<Emprestimo> listarEmprestimos() {
        return emprestimos;
    }
}
