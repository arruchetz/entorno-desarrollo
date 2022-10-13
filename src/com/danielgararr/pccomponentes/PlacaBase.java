package com.danielgararr.pccomponentes;

/**
 *Clase PlacaBase
 */
public class PlacaBase {

    /**
     * Atributos, propiedades, Variables
     */
    private Integer id;
    private String marca;
    private String fabricante;

    /**
     * Metodos, secciones, comportamiento,
     */
    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
        this.id = id;
    }

    public String getMarca(){
        return marca;
    }
    public void  setMarca(String marca){
        this.marca = marca;
    }

    public String getFabricante(){

        return fabricante;
    }
    public void  setFabricante(String fabricante){
        this.fabricante = fabricante;
    }
}