package CardGame.Service;

import CardGame.DAO.TriesRepository;
import CardGame.Model.Tries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TriesService {
    TriesRepository triesRepository;

    @Autowired
    public TriesService(TriesRepository triesRepository) {
        this.triesRepository = triesRepository;
    }
    public List<Tries> getAllTries(){
        return triesRepository.findAll();
    }
}