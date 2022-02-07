package project.shop.Controller;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import project.shop.Entity.CSBoard;
import project.shop.Repository.CSBoardRepository;
import project.shop.Service.CSBoardService;
import project.shop.Service.CSBoardServiceImpl;

import java.time.LocalDateTime;


//미완성

@Controller
@RequiredArgsConstructor
@RequestMapping
public class CSBoardController {

    @Autowired
    CSBoardService csBoardService;

    @Autowired
    CSBoardRepository csBoardRepository;


    @GetMapping("/CSBoard")
    public String CSBoardForm(Model model) throws Exception {
        model.addAttribute("list", csBoardService.list());
        return "csboard/CSBoard";
    }

    @PostMapping("/cscenter/new")
    public String register(CSBoard csBoard, Model model) throws Exception {
        csBoard.setRegDate(LocalDateTime.now());
        csBoardRepository.save(csBoard);

        model.addAttribute("msg", "등록이 완료되었습니다.");

        return "/csboard/CSBoard";
    }

//
//    @GetMapping("/read")
//    public void read(Long boardNo, Model model) throws Exception {
//        model.addAttribute(CSBoardService.read(boardNo));
//    }




}
