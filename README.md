# Overview
The code comprises three primary classes: FileManager, Person, and a main class awards. The purpose of the code is to read data from a file, process the data to track awards won by different people, and organize the awards by different categories.

# FileManager Class
The FileManager class is responsible for reading data from a file and storing it in a list of Person objects.

# Methods
getData(File dataFile)
This method reads a file where each line contains information about a person's awards.
The data is split using a comma (,) as a delimiter.
If a person's name matches the previous entry, the award is updated for the existing Person object.
If the person's name is new, a new Person object is created and added to the list of people.
The method returns an ArrayList of Person objects with the accumulated award data.
Person Class
The Person class represents an individual and their awards.

# Attributes
name: The person's name.
gold, silver, bronze, com, cw, cw_com: Counters for different types of awards.
setSubject, open, nature, scapes, doc, por: Arrays to store award counts categorized by photo types.
# Constructors
Person(): Default constructor.
Person(String name): Initializes a Person object with the given name and sets all award counters to zero.
# Methods
getName, setName, getGold, setGold, getSilver, setSilver, getBronze, setBronze, getCom, setCom, getCw, setCw, getCw_com, setCw_com, getSetSubject, setSetSubject, getOpen, setOpen, getNature, setNature, getScapes, setScapes, getDoc, setDoc, getPor, setPor: Getter and setter methods for the attributes.
increaseAward(String award, String photoName): Increases the count of the specified award and categorizes it based on the photoName. It updates the appropriate award counter and the corresponding category array.
Main Class (awards)
The awards class contains the main method which serves as the entry point for the application.

# Methods
main(String[] args)
Creates an instance of FileManager.
Currently, the main method doesn't perform any operations beyond this.
