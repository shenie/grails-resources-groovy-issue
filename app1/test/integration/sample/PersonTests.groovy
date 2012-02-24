package sample

import grails.test.GrailsUnitTestCase

class PersonTests extends GrailsUnitTestCase {

    def Person beckham
    def Person hillary

    public void testNicknamesAreSet() {
        assertEquals "David Beckham", beckham.name
        assertEquals "Hillary Clinton", hillary.name

        assertEquals "Victoria Beckham", beckham.partner.name
        assertEquals "Bill Clinton", hillary.partner.name

        assertNotNull "Hillary's husband is missing nicknames", hillary.partner.nicknames
        assertNotNull "David's wife is missing nicknames", beckham.partner.nicknames
    }
}
