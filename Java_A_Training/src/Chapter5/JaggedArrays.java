package Chapter5;
/*
Jagged Array is an array of other arrays
 */
public class JaggedArrays {
    public static void main(String[] args) {
        //Creating a jagged array
        String[][] arrHobbies = new String[3][];
        String[] arrSports = {"Golf", "Tennis", "Soccer"};

        arrHobbies[0] = arrSports;
        arrHobbies[1] = new String[]{"Hiking", "Reading Books"};
        arrHobbies[2] = new String[4];
        //Chess,  Soccer, Netball, Hiking
        arrHobbies[2][0] = "Chess";
        arrHobbies[2][1] = "Soccer";
        arrHobbies[2][2] = "Netball";
        arrHobbies[2][3] = "Hiking";

        for (int i = 0; i < arrHobbies.length; i++) {
            for(int j = 0; j < arrHobbies[i].length; j++) {
                System.out.print(arrHobbies[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
