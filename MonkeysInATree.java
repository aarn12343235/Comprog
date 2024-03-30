//Written By: Aaron A. Bigno
//this program prints out nursery rhyme :))
public class MonkeysInATree {
    public static void main(String[] args) {//main method
        //initialization of variables
        String five = "Five", four = "Four", three = "Three", two = "Two", one = "One";

        for (int monkeys = 5; monkeys >= 0; monkeys--){//loop decrements for every monkeys fell
            // Print the number of monkeys swinging in the tree
            if (monkeys == 5)
                System.out.print(five);
            else if (monkeys == 4)
                System.out.print(four);
            else if (monkeys == 3)
                System.out.print(three);
            else if (monkeys == 2)
                System.out.print(two);
            else if (monkeys == 1)
                System.out.print(one);
            else
                System.out.print("No");
                
            System.out.println(" little monkeys swinging in a tree");
            // Print the teasing part if there are monkeys left
            if (monkeys > 0) {
                System.out.println("Teasing Mr Crocodile \"you can't catch me\"");
                System.out.println("Along came the crocodile as quiet as can be");
                System.out.println("and SNAP!\n");
            }
        }
    }
}