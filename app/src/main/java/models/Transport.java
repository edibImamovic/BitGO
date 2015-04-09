package models;

/**
 * Created by gordansajevic on 08/04/15.
 */
public class Transport {

    private int id;
    private String name;
    private String[] lines;

    public Transport() {
    }

    public Transport(int id, String name, String[] lines) {
        this.id = id;
        this.name = name;
        this.lines = lines;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getLines() {
        return lines;
    }

    public void setLines(String[] lines) {
        this.lines = lines;
    }
}
