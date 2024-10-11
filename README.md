# Unit 2 - Store Management Project

## Introduction

You are opening a new business in your community! Businesses often need programs to manage the products and services they offer and track orders and requests from customers. Your goal is to create a store management system for your business.

## Requirements

Use your knowledge of object-oriented programming and class structure and design to create your store management system:
- **Create a class hierarchy** – Develop a superclass that represents a product or service your business offers and one or more subclasses that extend the superclass to represent more specific types of products or services.
- **Declare instance variables** – Declare instance variables in the superclass that are shared with the subclasses and instance variables in the subclasses that are not shared with the superclass.
- **Write constructors** – Write no-argument and parameterized constructors in the superclass and subclasses. Subclass constructors use the super keyword to call the superclass constructor.
- **Implement accessor and mutator methods** – Write accessor and mutator methods for instance variables that should be accessible and/or modifiable from outside of the class.
- **Implement a toString() method** – Write toString() methods in the superclass and subclasses that return information about the state of an object.

## UML Diagram

Put and image of your UML Diagram here. Upload the image of your UML Diagram to your repository, then use the Markdown syntax to insert your image here.

![UML Diagram for my project](<Screenshot 2024-10-10 215955.png>)

## Description

My store sells vinyl records and cassette tapes. I chose this topic so the user who loves to listen to music through vinyl and cassette rather than the apps can choose and buy their favorite records easily. There is a superclass named record that holds  instance variables of the song’s name, artist, release year, and price. Then there are two subclasses, vinyl and cassette, that extend the superclass. The vinyl class holds diameter and RPM. The cassette class holds the tape length and if it’s auto-reverse. When the user interacts with the store, the program will prompt the questions for input through the console. It will ask some kind of question like “Would you like to buy 1. Vinyl or 2. Cassette for today?” and "When was it released (year)?". The program expects the response to be in String and int. After putting in all the information, the program will print out all the inputs in the console as the output.
