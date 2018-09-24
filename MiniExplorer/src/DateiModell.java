
import java.util.ArrayList;
import javax.swing.AbstractListModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Christoph Mautner
 */
public class DateiModell extends AbstractListModel
{
    private ArrayList<Datei> dateien = new ArrayList<>();
    
    public void addDatei(Datei d)
    {
        dateien.add(d);
        fireIntervalAdded(this, dateien.size()-1, dateien.size()-1);
    }
    
    @Override
    public int getSize()
    {
        return dateien.size();
    }

    @Override
    public Object getElementAt(int i)
    {
        return dateien.get(i);
    }
    
}
