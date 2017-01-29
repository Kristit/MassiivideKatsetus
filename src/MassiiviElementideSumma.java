/**
 * Created by kristitammet on 29/01/2017.
 *  //Leida massiivi  elementide summa.
 */
public class MassiiviElementideSumma {


        public static void main (String[] args) {
            System.out.println (negSumma (new int[]{0}));
            // YOUR TESTS HERE
        }

        public static int negSumma (int[] m) {
            int summa = 0;

            for(int d:m)
            {
                if(d<0)
                {
                    summa+=d;
                }
            }
            return summa;  // YOUR PROGRAM HERE
        }

    }

/*public static int posSumma (int[] m) {
  int sum = 0;

   for (int i = 0; i < m.length; i++) {
 	  if (m[i] > 0) {
 		  sum += m[i];
	  }
  }
  return sum;
}*/


/*MASSIIVI PIKKUS

public class MassiiviPikkus {
    public static int numberOfItems(int [] m) {
        int kuiMitu = m.length;		// Your code here!
        return kuiMitu;			// return -1;
    }

    public static void main(String [] args) {
        int [] test = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int [] test2 = { 100, 3, 5, 6, 222222, 14};

        System.out.println( numberOfItems(test) );
        System.out.println( numberOfItems(test2) );
    }
}*/

/* MASSIVII RUUTUDE SUMMA

public class MassiiviRuutudeSumma {

   public static void main(String[] args) {
      System.out.println(ruutudeSumma(new int[] { 0 }));
      // YOUR TESTS HERE
   }

   public static int ruutudeSumma(int[] m) {
      int summa = 0;
      int arvuRuut = 0;
      for (int i = 0; i < m.length; i++) {
         arvuRuut = m[i] * m[i];
         summa = summa + arvuRuut;
      }
      return summa;
   }

}
 */