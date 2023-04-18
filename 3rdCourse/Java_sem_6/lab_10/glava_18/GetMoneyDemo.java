package glava_18;

import static javax.swing.JOptionPane.*;


class GetMoneyDemo {

    public static void main(String[] args) {

        String name;

        double m;

        double r;

        int t;

        double val;

        try {

            name = args[0] + " " + args[1];

            m = Double.parseDouble(args[2]);

            r = Double.parseDouble(args[3]);

            t = Integer.parseInt(args[4]);

            val = m;

            for (int k = 1; k <= t; k++) {
                val *= (1 + r / 100);
            }

            val = ((int) (100 * val)) / 100.0;

            String txt = "Name:       " + name + "\n";
            txt += "Vklad:  " + m + "\n";
            txt += "Stavka:  " + r + "\n";
            txt += "Time:   " + t + "\n";
            txt += "Itog:       " + val;

            showMessageDialog(null,
                    txt,
                    "Itogovaya summa po depositu",
                    INFORMATION_MESSAGE
            );
        }
        catch (Exception e) {
            showMessageDialog(null,

                    "Invalid!\n" + e,

                    "Error",

                    ERROR_MESSAGE
            );
        }
    }
}