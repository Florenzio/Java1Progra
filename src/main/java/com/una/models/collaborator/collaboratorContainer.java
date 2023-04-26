package com.una.models.collaborator;

import java.text.CollationKey;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class collaboratorContainer {
    static Scanner sc = new Scanner(System.in);
    private static Map<String, collaboratorEntity> cCollaborator = new HashMap<>();
    public static boolean exist(String id){
        return cCollaborator.containsKey(id);
    }
    public static boolean add(collaboratorEntity u){
        if(!cCollaborator.containsKey(u.getId())){
            cCollaborator.put(u.getId(), u);
            return true;
        }
        return false;
    }
    public static collaboratorEntity find(String id){
        collaboratorEntity user;
        if(cCollaborator.containsKey(id)){
            user=cCollaborator.get(id);
            return user;
        }
        return null;
    }
    public static String update(String id){
        if(cCollaborator.containsKey(id)){
            System.out.println("data to change: ");
            System.out.println("1.Name \n2.ID \n3.Phone \n4.email \n5.Speciality \n6.Statue");
            int opc = sc.nextInt();
            switch(opc){
                case 1:

                    break;
                case 2:
            }
        }

        return "has not been updated because the collaborator was not found";
    }
}
