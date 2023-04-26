package com.una.models.sprint;

public class SprintEntity {
    private String idSprint;
    private String dateStart;
    private String dateEnd;
    public SprintEntity(){
    }

    public String getIdSprint() {
        return idSprint;
    }

    public void setIdSprint(String idSprint) {
        this.idSprint = idSprint;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }

    @Override
    public String toString() {
        return "SprintEntity{" +
                "idSprint='" + idSprint + '\'' +
                ", dateStart='" + dateStart + '\'' +
                ", dateEnd='" + dateEnd + '\'' +
                '}';
    }
}
