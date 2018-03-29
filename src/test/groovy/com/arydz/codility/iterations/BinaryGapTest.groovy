package com.arydz.codility.iterations

import spock.lang.Specification

class BinaryGapTest extends Specification {

    private BinaryGap binaryGap = new BinaryGap()

    def "test solution"() {
        given:
        int number = 1041
        when:
        def result = binaryGap.solution(number)
        then:
        GroovyTestCase.assertEquals(5, result)
    }
}
