package StacksAndQueues;

import java.util.Stack;

public class TowersOfHanoi {
    public static void main(String[] args){
        int size = 6;
        TowersOfHanoi h = new TowersOfHanoi(size);
        printStacks(h.towers);
        h.moveDisks();
        printStacks(h.towers);
    }

    public static void printStacks(Tower[] towers){
        for(Tower t : towers){
            Stack s = t.disks;
            for(int i = 0; i < s.size(); i++){
                System.out.print(s.elementAt(i) + ",");
            }
            System.out.println();
        }
        System.out.println("-----");
    }

    Tower[] towers = new Tower[3];
    int size;

    public TowersOfHanoi(int size){
        this.size = size;
        for(int i = 0; i < towers.length; i ++){
            towers[i] = new Tower(size);
        }
        for(int i = 0; i < size; i ++){
            towers[0].disks.add(size - i);
        }
    }

    public void moveDisks(){
        // Start moving disks from tower[0] to tower[2]
        towers[0].moveDisks(size, towers[2], towers[1]);
    }
}

class Tower{
    Stack<Integer> disks;
    int index;
    Tower(int index){
        this.disks = new Stack<>();
        this.index = index;
    }
    public void add(int disk){
        if (disks.isEmpty() || disks.peek() > disk){
            disks.push(disk);
        }
    }
    public void moveToTop(Tower tower){
        tower.add(disks.pop());
    }
    public void moveDisks(int n, Tower destination, Tower buffer){
        /*
        Recursively do:
            Move a disk from the buffer to the destination pole
            Move a disk from the current pole to the destination pole
            Continue to move disk from the current pole to the destination pole
         */
        if (n > 0){
            moveDisks(n-1, buffer, destination);
            moveToTop(destination);
            buffer.moveDisks(n-1, destination, this);
        }
    }
}