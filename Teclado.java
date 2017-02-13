/**
 * Trabajo CRUD Programación-Sistemas Informáticos - vArrayList
 *
 * @author Adrián Aguilar
 */
package crudVarrayList;

public class Teclado {
  
  private int id;
  private String marca;
  private String modelo;
  private String conect;
  private String tipo;
  private float precio;
  
  public Teclado(int id, String m, String mod, String c, String t, float p) {
    this.id = id;
    this.marca = m;
    this.modelo = mod;
    this.conect = c;
    this.tipo = t;
    this.precio = p;
  }
  
  @Override
  public String toString() {
    return "\n###############################\n"
        + "ID: " + this.id
        + "\n───────────────────────────────\n"
        + "Marca: " + this.marca
        + "\n───────────────────────────────\n"
        + "Modelo: " + this.modelo
        + "\n───────────────────────────────\n"
        + "Conectividad: " + this.conect
        + "\n───────────────────────────────\n"
        + "Tipo: " + this.tipo
        + "\n───────────────────────────────\n"
        + "Precio: " + this.precio
        + "\n###############################\n";
  }
  
  public int getId() {
    return id;
  }
  
  public void setId(int id) {
    this.id = id;
  }
  
  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public String getConect() {
    return conect;
  }

  public void setConect(String conect) {
    this.conect = conect;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public float getPrecio() {
    return precio;
  }

  public void setPrecio(float precio) {
    this.precio = precio;
  }
}
