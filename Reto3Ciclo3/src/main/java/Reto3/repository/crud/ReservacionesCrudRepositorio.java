/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Reto3.repository.crud;

import Reto3.model.Reservaciones;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Will
 */
public interface ReservacionesCrudRepositorio extends CrudRepository<Reservaciones, Integer> {
    
}
