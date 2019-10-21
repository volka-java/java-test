package ru.itvitality.sbrf.cu.jfs.example2.datasourceCalculator;

public interface DataProvider {
    int getDataInteger();

    double getDataDouble( int seed );
}
