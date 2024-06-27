package org.example.model.ejercicios.GrafoNoGrafo.Utilities;


import org.example.model.ejercicios.GrafoNoGrafo.Interfaces.BinaryTree;

public class BinaryTreeUtilities {

    public static boolean esBalanceado(BinaryTree binaryTree) {
        if(binaryTree == null) {
            return true;
        }
        if(binaryTree.getLeft() == null && binaryTree.getRight() == null) {
            return true;
        }
        return esBalanceado(binaryTree.getLeft()) &&
                esBalanceado(binaryTree.getRight()) &&
                Math.abs(height(binaryTree.getLeft()) - height(binaryTree.getRight())) <= 1;

    }

    public static boolean esLleno(BinaryTree binaryTree) {
        if(binaryTree == null) {
            return true;
        }
        if(binaryTree.getLeft() == null && binaryTree.getRight() == null) {
            return true;
        }
        return esLleno(binaryTree.getLeft()) &&
                esLleno(binaryTree.getRight()) &&
                height(binaryTree.getLeft()) == height(binaryTree.getRight());
    }

    public static boolean esCompleto(BinaryTree binaryTree) {
        if(binaryTree == null) {
            return true;
        }
        return binaryTree.getLeft() != null &&
                binaryTree.getRight() != null &&
                esCompleto(binaryTree.getRight()) &&
                esCompleto(binaryTree.getLeft()) ||
                binaryTree.getLeft() == null && binaryTree.getRight() == null;
    }

    public static int height(BinaryTree binaryTree) {
        if(binaryTree == null) {
            return 0;
        }
        return 1 + Math.max(height(binaryTree.getLeft()), height(binaryTree.getRight()));
    }

    public static boolean esDegenerado(BinaryTree binaryTree) {
        if(binaryTree == null) {
            return true;
        }
        if(binaryTree.getLeft() == null && binaryTree.getRight() == null) {
            return true;
        }
        if(binaryTree.getLeft() != null && binaryTree.getRight() != null) {
            return false;
        }
        if(binaryTree.getLeft() != null) {
            return esDegenerado(binaryTree.getLeft());
        }
        return esDegenerado(binaryTree.getRight());
    }

    public static boolean esSesgado(BinaryTree binaryTree) {
        if(binaryTree == null) {
            return true;
        }
        if(binaryTree.getLeft() == null && binaryTree.getRight() == null) {
            return true;
        }
        if(binaryTree.getLeft() != null && binaryTree.getRight() != null) {
            return false;
        }
        if(binaryTree.getLeft() != null) {
            return esSesgado(binaryTree.getLeft(), true);
        }

        return esSesgado(binaryTree.getRight(), false);
    }

    private static boolean esSesgado(BinaryTree binaryTree, boolean left) {
        if(binaryTree == null) {
            return true;
        }
        if(binaryTree.getLeft() == null && binaryTree.getRight() == null) {
            return true;
        }

        if(left) {
            return binaryTree.getLeft() != null && binaryTree.getRight() == null && esSesgado(binaryTree.getLeft(), true);
        }

        return binaryTree.getLeft() == null && binaryTree.getRight() != null && esSesgado(binaryTree.getRight(), false);
    }

    public static void level(BinaryTree binaryTree) {
        levelAux(binaryTree, 0);
    }

    private static void levelAux(BinaryTree binaryTree, int current) {
        if(binaryTree == null) {
            return;
        }
        System.out.println("Nodo: " + binaryTree.getRoot() + ", nivel: " + current);
        levelAux(binaryTree.getLeft(), current + 1);
        levelAux(binaryTree.getRight(), current + 1);
    }

    public static void printLeaf(BinaryTree binaryTree) {
        if(binaryTree == null) {
            return;
        }
        printLeafAux(binaryTree.getLeft());
        printLeafAux(binaryTree.getRight());
    }

    private static void printLeafAux(BinaryTree binaryTree) {
        if(binaryTree == null) {
            return;
        }
        if(binaryTree.getLeft() == null && binaryTree.getRight() == null) {
            System.out.println("Hoja: " + binaryTree.getRoot());
            return;
        }
        if(binaryTree.getLeft() != null) {
            printLeaf(binaryTree);
        }
        if(binaryTree.getRight() != null) {
            printLeaf(binaryTree);
        }
    }



    public static boolean isBinarySearchTree(BinaryTree binaryTree) {
        return isBinarySearchTree(binaryTree, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private static boolean isBinarySearchTree(BinaryTree binaryTree, int min, int max) {
        if(binaryTree == null || binaryTree.getLeft() == null && binaryTree.getRight() == null) {
            return true;
        }
        boolean isValidLeft = true;
        boolean isValidRight = true;
        if(binaryTree.getLeft() != null) {
            isValidLeft = isBinarySearchTree(binaryTree.getLeft(), min, binaryTree.getRoot()) &&
                    binaryTree.getLeft().getRoot() < binaryTree.getRoot() &&
                    binaryTree.getLeft().getRoot() < max;
            if(!isValidLeft) {
                return false;
            }
        }
        if(binaryTree.getRight() != null) {
            isValidRight = isBinarySearchTree(binaryTree.getRight(), binaryTree.getRoot(), max) &&
                    binaryTree.getRight().getRoot() > binaryTree.getRoot() &&
                    binaryTree.getRight().getRoot() > min;
            if(!isValidRight) {
                return false;
            }
        }
        return isValidLeft && isValidRight;
    }
    public static int totalNodes(BinaryTree binaryTree) {
        if (binaryTree == null) {
            return 0;
        }
        return 1 + totalNodes(binaryTree.getLeft()) + totalNodes(binaryTree.getRight());
    }

    public static int sumNodes(BinaryTree binaryTree) {
        if (binaryTree == null) {
            return 0;
        }
        return binaryTree.getRoot() + sumNodes(binaryTree.getLeft()) + sumNodes(binaryTree.getRight());
    }

}
