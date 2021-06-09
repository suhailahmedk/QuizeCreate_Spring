package com.example.quizecreater;

public class Quiz {
    String Quize_title;
    String total_Points;
    String time_allowed;
    String dateline;

    public String getQuize_title() {
        return Quize_title;
    }

    public void setQuize_title(String quize_title) {
        Quize_title = quize_title;
    }

    public String getTotal_Points() {
        return total_Points;
    }

    public void setTotal_Points(String total_Points) {
        this.total_Points = total_Points;
    }

    public String getTime_allowed() {
        return time_allowed;
    }

    public void setTime_allowed(String time_allowed) {
        this.time_allowed = time_allowed;
    }

    public String getDateline() {
        return dateline;
    }

    public void setDateline(String dateline) {
        this.dateline = dateline;
    }
}
