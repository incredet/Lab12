package org.example.task1;

public abstract class Tray {
    private int denomination;
    private Tray next;
    public Tray(int denomination) {
        this.denomination = denomination;
    }
    public void setNext(Tray next) {
        this.next = next;
    }
    public void process(int amount) {
        int oldAmount = amount;
        amount=amount%denomination;
        if (next!=null) {
            next.process(amount);
        } else if (amount>0) {
            throw new IllegalArgumentException();
        }
        System.out.println("You received "+oldAmount/denomination+" of "+denomination);
    }
}
