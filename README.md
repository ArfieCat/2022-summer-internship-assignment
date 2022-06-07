# Game of Apps Development Intern Interview 2022

Thanks for your interest in the Game of Apps developer intern position! This repo contains a list of tasks for you to do, so we can get a gauge of your skill and abilities for the position.

You're expected to know the basics of the Git development workflow. If you would like a review, check out this [tutorial](https://www.raywenderlich.com/179717/open-source-collaboration-using-git-and-github).

## Instructions

Clone this repository to begin. 

Commit your work to each section in a separate sub folder to your cloned repo, the submit your Git repo link (make sure its public!) to this [Google Form](https://forms.gle/W6NRZYwk936nEmvY6)

We expect each section to take around 1 hour to complete. Therefore should you complete all three sections, it may take around 3-4 hours. You may be faster or slower depending on your skillset. 


## Challenge 1: Algorithms

Your first challenge is to solve two algorithm questions. You'll be judged based on correctness, performance, and code readability. 

Please complete this section in Java.

**About run time analysis:** We won't do a strict run time assessment but it will have some factor in it if it is wildly inefficient (eg: you have nested loops when it was not necessary, etc).  

It's also a trade off between super optimized code and readability, so take that into consideration as well. You should optimize to some degree but if it becomes very hard to comprehend then that is probably too far

Before each code block, please outline your approach/algorithm to solving the problem.
---
### Example of how each algorithm should be submitted: 

*Sample Question*: Write a GetNth() function that takes a linked list and an integer index and returns the data value stored in the node at that index position. 

#### You will be expected to submit something like the following:
*Algorithm*:
```
1. Initialize count = 0
2. Loop through the link list
     a. if count is equal to the passed index then return current
         node
     b. Increment count
     c. change current to point to next of the current.
```
*Implementation:*
```
...

static int GetNth(Node head, int n)
    {
        int count = 0;
        if (head == null) // edge case - if head is null
            return -1;
        // if count equal to n return node.data
        if (count == n)
            return head.data;
 
        // recursively decrease n and increase
        // head to next pointer
        return GetNth(head.next, n - 1);
    }

...
```
---
### Question 1: Find all pairs for a given sum

Create a function that accepts an array of integers and a target sum. The function will print all pairs of integers in the array whose sum is equal to the target sum. 

Feel free to expand the test cases and think of any edge cases. Your answer should be able to handle duplicate numbers in the input, but we only expect unique pairs to be in the output. We do not have any specific requirements about sorting the output  (small integer, larger integer or vice versa). Be ready to justify your decision, should we choose to ask.

Here's an example:

```java
int[] testArray = {2, 4, 5, 1, 3, 5, 4};
int targetSum = 6;
// Expected pairs are (to be printed on the console):
// (2, 4)
// (1, 5)

findPairs(testArray, targetSum);
```

Here's a function signature to start you off:

```java
void findPairs(int[] testArray, int targetSum) {
  // your code here
}
```

### Question 2: Reconcile Arrays

Given two unsorted integer arrays, print out the numbers that are NOT contained in the other array

*Input*: Two unique integer arrays, unsorted

*Output*: String in the format of 
```
Numbers in array a that aren't in array b: 
5

Numbers in array b that aren't in array a: 
6 10
```

Starting Code:
```java
void reconcileHelper(int[] a, int[] b) {
  // your code here
}
```

## Challenge 2: Android 

Convert the following figma design to a functioning app: [Figma](https://www.figma.com/file/wD6IpDv4wQqtJaEa5jWAYy/Android-Test-Mocks?node-id=111%3A8). [Playable Prototype](https://www.figma.com/proto/wD6IpDv4wQqtJaEa5jWAYy/Android-Test-Mocks?scaling=min-zoom&page-id=111%3A8&node-id=1204%3A5&starting-point-node-id=1204%3A6)


Files are located in a zip file in the git repo. Make it responsive using your best judgement.

### Requirements
* Create a Android App. The app contains:
     * Header with the text `Hello World`
     * Sub-header with the text `Wow! Check out all the cool Java things I can do!`
* Create 4 image blocks with the following crops/masks:
     * Image in a circle
     * Image in a 4:3 rectangle
     * Image in a 1:1 square
     * Image in a triangle
* The four images should be in a view that scrolls
* The image blocks should be clickable
     * When the user clicks on an image block, it should open in a translucent overlay, or navigate to a new screen with the image
* Background should have a blue to light blue gradient (get the color values off Figma)

### Notes:

- A good developer tries to write code that is easy to understand. The industry has a set of best practices that focus on writing easy to maintain code. Here's a set of guidelines on these best practices: [Java Style Guide](https://github.com/raywenderlich/java-style-guide).
- Try to show off your git knowledge here too
