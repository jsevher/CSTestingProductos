package com.example.juansevillano.testingproductos;

/**
 * Created by Juan Sevillano on 03/04/2017.
 */

public class Ingredientes {

    private int id_ingrediente;
    private String ingrediente;
    private String tipo_ingrediente;
    private boolean estado;

    Ingredientes()
    {
    }

    Ingredientes(int id_ingrediente, String ingrediente, String tipo_ingrediente)
    {
        this.id_ingrediente=id_ingrediente;
        this.ingrediente=ingrediente;
        this.tipo_ingrediente=tipo_ingrediente;
    }

    Ingredientes(String ingrediente, boolean estado)
    {
        this.ingrediente=ingrediente;
        this.estado=estado;
    }

    public int getid_ingrediente(){return id_ingrediente;}

    public void setid_ingrediente(int id_ingrediente){this.id_ingrediente=id_ingrediente;}

    public String getingrediente()
    {
        return ingrediente;
    }

    public void setingrediente(String ingrediente)
    {
        this.ingrediente=ingrediente;
    }

    public String gettipo_ingrediente(){return tipo_ingrediente;}

    public void settipo_ingrediente(String tipo_ingrediente){this.tipo_ingrediente=tipo_ingrediente;}

    public boolean isChekeado() {
        return estado;
    }

    public void setChekeado(boolean estado)
    {
        this.estado = estado;
    }

    public void Insertar_Usuario_Ingrediente()
    {

    }
}