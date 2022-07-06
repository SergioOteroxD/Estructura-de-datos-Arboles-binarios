/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbol;


public class Nodo {

    private int dato;
    private Nodo hijoIzquierdo, hijoDerecho;
    private int tamanio;

    public Nodo(int d) {
        this.dato = d;
        this.hijoDerecho = null;
        this.hijoIzquierdo = null;
        this.tamanio = 1;
    }

    public Nodo findPredecessor() {
        if (this.getHijoDerecho() == null) {
            return this;
        } else {
            return this.getHijoDerecho().findPredecessor();
        }
    }

    public Nodo findSuccessor() {
        if (this.getHijoIzquierdo() == null) {
            return this;
        } else {
            return this.getHijoIzquierdo().findSuccessor();
        }
    }

    public Nodo delete(int value) {
        Nodo response = this;
        if (value < this.dato) {
            this.hijoIzquierdo = this.hijoIzquierdo.delete(value);
        } else if (value > this.dato) {
            this.hijoDerecho = this.hijoDerecho.delete(value);
        } else {
            if (this.hijoIzquierdo != null && this.hijoDerecho != null) {
                Nodo temp = this;
                Nodo maxOfTheLeft = this.hijoIzquierdo.findPredecessor();
                this.dato = maxOfTheLeft.getDato();
                temp.hijoIzquierdo = temp.hijoIzquierdo.delete(maxOfTheLeft.getDato());
            } else if (this.hijoIzquierdo != null) {
                response = this.hijoIzquierdo;
            } else if (this.hijoDerecho != null) {
                response = this.hijoDerecho;
            } else {
                response = null;
            }
        }
        this.tamanio--;
        return response;
    }

    public void insertar(int v) {
        if (v < this.dato) {
            if (this.hijoIzquierdo == null) {
                this.hijoIzquierdo = new Nodo(v);
                this.tamanio= this.tamanio+1;
            } else {
                this.hijoIzquierdo.insertar(v);
                this.tamanio= this.tamanio+1;
            }
        } else {
            if (this.hijoDerecho == null) {
                this.hijoDerecho = new Nodo(v);
                this.tamanio= this.tamanio+1;
            } else {
                this.hijoDerecho.insertar(v);
                this.tamanio= this.tamanio+1;
            }
        }
    }

    public int getDato() {
        return dato;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setHijoIzquierdo(Nodo hijoIzquierdo) {
        this.hijoIzquierdo = hijoIzquierdo;
    }

    public void setHijoDerecho(Nodo hijoDerecho) {
        this.hijoDerecho = hijoDerecho;
    }

    public Nodo getHijoIzquierdo() {
        return hijoIzquierdo;
    }

    public Nodo getHijoDerecho() {
        return hijoDerecho;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }
}
