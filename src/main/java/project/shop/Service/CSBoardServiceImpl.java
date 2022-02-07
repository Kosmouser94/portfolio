package project.shop.Service;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import project.shop.Entity.CSBoard;
import project.shop.Repository.CSBoardRepository;

import java.util.List;

@Service
public class CSBoardServiceImpl implements CSBoardService {
    private final CSBoardRepository csBoardRepository;

    public CSBoardServiceImpl(CSBoardRepository csBoardRepository) {
        this.csBoardRepository = csBoardRepository;
    }

    @Override
    public List<CSBoard> list() throws Exception {
        return csBoardRepository.findAll(Sort.by(Sort.Direction.DESC, "csBoardNo"));
    }

    @Override
    public CSBoard save(CSBoard csBoard) {
        return csBoardRepository.save(csBoard);


    }
}




