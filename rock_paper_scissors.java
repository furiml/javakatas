/* Adrien Scrève 2018
 * https://www.codewars.com/kata/rock-paper-scissors/train/java
*/


public class Kata {
  public static String rps(String p1, String p2) {
    switch(p1) { // very long, ineffective solution 
      case "rock":
        switch(p2) {
          case "scissors":
            return "Player 1 won!";
          case "paper":
            return "Player 2 won!";
          default:
            return "Draw!";
        }
      case "paper":
        switch(p2) {
          case "rock":
            return "Player 1 won!";
          case "scissors":
            return "Player 2 won!";
          default:
            return "Draw!";
        }
      case "scissors":
        switch(p2) {
          case "paper":
            return "Player 1 won!";
          case "rock":
            return "Player 2 won!";
          default:
            return "Draw!";
        }
    }
    return "Draw!";
  }
}
