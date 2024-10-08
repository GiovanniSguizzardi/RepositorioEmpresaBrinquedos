package com.loja.brinquedos.controller;

import com.loja.brinquedos.model.Fornecedor;
import com.loja.brinquedos.repository.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class FornecedorController {

    @Autowired
    private FornecedorRepository fornecedorRepository;

    @GetMapping("/fornecedores")
    public String listarFornecedores(Model model) {
        model.addAttribute("fornecedores", fornecedorRepository.findAll());
        return "listar-fornecedores";
    }

    @GetMapping("/fornecedor/adicionar")
    public String formularioFornecedor(Model model) {
        model.addAttribute("fornecedor", new Fornecedor());
        return "formulario-fornecedor";
    }

    @PostMapping("/fornecedor/salvar")
    public String salvarFornecedor(@ModelAttribute Fornecedor fornecedor) {
        fornecedorRepository.save(fornecedor);
        return "redirect:/fornecedores";
    }

    @GetMapping("/fornecedor/editar/{id}")
    public String editarFornecedor(@PathVariable Long id, Model model) {
        Fornecedor fornecedor = fornecedorRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("ID inválido: " + id));
        model.addAttribute("fornecedor", fornecedor);
        return "formulario-fornecedor";
    }

    @PostMapping("/fornecedor/excluir/{id}")
    public String excluirFornecedor(@PathVariable Long id) {
        Fornecedor fornecedor = fornecedorRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("ID inválido: " + id));
        fornecedorRepository.delete(fornecedor);
        return "redirect:/fornecedores";
    }
}