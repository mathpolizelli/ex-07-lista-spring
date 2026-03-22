package com.mep.fornecedores.controllers;

import com.mep.fornecedores.models.FornecedorModel;
import com.mep.fornecedores.services.FornecedorService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fornecedores")
public class FornecedorController {

    @Autowired
    private FornecedorService fornecedorService;

    @GetMapping
    public ResponseEntity<List<FornecedorModel>> findAll() {
        return ResponseEntity.ok().body(fornecedorService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<FornecedorModel> findById(@PathVariable Long id) {
        return ResponseEntity.ok().body(fornecedorService.findById(id));
    }

    @PostMapping
    public ResponseEntity<FornecedorModel> save(@RequestBody FornecedorModel fornecedorModel) {
        return ResponseEntity.status(201).body(fornecedorService.save(fornecedorModel));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        fornecedorService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
