package Grades;


import java.util.ArrayList;

    public class Student {
        private String name;
        private ArrayList<Integer> grades;

        public Student(String name) {
            this.name = name;
            this.grades = new ArrayList<>();
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public ArrayList<Integer> getGrades() {
            return grades;
        }

        public void addGrade(int grade) {
            this.grades.add(grade);
        }

        public double getAverageGrade() {
            if (this.grades.isEmpty()) {
                return 0;
            }
            double sum = 0;
            for (int grade : this.grades) {
                sum += grade;
            }
            return sum / this.grades.size();
        }

        public int getHighestGrade() {
            if (this.grades.isEmpty()) {
                return 0;
            }
            int max = this.grades.get(0);
            for (int grade : this.grades) {
                if (grade > max) {
                    max = grade;
                }
            }
            return max;
        }
    }
