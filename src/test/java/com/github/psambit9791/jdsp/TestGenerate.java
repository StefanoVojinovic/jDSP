package com.github.psambit9791.jdsp;

import com.github.psambit9791.jdsp.signal.Generate;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

// Make sure the test_outputs/ directory exists

public class TestGenerate {

    final private int Fs = 100;
    private final Generate gp = new Generate(this.Fs);

    @Test
    public void TestSine() throws IOException{
        int f1 = 10;
        double[] out1 = this.gp.generateSineWave(f1);
        double[] result1 = {0., 0.593, 0.955, 0.945, 0.567, -0.032, -0.618, -0.964, -0.934, -0.541, 0.063,
                0.643, 0.972, 0.922, 0.514, -0.095, -0.667, -0.979, -0.91, -0.486, 0.127, 0.69, 0.985, 0.896,
                0.458, -0.158, -0.713, -0.99, -0.881, -0.43, 0.189, 0.735, 0.994, 0.866, 0.401, -0.22, -0.756,
                -0.997, -0.85, -0.372, 0.251, 0.776, 0.999, 0.833, 0.342, -0.282, -0.796, -1., -0.815, -0.312,
                0.312, 0.815, 1., 0.796, 0.282, -0.342, -0.833, -0.999, -0.776, -0.251, 0.372, 0.85, 0.997,
                0.756, 0.22, -0.401, -0.866, -0.994, -0.735, -0.189, 0.43, 0.881, 0.99, 0.713, 0.158, -0.458,
                -0.896, -0.985, -0.69, -0.127, 0.486, 0.91, 0.979, 0.667, 0.095, -0.514, -0.922, -0.972, -0.643,
                -0.063, 0.541, 0.934, 0.964, 0.618, 0.032, -0.567, -0.945, -0.955, -0.593, -0.};
        assertArrayEquals(result1, out1, 0.001);
        double[] t = this.gp.getTimeArray();
        this.plot_now("Sine Wave", t, result1, "test_outputs/sine.png");

        int f2 = 20;
        double[] out2 = this.gp.generateSineWave(f2);
        double[] result2 = {0.   ,  0.955,  0.567, -0.618, -0.934,  0.063,  0.972,  0.514, -0.667, -0.91 ,  0.127,
                0.985,  0.458, -0.713, -0.881,  0.189, 0.994,  0.401, -0.756, -0.85 ,  0.251,  0.999,  0.342, -0.796,
                -0.815,  0.312,  1.   ,  0.282, -0.833, -0.776,  0.372,  0.997, 0.22 , -0.866, -0.735,  0.43 ,  0.99 ,
                0.158, -0.896, -0.69 , 0.486,  0.979,  0.095, -0.922, -0.643,  0.541,  0.964,  0.032, -0.945, -0.593,
                0.593,  0.945, -0.032, -0.964, -0.541,  0.643, 0.922, -0.095, -0.979, -0.486,  0.69 ,  0.896, -0.158,
                -0.99 , -0.43 ,  0.735,  0.866, -0.22 , -0.997, -0.372,  0.776,  0.833, -0.282, -1.   , -0.312,  0.815,
                0.796, -0.342, -0.999, -0.251, 0.85 ,  0.756, -0.401, -0.994, -0.189,  0.881,  0.713, -0.458,
                -0.985, -0.127,  0.91 ,  0.667, -0.514, -0.972, -0.063,  0.934, 0.618, -0.567, -0.955, -0.};
        assertArrayEquals(result2, out2, 0.001);
    }

