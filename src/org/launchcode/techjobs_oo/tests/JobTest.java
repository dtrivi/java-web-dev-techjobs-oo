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

//    @Test
//    public void emptyTest() {
//        assertEquals(true, true);
//    }

    // "Two objects are equal if the values they store are the same at the time of comparison. object1 and object2 point to different memory addresses, but their values are all the same. Thus, we can consider them equal, even though they are not identical."
    @Test
    public void testSettingJobId() {
//        assertEquals(1, emptyJobOne.getId(), 1);
//        assertEquals(2, emptyJobTwo.getId(), 1);
//        assertEquals(emptyJobOne.getId(), emptyJobTwo.getId(), 1);
//        assertFalse(emptyJobOne.getId() == emptyJobTwo.getId());
//        assertFalse(emptyJobOne.equals(emptyJobTwo));
        assertNotEquals(emptyJobOne, emptyJobTwo);
        assertEquals(emptyJobOne.getId() + 1, emptyJobTwo.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
//        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
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
//        assertTrue(testJob.toString().equals("" + '\n' + testJob + '\n' + ""));
//        assertTrue(testJob.toString() == "" + '\n' + testJob + '\n' + "");
//        assertTrue(testJob.toString() ==
//                "" + '\n' +
//                "id: " + testJob.getId() + '\n' +
//                "name: " + testJob.getName() + '\n' +
//                "employer: " + testJob.getEmployer() + '\n' +
//                "location: " + testJob.getLocation() + '\n' +
//                "positionType: " + testJob.getPositionType() + '\n' +
//                "coreCompetency: " + testJob.getCoreCompetency() + '\n' +
//                "");
        assertEquals('\n', testJob.toString().charAt(0));
//        assertEquals('\n', testJob.toString().charAt(117));
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
