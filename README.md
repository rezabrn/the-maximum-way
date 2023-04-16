# the-maximum-way

First of all it is obvious that the question is about a tree.
Because it has no cycle. Theoretically, it is proved for an
n-vertex graph that it is not possible to contain a cycle and
have less than n nodes. In addition, according to the
assumption all of the nodes have to be connected, it
means the graph has connectivity. Consequently, this is a
tree.

My java program contains a class and two methods. One
of the methods is the main method that gets inputs and
saves the tree(saves in 2D boolean array). After that
another method will be called. All the logic of the program
exists in this method.

The operations start with the first node and it continues to
the last one. It has two nested loops to access two nodes.
The initial loop is responsible for the index of the second
node and the other loop response to index first node. If the
edge exists, the first node will be the second and the
second one will start from the first node in the graph. It
continues until a leaf is found, and then the leaf will be
removed and the counter will be 0; though the counter was
more than maxWay, maxWay catches the counter amount
and then counter will be 0.




<a name="br2"></a>This way is used till the first node becomes the last. No
need to compute this state because definitely in other
states opposite of this way has been computed. Thus
when the first node is the last one, the method returns the
maxWay amount and it is printed in the terminal.

● After removing all edges, the starting tree will be
 replaced by the current tree.

● When the first and second nodes form an edge, one
 is added to the amount of counter.

● When the second node becomes the first, the first
 node cannot become the second, otherwise this
 operation will not be finished.

● There are always at least two leaves. For this reason

we don't fall in an infinite loop.

Code:

This is the main method. I use an adjacency matrix to save the
tree. Because of that, when the (m, n) is true, the (n, m) has to be
true.




<a name="br3"></a>In the *findTheLongestWay* method I defined
another 2D boolean array and I put all values of the main
array in it. I did it because the array has a reference in
memory.

I defined a variable named “temp”. It should keep the old
value of the first node, And doesnt let the second node to
be equal to itself.

If all elements of the newGraph become false, it takes the
values of the graph again.




<a name="br4"></a>Examples:





<a name="br5"></a>


<a name="br6"></a>Thank you for your attention.

I hope the explanation is useful.

Full Name : Reza Salehi

Student Number : 40006703
