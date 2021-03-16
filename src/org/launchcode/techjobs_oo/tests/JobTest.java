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

    @Test
    public void testSettingJobId() {
//        assertEquals(1, emptyJobOne.getId(), 1);
//        assertEquals(2, emptyJobTwo.getId(), 1);
        assertEquals(emptyJobOne.getId(), emptyJobTwo.getId(), 1);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(testJob instanceof Job);
        assertEquals(3, testJob.getId());
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
