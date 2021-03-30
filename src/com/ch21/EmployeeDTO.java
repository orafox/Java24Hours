package com.ch21;

public class EmployeeDTO {
    private int empno;
    private String eName;
    private String jobTitle;

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "empno=" + empno +
                ", eName='" + eName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
