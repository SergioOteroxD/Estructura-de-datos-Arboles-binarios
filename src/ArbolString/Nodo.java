/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArbolString;

/**
 *
 * @author SergioxD
 */
public class Nodo {

    private String dato;
    private Nodo hijoIzquierdo, hijoDerecho;

    public Nodo(String d) {
        this.dato = d;
        this.hijoDerecho = null;
        this.hijoIzquierdo = null;
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

    public Nodo delete(String value) {
        Nodo response = this;
        if (value.compareTo(this.dato)<0) {
            this.hijoIzquierdo = this.hijoIzquierdo.delete(value);
        } else if (value.compareTo(this.dato)>0) {
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
        return response;
    }

    public void insertar(String v) {
        if (v.compareTo(this.dato)<0) {
            if (this.hijoIzquierdo == null) {
                this.hijoIzquierdo = new Nodo(v);
            } else {
                this.hijoIzquierdo.insertar(v);
            }
        } else {
            if (this.hijoDerecho == null) {
                this.hijoDerecho = new Nodo(v);
            } else {
                this.hijoDerecho.insertar(v);
            }
        }
    }

    public String getDato() {
        return dato;
    }

    public Nodo getHijoIzquierdo() {
        return hijoIzquierdo;
    }

    public Nodo getHijoDerecho() {
        return hijoDerecho;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }
}
