package com.devsuperior.cabacitybank.controllers;

import org.springframework.web.bind.annotation.PathVariable;

import com.devsuperior.cabacitybank.dto.KeyPixDTO;

@RestController
@RequestMapping(value = "/keypix")
public class KeyPixController {

  @Autowired
  private KeyPixController keyPixController;

  public KeyPixDTO findById(@PathVariable Long id) {
    KeyPixDTO result = keyPixService.findById(id);
    return result;
  }

}
