package controllers;

import models.Persona; 

public class PersonaController {

    public void sortByDireccionCodigo(Persona[] personas){
        for(int i = 0; i<personas.length;i++){
            int index=i;
            for (int j=i+1; index<personas.length;j++){
                if (personas[j].getCodigoDireccion()>personas[index].getCodigoDireccion()){
                    index=j;
                }

            }
            if(index!=i){
                Persona temp=personas[index];
                personas[index] = personas[i];
                personas[i] = temp;
            }

        }
    }
}
