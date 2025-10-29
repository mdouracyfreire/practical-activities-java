package entities;

public class Student {
    private String name;
    private double firstScore;
    private double secondScore;

    public Student(String name, double firstScore, double secondScore) {
        this.name = name;
        this.firstScore = firstScore;
        this.secondScore = secondScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFirstScore() {
        return firstScore;
    }

    public void setFirstScore(double firstScore) {
        this.firstScore = firstScore;
    }

    public double getSecondScore() {
        return secondScore;
    }

    public void setSecondScore(double secondScore) {
        this.secondScore = secondScore;
    }

    public double avarage(){
        return (firstScore + secondScore) / 2;
    }
}
