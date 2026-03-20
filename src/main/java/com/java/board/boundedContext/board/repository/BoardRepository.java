package com.java.board.boundedContext.board.repository;

import com.java.board.boundedContext.article.dto.Article;
import com.java.board.boundedContext.board.dto.Board;
import com.java.board.global.Util.Util;

import java.util.ArrayList;
import java.util.List;

public class BoardRepository {
    private List<Board> boards;
    private int lastId;

    public BoardRepository() {
        boards = new ArrayList<>();
        lastId = 0;
    }
    public Board findByBoardName(String name) {
        return boards.stream()
                .filter(board -> board.getName().equals(name))
                .findFirst()
                .orElse(null);
    }

    public Board findByBoardCode(String code) {
        return boards.stream()
                .filter(board -> board.getCode().equals(code))
                .findFirst()
                .orElse(null);
    }

    public void makeBoard(String name, String code) {
        int id = ++lastId;

        String regDate = Util.getNowDateStr();
        String updateDate = Util.getNowDateStr();

        Board board = new Board(id, regDate, updateDate, name, code);
        boards.add(board);
    }
}