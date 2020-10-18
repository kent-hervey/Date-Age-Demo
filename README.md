Simple project using separate class to create object and return from boolean method.

Idea is that a user interface would gather data from user themselves and possibly other sources and return to user or elsewhere result indicating whether or not user is anxious.

Person is/are the persons who may or may not be anxious.

PersonCreator simulates a UI sending data about a person and creates that person object.  Simulation includes the four Person attributes being set randomly, then anxiety status is set based on the number of "true" attributes.

Anxiety checker calls method in PersonCreator which creates a Person object and sets its variables and returns the object back to AnxietyChecker.

Main method/entry point is in class AnxietyChecker.

