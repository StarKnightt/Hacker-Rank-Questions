import java.util.ArrayList;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import java.util.ArrayList;
import java.util.Scanner;

// Define an enumeration of colors
enum Color {
    RED, GREEN
}

// Define an abstract class for a Tree
abstract class Tree {
    // Define private fields for value, color, and depth
    private int value;
    private Color color;
    private int depth;

    // Define a constructor that sets the value, color, and depth fields
    public Tree(int value, Color color, int depth) {
        this.value = value;
        this.color = color;
        this.depth = depth;
    }

    // Define getters for the value, color, and depth fields
    public int getValue() {
        return value;
    }

    public Color getColor() {
        return color;
    }

    public int getDepth() {
        return depth;
    }

    // Define abstract methods for accepting a visitor
    public abstract void accept(TreeVis visitor);
}

// Define a class for a TreeNode that extends Tree
class TreeNode extends Tree {
    // Define a private ArrayList of children
    private ArrayList<Tree> children = new ArrayList();

    // Define a constructor that calls the super constructor and passes in the value, color, and depth
    public TreeNode(int value, Color color, int depth) {
        super(value, color, depth);
    }

    // Define a method for accepting a visitor that visits each child
    public void accept(TreeVis visitor) {
        visitor.visitNode(this);
        for (Tree child : children) {
            child.accept(visitor);
        }
    }

    // Define a method for adding a child to the ArrayList
    public void addChild(Tree child) {
        children.add(child);
    }
}

// Define a class for a TreeLeaf that extends Tree
class TreeLeaf extends Tree {
    // Define a constructor that calls the super constructor and passes in the value, color, and depth
    public TreeLeaf(int value, Color color, int depth) {
        super(value, color, depth);
    }

    // Define a method for accepting a visitor that visits the leaf
    public void accept(TreeVis visitor) {
        visitor.visitLeaf(this);
    }
}

// Define an abstract class for a Tree Visitor
abstract class TreeVis {
    // Define abstract methods for getting the result and visiting a node or leaf
    public abstract int getResult();
    public abstract void visitNode(TreeNode node);
    public abstract void visitLeaf(TreeLeaf leaf);

}

// Define a class for a SumInLeavesVisitor that extends TreeVis
class SumInLeavesVisitor extends TreeVis {
    // Define a private field for the result
    private int result = 0;

    // Define a method for getting the result
    public int getResult() {
        return result;
    }

    // Define a method for visiting a node (does nothing in this visitor)
    public void visitNode(TreeNode node) {
        // do nothing
    }

    // Define a method for visiting a leaf and adding its value to the result
    public void visitLeaf(TreeLeaf leaf) {
        result += leaf.getValue();
    }
}

// Define a class for a ProductOfRedNodesVisitor that extends TreeVis
class ProductOfRedNodesVisitor extends TreeVis {
    // Define a private field for the result and a constant M
    private long result = 1;
    private final int M = 1000000007;

    // Define a method for getting the result
    public int getResult() {
        return (int) result;
    }

    // Define a method for visiting a node and multiplying its
