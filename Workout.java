package com.hfad.workout;

public class Workout {
    private String name;
    private String description;

    public static final Workout[] workouts={
            new Workout("The Limb Loosener","5 Handstands push-ups\n10 1-legged sqarts\n15 pull-ups"),
            new Workout("Core Agony","100 Pull-ups\n100 Push-ups\n100 sit-ups\n100 sqarts"),
            new Workout("The Wimp Special","5 Pull-ups\n10 Push-ups\n100 squarts"),
            new Workout("Strength and Length","500 meter run\n21x1.5 pood keetleball\n21x pull-ups")
    };
    private Workout(String name,String description){
        this.name=name;
        this.description=description;
        }
        public String getDescription(){
        return description;
        }
        public String getName(){
        return name;
        }
        public String toString(){
        return this.name;
    }
}

