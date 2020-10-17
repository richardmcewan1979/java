package RichardMcEwan.com;

/*
Convert kiloBytes to Megabytes with remainder
Mission accomplished 21:18 6/10/20
Brief
public static void method
method: printMegaBytesAndKiloBytes
method parameter: kiloBytes
parameter type: int
if kiloBytes < 0; print "Invalid Value"
Output, string to console:
"XX KB = YY MB and ZZ KB"
metric: 1MB = 1024KB
use remainder operator
watch spacing
run tests:
        printMegaBytesAndKiloBytes(2500);
        expected "2500 KB = 2 MB and 452 KB

        printMegaBytesAndKiloBytes(-1024);
        expected "Invalid Value"

        printMegaBytesAndKiloBytes(5000);
        expected "5000 KB = 4MB and 904 KB"

console output:

2500 KB = 2 MB and 452 KB
Invalid Value
5000 KB = 4 MB and 904 KB

TESTS PASSED

*/

public class Main {

    public static void main(String[] args) {
	// write your code here
        //tests
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);

    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){

        if (kiloBytes < 0){
                System.out.println("Invalid Value");
            }
        else {
                int megaBytes = kiloBytes / 1024;
                int remainingKiloBytes = kiloBytes % 1024;

                System.out.println(kiloBytes + " KB = "
                                    + megaBytes + " MB and "
                                    + remainingKiloBytes + " KB");

        }

    }

}
