/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DONOR;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 *
 * @author Chavan Shreya Navnath
 */
public class Calculate_Linear_Regression{
    public double getLinearRegressionFactor(ArrayList g, ArrayList e, double s) {
        double b = 0.0;
        double x = 0.0;
        double y = 0.0;
        double sum_x = 0.0, sum_y = 0.0, sum_x2 = 0.0, m = 0.0;
        double sum_xy = 0.0;
        int n = g.size();

        for (int i = 0; i < g.size(); i++) {
            x = (double)g.get(i);
            y = (int)e.get(i);
            double x2 = x * x;
            double xy = x * y;
            sum_x = sum_x + x;
            sum_y = sum_y + y;
            sum_x2 = sum_x2 + x2;
            sum_xy = sum_xy + xy;

        }
        double SumX_sq = sum_x * sum_x;
        double m1 = (n * sum_xy) - (sum_x * sum_y);
        double m2 = n * sum_x2 - SumX_sq;

        m = m1 / m2;
        m = Double.parseDouble(new DecimalFormat("##.##").format(m));

        b = (sum_y - (m * sum_x)) / n;
        b = Double.parseDouble(new DecimalFormat("##.##").format(b));

        y = m * s + b;
        y = Double.parseDouble(new DecimalFormat("##.##").format(y));

        return y;
    }
}


    

