/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.Interface;
import org.springframework.data.repository.CrudRepository;
import com.example.demo.Modelo.Partyroom;
/**
 *
 * @author USUARIO
 */
public interface PartyroomInterface extends CrudRepository<Partyroom, Integer> {
    
}
