# Assignment 18
Uriel Salazar  
Mr. Wilson  
Computer Information Systems 7  
11/20/2017


## &#35;1

### Prompt:

Give the function g that is part of the formal definition of the directed graph shown.

### Solution:

g(a) = (1, 2)  
g(b) = (1, 3)  
g(c) = (2, 3)  
g(d) = (2, 2)  


## &#35;2

### Prompt:

Use the graph in the figure to answer the qustions that follow.  
a. Is the graph simple?  
b. Is the graph complete?  
c. Is the graph connected?  
d. Can you find two paths from 3 to 6?  
e. Can you find a cycle?  
f. Can you find an arc whose removal will make the graph acyclic?  
g. Can you find an arc whose removal will make the graph not connected?  

### Solution:

a. Yes, the graph is simple (no loops or parallel arcs).  
b. No, the graph is not complete (vertices 1 and 7 have no joining edges).  
c. Yes, the graph is connected (every vertex is reachable from every other vertex).  
d. Path 1: 3, a_3, 4, a_4, 5, a_6, 6  
Path 2: 3, a_5, 5, a_6, 6  
e. Cycle: 3, a_3, 4, a_4, 5, a_5, 3  
f. Yes, removal of arc a_5 will make the graph acyclic.  
g. Yes, removal of arc a_7 will no longer make the graph connected (no path to vertex 7).  

## &#35;5

### Prompt:

Draw K_6.

### Solution:

<img src="https://i.imgur.com/PKGBqoa.png" width="400" />

&nbsp;

## &#35;9

### Prompt:

a. The acquaintanceship graph for the IT department and the marketing department of a major corporation is an unconnected graph. What does this imply?  
b. The following figure represents an acquaintanceship graph for residents of an apartment building. Are Carl and Fletcher acquainted? How many people is SiuYin acquainted with?  
c. The length of the shortest path between node a and node b in an acquaintanceship graph is sometimes called the degree of seperation between a and b. What is the degree of separation between Carl and Yuri?  

### Solution:

a. An unconnected graph implies that no one in the IT department is acquainted with anyone in the marketing department and vice-versa.  
b. Carl and Fletcher are not acquainted (not adjacent nodes). SiuYin is acquainted with 1 person (Carl).  
c. Carl and Yuri's degree of seperation is: 2  

## &#35;13

### Prompt:

Which of the following graphs is not isomorphic to the others, and why?

### Solution:

Graph (b) is not isomorphic to the others because each of the nodes in graph (b) have a degree of at least 1, whereas graphs (a) and (c) both have a node of degree 0. Graph (b) can never be made to "look" like the other graphs.  

## &#35;30

### Prompt:

If all the nodes of a simple, connected, planar graph have degree 4 and the number of arcs is 12, into how many regions does it divide the plane?

### Solution:

Euler's Formula: n - a + r = 2  

let n = number of nodes,  
 => sum of degrees = 4n.  
 To find the number of nodes, use the fact that the sum of degrees is twice the number of arcs a.  
 4n = 2(12)  
 => n = 12 / 2  
 => n = 6.  
 Use Euler's Formula to calculate the number of regions:  
 6 - 12 + r = 2  
 => -6 + r = 2  
 => r = 2 + 6  
 => r = 8.  
 
 The plane is divded into 8 regions.

## &#35;49

### Prompt:

Describe the graph whose adjacency matrix is I_n, the n x n identity matrix.

### Solution:

The graph is undirected (matrix is symmetric).  
There are n nodes in the graph (matrix is of order n x n).  
There is a loop in the graph at each node (a 1 in the matrix indicates there is 1 arc between the nodes).  
The graph is unconnected and contains n loops, 1 loop for each of the n nodes.

## &#35;50

### Prompt:

Describe the graph whose adjacency matrix is 0_n, the n x n matrix of all 0's.

### Solution:

The graph is undirected (matrix is symmetric).  
There are n nodes in the graph (matrix is of order n x n).  
There are no arcs in the graph (a 0 in the matrix indicates there are no arcs between the nodes).  
The graph is unconnected and contains n nodes, with no arcs connecting any of the nodes.  

## &#35;51

### Prompt:

### Solution:





## &#35;65

### Prompt:

### Solution:




## &#35;71

### Prompt:

### Solution:




&nbsp;

End Assignment 18
