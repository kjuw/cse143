import java.util.*;
import java.io.*;

public class inclassactivity {


  public static void main(String[] args) throws FileNotFoundException {
    // to read a file
    Scanner input = new Scanner(new File("numbers.txt"));
    // How to create an arraylist
    ArrayList<Integer> n = new ArrayList<Integer>();
    // This is a boolean statement
    while(input.hasNextInt()) {
      int value = input.nextInt();
      n.add(value);

    }
    System.out.println(n);
    double avg = average(n);
    System.out.println("Average is " + avg);
    ArrayList<Integer> s = evenList(n);
    System.out.print(s);

  }

public static double average(ArrayList<Integer> s) {
  int sum = 0;
  for(int i = 0; i < s.size(); i++) {
    sum += s.get(i);

  }
  double avg = sum / s.size() - 1;
  return avg;

}

public static ArrayList<Integer> evenList(ArrayList<Integer> s) {
  for(int i = 0; i < s.size(); i++) {
    if(s.get(i) % 2 != 0) {
      s.remove(i);
      i--;
    }
  }
  return s;
}

public static ArrayList<Integer> maxInt(ArrayList<Integer> s) {
  int max = 0;
  for(int i = 0; i < s.size(); i++) {
    if(s.get(i) > get(i + 1)) {
      max = s.get(i);
    } else {
      max = s.get(i + 1);
    }
  }
  return max;
}

}
