package org.launchcode.techjobs_oo.tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.main.*;

import static org.junit.Assert.*;

public class JobTest {

    Job emptyJobOne;
    Job emptyJobTwo;

    @Before
    public void createEmptyJobObjects() {
        emptyJobOne = new Job();
        emptyJobTwo = new Job();
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
        assertFalse(emptyJobOne.getId() == emptyJobTwo.getId());
//        assertTrue(emptyJobOne == emptyJobTwo);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
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

}
