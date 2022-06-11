/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles;

/**
 *
 * @author SergioxD
 */
public class Arbol {

    Nodo raiz;

    public Arbol() {
        this.raiz = null;
    }

    public void insertar(int val) {
        if (raiz == null) {
            this.raiz = new Nodo(val);
        } else {
            this.raiz.insertar(val);
        }
    }

    public void eliminar(int num) {
        this.raiz.delete(num);
    }

    public void mostrarPreorden() {
        this.preorden(this.raiz);
    }

    public void preorden(Nodo nod) {
        if (nod == null) {
            return; // detener la recursividad
        } else {
            System.out.println(nod.getDato());
            preorden(nod.getHijoIzquierdo());
            preorden(nod.getHijoDerecho());
        }

    }

    public void mostrarInorden() {
        this.Inorden(this.raiz);
    }

    public void Inorden(Nodo nod) {
        if (nod == null) {
            return; // detener la recursividad
        } else {
            Inorden(nod.getHijoIzquierdo());
            System.out.println(nod.getDato());
            Inorden(nod.getHijoDerecho());
        }

    }

    public void mostrarPostorden() {
        this.Postorden(this.raiz);
    }

    public void Postorden(Nodo nod) {
        if (nod == null) {
            return; // detener la recursividad
        } else {

            Postorden(nod.getHijoIzquierdo());
            Postorden(nod.getHijoDerecho());
            System.out.println(nod.getDato());
        }

    }
}
