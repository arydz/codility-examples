package com.arydz.codility.arrays.learning

import spock.lang.Specification

class ReversedArrayTest extends Specification {

    ReversedArray reversedArray = new ReversedArray()

    def "Test solution"() {
        expect:
        expected == reversedArray.solution(*initArray)
        where:
        initArray       | expected
        [1, 4, 3, 7]    | [7, 3, 4, 1]
        [1, 4, 3, 7, 5] | [5, 7, 3, 4, 1]
    }

}
