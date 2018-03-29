package com.arydz.codility.iterations.learning

import spock.lang.Specification

class TriangleOfAsterisksTest extends Specification {

    TriangleOfAsterisks triangleOfAsterisks = new TriangleOfAsterisks()

    def "test print"() {
        given:
        int count = 4
        when:
        triangleOfAsterisks.print(count)
        then:
        true
    }
}
