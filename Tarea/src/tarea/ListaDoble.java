/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea;

/**
 *
 * @author ernst
 */
    public class ListaDoble {
    NodoDoble<A> head;
    int tamanio;        

    public ListaDoble() {
        this.head = null;
        this.tamanio = 0;
    }

    public boolean estaVacia() {
        return this.head == null;
    }
    
    public void agregarAlInicio(A valor) {
        NodoDoble<A> Aux = new NodoDoble(valor);
        if (this.estaVacia()) {
            this.head = Aux;
        } else {
            Aux.setSiguiente(head);
            head = Aux;
        }
    }
     public void agregarAlFinal(A valor) {
        NodoDoble<A> Nuevo = new NodoDoble(valor);
        if (this.estaVacia()) {
            this.head = Nuevo;
        } else {
            NodoDoble<A> Aux = this.head;
            while (Aux.getSiguiente() != null) {
                Aux = Aux.getSiguiente();
                Nuevo.setAnterior(Aux);
            }
            Aux.setSiguiente(Nuevo);
            Aux = null;
            Nuevo = null;
        }
    }
    public void eliminarElPrimero() {
        NodoDoble Aux = head;
        if (this.estaVacia()) {
            head = Aux;
        } else {
            head= Aux.getSiguiente();
        }
    }
     public void eliminarElFinal() {
        NodoDoble Aux = head;
        if (this.estaVacia()) {
            head = Aux;
        } else {
            while (Aux.getSiguiente().getSiguiente() != null) {
                Aux = Aux.getSiguiente();
            }
            Aux.setSiguiente(null);
        }
    }
    public void eliminar(int posición) {
         NodoDoble Aux = head;
            if (this.estaVacia()) {
            System.out.println("Lista vacia, llénala primero alcornoque");
            } else {
                if (posición > head.toString().length()) {
                  System.out.println("La posición introducida no existe en esta lista, alcornoque");
              } else {
                 for (int contador = 1; contador < posición - 1; contador++) {
                        Aux = Aux.getSiguiente();
                     }
                 }
          }
            Aux.setSiguiente(Aux.getSiguiente().getSiguiente());
            Aux.setAnterior(Aux.getAnterior());
    }
     public void eliminarElPrimero() {
        NodoDoble Aux = head;
        if (this.estaVacia()) {
           head = Aux;
        } else {
            head = Aux.getSiguiente();
        }
    }
   
      public void eliminarElFinal() {
        NodoDoble Aux = head;
        if (this.estaVacia()) {
           head = Aux;
        } else {
            while (Aux.getSiguiente().getSiguiente() != null) {
                Aux = Aux.getSiguiente();
            }
            Aux.setSiguiente(null);
        }
    } 
      public int buscarValor(A valor) {
        NodoDoble Aux = head;
        int posición = 1;
        if (this.estaVacia()) {
            System.out.println("Vacio");
        } else {
            while (Aux.getDato() != valor) {
                Aux = Aux.getSiguiente();
                posición++;
            }
        }
        return posición;
    }
        public void actualizarValor(T valor, T actualizado) {
        NodoDoble Aux = head;
        while (Aux.getDato() != valor) {
            Aux = Aux.getSiguiente();
        }
        Aux.setDato(actualizado);
    
        }
      public void transversal() {
        NodoDoble nodo_actual = this.head;
        while (nodo_actual != null) {
            System.out.print(nodo_actual);
            nodo_actual = nodo_actual.getSiguiente();
        }
        System.out.println("");
    }
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
