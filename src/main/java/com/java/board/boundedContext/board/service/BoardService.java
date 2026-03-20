package com.java.board.boundedContext.board.service;

import com.java.board.boundedContext.board.dto.Board;
import com.java.board.boundedContext.board.repository.BoardRepository;
import com.java.board.container.Container;

public class BoardService {
    private BoardRepository boardRepository;

    public BoardService() {
        boardRepository = Container.boardRepository;
    }

    public Board findByBoardName(String name) {
        return boardRepository.findByBoardName(name);
    }

    public Board findByBoardCode(String code) {
        return boardRepository.findByBoardCode(code);
    }

    public void makeBoard(String name, String code) {
        boardRepository.makeBoard(name, code);
    }
}