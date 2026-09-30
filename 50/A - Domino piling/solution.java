/*
    Codeforces 50A - Domino Piling
 
    Problem Statement:
    You are given a rectangular board of size M × N squares.
 
    You also have an unlimited number of standard dominoes.
    Each domino covers exactly 2 adjacent squares.
 
    Rules:
    1. A domino can be placed either horizontally or vertically.
    2. Dominoes cannot overlap.
    3. Dominoes cannot extend outside the board.
 
    Task:
    Find the maximum number of dominoes that can be placed on the board.
 
    Input:
    - A single line containing two integers:
      M N
      where:
      M = number of rows
      N = number of columns
 
    Output:
    - Print one integer:
      The maximum number of dominoes that can fit on the board.
 
    Constraints:
    1 ≤ M ≤ 16
    1 ≤ N ≤ 16
 
    Examples:
 
    Example 1:
    Input:
    2 4
 
    Output:
    4
 
    Explanation:
    The board has 2 × 4 = 8 squares.
    Each domino covers 2 squares.
    Maximum dominoes = 8 / 2 = 4.
 
    Example 2:
    Input:
    3 3
 
    Output:
    4
 
    Explanation:
    The board has 9 squares.
    Four dominoes cover 8 squares.
    One square remains uncovered.
 
    Logic:
    - Total squares = M × N
    - One domino covers 2 squares.
    - Maximum dominoes = (M × N) / 2
      (Integer division automatically ignores any leftover square.)
*/
 
import java.util.Scanner;
 
public class main11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    int n = sc.nextInt();
 
    int totalcells = m * n;
 
    int answer = (totalcells) / 2;
 
    System.out.println(answer);
 
    sc.close();
 
  }
}