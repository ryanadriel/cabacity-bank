package com.devsuperior.cabacitybank.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.cabacitybank.dto.KeyPixDTO;
import com.devsuperior.cabacitybank.dto.KeyPixMinDTO;
import com.devsuperior.cabacitybank.services.KeyPixService;

@RestController
@RequestMapping(value = "/keypix")
public class KeyPixController {

  @Autowired
  private KeyPixService keyPixService;

  @GetMapping(value = "/{id}")
  public KeyPixDTO findById(@PathVariable Long id) {
    KeyPixDTO result = keyPixService.findById(id);
    return result;
  }

  @GetMapping
  public List<KeyPixMinDTO> findAll() {
    List<KeyPixMinDTO> result = keyPixService.findAll();
    return result;
  }

}
