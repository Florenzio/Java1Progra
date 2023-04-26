package com.una.models.project;
public class ProjectEntity {
    private String idProject;
    private String name;
    private String dateStart;
    private String dateEnd;
    public ProjectEntity(){
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setIdProject(String idProject){
        this.idProject = idProject;
    }
    public String getIdProject(){
        return idProject;
    }
    public void setDateStart(String dateStart){
        this.dateStart = dateStart;
    }
    public String getDateStart(){
        return dateStart;
    }
}
