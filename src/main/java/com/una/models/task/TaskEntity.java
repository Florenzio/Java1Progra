package com.una.models.task;
import java.util.ArrayList;
public class TaskEntity {
    String idTask;
    String description;
    String dateStar;
    String dateEnd;
    private ArrayList<String> resources;
    public TaskEntity(){
        System.out.println("Hola");
    }

    public String getIdTask() {
        return idTask;
    }

    public void setIdTask(String idTask) {
        this.idTask = idTask;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateStar() {
        return dateStar;
    }

    public void setDateStar(String dateStar) {
        this.dateStar = dateStar;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }

    public ArrayList<String> getResources() {
        return resources;
    }

    public void setResources(ArrayList<String> resources) {
        this.resources = resources;
    }

    @Override
    public String toString() {
        return "taskEntity{" + "idTask=" + idTask + ", description=" + description +
                ", dateStar=" + dateStar + ", dateEnd=" + dateEnd + ", resources=" + resources + '}';
    }
}