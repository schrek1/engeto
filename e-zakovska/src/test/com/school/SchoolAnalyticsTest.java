package com.school;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class SchoolAnalyticsTest {


    @DisplayName("method foo")
    @Nested
    class FooMethod {
        @Test
        void allValid_shouldPassWithoutError() {
            var schoolAnalytics = new SchoolAnalytics();

            String result = schoolAnalytics.foo();

            Assertions.assertEquals("non-mocked", result);
        }
    }

}
