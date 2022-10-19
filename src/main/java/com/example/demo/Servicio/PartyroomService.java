/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.Servicio;

import com.example.demo.Modelo.Partyroom;
import com.example.demo.Repositorio.PartyroomRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class PartyroomService {

    @Autowired
    private PartyroomRepository partyroomRepository;

    public List<Partyroom> getAll() {
        return partyroomRepository.getAll();
    }

    public Optional<Partyroom> getPartyroom(int id) {
        return partyroomRepository.getPartyroom(id);
    }

    public Partyroom save(Partyroom partyroom) {
        if (partyroom.getId() == null) {
            return partyroomRepository.save(partyroom);
        } else {
            Optional<Partyroom> partyroom1 = partyroomRepository.getPartyroom(partyroom.getId());
            if (partyroom1.isEmpty()) {
                return partyroomRepository.save(partyroom);
            } else {
                return partyroom;
            }
        }
    }

    public Partyroom update(Partyroom partyroom) {
        if (partyroom.getId() != null) {
            Optional<Partyroom> e = partyroomRepository.getPartyroom(partyroom.getId());
            if (!e.isEmpty()) {
                if (partyroom.getName() != null) {
                    e.get().setName(partyroom.getName());
                }
                if (partyroom.getOwner() != null) {
                    e.get().setOwner(partyroom.getOwner());
                }
                if (partyroom.getDescription() != null) {
                    e.get().setDescription(partyroom.getDescription());
                }
                if (partyroom.getDescription() != null) {
                    e.get().setDescription(partyroom.getDescription());
                }
                if (partyroom.getCategory() != null) {
                    e.get().setCategory(partyroom.getCategory());
                }
                partyroomRepository.save(e.get());
                return e.get();
            } else {
                return partyroom;
            }
        } else {
            return partyroom;
        }
    }

    public boolean deletePartyroom(int id) {
        Boolean d = getPartyroom(id).map(partyroom -> {
            partyroomRepository.delete(partyroom);
            return true;
        }).orElse(false);
        return d;
    }
}
