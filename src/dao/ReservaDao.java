/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.Reserva;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author RafaelG
 */
public class ReservaDao {
    private List<Reserva> reservas = new ArrayList<>();

    public void criarReserva(Reserva r) {
        reservas.add(r);
    }

    public List<Reserva> listarReservas() {
        return reservas;
    }
    
}
