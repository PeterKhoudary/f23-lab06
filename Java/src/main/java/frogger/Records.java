package frogger;

import java.util.ArrayList;
import java.util.List;

/**
 * Refactor Task 2.
 *
 * @author Zishen Wen (F22), Deyuan Chen (S22)
 */
public class Records {
    private final List<FroggerID> records;

    public Records() {
        this.records = new ArrayList<>();
    }

    /**
     * Adds a frogger's record.
     *
     * @param id a FroggerID containing personal information about the froger
     * @return Return false if the record has existed. Else, return true.
     */
    public boolean addRecord(FroggerID id) {
        for (FroggerID checkID : this.records) {
            if (id.equals(checkID))
                return false;
        }
        this.records.add(id);
        return true;
    }
}