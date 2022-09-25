package eu.berrytopia.arbor.geoobject.tree;

import eu.berrytopia.arbor.organisation.Organisation;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Component
public class TreeService {

    private final TreeRepository treeRepository;

    public TreeService(TreeRepository treeRepository){
        this.treeRepository = treeRepository;
    }


    public List<Tree> getTrees() {
       return treeRepository.findAll();
    }

    public Tree getTree(Long treeId) {
        Optional<Tree> treeOptional = treeRepository.findById(treeId);

        if(!treeOptional.isPresent()) {
            throw new IllegalStateException("Tree with ID " + treeId + " does not exist.");
        }

        return treeOptional.get();
    }

    public void addNewTree(Tree tree) {
        Optional<Tree> treeOptional = treeRepository.findTreeByName(tree.getName());
        if (treeOptional.isPresent()){
            throw new IllegalStateException("Name is taken");
        }
        treeRepository.save(tree);
        //System.out.println(tree);
    }

    public void deleteTree(Long treeId) {
       boolean exists = treeRepository.existsById(treeId);
       if(!exists) {
           throw new IllegalStateException("Tree with ID " + treeId + " does not exist.");
       }
       treeRepository.deleteById(treeId);
    }

    public void updateTree(Tree tree) {
        Optional<Tree> treeOptional = treeRepository.findById(tree.getId());
        if (!treeOptional.isPresent()) {
            throw new IllegalStateException("Tree with ID " + tree.getId() + "does not exist.");
        }
        Tree oldTree = treeOptional.get();
        oldTree.setName(tree.getName());
        oldTree.setPlantedDate(tree.getPlantedDate());
        oldTree.setUserDescription(tree.getUserDescription());

        treeRepository.save(oldTree);
    }
}
