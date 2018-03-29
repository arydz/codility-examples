package com.arydz.codility.iterations.learning

import spock.lang.Specification

class CountNumberOfDigitsTest extends Specification {

    CountNumberOfDigits countNumberOfDigits = new CountNumberOfDigits()
    def "test count"() {
        given:
        int number = 1234
        when:
        int result = countNumberOfDigits.count(number)
        then:
        GroovyTestCase.assertEquals(4, result)
    }
}
