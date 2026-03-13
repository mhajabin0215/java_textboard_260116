package com.java.board.global.interceptor;

import com.java.board.global.base.Rq;

public interface Interceptor {
    boolean run(Rq rq);
}