package com.devsuperior.cabacitybank.dto;

import org.springframework.beans.BeanUtils;

import com.devsuperior.cabacitybank.entities.KeyPix;


public class KeyPixDTO {

  private Long id;
  private String typeKey;
  private String keyPix;
  private double valueTransaction;

  public KeyPixDTO() {
  }

  public KeyPixDTO(KeyPix entity){
    BeanUtils.copyProperties(entity, this);
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTypeKey() {
    return typeKey;
  }

  public void setTypeKey(String typeKey) {
    this.typeKey = typeKey;
  }

  public String getKeyPix() {
    return keyPix;
  }

  public void setKeyPix(String keyPix) {
    this.keyPix = keyPix;
  }

  public double getValueTransaction() {
    return valueTransaction;
  }

  public void setValueTransaction(double valueTransaction) {
    this.valueTransaction = valueTransaction;
  }

  
}
