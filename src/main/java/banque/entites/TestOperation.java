package banque.entites;

import java.util.Objects;

public class TestOperation {

    public static void main(String[] args) {

        Operation op1 = new Credit("01/102024", 10);
        Operation op2 = new Debit("03/102024", 5);
        Operation op3 = new Debit("05/102024", 5);
        Operation op4 = new Credit("07/102024", 10);

        Operation[] tabOp = {op1, op2, op3, op4};

        int total = 0;

        for (int i=0; i<tabOp.length; i++) {
            System.out.println(tabOp[i]);
            if (tabOp[i].getType().equals("CREDIT")) {
                total += tabOp[i].getMontant();
            } else if (Objects.equals(tabOp[i].getType(), "DEBIT")) {
                total -= tabOp[i].getMontant();
            }
        }

        System.out.println("Le montant global est de : "+ total+"€");

    }
}
