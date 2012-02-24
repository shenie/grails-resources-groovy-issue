import sample.Person

beans = {

    beckham(Person) {
        name = "David Beckham"

        partner = { Person p ->
            name = "Victoria Beckham"
            nicknames = ["sexy", "spice girl"]
        }
    }

    hillary(Person) {
        name = "Hillary Clinton"

        partner = { Person p ->
            name = "Bill Clinton"
            nicknames = ["cheater"]
        }
    }
}
