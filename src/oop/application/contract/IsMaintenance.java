package oop.application.contract;

public interface IsMaintenance extends HashBrand {
  default boolean isMaintenance(){
    return false;
  };
}
