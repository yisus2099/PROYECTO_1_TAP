package Almacenamiento;

import Modelo.Cliente;
import java.util.ArrayList;

/**
 *
 * @author Jesús Alejandro Torres Ramírez
 */
public class ListaClientes {
  private static ArrayList<Cliente> listaClientes = new ArrayList<>();
    
    public static ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }
    
    public static void agregarCliente(Cliente cliente) {
        listaClientes.add(cliente);
    }

    public static void setListaClientes(ArrayList<Cliente> listaClientes) {
        ListaClientes.listaClientes = listaClientes;
    }

}
