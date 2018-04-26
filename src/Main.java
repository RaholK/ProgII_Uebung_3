public final class Main
{
    private Main() {}

    public static void main(String[] argv)
    {
        List list = new List();
        for (int i = 0; i < 20; i++)
        {
            list.append(i);
        }
        //list.print();



        List f = new List();
        for(int i = 100; i<102; i++) {
            f.append(i);
        }
        f.writeFileinList();

        list.readFileinList();

        list.print();
    }
}
