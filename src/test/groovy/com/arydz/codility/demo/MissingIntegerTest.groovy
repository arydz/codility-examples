package com.arydz.codility.demo

import spock.lang.Specification

class MissingIntegerTest extends Specification {

    MissingInteger missingInteger = new MissingInteger()

    def "test solution [1, 3, 6, 4, 1, 2]"() {
        given:
        int[] array = [1, 3, 6, 4, 1, 2]
        when:
        def result = missingInteger.solution(array)
        then:
        GroovyTestCase.assertEquals(5, result)
    }

    def "test solution [-1, -3]"() {
        given:
        int[] array = [-1, -3]
        when:
        def result = missingInteger.solution(array)
        then:
        GroovyTestCase.assertEquals(1, result)
    }

    def "test solution [1, 2, 3]"() {
        given:
        int[] array = [1, 2, 3]
        when:
        def result = missingInteger.solution(array)
        then:
        GroovyTestCase.assertEquals(4, result)
    }

    def "test solution [1, 2, 3, 4, 5, -2, -3, -4, -5, -6]"() {
        given:
        int[] array = [1, 2, 3, 4, 5, -2, -3, -4, -5, -6]
        when:
        def result = missingInteger.solution(array)
        then:
        GroovyTestCase.assertEquals(6, result)
    }

    def "test solution [1, 1, 1, 1, 1, 1, 2, 3, 4, 6, -2, -3, -4, -5, -6]"() {
        given:
        int[] array = [1, 1, 1, 1, 1, 1, 2, 3, 4, 6, -2, -3, -4, -5, -6]
        when:
        def result = missingInteger.solution(array)
        then:
        GroovyTestCase.assertEquals(5, result)
    }

    def "test solution [1, 1, 1, 1, 1, 2, 3, 4, 5, 6, -2, -3, -4, -5, -6]"() {
        given:
        int[] array = [1, 1, 1, 1, 1, 1, 2, 3, 4, 5, 6, -2, -3, -4, -5, -6]
        when:
        def result = missingInteger.solution(array)
        then:
        GroovyTestCase.assertEquals(7, result)
    }
}
