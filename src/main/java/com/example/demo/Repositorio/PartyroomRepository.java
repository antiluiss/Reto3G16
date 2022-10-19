/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.Repositorio;

import com.example.demo.Modelo.Partyroom;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.example.demo.Interface.PartyroomInterface;

/**
 *
 * @author danielcasallas
 */
@Repository
public class PartyroomRepository {

    @Autowired
    private PartyroomInterface extencionesCrud;

    public List<Partyroom> getAll() {
        return (List<Partyroom>) extencionesCrud.findAll();
    }

    public Optional<Partyroom> getPartyroom(int id) {
        return extencionesCrud.findById(id);
    }

    public Partyroom save(Partyroom partyroom) {
        return extencionesCrud.save(partyroom);
    }

    public void delete(Partyroom partyroom) {
        extencionesCrud.delete(partyroom);
    }
}
