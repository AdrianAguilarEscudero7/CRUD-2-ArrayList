/**
 * Trabajo CRUD Programación-Sistemas Informáticos - vArrayList
 *
 * @author Adrián Aguilar
 */
package crudVarrayList;

import java.util.Scanner;
import java.util.ArrayList;

public class CRUDvArrayList {

///////////PROGRAMA PRINCIPAL///////////////////////////////////////////////////

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    ArrayList<Teclado> t = new ArrayList<Teclado>();
    
    t.add(new Teclado(1,"Razer","Blackwidow Chroma","Cable","Mecánico",164));
    t.add(new Teclado(2,"Corsair","K95","Cable","Mecánico",199));
    t.add(new Teclado(3,"Logitech","MK710","Wireless","Membrana",79));
    
    int opcionMenu;
    
    do {
      System.out.println("\n1.- Listado.");
      System.out.println("2.- Nuevo artículo.");
      System.out.println("3.- Editar.");
      System.out.println("4.- Borrar.");
      System.out.println("5.- Salir.");
      System.out.print("Por favor, seleccione una opción del menú: ");
      opcionMenu = Integer.parseInt(s.nextLine());
      
      switch (opcionMenu) {
        case 1:
          System.out.println("\nLISTADO");
          System.out.println("───────");
          muestraListado(t);
        break;
        case 2:
          System.out.println("\nNUEVO ARTÍCULO");
          System.out.println("──────────────");
          newArticulo(t);
        break;
        case 3:
          System.out.println("\nEDITAR");
          System.out.println("──────");
          editaArticulo(t);
        break;
        case 4:
          System.out.println("\nBORRAR");
          System.out.println("──────");
          borraArticulo(t);
        break;
        case 5:
          System.out.println("\n¡Hasta pronto!\n");
        break;
        default:
          System.out.println("\nLo siento ha introducido una opción no válida.\n");
      }
    } while (opcionMenu != 5);
  }

//////////////FUNCIONES/////////////////////////////////////////////////////////
  
  /**
   * Muestra el listado
   * 
   * @param t el ArrayList de objetos de la clase Teclado
   */
  public static void muestraListado(ArrayList<Teclado> t) {
    for (Teclado teclado : t) {
      System.out.print(teclado);
    }
  }
  
  /**
   * Añade un nuevo artículo
   * 
   * @param t el ArrayList de objetos de la clase Teclado
   */
  public static void newArticulo(ArrayList<Teclado> t) {
    Scanner a = new Scanner(System.in);
    
    System.out.print("\nIntroduzca el ID del teclado: ");
    int id = Integer.parseInt(a.nextLine());
    System.out.print("\nIntroduzca la marca del teclado: ");
    String marca = a.nextLine();
    System.out.print("\nIntroduzca el modelo del teclado: ");
    String modelo = a.nextLine();
    System.out.print("\nIntroduzca la conectividad del teclado: ");
    String conect = a.nextLine();
    System.out.print("\nIntroduzca el tipo de teclado: ");
    String tipo = a.nextLine();
    System.out.print("\nIntroduzca el precio del teclado: ");
    float precio = Float.parseFloat(a.nextLine());;
    t.add(new Teclado(id,marca,modelo,conect,tipo,precio));
  }
  
  /**
   * Edita un artículo
   * 
   * @param t el ArrayList de objetos de la clase Teclado
   */
  public static void editaArticulo(ArrayList<Teclado> t) {
    Scanner b = new Scanner(System.in);
    
    System.out.print("\nPor favor, introduzca el ID del teclado que desea" +
    		" modificar: ");
    int id = Integer.parseInt(b.nextLine());
    
    boolean salir = false;
    String intro = "";
    for(int i = 0; i < t.size() && !salir; i++) {
      if (t.get(i).getId() == id) {
        salir = true;
        System.out.println("\nIntroduzca los nuevos datos del artículo, o vaya" +
            " pulsando [INTRO] para no modificarlos.");
        System.out.println("\nID: " + t.get(i).getId());
        System.out.print("Nuevo ID: ");
        String nId = b.nextLine();
        if (!nId.equals(intro)) {
          t.get(i).setId(Integer.parseInt(nId));
        }
        System.out.println("\nMarca: " + t.get(i).getMarca());
        System.out.print("Nueva marca: ");
        String marca = b.nextLine();
        if (!marca.equals(intro)) {
          t.get(i).setMarca(marca);
        }
        System.out.println("\nModelo: " + t.get(i).getModelo());
        System.out.print("Nuevo modelo: ");
        String modelo = b.nextLine();
        if (!modelo.equals(intro)) {
          t.get(i).setModelo(marca);
        }
        System.out.println("\nConectividad: " + t.get(i).getConect());
        System.out.print("Nueva conectividad: ");
        String conect = b.nextLine();
        if (!conect.equals(intro)) {
          t.get(i).setConect(marca);
        }
        System.out.println("\nTipo: " + t.get(i).getTipo());
        System.out.print("Nuevo tipo: ");
        String tipo = b.nextLine();
        if (!tipo.equals(intro)) {
          t.get(i).setTipo(marca);
        }
        System.out.println("\nPrecio: " + t.get(i).getPrecio());
        System.out.print("Nuevo precio: ");
        String precio = b.nextLine();
        if (!precio.equals(intro)) {
          t.get(i).setPrecio(Float.parseFloat(precio));
        }
        System.out.println();
      }
      if ((i == t.size()-1) && (!salir)) {
        System.out.println("\nLo siento, el código introducido no existe.\n");
      }
    }
  }
  
  /**
   * Borra un artículo
   * 
   * @param t el ArrayList de objetos de la clase Teclado
   */
  public static void borraArticulo(ArrayList<Teclado> t) {
    Scanner c = new Scanner(System.in);
    
    System.out.print("\nPor favor, introduzca el ID del teclado que desea" +
        " borrar: ");
    int id = Integer.parseInt(c.nextLine());
    
    boolean salir = false;
    for (int i = 0; i < t.size() && !salir; i++) {
      if (t.get(i).getId() == id) {
        salir = true;
        t.remove(i);
        System.out.println("\n¡Artículo eliminado correctamente!.\n");
      }
      if ((i == t.size()-1) && (!salir)) {
        System.out.println("\nLo siento, el código introducido no existe.\n");
      }
    }
  }
}
