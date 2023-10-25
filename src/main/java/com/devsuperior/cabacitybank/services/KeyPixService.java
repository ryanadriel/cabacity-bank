package com.devsuperior.cabacitybank.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.devsuperior.cabacitybank.dto.KeyPixDTO;
import com.devsuperior.cabacitybank.dto.KeyPixMinDTO;
import com.devsuperior.cabacitybank.entities.KeyPix;
import com.devsuperior.cabacitybank.repositories.KeyPixRepository;

@Service
public class KeyPixService {

  @Autowired
  private KeyPixRepository keyPixRepository;

  @Transactional(readOnly = true)
  public KeyPixDTO findById(Long id) {
    KeyPix result = keyPixRepository.findById(id).get();
    return new KeyPixDTO(result);
  }

  @Transactional(readOnly = true)
  public List<KeyPixMinDTO> findAll() {
    List<KeyPix> result = keyPixRepository.findAll();
    return result.stream().map(x -> new KeyPixMinDTO(x)).toList();
  }
}