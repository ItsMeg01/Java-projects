import java.util.*;

public class TGame {

static String game[] = new String[9];
static String t;
static String winner() {
for (int i = 0; i < 8; i++) {
String slot = null;
switch (i) {
case 0:
slot = game[0] + game[1] + game[2];
break;
case 1:
slot = game[3] + game[4] + game[5];
break;
case 2:
slot = game[6] + game[7] + game[8];
break;
case 3:
slot = game[0] + game[3] + game[6];
break;
case 4:
slot = game[1] + game[4] + game[7];
break;
case 5:
slot = game[2] + game[5] + game[8];
break;
case 6:
slot = game[0] + game[4] + game[8];
break;
case 7:
slot = game[2] + game[4] + game[6];
break;
}
if (slot.equals("XXX")) {
return "X";
} else if (slot.equals("OOO")) {
return "O";
}
}
for (int i = 0; i < 9; i++) {
if (Arrays.asList(game).contains(String.valueOf(i+1))) {
break;
}
else if (i == 8) return "draw";
}
System.out.println(t + "'s turn; enter a slot number to place " + t + "in:");
return null;
}
static void printBoard() {
System.out.println("");
System.out.println("| " + game[0] + " | " + game[1] + " | " + game[2] + " |");
System.out.println("*************");
System.out.println("| " + game[3] + " | " + game[4] + " | " + game[5] + " |");
System.out.println("*************");
System.out.println("| " + game[6] + " | " + game[7] + " | " + game[8] + " |");
System.out.println("");
}
static void empty() {
for (int i = 0; i < 9; i++) {
game[i] = String.valueOf(i+1);
}
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
t = "X";
String winplayer = null;
empty();
System.out.println(" Tic Tac Toe.");
System.out.println("**************");
printBoard();
System.out.println("X's will play first. Enter a slot number to place X in:");
while (winplayer == null) {
int num;
try {
num = sc.nextInt();
if (!(num > 0 && num <= 9)) {
System.out.println("Invalid input; re-enter slot number:");
continue;
}
} catch (InputMismatchException e) {
System.out.println("Invalid input; re-enter slot number:");
continue;
}
if (game[num-1].equals(String.valueOf(num))) {
game[num-1] = t;
if (t.equals("X")) {
t = "O";
} else {
t = "X";
}
printBoard();
winplayer = winner();
} else {
System.out.println("Slot already taken; re-enter slot number:");
continue;
}
}
if (winplayer.equalsIgnoreCase("draw")) {
System.out.println("It's a DRAW!");
} else {
System.out.println("GREAT! " + winplayer + "'s have won! GGWP.");
}
}

}
