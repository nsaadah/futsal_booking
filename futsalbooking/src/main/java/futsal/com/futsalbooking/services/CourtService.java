package futsal.com.futsalbooking.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import futsal.com.futsalbooking.models.Court;
import futsal.com.futsalbooking.repositories.CourtRepository;

@Service
@Transactional
public class CourtService {
    
  
  @Autowired
    private CourtRepository repo;
     
    public List<Court> listAll() {
        return (List<Court>) repo.findAll();
    }
     
    public void save(Court Court) {
        repo.save(Court);
    }
     
    public Court get(int id) {
        return repo.findById(id).get();
    }
     
    public void delete(int id) {
        repo.deleteById(id);
    }
    

}