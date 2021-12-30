package ornek_2;

import com.company.Employe;

import java.util.ArrayList;
import java.util.List;

public class AskerDirector implements Asker{

    private List<Asker> askerList=new ArrayList<Asker>();

    public void addAsker(Asker asker){
        askerList.add(asker);
    }

    public void removeAsker(Asker asker){
        askerList.remove(asker);
    }


    @Override
    public void showDetails() {
        for (Asker asker: askerList){
            asker.showDetails();
        }
    }
}
