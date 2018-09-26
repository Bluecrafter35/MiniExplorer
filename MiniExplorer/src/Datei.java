
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Christoph Mautner
 */
public class Datei extends File
{
    
    public Datei(String string)
    {
        super(string);
    }
    
    public String toString()
    {
        try{
            if(this.isDirectory())
            {
                return String.format("%s",this.getName());
            }
            else
            {
                Date d = new Date(this.lastModified());
                SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm");
                return String.format("%-20s %25s %30dKB ", this.getName(), sdf.format(d),this.getTotalSpace());
            }
        }catch(Exception ex)
        {
            ex.printStackTrace();
            return null;
        }
    }
    
}
