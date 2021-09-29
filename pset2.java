//Ronald Liu
//1-1
//Sept 20
import java.lang.Math;
public class pset1{
    static public void main(String[] args){      
        System.out.println("QUADRATIC FORMULA"); //QUADDRATIC FORMULA
        int q_a = 1, q_b = 5, q_c = 6; //variables needed for calculatoin: coefficient of x^2, coefficient of x, and coefficient of 1
        double q_ans1 = (-q_b - Math.sqrt(q_b * q_b - 4 * q_a * q_c)) / (2 * q_a); //calculation using the QUADDRATIC FORMULA
        double q_ans2 = (-q_b + Math.sqrt(q_b * q_b - 4 * q_a * q_c)) / (2 * q_a);//calculation using the QUADDRATIC FORMULA
        System.out.println("The solutions for " + q_a + "x^2 + " + q_b + "x + " + q_c + " are " + q_ans1 + " and " + q_ans2 + ".\n"); //output

        System.out.println("SLOPE FORMULA"); //SlOPE FORMULA
        int s_1x = 0, s_1y = 0, s_2x = 2, s_2y = 3; //variables needed for calculatoin: x of point 1, y of point 1, x of point 2, y of point 2
        double s_ans = (double)(s_2y - s_1y) / (s_2x - s_1x); //calculation using the SlOPE FORMULA
        System.out.println("A line connecting the points (" + s_1x + ", " + s_1y + ") and (" + s_2x + ", " + s_2y + ") has a slope of " + s_ans + "\n"); //output

        System.out.println("MIDPOINT FORMULA"); //MIDPOINT FORMULA
        int m_1x = 0, m_1y = 0, m_2x = 2, m_2y = 3; //variables needed for calculatoin: x of point 1, y of point 1, x of point 2, y of point 2
        double m_ansX = (double)(m_1x + m_2x) / 2; //calculation using the MIDPOINT FORMULA
        double m_ansY = (double)(m_1y + m_2y) / 2; //calculation using the MIDPOINT FORMULA
        System.out.println("The midpoint between (" + m_1x + ", " + m_1y + ") and (" + m_2x + ", " + m_2y + ") is (" + m_ansX + ", " + m_ansY + ")\n"); //output
        
        System.out.println("SUM OF ARITHMETIC SERIES"); //SUM OF ARITHMETIC SERIES
        int a_num = 5; //variables needed for calculatoin: number of terms
        double a_sta = 1.0, a_inc = 1.0; //variables needed for calculatoin: starting number, increment
        double a_sum = (a_num / 2.0) * (a_sta + a_sta + (a_num-1) * a_inc); //calculation using the SUM OF ARITHMETIC SERIES FORMULA
        System.out.println("The sum of the first " + a_num + " terms of an arithmetic series that starts with " + a_sta + " and increases by " + a_inc + " is " + a_sum + "\n"); //output

        System.out.println("SUM OF FINITE GEOMETRIC SERIES"); //SUM OF FINITE GEOMETRIC SERIES
        int g_num = 3; //variables needed for calculatoin: number of terms
        double g_sta = 3.0, g_rat = 2.0; //variables needed for calculatoin: starting number, increment
        double g_sum = g_sta * (1 - Math.pow(g_rat, g_num)) / (1 - g_rat); //calculation using the SUM OF FINITE GEOMETRIC SERIES FORMULA
        System.out.println("The sum of the first " + g_num + " terms of a finite geometric series that starts with " + g_sta + " and increases by a rate of " + g_rat + " is " + g_sum); //output
    }
}
