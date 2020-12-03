public class Square {
    public static void makeSquare(int dim, char c) {
        if (dim < 0) {
            System.out.println("Cannot have a negative dimension.");
        } else if (dim > 70) {
            System.out.println("Cannot be more than 70.");
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < dim; i++) {
                for (int j = 0; j < dim; j++) {
                    sb.append(" " + c);
                }
                sb.append("\n");
            }
            System.out.println(sb);
        }
    }
}
