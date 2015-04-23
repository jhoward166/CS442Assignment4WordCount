CS442 Design Patterns
Spring 2015
PROJECT 4 README FILE

Due Date: Friday, April 22, 2015
Submission Date: Wednesday, April 22, 2015
Grace Period Used This Project: 0 Days
Grace Period Remaining: ??? Days
Authors: Joseph Howard and Weronika Kowalczyk
e-mail: jhoward$@binghamton.edu wkowalc1@binghamton.edu


PURPOSE:

This project implements a visitor pattern to populate a tree of words
and then uses another visitor to count the words and characters in the
file.

PERCENT COMPLETE:

We believe this project is 100% complete.

PARTS THAT ARE NOT COMPLETE:

We believe all parts to be complete.

BUGS:

We did not find any bugs while testing the code.

FILES:
    
    Included with this project are 10 files:

    build.xml, the build file for this project
    README.txt, the file you are currently reading that describes the 
        project
    FileProcessor.java, the file user to parse the input file text
    Logger.java, the debug class that prints out messages when specific
        actions occur
    Driver.java, the main driver class for the taskManager object
    Visitor.java, a visitor interface to be implemented by all visitor
        implementations 
    PopulateTreeVisitor.java, visitor implementation that takes in the
        input file word by word, stores word in a node, and places that
        node in the tree.
    WordCountVisitor.java, visitor that traverses the tree and gathers
        the data about the words within it to write to an output file.
    BST.java, class with the implementation of the binary search tree
        data structure
    Node.java, class with the implementation of each node in the
        binary search tree 
    
SAMPLE OUTPUT:


TO COMPILE:

    Run the command "ant -buildfile src/build.xml all"

TO RUN:

    Run the command "ant -buildfile src/build.xml run -Darg0="input.txt" -Darg1=output.txt -Darg2="3" -Darg3="0""

JUSTIFICATION:

We used a binary search tree to store unique words alphabetically.
When a duplicate word enters the tree the node it matches has a counter
that is incremented. Each node has the number of times the word has been
entered into the tree, the number of characters in the word, a left and
right child, and the String the node was initialized to track. The code
for our BST was made by us, rather than take from a library. The reason
for this is that normal trees rebalance so that the access of a single
element will be at most O(logn). We are not accessing single elements,
only dumping all of the words into the tree, then iterating back over
it therefore this balancing is wasted time. Our data structure contains
only what it needs to function, and no more. This would make it
difficult to expand upon, but also makes it faster. The only other real
decision that factored into design was the use of BufferedReader to
parse the text file instead of Scanner. We discovered by testing both
implementations that BufferedReader was significantly faster on the
files of larger size.

LOGGER VALUES:

    0 - no logging statements
    1 - reading from a file
    2 - writing to a file
    3 - a node has been created and added to the tree
    4 - a node on the tree has been visited

EXTRA CREDIT:

None

BIBLIOGRAPHY:

This serves as evidence that we are in no way intending Academic Dishonesty.
Joseph Howard
Weronika Kowalczyk

ACKNOWLEDGEMENT:

    During the coding process one or more of the following people may have been
    consulted. Their help is greatly appreciated. They helped with by providing 
    moral support, and consulting on design questions and syntax clarification.

    David Morris

