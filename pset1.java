//Ronald Liu
//1-1
//Sept 20
import java.lang.Math;
public class pset1{
    static public void main(String[] args){
        //QUADDRATIC FORMULA
        System.out.println("QUADRATIC FORMULA");
        int q_a = 1;
        int q_b = 5;
        int q_c = 6;
        double q_ans1 = (-q_b + Math.sqrt(q_b * q_b - 4 * q_a * q_c)) / (2 * q_a);
        double q_ans2 = (-q_b - Math.sqrt(q_b * q_b - 4 * q_a * q_c)) / (2 * q_a);
        System.out.println("The solutions for " + q_a + "x^2 + " + q_b + "x + " + q_c + " are " + q_ans1 + " and " + q_ans2 + ".\n");
        //SlOPE FORMULA
        System.out.println("SLOPE FORMULA");
        int s_1x = 0;
        int s_1y = 0;
        int s_2x = 2;
        int s_2y = 3;
        double s_ans = (double)(s_2y-s_1y)/(s_2x-s_1x);
        System.out.println("A line connecting the points (" + s_1x + ", " + s_1y + ") and (" + s_2x + ", " + s_2y + ") has a slope of " + s_ans + "\n");
        //MIDPOINT FORMULA
        System.out.println("MIDPOINT FORMULA");
        int m_1x = 0;
        int m_1y = 0;
        int m_2x = 2;
        int m_2y = 3;
        double m_ansX = (m_1x + m_2x) / 2.0;
        double m_ansY = (m_1y + m_2y) / 2.0;
        System.out.println("The midpoint between (" + m_1x + ", " + m_1y + ") and (" + m_2x + ", " + m_2y + ") is (" + m_ansX + ", " + m_ansY + ")\n");
        //SUM OF ARITHMETIC SERIES
        System.out.println("SUM OF ARITHMETIC SERIES");
        int a_num = 5;
        double a_sta = 1.0;  
        double a_inc = 1.0;
        double  a_sum = (a_num / 2.0) * (a_sta + a_sta + (a_num-1) * a_inc);
        System.out.println("The sum of the first " + a_num + " terms of an arithmetic series that starts with " + a_sta + " and increases by " + a_inc + " is " + a_sum + "\n");
        //SUM OF FINITE GEOMETRIC SERIES
        System.out.println("SUM OF FINITE GEOMETRIC SERIES");
        int g_num = 3;
        double g_sta = 3.0;  
        double g_rat = 2.0;
        double  g_sum = (g_sta) * (1-Math.pow(g_rat, g_num))/(1-g_rat);
        System.out.println("The sum of the first " + g_num + " terms of a finite geometric series that starts with " + g_sta + " and increases by a rate of " + g_rat + " is " + g_sum);
    }
}