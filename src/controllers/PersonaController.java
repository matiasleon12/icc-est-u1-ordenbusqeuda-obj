package controllers;

import models.Persona;

public class PersonaController{


    public void sortBySeleccionDesbyDireccionCodigo(Persona[] personas){
        for (int i = 0; i<personas.length; i++){
            int maxIndex = i;
            for (int j = i+1; j<personas.length;j++){
                //if (personas[j].getCodigoDireccion()>personas[maxIndex].getCodigoDireccion()){
                if(personas[j].equalsByCodigoDireccion(personas[maxIndex])){
                    maxIndex = j;

                }
                

            }
            if (maxIndex != i){
                Persona temp = personas[maxIndex];
                personas[maxIndex] = personas[i];
                personas[i] = temp;
            }
        }
    }
    public Persona findPersonaByCodigoDireccion(Persona[] personas, int codigo){

        int bajo = 0;
        int alto = personas.length-1;

        while(bajo<=alto){
            int central = bajo + (alto-bajo)/2;
            int valorCentral = personas[central].getCodigoDireccion();

            if(valorCentral == codigo){
                return personas[central];
            }
            if (valorCentral>codigo){
            bajo = central +1;
        }else {alto = central - 1;}
        }
        return null;
    }


}
    

