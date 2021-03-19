package org.launchcode.techjobs_oo.tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.main.*;

import static org.junit.Assert.*;

public class JobTest {

    Job emptyJobOne;
    Job emptyJobTwo;
    Job testJob;

    @Before
    public void createEmptyJobObjects() {
        emptyJobOne = new Job();
        emptyJobTwo = new Job();
    }

    @Before
    public void createFullJobObjects() {
        testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }

    @Test
    public void testSettingJobId() {
        assertNotEquals(emptyJobOne, emptyJobTwo);
        assertEquals(emptyJobOne.getId() + 1, emptyJobTwo.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        assertTrue(testJob instanceof Job);
        assertTrue(emptyJobOne.getId() != testJob.getId());
        assertTrue(emptyJobTwo.getId() != testJob.getId());
        assertEquals("Product tester", testJob.getName());
        assertEquals("ACME", testJob.getEmployer().getValue());
        assertEquals("Desert", testJob.getLocation().getValue());
        assertEquals("Quality control", testJob.getPositionType().getValue());
        assertEquals("Persistence", testJob.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality() {
        Job testJobEqualityOne = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job testJobEqualityTwo = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(testJobEqualityOne.equals(testJobEqualityTwo));
    }

    @Test
    public void testToStringBlankLine() {
        assertEquals('\n', testJob.toString().charAt(0));
        assertEquals('\n', testJob.toString().charAt(testJob.toString().length() - 1));
    }

    @Test
    public void testToStringFieldLabelsAndData() {
        assertEquals('\n' +
                "ID: " + testJob.getId() + '\n' +
                "Name: " + testJob.getName() + '\n' +
                "Employer: " + testJob.getEmployer() + '\n' +
                "Location: " + testJob.getLocation() + '\n' +
                "Position Type: " + testJob.getPositionType() + '\n' +
                "Core Competency: " + testJob.getCoreCompetency() + '\n', testJob.toString());
    }

    @Test
    public void testToStringEmptyField() {
        Job testJobFields = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        assertEquals('\n' +
                "ID: " + testJobFields.getId() + '\n' +
                "Name: Data not available" + '\n' +
                "Employer: Data not available" + '\n' +
                "Location: Data not available" + '\n' +
                "Position Type: Data not available" + '\n' +
                "Core Competency: Data not available" + '\n', testJobFields.toString());
    }

}
