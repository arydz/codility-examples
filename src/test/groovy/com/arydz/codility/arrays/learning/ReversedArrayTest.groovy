package com.arydz.codility.arrays.learning

import spock.lang.Specification

class ReversedArrayTest extends Specification {

    ReversedArray reversedArray = new ReversedArray()

    def "test solution. Even length"() {
        given:
        int[] array = [1, 4, 3, 7]
        when:
        def result = reversedArray.solution(array)
        then:
        assert result == [7, 3, 4, 1]
    }

    def "test solution. Odd length"() {
        given:
        int[] array = [1, 4, 3, 7, 5]
        when:
        def result = reversedArray.solution(array)
        then:
        assert result == [5, 7, 3, 4, 1]
    }
}
