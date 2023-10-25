package com.devsuperior.cabacitybank.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_key_pix")
public class KeyPix {

  @Id
  private Long id;

  @Column(name = "type_key")
  private String typeKey;

  @Column(name = "key_pix")
  private String keyPix;

  @Column(name = "value_transaction")
  private double valueTransaction;

  public KeyPix(){
  }

  public KeyPix(Long id, String typeKey, String keyPix, double valueTransaction) {
    this.id = id;
    this.typeKey = typeKey;
    this.keyPix = keyPix;
    this.valueTransaction = valueTransaction;
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

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    KeyPix other = (KeyPix) obj;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    return true;
  }

  

}
