/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbol;

public class ArbolInt {

    Nodo raiz;

    public ArbolInt() {
        this.raiz = null;
    }

    public void cambioRamas() {
        cambio(this.raiz);
    }

    public void cambio(Nodo nod) {
        if (nod == null) {
            return;
        }
        Nodo newDerecha, newHizquierda;
        newDerecha = nod.getHijoIzquierdo();
        newHizquierda = nod.getHijoDerecho();
        nod.setHijoDerecho(newDerecha);
        nod.setHijoIzquierdo(newHizquierda);
        cambio(nod.getHijoDerecho());
        cambio(nod.getHijoIzquierdo());
    }

    public void insertar(int val) {
        if (raiz == null) {
            this.raiz = new Nodo(val);
        } else {
            this.raiz.insertar(val);
        }
    }

    public int getTamanio() {
        return this.raiz.getTamanio();
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

    public int getSuma() {
        return suma(this.raiz);
    }

    public double getPromedio() {
        double prom;
        prom = getSuma() / getTamanio();
        return prom;
    }

    public int suma(Nodo nod) {
        int sum = 0;
        if (nod == null) {
            return sum; // detener la recursividad
        } else {
            sum = sum + nod.getDato();
            sum = sum + suma(nod.getHijoDerecho());
            sum = sum + suma(nod.getHijoIzquierdo());
            return sum;
        }
    }

    public void mostrarHojas() {
        hojas(this.raiz);
    }

    public void hojas(Nodo nod) {
        if (nod == null) {
            return;
        } else {
            if (nod.getHijoDerecho() == null && nod.getHijoIzquierdo() == null) {
                System.out.println(nod.getDato());
            }
            hojas(nod.getHijoIzquierdo());
            hojas(nod.getHijoDerecho());
        }
    }

    public void mostrarNodosInternos() {
        internos(this.raiz.getHijoDerecho());
        internos(this.raiz.getHijoIzquierdo());
    }

    public void internos(Nodo nod) {
        if (nod == null) {
            return;
        }
        if (nod.getHijoDerecho() == null && nod.getHijoIzquierdo() == null) {
            return;
        } else {
            System.out.println(nod.getDato());
            internos(nod.getHijoIzquierdo());
            internos(nod.getHijoDerecho());
        }
    }

    public int findSuccessor() {
        return this.raiz.findPredecessor().getDato();
    }
}
