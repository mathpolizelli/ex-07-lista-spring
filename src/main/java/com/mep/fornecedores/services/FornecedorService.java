package com.mep.fornecedores.services;

import com.mep.fornecedores.models.FornecedorModel;
import com.mep.fornecedores.repositories.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FornecedorService {

    @Autowired
    private FornecedorRepository fornecedorRepository;

    public List<FornecedorModel> findAll() {
        return fornecedorRepository.findAll();
    }

    public FornecedorModel findById(Long id) {
        return fornecedorRepository.findById(id).get();
    }

    public FornecedorModel save(FornecedorModel pedidoModel) {
        return fornecedorRepository.save(pedidoModel);
    }

    public void delete(Long id) {
        fornecedorRepository.deleteById(id);
    }
}
