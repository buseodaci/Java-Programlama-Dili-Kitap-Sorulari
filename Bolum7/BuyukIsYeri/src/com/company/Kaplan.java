package com.company;

/**
 * Java'da, çoklu kalıtım  desteğinden yararlanmak için Interface ve inner class lar kullanılır.
 * Interface'ler, abstract classların bir üst modeli gibidir.
 * Interface içerisinde tanımlanan bir alan otomatik oalrak hem 'public' hem de 'final' ve 'static' özelliğine sahip olur.
 */
interface Hayvan{
   void avlan();
}

abstract class Kedi implements Hayvan{
    abstract void takipEt();
}

public class Kaplan extends Kedi{

    @Override
    void takipEt() {
        System.out.println("Kaplan takip ediyor..");
    }

    @Override
    public void avlan() {
        System.out.println("Kaplan avlanıyor..");
    }
}
