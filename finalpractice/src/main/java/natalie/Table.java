package natalie;

public class Table 
{
    private TableRow[] rows;

    public Table(int tableSize)
    {
        rows = new TableRow[tableSize];
    }

    private int hash(int key)
    {
        return (key % rows.length + rows.length) % rows.length;
    }

    private int locate(int key)
    {
        int tableSize = rows.length;
        int i = 0;
        int location = (hash(key) + i) % tableSize;

        while (rows[location] != null && rows[location].key != key && i < tableSize)
        {
            i++;
            location = (hash(key) + i) % tableSize;
        }

        return location;
    }

    public void insert(int key, String value)
    {
        int location = locate(key);
        rows[location] = new TableRow(key, value);
    }

    public String lookup(int key)
    {
        int tableSize = rows.length;
        int i = 0;
        int location = (hash(key) + i) % tableSize;

        while (rows[location] != null && rows[location].key != key && i < tableSize)
        {
            i++;
            location = (hash(key) + i) % tableSize;
        }

        if (rows[location] == null)
            return null;

        return rows[location].value;
    }

    public static void main(String[] args) 
    {
        Table table = new Table(3);

        table.insert(3, "hi");
        table.insert(6, "hello");

        System.out.println(table.lookup(3));
        System.out.println(table.lookup(6));
    }
}