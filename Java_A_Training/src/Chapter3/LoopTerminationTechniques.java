package Chapter3;
/* You can exit the loop using loop termination techniques
* break - exit the loop
* continue - skip the current iteration
* */
public class LoopTerminationTechniques {
    public static void main(String[] args) {
        for(int i = 1; i <= 15; i++) {
            if(i == 11) break; //exit the loop
            if(i % 3 == 0) continue; //skip to the next iteration
            System.out.print(i + " ");
        }
    }
}
