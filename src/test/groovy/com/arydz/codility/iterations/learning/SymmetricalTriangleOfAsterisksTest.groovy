package com.arydz.codility.iterations.learning

import spock.lang.Specification

class SymmetricalTriangleOfAsterisksTest extends Specification {

    SymmetricalTriangleOfAsterisks triangleOfAsterisks = new SymmetricalTriangleOfAsterisks()
    def "test print"() {
        given:
        int n = 4
        when:
        triangleOfAsterisks.print(n)
        then:
        true
    }
}
