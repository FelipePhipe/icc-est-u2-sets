package controllers;

import java.util.Set;
import java.util.TreeSet;

import models.Contacto;
import utils.ContactoComparator;
import utils.ContactoComparatorNumero;
import utils.ContactoComparatorHash;

public class ContactoController {

    public ContactoController(){
        runTreeContacto();
        runTreeContactoNum();
        runTreeContactoHash();
    }
    
    public void runTreeContacto(){
        Set<Contacto> agenda= new TreeSet(new ContactoComparator());
        System.out.println("Agenda ordenada por Apellido - Nombre");

        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Luis", "Perez", "111111111"));
        agenda.add(new Contacto("Ana", "Perez", "987654321"));
        agenda.add(new Contacto("Pedro", "Lopez","123456789"));
        agenda.add(new Contacto("Pedro", "Lopez","222222222"));
        agenda.add(new Contacto("Pedro", "Gonzales","222222222"));
        agenda.add(new Contacto("Pablo", "Lopez","222222222"));


        for (Contacto c: agenda){
            System.out.println(c);
        }
    }

    public void runTreeContactoNum(){
        Set<Contacto> agenda= new TreeSet(new ContactoComparatorNumero());
        

        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Luis", "Perez", "111111111"));
        agenda.add(new Contacto("Ana", "Perez", "987654321"));
        agenda.add(new Contacto("Pedro", "Lopez","123456789"));
        agenda.add(new Contacto("Pedro", "Lopez","222222222"));
        agenda.add(new Contacto("Pedro", "Gonzales","222222222"));
        agenda.add(new Contacto("Pablo", "Lopez","222222222"));

        System.out.println("Agenda ordenada por Apellido - Nombre - Numero");
        for (Contacto c: agenda){
            System.out.println(c);
        }
    }

    public void runTreeContactoHash(){
        Set<Contacto> agenda= new TreeSet(new ContactoComparatorHash());
        

        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Luis", "Perez", "111111111"));
        agenda.add(new Contacto("Ana", "Perez", "987654321"));
        agenda.add(new Contacto("Pedro", "Lopez","123456789"));
        agenda.add(new Contacto("Pedro", "Lopez","222222222"));
        agenda.add(new Contacto("Pedro", "Gonzales","222222222"));
        agenda.add(new Contacto("Pablo", "Lopez","222222222"));

        System.out.println("Agenda ordenada por HashCode");
        for (Contacto c: agenda){
            System.out.println(c);
        }
    }
}
