package WhileLoopMoreExercises;

public class Test {

    public static void main(String[] args) {
        int couter = 0;
        for (int i = 1; i <= 44 ; i++) {
            for (int j = i + 1; j <= 45 ; j++) {
                for (int k = j + 1; k <= 46 ; k++) {
                    for (int l = k + 1; l <= 47 ; l++) {
                        for (int m = l + 1; m <= 48 ; m++) {
                            for (int n = m + 1; n <= 49 ; n++) {
                                System.out.printf("%d %d %d %d %d %d%n", i, j, k, l, m, n);
                                couter++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Number of combination is: " + couter);
    }
}

