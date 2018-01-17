package com.hlex.learn.testing;

import com.hlex.learn.testing.SchoolService;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class SchoolServiceTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();
    SchoolService schoolService = new SchoolService();

    @Test
    public void register_whenClassIsNull_thenThrowIllegalArgumentException() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("is null");
        schoolService.register(null);
    }

    @Test
    public void register_whenInputAnyString_thenNoException() {
        schoolService.register("123");
    }
}