package com.devsuperior.cabacitybank.entities;

public class KeyPixList {

  private String keyPix;
  private double valueTransaction;

  public KeyPixList() {
  }

  public KeyPixList(String keyPix, double valueTransaction) {
    this.keyPix = keyPix;
    this.valueTransaction = valueTransaction;
  }

  public String getKeyPix() {
    return keyPix;
  }

  public double getValueTransaction() {
    return valueTransaction;
  }

}
