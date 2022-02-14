package org.example;

public class student {
    private int stdId;
    private String stdName;
    private int standard;

    public student(int stdId, String stdName, int standard) {
        this.stdId = stdId;
        this.stdName = stdName;
        this.standard = standard;
    }

    public int getStdId() {
        return stdId;
    }

    public void setStdId(int stdId) {
        this.stdId = stdId;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public int getStandard() {
        return standard;
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }

    @Override
    public String toString() {
        return "student{" +
                "stdId=" + stdId +
                ", stdName='" + stdName + '\'' +
                ", standard=" + standard +
                '}';
    }
}
