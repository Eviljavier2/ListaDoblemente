package tarea;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ernst
 */
public class NodoDoble<A> {
private A datos;
    private NodoDoble<A> Siguiente;
    private NodoDoble<A> Anterior;

    public NodoDoble() {
    }

    public NodoDoble(A datos, NodoDoble<A> Siguiente, NodoDoble<A> Anterior) {
        this.datos = datos;
        this.Siguiente = Siguiente;
        this.Anterior = Anterior;
    }

    public A getDatos() {
        return datos;
    }

    public void setDatos(A datos) {
        this.datos = datos;
    }

    public NodoDoble<A> getSiguiente() {
        return Siguiente;
    }

    public void setSiguiente(NodoDoble<A> Siguiente) {
        this.Siguiente = Siguiente;
    }

    public NodoDoble<A> getAnterior() {
        return Anterior;
    }

    public void setAnterior(NodoDoble<A> Anterior) {
        this.Anterior = Anterior;
    }

    @Override
    public String toString() {
        return "NodoDoble{" + "datos=" + datos + ", Siguiente=" + Siguiente + ", Anterior=" + Anterior + '}';
    }
    
}  

