package fr.houseofcode.dap.server.dma.google;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//TODO DMA by Djer |Audit Code| Prends en compte les remarques de CheckStyle !
//TODO DMA by Djer |POO| Cette classe devrait �tre dans le package "xxx.controller". A minima devrait �tre � proximit� des autrescontrollers.
/**
 * @author Mams
 *
 */
@RestController
public class HelloController {
    @RequestMapping("/")
    public String index() {
        return "Yo tout le monde ! ^^ ";
    }
}
