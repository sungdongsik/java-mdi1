package enumeration.test;

public class AuthGradleMain1 {
    public static void main(String[] args) {
        AuthGradle[] authGradles = AuthGradle.values();

        for(AuthGradle authGradle : authGradles){
            printGralde(authGradle);
        }
    }

    private static void printGralde(AuthGradle authGradle){
        System.out.println("gradle = " + authGradle + " level=" + authGradle.getLevel() + " 설명=" + authGradle.getDescription());
    }
}
