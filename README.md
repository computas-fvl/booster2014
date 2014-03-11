Mutation Testing Example for the Booster 2014 Conference
========================================================

If you're wondering what this repository is about, have a look at the presentation over [here](http://www.slideshare.net/filipvanlaenen/booster-2014-mutation-testing).

1. Clone the repository
-----------------------

    git clone https://github.com/computas-fvl/booster2014.git

2. Create the test coverage and mutation testing reports
--------------------------------------------------------

    mvn clean site:site org.pitest:pitest-maven:mutationCoverage