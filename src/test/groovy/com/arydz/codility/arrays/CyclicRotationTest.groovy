package com.arydz.codility.arrays

import spock.lang.Specification

class CyclicRotationTest extends Specification {

    private CyclicRotation cyclicRotation = new CyclicRotation()
    def "test solution"() {
        given:
        int[] array = [3, 8, 9, 7, 6]
        int k = 3
        when:
        def result = cyclicRotation.solution(array, k)
        then:
        assert result == [9, 7, 6, 3, 8]
    }
}
