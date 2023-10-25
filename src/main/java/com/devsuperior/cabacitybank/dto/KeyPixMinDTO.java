package com.devsuperior.cabacitybank.dto;

import com.devsuperior.cabacitybank.entities.KeyPix;

public class KeyPixMinDTO {

  private Long id;
  private String typeKey;
  private String keyPix;
  private double valueTransaction;

  public KeyPixMinDTO(){
  }

  public KeyPixMinDTO(KeyPix entity) {
    id = entity.getId();
    typeKey = entity.getTypeKey();
    keyPix = entity.getKeyPix();
    valueTransaction = entity.getValueTransaction();
  }

  public Long getId() {
    return id;
  }

  public String getTypeKey() {
    return typeKey;
  }
  
  public String getKeyPix() {
    return keyPix;
  }

  public double getValueTransaction() {
    return valueTransaction;
  }
  
}
