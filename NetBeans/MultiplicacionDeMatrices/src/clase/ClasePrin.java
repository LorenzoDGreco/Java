package clase;

public class ClasePrin {

    public static void main(String[] args) {
        int matriz1[][] = new int[2][3];
        int matriz2[][] = new int[3][2];
        int matriz3[][] = new int[2][2];

        //llenado de la primer matriz
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                matriz1[i][j] = (int) (Math.random() * 5);
            }
        }

        //llenado de la segunda matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                matriz2[i][j] = (int) (Math.random() * 5);
            }
        }

        //resultado de matrices
        for (int i = 0; i < 4; i++) {
            if (matriz3[0][0] == 0) {
                int temporal = (matriz1[0][0] * matriz2[0][0])
                        + (matriz1[0][1] * matriz2[1][0])
                        + (matriz1[0][2] * matriz2[2][0]);
                matriz3[0][0] = temporal;

            } else if (matriz3[1][0] == 0) {
                int temporal = (matriz1[1][0] * matriz2[0][0])
                        + (matriz1[1][1] * matriz2[1][0])
                        + (matriz1[1][2] * matriz2[2][0]);
                matriz3[1][0] = temporal;

            } else if (matriz3[0][1] == 0) {
                int temporal = (matriz1[0][0] * matriz2[0][1])
                        + (matriz1[0][1] * matriz2[1][1])
                        + (matriz1[0][2] * matriz2[2][1]);
                matriz3[0][1] = temporal;

            } else if (matriz3[1][1] == 0) {
                int temporal = (matriz1[1][0] * matriz2[0][1])
                        + (matriz1[1][1] * matriz2[1][1])
                        + (matriz1[1][2] * matriz2[2][1]);
                matriz3[1][1] = temporal;
            }
        }

        //imprimiendo matrices
        for (int i = 0; i <= 3; i++) {
            if (i < 2) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("[ " + matriz1[i][j] + " ]");
                }
                if (i == 1) {
                    System.out.print("    x   ");
                } else {
                    System.out.print("        ");
                }
            } else {
                System.out.print("                      ");
            }

            for (int j = 0; j < 2; j++) {
                System.out.print("[ " + matriz2[i][j] + " ]");
            }
            if (i == 1) {
                System.out.print("    =   ");
            } else {
                System.out.print("        ");
            }

            if (i < 2) {
                for (int j = 0; j < 2; j++) {
                    System.out.print("[ " + matriz3[i][j] + " ]");
                }
            }
            System.out.println("");
        }
    }
}
