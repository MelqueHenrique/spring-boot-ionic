package com.melquehenrique.cursomc.services;

import com.melquehenrique.cursomc.domain.Categoria;
import com.melquehenrique.cursomc.repositories.CategoriaRepository;
import com.melquehenrique.cursomc.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repo;
    public Categoria buscar(Integer id){
        Optional<Categoria> obj = repo.findById(id);
        return obj.orElseThrow(()-> new ObjectNotFoundException("Objeto não Encontrado! ID: "+id+", Tipo: "+ Categoria.class.getName()));
    }
}
