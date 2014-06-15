# avaus-tv

Simulation of Avaus-TV prize draw

## Installation

Clone this repo.

## Usage

Invoke the simulator with:

    lein run acct-no list-of-channels

e.g.,

    lein run 79 kids gossip

Account numbers can be:

* 1-100 eligible
* 101-200 ineligible
* 201-300 eligibility service fails
* otherwise invalid account number

Channels can be:

* sports
* movies
* gossip
* kids

## License

Copyright © 2014 Sean Corfield

Distributed under the Eclipse Public License either version 1.0.

