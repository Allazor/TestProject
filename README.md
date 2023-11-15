# TestProject
# GOAL
A test project which includes unit test and ui test folders.
For testing I used Java11 together with Selenid and TestNG, build on Gradle.

# 1 Task (unit test)

*When testing the function, I used data provider, which helped to check both 
valid and invalid data at once in one test

***
# 2 Task (ui google test)

For testing ui google were observed patterns Page Object Model, all test data used 
through java Faker or in a pre-created text file ("src/test/recourse/celebtitiesName.txt"), 
since the Faker generated names could not display the actual queries decided to save 
the celebrities in a text file and further use by converting to List<String>