    @Test
    public void TestCosine() throws IOException{
        int f1 = 10;
        double[] out1 = this.gp.generateCosineWave(f1);
        double[] result1 = {1., 0.805, 0.297, -0.327, -0.824, -0.999, -0.786, -0.266, 0.357, 0.841, 0.998, 0.766,
                0.236, -0.386, -0.858, -0.995, -0.745, -0.205, 0.415, 0.874, 0.992, 0.724, 0.174, -0.444, -0.889,
                -0.987, -0.701, -0.142, 0.472, 0.903, 0.982, 0.679, 0.111, -0.5, -0.916, -0.975, -0.655, -0.079,
                0.527, 0.928, 0.968, 0.631, 0.048, -0.554, -0.94, -0.959, -0.606, -0.016, 0.58, 0.95, 0.95,
                0.58, -0.016, -0.606, -0.959, -0.94, -0.554, 0.048, 0.631, 0.968, 0.928, 0.527, -0.079, -0.655,
                -0.975, -0.916, -0.5, 0.111, 0.679, 0.982, 0.903, 0.472, -0.142, -0.701, -0.987, -0.889, -0.444,
                0.174, 0.724, 0.992, 0.874, 0.415, -0.205, -0.745, -0.995, -0.858, -0.386, 0.236, 0.766, 0.998,
                0.841, 0.357, -0.266, -0.786, -0.999, -0.824, -0.327, 0.297, 0.805, 1.};
        assertArrayEquals(result1, out1, 0.001);
        double[] t = this.gp.getTimeArray();
        this.plot_now("Cosine Wave", t, result1, "test_outputs/cosine.png");

        int f2 = 20;
        double[] out2 = this.gp.generateCosineWave(f2);
        double[] result2 = {1.   ,  0.297, -0.824, -0.786,  0.357,  0.998,  0.236, -0.858, -0.745,  0.415,  0.992,
                0.174, -0.889, -0.701,  0.472,  0.982, 0.111, -0.916, -0.655,  0.527,  0.968,  0.048, -0.94 , -0.606,
                0.58 ,  0.95 , -0.016, -0.959, -0.554,  0.631,  0.928, -0.079, -0.975, -0.5  ,  0.679,  0.903, -0.142,
                -0.987, -0.444,  0.724, 0.874, -0.205, -0.995, -0.386,  0.766,  0.841, -0.266, -0.999, -0.327,  0.805,
                0.805, -0.327, -0.999, -0.266,  0.841,  0.766, -0.386, -0.995, -0.205,  0.874,  0.724, -0.444, -0.987,
                -0.142, 0.903,  0.679, -0.5  , -0.975, -0.079,  0.928,  0.631, -0.554, -0.959, -0.016,  0.95 ,  0.58 ,
                -0.606, -0.94 ,  0.048,  0.968, 0.527, -0.655, -0.916,  0.111,  0.982,  0.472, -0.701, -0.889,
                0.174,  0.992,  0.415, -0.745, -0.858,  0.236,  0.998,  0.357, -0.786, -0.824,  0.297,  1.};
        assertArrayEquals(result2, out2, 0.001);
    }

    @Test
    public void TestSquare() throws IOException {
        int f1 = 10;
        double[] out1 = this.gp.generateSquareWave(f1);
        double[] result1 = {1., 1., 1., 1., 1., -1., -1., -1., -1., -1., 1., 1., 1., 1., 1., -1., -1., -1., -1.,
                -1., 1., 1., 1., 1., 1., -1., -1., -1., -1., -1., 1., 1., 1., 1., 1., -1., -1., -1., -1., -1.,
                1., 1., 1., 1., 1., -1., -1., -1., -1., -1., 1., 1., 1., 1., 1., -1., -1., -1., -1., -1., 1.,
                1., 1., 1., 1., -1., -1., -1., -1., -1., 1., 1., 1., 1., 1., -1., -1., -1., -1., -1., 1., 1.,
                1., 1., 1., -1., -1., -1., -1., -1., 1., 1., 1., 1., 1., -1., -1., -1., -1., 1.};
        assertArrayEquals(result1, out1, 0.001);
        double[] t = this.gp.getTimeArray();
        this.plot_now("Square Wave", t, result1, "test_outputs/square.png");

        int f2 = 20;
        double[] out2 = this.gp.generateSquareWave(f2);
        double[] result2 = {1.,  1.,  1., -1., -1.,  1.,  1.,  1., -1., -1.,  1.,  1.,  1., -1., -1.,  1.,  1.,  1.,
                -1., -1.,  1.,  1.,  1., -1., -1.,  1., 1.,  1., -1., -1.,  1.,  1.,  1., -1., -1.,  1.,  1.,  1., -1.,
                -1.,  1.,  1.,  1., -1., -1.,  1.,  1.,  1., -1., -1.,  1.,  1., -1., -1., -1.,  1.,  1., -1., -1., -1.,
                1.,  1., -1., -1., -1., 1.,  1., -1., -1., -1.,  1.,  1., -1., -1., -1.,  1.,  1., -1., -1., -1.,  1.,
                1., -1., -1., -1.,  1.,  1., -1., -1., -1.,  1., 1., -1., -1., -1.,  1.,  1., -1., -1.,  1.};
        assertArrayEquals(result2, out2, 0.001);
    }

    public void plot_now(String title, double[] t, double[] signal, String fname) throws IOException {
        Plotting fig = new Plotting(600, 300, title, "Time", "Signal");
        fig.initialise_plot();
        fig.add_signal(title, t, signal, false);
        fig.save_as_png(fname);
    }
}
