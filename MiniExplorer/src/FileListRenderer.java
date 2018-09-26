
import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Christoph Mautner
 */
public class FileListRenderer implements ListCellRenderer
{

    @Override
    public Component getListCellRendererComponent(JList jlist, Object e, int i, boolean isSelected, boolean hasFocus)
    {
        if(e instanceof Datei)
        {
            Datei d = (Datei)e;
            Component c = null;
            JLabel l = new JLabel(d.toString());
            l.setOpaque(true);
            c=l;
            if(d.isDirectory())
            {
                c.setBackground(Color.LIGHT_GRAY);
                c.setForeground(Color.RED);
            }
            else
            {
                c.setBackground(Color.WHITE);
                c.setForeground(Color.BLUE);
            }
            
            if(d.isFile() && isSelected)
            {
                c.setBackground(Color.ORANGE);
            }
            else if(d.isDirectory() && isSelected)
            {
                c.setBackground(Color.GRAY);
            }
            return c;
        }
        return new JLabel("???");
    }
    
}
