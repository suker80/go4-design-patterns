package me.whiteship.designpatterns._01_creational_patterns._05_prototype._04_builder._02_after;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TourPlan {

    private String title;

    private int nights;

    private int days;

    private LocalDate startDate;

    private String whereToStay;

    private List<DetailPlan> plans;

    public TourPlan() {
    }

    public TourPlan(String title, int nights, int days, LocalDate startDate, String whereToStay, List<DetailPlan> plans) {
        this.title = title;
        this.nights = nights;
        this.days = days;
        this.startDate = startDate;
        this.whereToStay = whereToStay;
        this.plans = plans;
    }

    @Override
    public String toString() {
        return "TourPlan{" +
                "title='" + title + '\'' +
                ", nights=" + nights +
                ", days=" + days +
                ", startDate=" + startDate +
                ", whereToStay='" + whereToStay + '\'' +
                ", plans=" + plans +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNights() {
        return nights;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public String getWhereToStay() {
        return whereToStay;
    }

    public void setWhereToStay(String whereToStay) {
        this.whereToStay = whereToStay;
    }

    public List<DetailPlan> getPlans() {
        return plans;
    }

    public void setPlans(List<DetailPlan> plans) {
        this.plans = plans;
    }

    public void addPlan(int day, String plan) {
        this.plans.add(new DetailPlan(day, plan));
    }

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder {
        public Builder() {
            plans = new ArrayList<>();
        }

        private String title;

        private int nights;

        private int days;

        private LocalDate startDate;

        private String whereToStay;

        private List<DetailPlan> plans;


        public TourPlan build(){


            return new TourPlan(title, nights, days, startDate, whereToStay, plans);
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder nights(int nights) {
            this.nights = nights;
            return this;
        }

        public Builder days(int days) {
            this.days = days;
            return this;
        }

        public Builder startDate(LocalDate startDate) {
            this.startDate = startDate;
            return this;
        }

        public Builder whereToStay(String whereToStay) {
            this.whereToStay = whereToStay;
            return this;
        }

        public Builder addPlans(DetailPlan plan) {
            this.plans.add(plan);
            return this;
        }

    }
}
