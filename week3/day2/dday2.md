Abstraction:
Definition:

Abstraction is an OOPs concept that focuses on hiding complex implementation details and 
exposing only the necessary parts of an object. It's about representing features without 
including background details.

Advantages of Abstraction:

Simplicity: Abstraction simplifies the view of an object, so you don't need to understand the 
internal workings to use it.
Reusability: Abstract classes and interfaces can be reused to implement common methods in 
multiple subclasses.

Keyword: The "implements" keyword is used to implement an Interface

Types:
Interfaces: Used for full abstraction, they cannot have any implementation.100%
Abstract Classes: Provide partial abstraction with some implemented methods.both implemented ,unimplemented
Concrete Classes: Regular classes with full implementation.






Java Examples:
Interfaces: List, Set, Map are interfaces providing a standard set of methods to be 
implemented by concrete collections.
Abstract Classes: AbstractList, AbstractCollection provide skeletal implementations that 
can be used as starting points for creating concrete collections.

Selenium WebDriver Examples:

Interfaces: WebDriver, WebElement, Alert are interfaces representing abstract concepts in browser automation.
Abstract Classes: By is an abstract class providing methods to locate elements.
Concrete Classes: RemoteWebDriver is a concrete implementation of the WebDriver interface.

KeyWords
===========
Class to Interface: -implements
abstract class to Interface: - implements
class to abstract class:  - extends
class to class: - extends
interface to interface: - extends 

-------------------------------------------------------------------------------
List Interface in Java:

Here are some key characteristics and methods associated with the List interface:

1. *Ordered Collection:*
   - Lists maintain the order in which elements are inserted. The order of elements in a list is determined by the sequence in which they were added.

2. *Duplicates Allowed:*
   - Unlike a Set, a List allows duplicate elements. Each element in the list has a unique index, starting from 0.

3. *Dynamic Size:*
   - Lists can dynamically grow or shrink in size as elements are added or removed. The size of a list is not fixed.

4. *Common List Implementations:*
   - ArrayList: Implements a dynamic array that can grow or shrink in size. Provides fast random access and is suitable for scenarios where elements are frequently accessed.
   - LinkedList: Implements a doubly-linked list. Provides efficient insertion and deletion of elements at any position in the list.


wrapper class : specifically designed to wrap primitive data types
EX:
dataType - weapper class
int       -Integer
double       -Double





5. *Common Methods:*
   - add: Adds an element to the list.
   - get: Retrieves the element at a specified index.
   - remove: Removes an element from the list.
   - size: Returns the number of elements in the list.
   - contains: Checks if a specific element is present in the list


Definition: The List interface in Java is part of the Java Collections Framework. It represents an ordered collection (also known as a sequence). Lists can contain duplicate elements and are dynamic in size, meaning they can grow or shrink as needed.
Why Use Lists: Lists are used when you need an ordered collection that can change in size. This is particularly useful when you don't know the number of elements in advance, or when you need to perform frequent insertions and deletions.
ArrayList vs LinkedList: While ArrayList is the most common implementation, providing fast access and efficient storage for large numbers of elements, LinkedList can be more efficient for certain use cases, especially where frequent insertion and deletion occur.
Methods and Use Cases
Creating Lists (new ArrayList<>()):

Usage: To initialize a list.
Real-time Use Case: In a real-world scenario, you might initialize a list to store data such as employee names, product details, or any collection of similar items. For example, a list to store the names of participants in a workshop.
Adding Items (add() method):

Usage: To add elements to the list.
Real-time Use Case: This is used when you need to add new data to your collection. For example, adding new members to a project team or new items to a to-do list.
Inserting at Specific Index (add(index, element)):

Usage: To add an element at a specified position in the list.
Real-time Use Case: Useful in cases where the order is important, like adding a new task at a specific position in a task list or inserting a new chapter into a specific position in a book's table of contents.
Printing the List (System.out.println(list)):

Usage: To display the contents of the list.
Real-time Use Case: Displaying a list of items, such as a list of available products to a user, or printing a list of registered participants for an event.
Adding All Elements from Another List (addAll()):

Usage: To add all elements from one list into another.
Real-time Use Case: Merging two datasets, such as combining two lists of customers from different regions into a single list for a unified analysis.
Finding the Size of the List (size() method):

Usage: To get the number of elements in the list.
Real-time Use Case: Checking the number of entries in a database, like the number of students enrolled in a course or the number of items in stock.
Accessing Elements (get(index)):

Usage: To retrieve a specific element from the list based on its index.
Real-time Use Case: Fetching a specific data entry, such as retrieving a specific order detail from a list of orders.
Removing Elements (remove(index) and removeAll()):

Usage: remove(index) removes an element at a specific index, while removeAll() removes all elements that are present in another collection.
Real-time Use Case: remove(index) can be used for deleting a specific entry, like removing a discontinued product from a product list. removeAll() can be useful in filtering out data, like removing all outdated items from a current inventory list.
Clearing the List (clear()):

Usage: To remove all elements from the list, making it empty.
Real-time Use Case: Resetting data, such as clearing a user's shopping cart after they have completed the checkout process.