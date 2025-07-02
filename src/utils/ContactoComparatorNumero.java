package utils;

import java.util.Comparator;

import models.Contacto;

public class ContactoComparatorNumero implements Comparator<Contacto> {

    @Override
    public int compare(Contacto o1, Contacto o2) {
        int result=o1.getApellido().compareToIgnoreCase(o2.getApellido());
        if(result!=0){
            return result;
        }
        int resultComparacionNombre= o1.getNombre().compareToIgnoreCase(o2.getNombre());
        if(resultComparacionNombre!=0){
        return resultComparacionNombre;
        }

        int resultNumero= o1.getTelefono().compareTo(o2.getTelefono());
        return resultNumero;
    }


    
}
