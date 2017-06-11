package com.example.bookdoc.testdata;

import java.sql.SQLException;

public interface Mapper<T, S>{
    T map(S source) throws NumberFormatException ;
}
