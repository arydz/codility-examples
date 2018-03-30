package com.arydz.codility.arrays

import spock.lang.Specification
import spock.lang.Unroll

class OddOccurrencesInArrayTest extends Specification {

    OddOccurrencesInArray oddOccurrencesInArray = new OddOccurrencesInArray()

    @Unroll
    def "test solution"() {
        expect:
        expected == oddOccurrencesInArray.solution(*array)
        where :
        array                               | expected
        [9, 3, 9, 3, 9, 7, 9]               | 7
        [9, 3, 9, 3, 9, 7, 9, 7, 15]        | 15
        [1, 15, 9, 3, 9, 3, 9, 7, 9, 7, 15] | 1
    }
}
