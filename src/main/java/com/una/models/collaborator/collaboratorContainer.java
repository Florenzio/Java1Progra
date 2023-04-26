package com.una.models.collaborator;

import java.util.HashMap;
import java.util.Map;

public class collaboratorContainer {
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
}
