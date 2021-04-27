package pollub.ism.lab07;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Warzywniak")
public class PozycjaMagazynowa {

    @PrimaryKey(autoGenerate = true)
    public int _id;
    public String NAME;
    public int QUANTITY;
}