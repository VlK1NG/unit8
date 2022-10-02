package com.absoft.unit8;

public enum POSITION {
    JUNIOR( 5000 ),
    MIDDLE( 10000 ),
    SENIOR( 20000 ),
    SENIOR_POMIDOR( 40000 );

    public final int minSalary;

    POSITION( int minSalary ){
        this.minSalary = minSalary;
    }

}
