package org.launchcode.techjobs_oo.main;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
//        Job job2 = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
//        Job job3 = new Job("Ice cream taster", new Employer(""), new Location("Home"), new PositionType("UX"), new CoreCompetency("Taste"));
//
//        ArrayList<Job> jobs = new ArrayList<>();
//        jobs.add(job1);
//        jobs.add(job2);
//        jobs.add(job3);
//
//        for (Job job : jobs){
//            System.out.println(job);
//        }


//        ignore and delete below
        Job sampleJobOne = new Job("", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job sampleJobTwo = new Job("Product tester", new Employer(""), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job sampleJobThree = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
//        Job sampleJobFour = new Job();
//        System.out.println(sampleJobOne.getId());
//        System.out.println(sampleJobTwo.getId());
        System.out.println(sampleJobOne.toString());
        System.out.println(sampleJobTwo.toString());
        System.out.println(sampleJobThree.toString());
//        System.out.println(sampleJobFour.toString());
    }

}
