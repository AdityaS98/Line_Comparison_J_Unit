package com.bridgelabz.linecomparison;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LineComparisonTest {


    LineComparison obj = new LineComparison();
    LineComparison obj1 = new LineComparison();
    LineComparison obj2 = new LineComparison();

    @Test

    public void givenInputCalculatedLengthOfLines() {


        double res = obj1.lengthOfLineCalculation(1.2, 2.2, 3.2, 4.2);

        Assertions.assertEquals(1.4142135623730951, res);


    }

    @Test

    public void givenInputCompareEqualityOfLengthOfLines() {


        double line1 = obj1.lengthOfLineCalculation(1.2, 2.2, 3.2, 4.2);
        double line2 = obj2.lengthOfLineCalculation(1.2, 2.2, 3.2, 4.2);

        boolean res = obj.compareTwoLines(line1, line2);

        //Assertions.assertFalse(res);
        Assertions.assertTrue(res);

    }

    @Test
    public void givenInputCompareLengthOfLines() {

        double line1 = obj1.lengthOfLineCalculation(1.2, 2.2, 3.2, 5.2);
        double line2 = obj2.lengthOfLineCalculation(1.2, 2.2, 3.2, 9.2);

        double res = obj.compareLengthOfLinesToFindWhichisGreater(line1, line2);

        Assertions.assertEquals(line2, res);


    }


}
