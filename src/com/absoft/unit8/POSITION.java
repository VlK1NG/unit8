package com.absoft.unit8;

public enum POSITION {
    JUNIOR( 5000 ), // 0
    MIDDLE( 10000 ), // 1
    SENIOR( 20000 ), // 2
    SENIOR_POMIDOR( 40000 ); // 3

    public final int minSalary;

    POSITION( int minSalary ){
        this.minSalary = minSalary;
    }

}
