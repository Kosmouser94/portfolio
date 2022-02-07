package project.shop.Service;

import project.shop.Entity.CSBoard;
import project.shop.Entity.Member;

import java.util.List;

public interface CSBoardService {
    public List<CSBoard> list() throws Exception;
    CSBoard save(CSBoard csBoard);



}
