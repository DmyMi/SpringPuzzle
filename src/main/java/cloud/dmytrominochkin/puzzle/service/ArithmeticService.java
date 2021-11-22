package cloud.dmytrominochkin.puzzle.service;

import cloud.dmytrominochkin.puzzle.annotation.LogPerformance;

public interface ArithmeticService {
    @LogPerformance
    int add(int arg1, int arg2);

    @LogPerformance
    int inc(int arg);

    //f = (arg1 + arg2) - (arg3+1)
    @LogPerformance
    int function(int arg1, int arg2, int arg3);
}
