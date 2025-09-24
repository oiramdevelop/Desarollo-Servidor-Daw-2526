package com.ejemplos;

import java.util.HashMap;

public class EjemploScrabble {
    
        HashMap<String,Integer> valores = new HashMap<>();

        valores.put("aeionrtlsu",1);
        valores.put("dg",2);
        valores.put("bcmp",3);
        valores.put("fhvwy",4);
        valores.put("k",5);
        valores.put("jx",8);
        valores.put("zq",10);

        
        Iterator it = valores.keySet().iterator();

        while (it.hasNext())
        {
            String clave = (String)it.next();
            System.err.println(clave);
            if (clave.contains("a"))
                System.err.println(valores.get(clave));

        }


}
