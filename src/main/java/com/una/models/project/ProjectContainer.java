package com.una.models.project;

import java.util.HashMap;
import java.util.Map;

public class ProjectContainer {
    private static Map<String, ProjectEntity> cProject = new HashMap<>();
    public static boolean exist(String id){
        return cProject.containsKey(id);
    }
    public static boolean add(ProjectEntity u){
        if(!cProject.containsKey(u.getIdProject())){
            cProject.put(u.getIdProject(), u);
            return true;
        }
        return false;
    }
    public static ProjectEntity find(String id){
        ProjectEntity user;
        if(cProject.containsKey(id)){
            user =cProject.get(id);
            return user;
        }
        return null;
    }
}
